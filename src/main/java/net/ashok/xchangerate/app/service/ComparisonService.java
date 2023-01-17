package net.ashok.xchangerate.app.service;

import net.ashok.xchangerate.app.dto.ComparisonResponseDTO;
import net.ashok.xchangerate.app.dto.ComparisonsResponseDTO;
import net.ashok.xchangerate.app.dto.ProvidersResponseDTO;
import net.ashok.xchangerate.app.exception.ComparisonException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ComparisonService {

    @Value("${wise.url}")
    private String URL;

    public List<ComparisonsResponseDTO> getPrice(String sourceCurrency, String targetCurrency, BigDecimal sendAmount) {
        RestTemplate restTemplate = new RestTemplate();
        String formattedURL = URL + "?sourceCurrency=" + sourceCurrency + "&targetCurrency=" + targetCurrency + "&sendAmount=" + sendAmount;
        ComparisonResponseDTO comparisonResponseDTO = restTemplate.getForObject(formattedURL, ComparisonResponseDTO.class);
        return generateSimpleComparison(comparisonResponseDTO);
    }

    private List<ComparisonsResponseDTO> generateSimpleComparison(ComparisonResponseDTO comparisonResponseDTO) {
        List<ComparisonsResponseDTO> responseList = new ArrayList<>();
        if (comparisonResponseDTO != null) {
            for (ProvidersResponseDTO provider : comparisonResponseDTO.getProviders()) {
                ComparisonsResponseDTO responseDTO = new ComparisonsResponseDTO();
                responseDTO.setName(provider.getName());
                responseDTO.setRate(provider.getQuotes().get(0).getRate());
                responseDTO.setReceivedAmount(provider.getQuotes().get(0).getReceivedAmount());
                responseList.add(responseDTO);
            }
        } else {
            throw new ComparisonException("Exception in generating simple response");
        }
        responseList.sort(Comparator.comparing(ComparisonsResponseDTO::getReceivedAmount).reversed());
        return responseList;
    }
}

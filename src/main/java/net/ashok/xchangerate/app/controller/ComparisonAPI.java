package net.ashok.xchangerate.app.controller;

import net.ashok.xchangerate.app.dto.ComparisonsResponseDTO;
import net.ashok.xchangerate.app.service.ComparisonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/v1/compare/rates")
public class ComparisonAPI {

    @Resource
    private ComparisonService comparisonService;

    @GetMapping()
    public List<ComparisonsResponseDTO> comparisons(@RequestParam("sourceCurrency") String sourceCurrency, @RequestParam("targetCurrency") String targetCurrency, @RequestParam("sendAmount") BigDecimal sendAmount) {
        return comparisonService.getPrice(sourceCurrency, targetCurrency, sendAmount);
    }
}

package net.ashok.xchangerate.app.dto;

import java.math.BigDecimal;
import java.util.List;

public class ComparisonResponseDTO {

    private String sourceCurrency;
    private String targetCurrency;
    private String sourceCountry;
    private String targetCountry;
    private String providerCountry;
    private String providerType;
    private BigDecimal sendAmount;
    private List<ProvidersResponseDTO> providers;

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public String getSourceCountry() {
        return sourceCountry;
    }

    public void setSourceCountry(String sourceCountry) {
        this.sourceCountry = sourceCountry;
    }

    public String getTargetCountry() {
        return targetCountry;
    }

    public void setTargetCountry(String targetCountry) {
        this.targetCountry = targetCountry;
    }

    public String getProviderCountry() {
        return providerCountry;
    }

    public void setProviderCountry(String providerCountry) {
        this.providerCountry = providerCountry;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public BigDecimal getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
    }

    public List<ProvidersResponseDTO> getProviders() {
        return providers;
    }

    public void setProviders(List<ProvidersResponseDTO> providers) {
        this.providers = providers;
    }
}

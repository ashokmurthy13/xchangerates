package net.ashok.xchangerate.app.dto;

import java.util.List;

public class ProvidersResponseDTO {

    private Long id;
    private String alias;
    private String name;
    private String logo;
    private LogosResponseDTO logos;
    private String type;
    private boolean partner;
    private List<QuotesResponseDTO> quotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public LogosResponseDTO getLogos() {
        return logos;
    }

    public void setLogos(LogosResponseDTO logos) {
        this.logos = logos;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public List<QuotesResponseDTO> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<QuotesResponseDTO> quotes) {
        this.quotes = quotes;
    }
}

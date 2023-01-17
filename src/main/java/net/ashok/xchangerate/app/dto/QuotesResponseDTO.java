package net.ashok.xchangerate.app.dto;

public class QuotesResponseDTO {

    private String rate;
    private String fee;
    private String receivedAmount;
    private String dateCollected;
    private String sourceCountry;
    private String targetCountry;
    private String markup;
    private DeliveryEstimationDTO deliveryEstimation;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getDateCollected() {
        return dateCollected;
    }

    public void setDateCollected(String dateCollected) {
        this.dateCollected = dateCollected;
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

    public String getMarkup() {
        return markup;
    }

    public void setMarkup(String markup) {
        this.markup = markup;
    }

    public DeliveryEstimationDTO getDeliveryEstimation() {
        return deliveryEstimation;
    }

    public void setDeliveryEstimation(DeliveryEstimationDTO deliveryEstimation) {
        this.deliveryEstimation = deliveryEstimation;
    }
}

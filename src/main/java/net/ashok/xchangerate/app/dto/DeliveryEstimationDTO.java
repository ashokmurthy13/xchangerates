package net.ashok.xchangerate.app.dto;

public class DeliveryEstimationDTO {

    private DurationDTO duration;
    private boolean providerGivesEstimate;

    public DurationDTO getDuration() {
        return duration;
    }

    public void setDuration(DurationDTO duration) {
        this.duration = duration;
    }

    public boolean isProviderGivesEstimate() {
        return providerGivesEstimate;
    }

    public void setProviderGivesEstimate(boolean providerGivesEstimate) {
        this.providerGivesEstimate = providerGivesEstimate;
    }
}

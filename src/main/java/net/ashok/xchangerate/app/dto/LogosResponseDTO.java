package net.ashok.xchangerate.app.dto;

public class LogosResponseDTO {

    private LogoResponseDTO normal;
    private LogoResponseDTO inverse;
    private LogoResponseDTO white;

    public LogoResponseDTO getNormal() {
        return normal;
    }

    public void setNormal(LogoResponseDTO normal) {
        this.normal = normal;
    }

    public LogoResponseDTO getInverse() {
        return inverse;
    }

    public void setInverse(LogoResponseDTO inverse) {
        this.inverse = inverse;
    }

    public LogoResponseDTO getWhite() {
        return white;
    }

    public void setWhite(LogoResponseDTO white) {
        this.white = white;
    }
}

package click.botay.japan.domain;

import javax.validation.constraints.NotBlank;

public class VocabularyUpsertRequest {
    @NotBlank
    private String tuVung;
    @NotBlank
    private String kanJi;
    @NotBlank
    private String phienAm;
    @NotBlank
    private String nghia;
    @NotBlank
    private String viDu;

    public String getTuVung() {
        return tuVung;
    }

    public void setTuVung(String tuVung) {
        this.tuVung = tuVung;
    }

    public String getKanJi() {
        return kanJi;
    }

    public void setKanJi(String kanJi) {
        this.kanJi = kanJi;
    }

    public String getPhienAm() {
        return phienAm;
    }

    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }

    public String getViDu() {
        return viDu;
    }

    public void setViDu(String viDu) {
        this.viDu = viDu;
    }
}

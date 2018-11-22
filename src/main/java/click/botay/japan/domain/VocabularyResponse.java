package click.botay.japan.domain;

public class VocabularyResponse {
    private long idVocabulary;

    private String tuVung;

    private String kanJi;

    private String phienAm;

    private String nghia;

    private String viDu;

    public long getIdVocabulary() {
        return idVocabulary;
    }

    public void setIdVocabulary(long idVocabulary) {
        this.idVocabulary = idVocabulary;
    }

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

package click.botay.japan.domain;

public class GrammarResponse {
    private long id;

    private String tenNguPhap;

    private String cauTruc;

    private String cachDung;

    private String viDu;

    private String chuThich;

    public long getIdGrammar() {
        return id;
    }

    public void setIdGrammar(long idGrammar) {
        this.id = idGrammar;
    }

    public String getTenNguPhap() {
        return tenNguPhap;
    }

    public void setTenNguPhap(String tenNguPhap) {
        this.tenNguPhap = tenNguPhap;
    }

    public String getCauTruc() {
        return cauTruc;
    }

    public void setCauTruc(String cauTruc) {
        this.cauTruc = cauTruc;
    }

    public String getCachDung() {
        return cachDung;
    }

    public void setCachDung(String cachDung) {
        this.cachDung = cachDung;
    }

    public String getViDu() {
        return viDu;
    }

    public void setViDu(String viDu) {
        this.viDu = viDu;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }
}

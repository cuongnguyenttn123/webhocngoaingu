package click.botay.japan.domain;

import javax.validation.constraints.NotBlank;

public class GrammarUpsertRequest {
    @NotBlank
    private String tenNguPhap;
    @NotBlank
    private String cauTruc;
    @NotBlank
    private String cachDung;
    @NotBlank
    private String viDu;
    @NotBlank
    private String chuThich;

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

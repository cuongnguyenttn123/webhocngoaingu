package click.botay.japan.domain;

import javax.validation.constraints.NotBlank;

public class VideoUpSertRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

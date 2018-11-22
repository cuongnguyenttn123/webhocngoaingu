package click.botay.japan.converter;

import click.botay.japan.domain.VideoResponse;
import click.botay.japan.entity.VideoEntity;
import org.springframework.stereotype.Component;

@Component
public class VideoEntityToResponse {
    public VideoResponse convert(VideoEntity entity) {
        VideoResponse response = new VideoResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setUrl(entity.getUrl());
        return response;
    }
}

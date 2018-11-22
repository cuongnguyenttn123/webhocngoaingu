package click.botay.japan.service;

import click.botay.japan.domain.VideoResponse;
import click.botay.japan.domain.VideoUpSertRequest;

import javax.transaction.Transactional;
import java.util.List;

public interface VideoService {
    List<VideoResponse> getAllVideo();

    void addVideo(VideoUpSertRequest videoRequest);

    @Transactional
    void updateVideo(long id, VideoUpSertRequest videoRequest);

    @Transactional
    void deleteVideos(List<Long> videoIds);
}

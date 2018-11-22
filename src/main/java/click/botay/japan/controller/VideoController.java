package click.botay.japan.controller;

import click.botay.japan.domain.VideoUpSertRequest;
import click.botay.japan.domain.VideoResponse;
import click.botay.japan.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping
    public List<VideoResponse> getVideos() {
        return videoService.getAllVideo();
    }

    @PostMapping
    public void addVideo(@RequestBody @Valid VideoUpSertRequest videoRequest) {
        videoService.addVideo(videoRequest);
    }

    @PutMapping("/{videoId}")
    public void updateVideo(@PathVariable("videoId") long id, @RequestBody @Valid VideoUpSertRequest videoRequest) {
        videoService.updateVideo(id, videoRequest);
    }

    @DeleteMapping
    public void deleteVideos(@RequestBody List<Long> videoIds) {
        videoService.deleteVideos(videoIds);
    }
}

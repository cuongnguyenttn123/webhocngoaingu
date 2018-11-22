package click.botay.japan.service.impl;

import click.botay.japan.converter.VideoEntityToResponse;
import click.botay.japan.domain.VideoUpSertRequest;
import click.botay.japan.domain.VideoResponse;
import click.botay.japan.entity.VideoEntity;
import click.botay.japan.repository.VideoRepository;
import click.botay.japan.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;
    private final VideoEntityToResponse converter;

    @Autowired
    public VideoServiceImpl(VideoRepository videoRepository, VideoEntityToResponse converter) {
        this.videoRepository = videoRepository;
        this.converter = converter;
    }

    @Override
    public List<VideoResponse> getAllVideo() {
        List<VideoResponse> responses = new ArrayList<>();
        List<VideoEntity> entities = videoRepository.findAll();
        for (VideoEntity entity : entities) {
            responses.add(converter.convert(entity));
        }
        return responses;
        // return videoRepository.findAll().stream().map(converter::convert).collect(Collectors.toList());

    }

    @Transactional
    @Override
    public void addVideo(VideoUpSertRequest videoRequest) {
        VideoEntity entity = convertRequestToEntity(videoRequest);
        videoRepository.save(entity);
    }

    @Transactional
    @Override
    public void updateVideo(long id, @Valid VideoUpSertRequest videoRequest) {
        VideoEntity entity = videoRepository.findById(id).orElseThrow(() -> new RuntimeException()); //FIXME update exception
        entity.setName(videoRequest.getName());
        entity.setUrl(videoRequest.getUrl());
    }

    @Transactional
    @Override
    public void deleteVideos(List<Long> videoIds) {
        videoRepository.deleteAllByIdIn(videoIds);
    }

    private VideoEntity convertRequestToEntity(VideoUpSertRequest request) {
        VideoEntity entity = new VideoEntity();
        entity.setName(request.getName());
        entity.setUrl(request.getUrl());
        return entity;
    }
}

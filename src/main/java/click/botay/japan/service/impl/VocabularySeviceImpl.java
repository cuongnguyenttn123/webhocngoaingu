package click.botay.japan.service.impl;

import click.botay.japan.converter.VocabularyEntityToReponse;
import click.botay.japan.domain.VocabularyResponse;
import click.botay.japan.domain.VocabularyUpsertRequest;
import click.botay.japan.entity.VocabularyEntity;
import click.botay.japan.repository.VocabularyRepository;
import click.botay.japan.service.VocabularySevice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VocabularySeviceImpl implements VocabularySevice {
    private final VocabularyRepository vocabularyRepository;
    private final VocabularyEntityToReponse converter;

    public VocabularySeviceImpl(VocabularyRepository vocabularyRepository, VocabularyEntityToReponse converter) {
        this.vocabularyRepository = vocabularyRepository;
        this.converter = converter;
    }


    @Override
    public List<VocabularyResponse> getAllVocabulary() {
        List<VocabularyResponse> vocabularyResponses = new ArrayList<>();
        List<VocabularyEntity> vocabularyEntities = vocabularyRepository.findAll();
        for (VocabularyEntity vocabularyEntity : vocabularyEntities){
            vocabularyResponses.add(converter.coverter(vocabularyEntity));
        }
        return vocabularyResponses;
    }

    @Override
    public void addVocabulary(VocabularyUpsertRequest vocabularyUpsertRequest) {
        VocabularyEntity vocabularyEntity = converterRequesToEntity(vocabularyUpsertRequest);
        vocabularyRepository.save(vocabularyEntity);

    }

    private VocabularyEntity converterRequesToEntity(VocabularyUpsertRequest vocabularyUpsertRequest) {
        VocabularyEntity vocabularyEntity = new VocabularyEntity();
        vocabularyEntity.setTuVung(vocabularyUpsertRequest.getTuVung());
        vocabularyEntity.setKanJi(vocabularyUpsertRequest.getKanJi());
        vocabularyEntity.setPhienAm(vocabularyUpsertRequest.getPhienAm());
        vocabularyEntity.setNghia(vocabularyUpsertRequest.getNghia());
        vocabularyEntity.setViDu(vocabularyUpsertRequest.getViDu());
        return vocabularyEntity;
    }

    @Override
    public void updateVcabulary(long id, VocabularyResponse vocabularyResponse) {
        VocabularyEntity vocabularyEntity = vocabularyRepository.findById(id).orElseThrow(() -> new RuntimeException());
        vocabularyEntity.setTuVung(vocabularyResponse.getTuVung());
        vocabularyEntity.setKanJi(vocabularyResponse.getKanJi());
        vocabularyEntity.setPhienAm(vocabularyResponse.getPhienAm());
        vocabularyEntity.setNghia(vocabularyResponse.getNghia());
        vocabularyEntity.setViDu(vocabularyResponse.getViDu());
    }

    @Override
    public void deleteVocabulary(List<Long> VocabularyIds) {

    }
}

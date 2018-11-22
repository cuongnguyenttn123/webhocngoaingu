package click.botay.japan.converter;

import click.botay.japan.domain.VocabularyResponse;
import click.botay.japan.entity.VocabularyEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class VocabularyEntityToReponse {
    public static VocabularyResponse coverter(VocabularyEntity vocabularyEntity){
        VocabularyResponse vocabularyResponse = new VocabularyResponse();
        vocabularyResponse.setIdVocabulary(vocabularyEntity.getId());
        vocabularyResponse.setTuVung(vocabularyEntity.getTuVung());
        vocabularyResponse.setKanJi(vocabularyEntity.getKanJi());
        vocabularyResponse.setPhienAm(vocabularyEntity.getPhienAm());
        vocabularyResponse.setNghia(vocabularyEntity.getNghia());
        vocabularyResponse.setViDu(vocabularyEntity.getViDu());
        return vocabularyResponse;
    }
    public static Set<VocabularyResponse> coverterList(Set<VocabularyEntity> vocabularyEntities){
        Set<VocabularyResponse> vocabularyResponses = new HashSet<>();
        for(VocabularyEntity vocabularyEntity : vocabularyEntities){
            VocabularyResponse vocabularyResponse = coverter(vocabularyEntity);
            vocabularyResponses.add(vocabularyResponse);
        }
        return vocabularyResponses;
    }

}

package click.botay.japan.service;

import click.botay.japan.domain.VocabularyResponse;
import click.botay.japan.domain.VocabularyUpsertRequest;

import javax.transaction.Transactional;
import java.util.List;

public interface VocabularySevice {
    List<VocabularyResponse> getAllVocabulary();

    void addVocabulary(VocabularyUpsertRequest vocabularyUpsertRequest);

    @Transactional
    void updateVcabulary(long id, VocabularyResponse vocabularyResponse);

    @Transactional
    void deleteVocabulary(List<Long> VocabularyIds);
}

package click.botay.japan.service;

import click.botay.japan.domain.GrammarResponse;
import click.botay.japan.domain.GrammarUpsertRequest;

import javax.transaction.Transactional;
import java.util.List;

public interface GrammarSevice {

    List<GrammarResponse> getAllGrammar();

    void addGrammar(GrammarUpsertRequest grammarUpsertRequest);

    @Transactional
    void updateGrammar(long id, GrammarResponse grammarResponse);

    @Transactional
    void deleteGrammar(List<Long> GrammarIds);

}

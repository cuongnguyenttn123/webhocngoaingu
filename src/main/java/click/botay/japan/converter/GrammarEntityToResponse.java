package click.botay.japan.converter;

import click.botay.japan.domain.GrammarResponse;
import click.botay.japan.entity.GrammarEntity;
import org.springframework.stereotype.Component;

@Component
public class GrammarEntityToResponse {
    public GrammarResponse coverter(GrammarEntity grammarEntity){
        GrammarResponse grammarResponse = new GrammarResponse();
        grammarResponse.setIdGrammar(grammarEntity.getId());
        grammarResponse.setTenNguPhap(grammarEntity.getTenNguPhap());
        grammarResponse.setCachDung(grammarEntity.getCachDung());
        grammarResponse.setViDu(grammarEntity.getViDu());
        grammarResponse.setCauTruc(grammarEntity.getCauTruc());
        grammarResponse.setChuThich(grammarEntity.getChuThich());
        return grammarResponse;
    }
}

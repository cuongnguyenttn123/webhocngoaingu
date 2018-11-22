package click.botay.japan.service.impl;

import click.botay.japan.converter.GrammarEntityToResponse;
import click.botay.japan.domain.GrammarResponse;
import click.botay.japan.domain.GrammarUpsertRequest;
import click.botay.japan.entity.GrammarEntity;
import click.botay.japan.repository.GrammarRepository;
import click.botay.japan.service.GrammarSevice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class GrammarSeviceImpl implements GrammarSevice {
    private final GrammarRepository grammarRepository;
    private final GrammarEntityToResponse converver;

    public GrammarSeviceImpl(GrammarRepository grammarRepository, GrammarEntityToResponse converver) {
        this.grammarRepository = grammarRepository;
        this.converver = converver;
    }


    @Override
    public List<GrammarResponse> getAllGrammar() {
        List<GrammarResponse> grammarResponses = new ArrayList<>();
        List<GrammarEntity> grammarEntities = grammarRepository.findAll();
        for (GrammarEntity grammarEntity : grammarEntities){
                grammarResponses.add(converver.coverter(grammarEntity));
        }
        return grammarResponses;
    }

    @Override
    public void addGrammar(GrammarUpsertRequest grammarUpsertRequest) {
        grammarRepository.save(converter(grammarUpsertRequest));

    }

    private GrammarEntity converter(GrammarUpsertRequest grammarUpsertRequest) {
        GrammarEntity grammarEntity = new GrammarEntity();
        grammarEntity.setTenNguPhap(grammarUpsertRequest.getTenNguPhap());
        grammarEntity.setCauTruc(grammarUpsertRequest.getCauTruc());
        grammarEntity.setCachDung(grammarUpsertRequest.getCachDung());
        grammarEntity.setChuThich(grammarUpsertRequest.getChuThich());
        grammarEntity.setViDu(grammarUpsertRequest.getViDu());
        return grammarEntity;
    }

    @Override
    public void updateGrammar(long id, GrammarResponse grammarResponse) {
        GrammarEntity grammarEntity = grammarRepository.findById(id).orElse(null);
        grammarEntity.setTenNguPhap(grammarResponse.getTenNguPhap());
        grammarEntity.setCauTruc(grammarResponse.getCauTruc());
        grammarEntity.setCachDung(grammarResponse.getCachDung());
        grammarEntity.setChuThich(grammarResponse.getChuThich());
        grammarEntity.setViDu(grammarResponse.getViDu());
    }

    @Override
    public void deleteGrammar(List<Long> GrammarIds) {
        grammarRepository.deleteAllByIdIn((GrammarIds));
    }


}

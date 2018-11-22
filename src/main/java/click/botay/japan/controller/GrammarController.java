package click.botay.japan.controller;

import click.botay.japan.domain.GrammarResponse;
import click.botay.japan.domain.GrammarUpsertRequest;
import click.botay.japan.entity.GrammarEntity;
import click.botay.japan.service.GrammarSevice;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/grammars")
public class GrammarController {
    private final GrammarSevice grammarSevice;

    public GrammarController(GrammarSevice grammarSevice) {
        this.grammarSevice = grammarSevice;
    }
    @GetMapping
    public List<GrammarResponse> getLessons() {
        return grammarSevice.getAllGrammar();
    }
    @PostMapping
    public void addGrammar(@RequestBody GrammarUpsertRequest grammarUpsertRequest){
        grammarSevice.addGrammar(grammarUpsertRequest);
    }

    @DeleteMapping
    public void deleteGrammar(@RequestBody List<Long> ids){
        grammarSevice.deleteGrammar(ids);
    }

}

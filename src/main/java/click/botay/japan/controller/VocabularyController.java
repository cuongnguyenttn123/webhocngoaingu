package click.botay.japan.controller;

import click.botay.japan.domain.VocabularyResponse;
import click.botay.japan.domain.VocabularyUpsertRequest;
import click.botay.japan.service.VocabularySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vocabularys")
public class VocabularyController {
    private final VocabularySevice vocabularySevice;
    @Autowired
    public VocabularyController(VocabularySevice vocabularySevice) {
        this.vocabularySevice = vocabularySevice;
    }

    @GetMapping
    public List<VocabularyResponse> getLessons() {
        return vocabularySevice.getAllVocabulary();
    }

    @PostMapping
    public void addVocabulary(@RequestBody VocabularyUpsertRequest vocabularyUpsertRequest){
        vocabularySevice.addVocabulary(vocabularyUpsertRequest);
    }
}


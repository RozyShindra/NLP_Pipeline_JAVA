package com.rozy.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Lemmatization {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text_lemma = "She likes fishing while having snacks.";

        CoreDocument coreDocument = new CoreDocument(text_lemma);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> CoreLableList = coreDocument.tokens();

        for(CoreLabel coreLabel : CoreLableList) {
            String lemma = coreLabel.lemma();
            System.out.println(coreLabel.originalText() + " = " + lemma);
        }
    }
}

package com.rozy.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class NER {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text_ner = "Hi I am Rozy, an AI/ML engineer with masters degree from NIT Surat.";
        CoreDocument  coreDocument = new CoreDocument(text_ner);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabels = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabels){
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText() + " = " + ner);
        }
    }
}

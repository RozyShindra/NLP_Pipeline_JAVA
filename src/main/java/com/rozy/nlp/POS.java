package com.rozy.nlp;

import edu.stanford.nlp.ling.CoreAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class POS {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text_pos = "Hi there! I am Rozy! Working on integration of Quantum Computing and NLP, I have also doing deep research in Cancer detection using Histopathological images.";
        CoreDocument coreDocument = new CoreDocument(text_pos);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for (CoreLabel coreLabel : coreLabelList){
            String pos = coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText() + " = " + pos);
        }
    }
}

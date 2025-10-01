package com.rozy.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;
import java.util.Properties;

public class SentenceRecognizer {
    public static void main(String[] args){
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String sentence = "Hey! I have recently completed MTech in Data Science. Actively Looking to collaborate on projects in AI - ML domain.";

        CoreDocument coreDocument = new CoreDocument(sentence);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();

        for(CoreSentence coreSentence : sentences){
            System.out.println(coreSentence.toString());
        }


    }
}

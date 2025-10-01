package com.rozy.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text_sentiment = "I am enjoying NLP with JAVA";
        CoreDocument coreDocument = new CoreDocument(text_sentiment);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for(CoreSentence sentence : sentences) {
            String sentiment = sentence.sentiment();
            System.out.println(text_sentiment + "\t" + sentiment);
        }
    }
}

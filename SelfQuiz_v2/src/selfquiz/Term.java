/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfquiz;

import java.util.ArrayList;

/**
 *
 * @author Stone
 */
public class Term
{
    private String term;
    private String type;
    
    private ArrayList<String> basicHints;
    private ArrayList<String> intermediateHints;
    private ArrayList<String> advancedHints;
    
    private ArrayList<String> keyPhrases;
    private ArrayList<String> promptPhrases;
    private ArrayList<String> wrongPhrases;
    
    private boolean keyPhrasesExclusionary;
    
    
    Term(String term, String type, ArrayList<String> basicHints, ArrayList<String> intermediateHints, ArrayList<String> advancedHints, ArrayList<String> keyPhrases, ArrayList<String> promptPhrases, ArrayList<String> wrongPhrases, boolean keyPhrasesExclusionary)
    {
        this.term = term;
        this.type = type;
        
        this.basicHints = basicHints;
        this.intermediateHints = intermediateHints;
        this.advancedHints = advancedHints;
        
        this.keyPhrases = keyPhrases;
        this.promptPhrases = promptPhrases;
        this.wrongPhrases = wrongPhrases;
        
        this.keyPhrasesExclusionary = keyPhrasesExclusionary;
    }
    
    
    public String getTerm() { return term; }
    public String getType() { return type; }
    
    public ArrayList<String> getBasicHints() { return basicHints; }
    public ArrayList<String> getIntermediateHints() { return intermediateHints; }
    public ArrayList<String> getAdvancedHints() { return advancedHints; }
    
    public ArrayList<String> getKeyPhrases() { return keyPhrases; }
    public ArrayList<String> getPromptPhrases() { return promptPhrases; }
    public ArrayList<String> getWrongPhrases() { return wrongPhrases; }
    
    public boolean getKeyPhrasesExclusionary() { return keyPhrasesExclusionary; }
}

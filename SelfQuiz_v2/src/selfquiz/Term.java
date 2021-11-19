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
    
    private ArrayList<String> generalHints;
    private ArrayList<String> dateHints;
    private ArrayList<String> actionHints;
    private ArrayList<String> associationHints;
    
    private ArrayList<String> keyPhrases;
    private ArrayList<String> promptPhrases;
    private ArrayList<String> wrongPhrases;
    
    private boolean keyPhrasesExclusionary;
    
    
    Term(String term, String type, ArrayList<String> generalHints, ArrayList<String> dateHints, ArrayList<String> actionHints, ArrayList<String> associationHints, ArrayList<String> keyPhrases, ArrayList<String> promptPhrases, ArrayList<String> wrongPhrases, boolean keyPhrasesExclusionary)
    {
        this.term = term;
        this.type = type;
        
        this.generalHints = generalHints;
        this.dateHints = dateHintsEnabled;
        this.actionHints = actionHints;
        this.associationHints = associationHints;
        
        this.keyPhrases = keyPhrases;
        this.promptPhrases = promptPhrases;
        this.wrongPhrases = wrongPhrases;
        
        this.keyPhrasesExclusionary = keyPhrasesExclusionary;
    }
    
    
    public String getTerm() { return term; }
    public String getType() { return type; }
    
    public ArrayList<String> getGeneralHints() { return generalHints; }
    public ArrayList<String> getDateHints() { return dateHints; }
    public ArrayList<String> getActionHints() { return actionHints; }
    public ArrayList<String> getAssociationHints() { return associationHints; }
    
    public ArrayList<String> getKeyPhrases() { return keyPhrases; }
    public ArrayList<String> getPromptPhrases() { return promptPhrases; }
    public ArrayList<String> getWrongPhrases() { return wrongPhrases; }
    
    public boolean getKeyPhrasesExclusionary() { return keyPhrasesExclusionary; }
}

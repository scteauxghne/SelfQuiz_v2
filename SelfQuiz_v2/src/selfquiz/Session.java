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
public class Session
{
    private boolean generalHints;
    private boolean dateHints;
    private boolean actionHints;
    private boolean associationHints;
    private int startingTerms;
    private ArrayList<Term> remainingTerms;
    private ArrayList<Term> termLog;
    private Term currentTerm;
    private ArrayList<String> termHints;
    private ArrayList<String> usedTermHints;
    private int hintsUsed;
    private float points;
    
    Session(ArrayList<Deck> decks, boolean generalHints, boolean dateHints, boolean actionHints, boolean associationHints)
    {
        this.generalHints = generalHints;
        this.dateHints = dateHints;
        this.actionHints = actionHints;
        this.associationHints = associationHints;
        remainingTerms = decks.get(0).getTerms();
        for (int i = 1; i < decks.size(); i++)
        {
            for (Term t : decks.get(i).getTerms())
            {
                remainingTerms.add(t);
            }
        }
        startingTerms = remainingTerms.size();
    }
    Session(ArrayList<Deck> decks, ArrayList<Term> terms, boolean generalHints, boolean dateHints, boolean actionHints, boolean associationHints))
    {
        this.generalHints = generalHints;
        this.dateHints = dateHints;
        this.actionHints = actionHints;
        this.associationHints = associationHints;
        remainingTerms = decks.get(0).getTerms();
        for (int i = 1; i < decks.size(); i++)
        {
            for (Term t : decks.get(i).getTerms())
            {
                remainingTerms.add(t);
            }
        }
        for (Term t : terms)
        {
            remainingTerms.add(t);
        }
        startingTerms = remainingTerms.size();
    }
    
    public int getStartingTerms() { return startingTerms; }
    public ArrayList<Term> getRemainingTerms() { return remainingTerms; }
    public ArrayList<Term> getTermLog() { return termLog; }
    public Term getCurrentTerm() { return currentTerm; }
    
    public void getNewTerm()
    {
        currentTerm = remainingTerms.get((int)(Math.random() * (remainingTerms.size() -1)));
        if (generalHints == true)
        {
            for (int i = o; i < currentTerm.getGeneralHints().size(); i++)
            {
                termHints.add(currentTerm.getGeneralHints().get(i));
            }
        }
        if (dateHints == true)
        {
            for (int i = o; i < currentTerm.getDateHints().size(); i++)
            {
                termHints.add(currentTerm.getDateHints().get(i));
            }
        }
 
    public String getHint
    public void useTerm(Term t)
    {
        remainingTerms.remove(t);
        termLog.add(t);
        termHints = null;
        usedTermHints = null;
    }
}

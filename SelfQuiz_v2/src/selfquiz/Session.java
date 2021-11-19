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
    private int startingTerms;
    private ArrayList<Term> remainingTerms;
    private ArrayList<Term> termLog;
    private Term currentTerm;
    
    Session(ArrayList<Deck> decks)
    {
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
    Session(ArrayList<Deck> decks, ArrayList<Term> terms)
    {
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
    public void getNewTerm()
    {
        currentTerm = remainingTerms.get((int)(Math.random() * (remainingTerms.size() -1)));
    }
    public Term getCurrentTerm() { return currentTerm; }
    public void useTerm(Term t)
    {
        remainingTerms.remove(t);
        termLog.add(t);
    }
}

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
public class Deck
{
    private String name;
    private ArrayList<Term> terms;
    
    Deck(String name, ArrayList<Term> terms) { this.name = name; this.terms = terms; }
    
    public String getName() { return name; }
    public ArrayList<Term> getTerms() { return terms; }
    public int size() { return terms.size(); }
}

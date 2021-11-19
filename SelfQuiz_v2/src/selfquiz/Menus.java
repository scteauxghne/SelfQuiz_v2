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
public class Menus
{
    public static boolean isNumeric(String str)
    { 
        try
        {  
            Integer.parseInt(str);  
            return true;
        }   
        catch(NumberFormatException e)
        {  
            return false;  
        }  
    }   
    public void menuSelector(int i)
    {
        if (i == 0) { mainMenu(); }
        if (i == 1) { commandsMenu(); }
        if (i == 2) { setupMenu(); }
    }
    public int commander(int i, String input)
    {
        if (i == 0) { return mainMenuCommand(input); }
        else if (i == 1) { return commandsMenuCommand(input); }
        else if (i == 2) { return setupMenuCommand(input); }
        else { return -1; }
    }
    public void mainMenu() // 0
    {
        System.out.println("==============");
        System.out.println("Self Quiz Game");
        System.out.println("==============");
        System.out.println();
        System.out.println("1. New Game");
        System.out.println("2. Commands");
    }
    public int mainMenuCommand(String input)
    {
        if (input.equals("1")) { return 2; }
        if (input.equals("2")) { return 1; }
        else { return -1; }
    }
    
    public void commandsMenu() // 1
    {
        System.out.println("---Commands---");
        System.out.println();
        System.out.println("1. Back");
    }
    public int commandsMenuCommand(String input)
    {
        if (input.equals("1")) { return 0; }
        else { return -1; }
    }
    
    private ArrayList<Deck> setupDecks = new ArrayList<Deck>();
    public void importDecks(ArrayList<Deck> decks) { setupDecks = decks; }
    private ArrayList<Deck> setupSelectedDecks = new ArrayList<Deck>();
    public ArrayList<Deck> getSelected() { return setupSelectedDecks; }
    
    public void setupMenu() // 2
    {
        System.out.println("--- Game Setup ---");
        if (setupDecks.size() > 0)
        {
            System.out.println();
            System.out.println("< Loaded Decks >");
            for (int i = 0; i < setupDecks.size(); i++)
            {
                System.out.println((i + 1) + ". " + setupDecks.get(i).getName());
            }
        }
        else
        {
            System.out.println();
            System.out.println("No decks loaded");
        }
        if (setupSelectedDecks.size() > 0)
        {
            System.out.println();
            System.out.println("< Selected Decks >");
            for (int i = 0; i < setupSelectedDecks.size(); i++)
            {
                System.out.println((setupDecks.size() + i + 1) + ". " + setupSelectedDecks.get(i).getName());
            }
        }
        System.out.println();
        System.out.println("Start Game [S]");
        System.out.println("Back [B]");
    }
    public int setupMenuCommand(String input)
    {
        if (input.toLowerCase().equals("s"))
        {
            Session session = new Session(setupSelectedDecks);
            return 3;
        }
        else if (input.toLowerCase().equals("b")) { return 0; }
        else if (isNumeric(input) == true)
        {
            if (Integer.parseInt(input) > 0 && Integer.parseInt(input) <= setupDecks.size() + setupSelectedDecks.size())
            {
                if (Integer.parseInt(input) <= setupDecks.size())
                {
                    setupSelectedDecks.add(setupDecks.get(Integer.parseInt(input) - 1));
                    setupDecks.remove(setupDecks.get(Integer.parseInt(input) - 1));
                }
                else
                {
                    setupDecks.add(setupSelectedDecks.get(Integer.parseInt(input) - 1 - setupDecks.size()));
                    setupSelectedDecks.remove(setupSelectedDecks.get(Integer.parseInt(input) - 1 - setupDecks.size()));
                }
            }
            return 2;
        }
        else { return 2; }
    }
    public void activeGameMenu(Session s) // 3
    {
        System.out.println( "(" + (s.getStartingTerms() - (s.getStartingTerms() - s.getRemainingTerms().size())) + "/" + s.getStartingTerms() + ")" );
        System.out.println();
        System.out.println("Question " + (s.getStartingTerms() - (s.getStartingTerms() - s.getRemainingTerms().size())) + ": (" + s.getCurrentTerm().getType() + ")" );
    }
    public int activeGameMenuCommand(Session s, String input)
    {
        //if (input == "1") { return 0; }
        //else { return -1; }
        return 0;
    }
}

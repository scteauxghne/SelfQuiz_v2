/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfquiz;

import java.util.Scanner;

/**
 *
 * @author Stone
 */
public class SelfQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int screen = 0;
        Menus menus = new Menus();
        /*
            0 = main menu
            1 = commands
            2 = setup
            3 = game: active
            4 = game: log
        */
        
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            menus.menuSelector(screen);
            while(scanner.hasNext())
            {
                String input = scanner.nextLine();
                if (menus.commander(screen, input) > -1)
                {
                    screen = menus.commander(screen, input);
                }
                for (int i = 0; i < 1000; i++)
                {
                    System.out.println();
                }
                menus.menuSelector(screen);
            }
        }
    }
}

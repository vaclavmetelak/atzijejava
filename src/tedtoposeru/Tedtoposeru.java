/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tedtoposeru;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Václav
 */
public class Tedtoposeru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Random generace = new Random();
        sc.nextLine();
        System.out.println("select your name");
        String name = sc.nextLine();
        System.out.println("choose your side");
        System.out.println("Red Legion or Derion");
        while (true) {
            String side = sc.nextLine();

            if (side.equals("Red Legion")) {
                System.out.println("For centuries, two empires ");
                System.out.println("led a war one against the other, for so long,");
                System.out.println("that nobody knew the cause, and you a legioner");
                System.out.println("of the Red Legion have to find");
                System.out.println("a peace between them, but");
                System.out.println("because many people find");
                System.out.println("this war like a");
                System.out.println("golden mine, your finding may bring you more");
                System.out.println("enemies on both sides, then the war itself.");
                System.out.println("Good luck " + name);
                break;
            } else if (side.equals("Derion")) {
                System.out.println("For centuries, two empires ");
                System.out.println("led a war one against the other, for so long,");
                System.out.println("that nobody knew the cause, and you a legioner");
                System.out.println("of the Red Legion have to find");
                System.out.println("a peace between them, but");
                System.out.println("because many people find");
                System.out.println("this war like a");
                System.out.println("golden mine, your finding may bring you more");
                System.out.println("enemies on both sides, then the war itself.");
                System.out.println("Good luck " + name);
                break;
            } else {
                System.out.println("invalid faction");
                continue;
            }
        }
        int random = generace.nextInt(2);
        if (random == 0){
            System.out.println();
            System.out.println("You were hunting in a forest with your companions");
            System.out.println("then you heard some shouting and your group splited up");
            System.out.println("After few minutes the group of soldiers is standing in front");
            System.out.println(" you, and one of them is holding a sword with blood on his armor.");
            System.out.println("Acording to red eagle on his chestplate he is probably from The Red Legion, ");
            System.out.println("but they aren't looking very friendly");
            System.out.println("Then one of them aimed on you with a crossbow.");
            System.out.println("What will you do ?");
            System.out.println("run away / fight");
            String reaction = sc.nextLine();
            
            if (reaction.equals("run away")) {
                System.out.println("you tried to run away but they caught up with you and killed two of your soldiers");
                System.out.println("it looks like you have no choice");
                random = generace.nextInt(5);
                
                        
            
        }
        } 
    }

}

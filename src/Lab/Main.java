/**
 * Name: Saul Ouellet
 * Date: Feb 21st 2022
 * Description: Program consists of a Player class that holds name and position variables and a method to determine
 * if Player objects are equal iff the name and pos are the same. Also creates a Team class that holds a name
 * and an ArrayList of Player objects - implements methods to insert Players into the ArrayList and throw
 * exceptions if a duplicate player is added or if the team's max size is reached. The Main creates two teams and
 * sufficiently many unique players to fill them and tests out the team methods/exceptions.
 */

package Lab;

import java.util.Iterator;

/***
 * Main Class
 */
public class Main {

    /***
     * It's a main, what else is there to say?
     * @param args supplies args to main
     */
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player("Josh Anderson", 17);
        Player p4 = new Player("Joel Armia", 40);
        Player p5 = new Player("Paul Bryon", 41);
        Player p6 = new Player("Cole Caufield", 22);
        Player p7 = new Player("Laurent Dauphin", 45);
        Player p8 = new Player("Johnathan Drouin", 92);
        Player p9 = new Player("Christian Dvorak", 28);
        Player p10 = new Player("Jake Evans", 71);
        Player p11 = new Player("Matthew Perreault", 85);
        Player p12 = new Player("Shea Weber", 6);
        Player p13 = new Player("Jeff Petry", 26);
        Player p14 = new Player("Chris Widemen", 20);
        Player p15 = new Player("Sam Montembeault", 35);
        Player p16 = new Player("Carey Price", 31);
        Player p17 = new Player("Nick Suzuki", 14);
        Player p18 = new Player("Mike Hoffman", 68);
        Player p19 = new Player("Random Dude", 1);

        Player[] pPlayers = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19};

        Player d1 = new Player("Anthony Angello", 57);
        Player d2 = new Player("Zach Aston-Reese", 12);
        Player d3 = new Player("Teddy Blueger", 53);
        Player d4 = new Player("Brian Boyle", 11);
        Player d5 = new Player("Jeff Carter", 77);
        Player d6 = new Player("Sidney Crosby", 87);
        Player d7 = new Player("Jake Guentzel", 59);
        Player d8 = new Player("Filip Hallander", 36);
        Player d9 = new Player("Danton Heinen", 43);
        Player d10 = new Player("Kasperi Kapanen", 42);
        Player d11 = new Player("Evgeni Malkin", 71);
        Player d12 = new Player("Brock McGinn", 23);
        Player d13 = new Player("Drew O'Conner", 10);
        Player d14 = new Player("Brian Dumoulin", 8);
        Player d15 = new Player("Marcus Petterson", 28);
        Player d16 = new Player("Casey DeSmith", 1);
        Player d17 = new Player("Tristan Jarry", 35);

        Player[] dPlayers = {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17};

        Team teamA = new Team("Tigers");
        Team teamB = new Team();

        System.out.println("\n========== Testing and Filling up Team A ===========");

        for (int i = 0; i < pPlayers.length; i++) {   //errors adding p2 (duplicate of p1) and
            try {                                   //p19 (team is max size of 17)
                teamA.insert(pPlayers[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n================= Filling up Team B =================");

        for (int i = 0; i < dPlayers.length; i++) {
            try {
                teamB.insert(dPlayers[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n================= Testing Overfilling teams =================");

        for (int i = 0; i < 3; i++) {
            try {
                teamA.insert(dPlayers[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                teamB.insert(pPlayers[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n================= Testing Contains =================");
        System.out.println("Checking " + teamA.getName());
        teamA.contains(p1);     //true
        teamA.contains(p10);    //true
        teamA.contains(p18);    //true
        teamA.contains(d1);     //false
        teamA.contains(d10);    //false
        teamA.contains(d17);    //false
        System.out.println("Checking " + teamB.getName());
        teamB.contains(d1);     //true
        teamB.contains(d10);    //true
        teamB.contains(d17);    //true
        teamB.contains(p1);     //false
        teamB.contains(p10);    //false
        teamB.contains(p18);    //false

        System.out.println("\n================= Printing Teams =================");

        Iterator<Player> iter = teamA.iterator();   //create iterator over roster using Team's iterator method
        System.out.println("       " + teamA.getName() + " Roster");
        System.out.println("==============================");
        while (iter.hasNext()) {
            Player p = iter.next();     //initialize a player p for every player so we can getName and getPos
            System.out.println("    Player: " + p.getName() + "\n        Position: " + p.getPos());
            System.out.println("==============================");
        }

        System.out.println("\n");

        Iterator<Player> iter2 = teamB.iterator();
        System.out.println("       " + teamB.getName() + " Roster");
        System.out.println("==============================");
        while (iter2.hasNext()) {
            Player p = iter2.next();
            System.out.println("    Player: " + p.getName() + "\n        Position: " + p.getPos());
            System.out.println("==============================");
        }

    }

}

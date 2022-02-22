/**
 * Refer to Main
 */

package Lab;

import java.util.ArrayList;
import java.util.Iterator;

/***
 * Class holds an ArrayList of Player objects (roster), a name, and a final int for maxSize of team's roster
 */
public class Team {

    private String name;
    private final int maxSize = 17;
    private ArrayList<Player> roster;

    /**
     * constructor given a String name
     * @param n supplies constructor with String name
     */
    public Team(String n){
        this.name = n;
        roster = new ArrayList<Player>(maxSize);
    }

    /**
     * default constructor, supplies own name
     */
    public Team(){
        this.name = "Defaults";
        roster = new ArrayList<Player>(maxSize);
    }

    /**
     * name Getter
     * @return returns String name
     */
    public String getName(){
        return this.name;
    }

    /**
     * method checks to see if a given Player object is already in the ArrayList roster. Uses an iterator
     * to go through ArrayList
     * @param x supplies Player object to funciton
     * @return returns boolean if Player was found or not
     */
    public boolean contains(Player x){
        Iterator<Player> iterator = this.iterator(); //calls own iterator method bcuz why not
        while(iterator.hasNext()){
            if(x.equals(iterator.next()))
            {
                System.out.println(this.getName() + " contains " + x.getName() + " returning true");
                return true;
            }
        }
        System.out.println(this.getName() + " doesn't contain " + x.getName() + " returning false");
        return false;
    }

    /***
     * function inserts given Player object into ArrayList roster. Throws exceptions if roster contains
     * a duplicate Player or if the roster exceeds the max Size.
     * @param x supplies Player object to function
     * @throws Exception default Exception object
     */
    public void insert(Player x) throws Exception{
        if(!(this.roster.size() < maxSize)) {       //if roster is not smaller than maxSize
            throw new Exception(this.name + " is already max size, " + x.getName() + " not added.");
        }
        else{
            if(this.contains(x)){                   //if roster already contains player we're adding
                throw new Exception(x.getName() + " duplicate found in " + this.name + ", not adding player");
            }
            else
            {
                System.out.println("No " + x.getName() + " duplicate found, adding player.");
                roster.add(x);
            }
        }
    }

    /**
     * methods provides iterator object pointing to the ArrayList roster
     * @return returns a Player Iterator object
     */
    public Iterator<Player> iterator(){
        return roster.iterator();
    }


}


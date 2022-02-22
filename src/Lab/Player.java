/**
 * Refer to Main
 */

package Lab;

/***
 * Class holds int position and String name
 */
public class Player {

    private int pos;
    private String name;

    /**
     * Default constructor
     */
    public Player(){
        this.pos = 0;
        this.name = "Dea Fault";
    }

    /***
     * Constructor given a specific name and position
     * @param n supplies name to constructor
     * @param p supplies position to constructor
     */
    public Player(String n, int p){
        this.pos = p;
        this.name = n;
    }

    /**
     * name Getter
     * @return returns String of the name
     */
    public String getName(){
        return this.name;
    }

    /**
     * position Getter
     * @return returns int of the position
     */
    public int getPos(){
        return this.pos;
    }

    /**
     * function checks to see if Player objects are equal based on its name and position class variables
     * @param x supplies Player object to check to function
     * @return returns boolean determining equality
     */
    public boolean equals(Player x){
        if(this.pos == x.getPos() && this.name.equals(x.getName())) {
            //System.out.println("Players match, returning true.");
            return true;
        }
        //System.out.println("Players don't match, returning false.");
        return false;
    }

}

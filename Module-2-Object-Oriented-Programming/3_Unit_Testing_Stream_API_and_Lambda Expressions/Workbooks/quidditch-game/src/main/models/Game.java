package src.main.models;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;

public class Game {
    // Fields
    private HashMap<Team,Integer> scoreboard;
    // Static Variables
    private static int gameCount;
    private static final int QUAFFLE_POINTS = 10;
    private static final int SNITCH_POINTS = 150;
    
    // Constructor
    public Game(Team home, Team away) {
        this.scoreboard = new HashMap<Team, Integer>();
        this.scoreboard.put(new Team(home), 0);
        this.scoreboard.put(new Team(away), 0);
        gameCount++;
    }

    // Getter - getScore()
    // Returns the score for the requested team
    public Integer getScore(Team team){
        return this.scoreboard.get(team);
    }

    // Getter - getTeam()
    public Team getTeam(String name){
        return this.scoreboard.keySet().stream()
                                        .filter(key -> key.getHouse().equals(name))
                                        .findFirst().orElse(null);
    }

    // Setter - setScore()
    // Sets the score for the requested team
    public void setScore(Team team, Integer Score){
        if(team== null){
            throw new IllegalArgumentException("Cannot add null score to the scoreboard");
        }
        this.scoreboard.put(team, Score);
    }

    // Static Methods
    public static int getGameCount(){
        return gameCount;
    }
    public static int getQuafflePoints(){
        return QUAFFLE_POINTS;
    }
    public static int getSnitchPoints(){
        return SNITCH_POINTS;
    }

    /**
    * Function name: getPlaceholder
    * @param play (String)
    * @return (String)
    * 
    * Inside the function:
    *  1. Returns a substring between two < > characters.
    */
    public String getPlaceHolder(String play){
        return play.substring(play.indexOf("<")+1,play.indexOf(">"));
    }

    /** 
     * Function name: replacePlaceholder
     * @param play
     * @param placeholder
     * @param value
     * @return (String)
     * 
     * Inside the function:
     *  1. Replaces the placeholder in a play with a value
     */
    public String replacePlaceHolder(String play, String placeholder, String value){
        return play.replace("<"+placeholder+">", value);
    }

    /**
     * Function name: quaffleScore
     * @param team
     * 
     * Inside the function:
     *  1. Update the team's points by `QUAFFLE_POINTS`. <---
     */
    public void quaffleScore(Team team){
        //this.scoreboard.put(team,(this.scoreboard.get(team)+QUAFFLE_POINTS));
        this.setScore(team, this.getScore(team)+QUAFFLE_POINTS);
    }

    /**
     * Function name: catchSnitch
     * @param team
     * 
     * Inside the function:
     *  1. Update the team's points by `SNITCH_POINTS`. <---
     */
    public void catchSnitch(Team team){
        this.setScore(team, this.getScore(team)+SNITCH_POINTS);
    }

    /**
     * Function name: getRandomTeam()
     * @return (Team)
     * 
     *  1. converts scoreBoard to keySet.
     *  2. converts keyset to array (easier to index).
     *  3. returns a random team from the array of teams. 
     */
    public Team getRandomTeam(){
        Object[] teams = scoreboard.keySet().toArray();
        return (Team)teams[random(teams.length)];
    }

    public int random(int range){
        return ThreadLocalRandom.current().nextInt(0,range);
    }

    /**
     * Function name: simulate(String play)
     * @return String
     * 
     *  1. From the play, retrieve the placeholder.
     *  2. Get a random team from the HashMap
     *  3. Check the placeholder 
     *      - Team.POSITION_CHASER -> score with quaffle -> get name of a Chaser
     *      - Team.POSITION_SEEKER -> catch snitch -> get name of Seeker
     *      - Team.POSITION_KEEPER -> get name of Keeper
     *  4. return a string using replacePlaceHolder describing the play
     */
    public String simulate(String play) {
        String placeholder = getPlaceHolder(play);
        Team team = getRandomTeam();
        String value = "";
        
        if (placeholder.equals(Team.getPositionChaser())) {
            quaffleScore(team);
            value = team.getChasers()[random(team.getChasers().length)];
        } else if (placeholder.equals(Team.getPositionSeeker())) {
            catchSnitch(team);
            value = team.getSeeker();
        } else if (placeholder.equals(Team.getPositionKeeper())) {
            value = team.getKeeper();
        } 

        return replacePlaceHolder(play, placeholder, value);
    }

}

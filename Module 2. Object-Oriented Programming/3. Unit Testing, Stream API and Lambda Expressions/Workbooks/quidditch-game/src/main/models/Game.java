package src.main.models;

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
            throw new IllegalArgumentException("Cannot add null team to the scoreboard");
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


}

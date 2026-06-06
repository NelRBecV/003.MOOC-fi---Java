/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Team {
    private String teamName;
    private int teamMatches;
    private int teamWins;
    private int teamLoses;
    
    public Team(String name){
        this.teamName = name;
        this.teamMatches = 0;
        this.teamWins = 0;
        this.teamLoses = 0;
    }
    
    public void addMatch(int ownPoints, int contenderPoints){
        if (ownPoints > contenderPoints){
            this.teamWins++;
        } else {
            this.teamLoses++;
        }
        this.teamMatches++;
    }
    public String getTeamName(){
        return this.teamName;
    }
    public int getPlayedMatches(){
        return this.teamMatches;
    }
    public int getWins(){
        return this.teamWins;
    }
    
    public int getLoses(){
        return this.teamLoses;
    }
}

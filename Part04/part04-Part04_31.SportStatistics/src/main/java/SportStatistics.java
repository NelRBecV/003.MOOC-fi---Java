
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {    
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine().strip();
        try {
            Scanner data = new Scanner(Paths.get(file));
            Team teamSearch = new Team(team);
            while(data.hasNextLine()){
                //System.out.println(data.nextLine());
                String currentData = data.nextLine();
                if (currentData.contains(team)){                    
                    String[] teamInfo = currentData.split(",");
                    int score1 = Integer.valueOf(teamInfo[2]);
                    int score2 = Integer.valueOf(teamInfo[3]);
                    if (team.equals(teamInfo[0])){                        
                        teamSearch.addMatch(score1,score2);                        
                    } else if (team.equals(teamInfo[1])){                        
                        teamSearch.addMatch(score2,score1);
                    } 
                }                
            }
            System.out.println("Games: " + teamSearch.getPlayedMatches());
            System.out.println("Wins: " + teamSearch.getWins());
            System.out.println("Losses: " + teamSearch.getLoses());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage() + " hasn't found.");
        }
    }

}

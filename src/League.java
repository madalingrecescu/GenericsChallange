import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String leagueName;
    private ArrayList<T> leagueTeams = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void addTeam(T team){
        if(this.leagueTeams.contains(team)){
            System.out.println(team.getTeamName() + " is already in the league!");
        } else {
            this.leagueTeams.add(team);
            System.out.println(team.getTeamName() + " entered the " + this.leagueName);
        }
    }

    public void print(){
        Collections.sort(this.leagueTeams);
        System.out.println(this.leagueName + " clasament:");
        for (int i=0; i<this.leagueTeams.size();i++){
            System.out.println(i+1 + ". " + this.leagueTeams.get(i).getTeamName() + " with "
                    + this.leagueTeams.get(i).getLeaguePoints() + " points.");
        }
    }

}

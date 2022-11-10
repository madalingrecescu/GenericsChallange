public abstract class Team implements Comparable<Team>{

    private String teamName;
    private int leaguePoints;

    public Team(String teamName, int leaguePoints) {
        this.teamName = teamName;
        this.leaguePoints = leaguePoints;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }
    @Override
    public int compareTo(Team team) {
        if (this.getLeaguePoints() > team.getLeaguePoints()){
            return -1;
        } else if(this.getLeaguePoints() < team.getLeaguePoints()){
            return 1;
        } else {
            return 0;
        }
    }
}

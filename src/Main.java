public class Main {
    public static void main(String[] args) {
        FootballTeam dinamo = new FootballTeam("Dinamo",10);
        FootballTeam steaua = new FootballTeam("Steaua",13);
        FootballTeam cfr = new FootballTeam("CFR",11);

        BaseballTeam lakers = new BaseballTeam("Lakers", 35);
        BaseballTeam chicagobulls = new BaseballTeam("Chicago Bulls", 25);

        League<FootballTeam> footballLeague = new League<>("Football league");
        League<BaseballTeam> basketballLeague = new League<>("Basketball League");

        footballLeague.addTeam(dinamo);
        footballLeague.addTeam(dinamo);
        footballLeague.addTeam(steaua);
        footballLeague.addTeam(cfr);
        basketballLeague.addTeam(lakers);
        basketballLeague.addTeam(chicagobulls);
//        footballLeague.addTeam(lakers);

        footballLeague.print();
        basketballLeague.print();

    }
}
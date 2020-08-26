public class Main {
    public static void main(String[] args) {
        FootballPlayer suhas =new FootballPlayer("Suhas");
        BaseballPlayer varun = new BaseballPlayer("Varun");
        SocerrPlayer krish = new SocerrPlayer("Krish");

        //use of this, we cant add football player to baskbet ball team
        Team<FootballPlayer> rushHour = new Team<>("RushHour");
        rushHour.addPlayer(suhas);
//        It is going to throw error as varun is a basketball player not a football
//        rushHour.addPlayer(varun)

        System.out.println("no of players in  rush hour team: "+rushHour.numPlayers());

        Team<FootballPlayer> terminators =new Team<>("Terminators");

        rushHour.matchResult(terminators,3,1);

        Team<BaseballPlayer> bouncingBall = new Team<>("BouncingBall");

        System.out.println("ranking of rushHour is "+rushHour.ranking());
//        we get error because the  we  cant match footbal team with basketball
//        bouncingBall.matchResult(terminators,2,1);

        System.out.println(rushHour.compareTo(terminators));
    }
}

package Generic;

public class Min2 {
    public static void main(String[] args) {

        FootBallPlayer joe = new FootBallPlayer("joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer>adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayerr());

        Team<BaseBallPlayer> ballPlayerTeam = new Team<>("Cubs");
        ballPlayerTeam.addPlayer(pat);
    }

}

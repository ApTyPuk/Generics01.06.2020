package com.Artur;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseBallTeam = new Team<>("Chicago Cubs");
        baseBallTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won;t work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourn = new Team<>("Melnbourn");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourn.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        adelaideCrows.matchResult(baseBallTeam, 1, 1);

    }
}

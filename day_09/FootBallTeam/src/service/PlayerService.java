package service;

import model.Player;
import model.Position;

import java.lang.reflect.Array;
import java.util.*;

import static model.Position.*;

public class PlayerService {

    private Random randomPlayer;
    private ArrayList<Player> players;

    public PlayerService() {
        init();
    }

    private void init() {
        players = new ArrayList<>();
        // Các cầu thủ thuộc vị trí thủ môn
        players.add(new Player(1, "Bernd Leno", GK));
        players.add(new Player(2, "Aaron Ramsdale", GK));
        players.add(new Player(3, "Arthur Okonkwo", GK));

        // Các cầu thủ thuộc vị trí hậu vệ
        players.add(new Player(4, "Kieran Tierney", Position.DF));
        players.add(new Player(5, "Ben White", Position.DF));
        players.add(new Player(6, "Gabriel Magalhães", Position.DF));
        players.add(new Player(7, "Rob Holding", Position.DF));
        players.add(new Player(8, "Cédric Soares", Position.DF));
        players.add(new Player(9, "Takehiro Tomiyasu", Position.DF));
        players.add(new Player(10, "Nuno Tavares", Position.DF));

        // Các cầu thủ thuộc vị trí tiền vệ
        players.add(new Player(11, "Thomas Partey", Position.MF));
        players.add(new Player(12, "Bukayo Saka", Position.MF));
        players.add(new Player(13, "Martin Ødegaard", Position.MF));
        players.add(new Player(14, "Emile Smith Rowe", Position.MF));
        players.add(new Player(15, "Albert Sambi Lokonga", Position.MF));
        players.add(new Player(16, "Mohamed Elneny", Position.MF));
        players.add(new Player(17, "Granit Xhaka", Position.MF));

        // Các cầu thủ thuộc vị trí tiền đạo
        players.add(new Player(18, "Alexandre Lacazette ", Position.FW));
        players.add(new Player(19, "Nicolas Pépé", Position.FW));
        players.add(new Player(20, "Eddie Nketiah", Position.FW));
        players.add(new Player(21, "Gabriel Martinelli", Position.FW));
    }

    public ArrayList<Player> buildTeam(int GKNumber, int DFNumber, int MFNumber, int FWNumber) {
        ArrayList<Player> team = new ArrayList<>();
        ArrayList<Player> GK = this.getPlayers(Position.GK,GKNumber);
        ArrayList<Player> DF = this.getPlayers(Position.DF,DFNumber);
        ArrayList<Player> MF = this.getPlayers(Position.MF,MFNumber);
        ArrayList<Player> FW = this.getPlayers(Position.FW,FWNumber);
        team.addAll(GK);
        team.addAll(DF);
        team.addAll(MF);
        team.addAll(FW);
        return team;
    }

    public ArrayList<Player> getPlayers(Position position, int number) {
        ArrayList<Player> players1 = new ArrayList<>();
        ArrayList<Player> players2 = new ArrayList<>();
        for (Player player:players) {
            if(player.getPosition().equals(position)){
                players1.add(player);
            }
        }
        Collections.shuffle(players1);
        for(int i = 0; i<number;i++) {
            players2.add(players1.get(i));
        }
        return players2;
    }

    public void printInfo(ArrayList<Player> team) {
        for (Player player: team) {
            System.out.println(player);
        }
    }
}






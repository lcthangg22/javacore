import models.Player;
import services.PlayerServices;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayerServices playerServices = new PlayerServices();
        ArrayList<Player> team= playerServices.getTeams(1,3,5,2);
        playerServices.printTeam(team);
    }
}
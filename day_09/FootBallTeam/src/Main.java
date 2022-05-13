
import model.Player;
import service.PlayerService;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        ArrayList<Player> team = playerService.buildTeam(1,3,5,2);
        playerService.printInfo(team);
    }
}

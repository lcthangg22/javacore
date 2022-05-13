
import model.Player;
import service.PlayerService;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        ArrayList<Player> team = playerService.buildTeam(1,4,3,3);
        playerService.printInfo(team);
    }
}

package fr.xenover.practice.Listener;

import fr.xenover.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class GPlayerListener implements Listener {

    private Practice main;

    public GPlayerListener(Practice practice) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        Location spawn = new Location(Bukkit.getWorld("world"), -311.004, 99, -2.497, 76.1f, 6.7f);

        player.teleport(spawn);
        player.setHealth(20);
        player.setFoodLevel(20);
        player.setGameMode(GameMode.ADVENTURE);
    }

}

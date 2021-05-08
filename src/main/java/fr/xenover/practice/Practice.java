package fr.xenover.practice;

import fr.mrmicky.fastinv.FastInvManager;
import fr.xenover.practice.Command.CommandDuel;
import fr.xenover.practice.Command.CommandElo;
import fr.xenover.practice.Gui.ItemPractice;
import fr.xenover.practice.Listener.GDamageListeners;
import fr.xenover.practice.Listener.GPlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;


public final class Practice extends JavaPlugin implements CommandExecutor {

    private final Map<UUID, UUID> playerduelselect = new HashMap<>();
    private final List<Player> players = new ArrayList<>();
    public static Practice instance;



    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new ItemPractice(), this);
        FastInvManager.register(this);
        Bukkit.getPluginManager().registerEvents(new GPlayerListener(this), this);
        Bukkit.getPluginManager().registerEvents(new GDamageListeners(this), this);


        // Command
        getCommand("duel").setExecutor(new CommandDuel());
        getCommand("elo").setExecutor(new CommandElo());

    }

    @Override
    public void onDisable() {

    }

    public static Practice getInstance() {
        return instance;
    }

    public Map<UUID, UUID> getPlayerduelselect() {
        return playerduelselect;
    }

    public void eliminate(Player player) {
        if(players.contains(player)) players.remove(player);
        player.setGameMode(GameMode.ADVENTURE);
        player.sendMessage("§2Vous avez perdu !");
    }

}

package fr.xenover.practice.Command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CommandElo implements CommandExecutor {

    int Elo = 100;
    int pelo = 120;
    Map<UUID, Integer> elo = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //  /elo <Joueur>
        if(label.equalsIgnoreCase("elo") && sender instanceof Player){
            Player player = (Player) sender;

            if(args.length == 0) {
                player.sendMessage("§eTon elo est de : §r" + Elo);
            }

            if (args.length == 1) {
                String targetName = args[0];

                if (Bukkit.getPlayer(targetName) != null) {
                    Player target = Bukkit.getPlayer(targetName);
                    player.sendMessage("§eTon elo est de : §r" + pelo);

                }

                else{
                    player.sendMessage("§cCe Joueur n'est pas encore venu sur le serveur");
                }
            }
        }

            return false;
    }
}

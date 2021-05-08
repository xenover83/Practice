package fr.xenover.practice.Command;

import fr.xenover.practice.Gui.SelectionKit;
import fr.xenover.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



public class CommandDuel implements CommandExecutor {

    private final Map<UUID, UUID> players = new HashMap<>();
    private final Map<UUID, UUID> playerduelselect = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // --> /duel |info
        // --> /duel <player> |enclencher le duel
        // --> /duel accepter/refuser

        if (sender instanceof Player) {
            Player player = (Player) sender;

            // --> /duel
            if (args.length == 0) {
                player.sendMessage("§e/§rduel <player>");
                player.sendMessage("§e/§rduel <accepter/refuser>");
                return true;
            }

            // --> /duel <player>
            if (args.length == 1) {
                String targetName = args[0];

                if (args[0].equalsIgnoreCase("accepter")) {

                    if (players.containsKey(player.getUniqueId())) {

                        player.sendMessage("Ok, le duel se lance !");

                        Player firstPlayerTarget = Bukkit.getPlayer(playerduelselect.get(player.getUniqueId()));
                        firstPlayerTarget.sendMessage("Ok, le duel se lance !");

                        //teleport
                        player.teleport(new Location(Bukkit.getWorld("world"), -259.300, 77, -24.540, 90f, 2.5f));
                        firstPlayerTarget.teleport(new Location(Bukkit.getWorld("world"), -266.700, 77, -24.585, 90f, 2.5f));

                        //Gamemode
                        player.setGameMode(GameMode.ADVENTURE);
                        firstPlayerTarget.setGameMode(GameMode.ADVENTURE);

                        player.getInventory().clear();
                        firstPlayerTarget.getInventory().clear();

                        // ItemFight
                        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
                        ItemStack pearl = new ItemStack(Material.ENDER_PEARL, 16);
                        ItemStack steak = new ItemStack(Material.COOKED_BEEF, 64);
                        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
                        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
                        Potion pot = new Potion(PotionType.INSTANT_HEAL, 1);
                        pot.setSplash(true);
                        ItemStack ih = pot.toItemStack(1);
                        Potion pot1 = new Potion(PotionType.SPEED,1);
                        pot1.setSplash(false);
                        ItemStack sp = pot1.toItemStack(1);
                        Potion pot2 = new Potion(PotionType.FIRE_RESISTANCE, 1);
                        pot2.setSplash(false);
                        ItemStack fr = pot2.toItemStack(1);

                        firstPlayerTarget.getInventory().setItem(0, sword);
                        firstPlayerTarget.getInventory().setItem(1, pearl);
                        firstPlayerTarget.getInventory().setItem(2, sp);
                        firstPlayerTarget.getInventory().setItem(3, fr);
                        firstPlayerTarget.getInventory().setItem(4, ih);
                        firstPlayerTarget.getInventory().setItem(5, ih);
                        firstPlayerTarget.getInventory().setItem(6, ih);
                        firstPlayerTarget.getInventory().setItem(7, ih);
                        firstPlayerTarget.getInventory().setItem(8, steak);
                        firstPlayerTarget.getInventory().setItem(9, ih);
                        firstPlayerTarget.getInventory().setItem(10, ih);
                        firstPlayerTarget.getInventory().setItem(11, ih);
                        firstPlayerTarget.getInventory().setItem(12, ih);
                        firstPlayerTarget.getInventory().setItem(13, ih);
                        firstPlayerTarget.getInventory().setItem(14, ih);
                        firstPlayerTarget.getInventory().setItem(15, ih);
                        firstPlayerTarget.getInventory().setItem(16, ih);
                        firstPlayerTarget.getInventory().setItem(17, ih);
                        firstPlayerTarget.getInventory().setItem(18, ih);
                        firstPlayerTarget.getInventory().setItem(19, ih);
                        firstPlayerTarget.getInventory().setItem(20, ih);
                        firstPlayerTarget.getInventory().setItem(21, ih);
                        firstPlayerTarget.getInventory().setItem(22, ih);
                        firstPlayerTarget.getInventory().setItem(23, ih);
                        firstPlayerTarget.getInventory().setItem(24, ih);
                        firstPlayerTarget.getInventory().setItem(25, ih);
                        firstPlayerTarget.getInventory().setItem(26, sp);
                        firstPlayerTarget.getInventory().setItem(27, ih);
                        firstPlayerTarget.getInventory().setItem(28, ih);
                        firstPlayerTarget.getInventory().setItem(29, ih);
                        firstPlayerTarget.getInventory().setItem(30, ih);
                        firstPlayerTarget.getInventory().setItem(31, ih);
                        firstPlayerTarget.getInventory().setItem(32, ih);
                        firstPlayerTarget.getInventory().setItem(33, ih);
                        firstPlayerTarget.getInventory().setItem(34, ih);
                        firstPlayerTarget.getInventory().setItem(35, sp);
                        firstPlayerTarget.getInventory().setHelmet(helmet);
                        firstPlayerTarget.getInventory().setChestplate(chestplate);
                        firstPlayerTarget.getInventory().setLeggings(leggings);
                        firstPlayerTarget.getInventory().setBoots(boots);

                        player.getInventory().setItem(0, sword);
                        player.getInventory().setItem(1, pearl);
                        player.getInventory().setItem(2, sp);
                        player.getInventory().setItem(3, fr);
                        player.getInventory().setItem(4, ih);
                        player.getInventory().setItem(5, ih);
                        player.getInventory().setItem(6, ih);
                        player.getInventory().setItem(7, ih);
                        player.getInventory().setItem(8, steak);
                        player.getInventory().setItem(9, ih);
                        player.getInventory().setItem(10, ih);
                        player.getInventory().setItem(11, ih);
                        player.getInventory().setItem(12, ih);
                        player.getInventory().setItem(13, ih);
                        player.getInventory().setItem(14, ih);
                        player.getInventory().setItem(15, ih);
                        player.getInventory().setItem(16, ih);
                        player.getInventory().setItem(17, ih);
                        player.getInventory().setItem(18, ih);
                        player.getInventory().setItem(19, ih);
                        player.getInventory().setItem(20, ih);
                        player.getInventory().setItem(21, ih);
                        player.getInventory().setItem(22, ih);
                        player.getInventory().setItem(23, ih);
                        player.getInventory().setItem(24, ih);
                        player.getInventory().setItem(25, ih);
                        player.getInventory().setItem(26, sp);
                        player.getInventory().setItem(27, ih);
                        player.getInventory().setItem(28, ih);
                        player.getInventory().setItem(29, ih);
                        player.getInventory().setItem(30, ih);
                        player.getInventory().setItem(31, ih);
                        player.getInventory().setItem(32, ih);
                        player.getInventory().setItem(33, ih);
                        player.getInventory().setItem(34, ih);
                        player.getInventory().setItem(35, sp);
                        player.getInventory().setHelmet(helmet);
                        player.getInventory().setChestplate(chestplate);
                        player.getInventory().setLeggings(leggings);
                        player.getInventory().setBoots(boots);

                        players.remove(player.getUniqueId());

                    }

                } else if (args[0].equalsIgnoreCase("refuser")) {

                    if (players.containsKey(player.getUniqueId())) {
                        player.sendMessage("Vous avez refuser le duel");

                        Player firstPlayerTarget = Bukkit.getPlayer(players.get(player.getUniqueId()));
                        firstPlayerTarget.sendMessage("Le joueur §e" + player.getName() + "§r a refusé le duel!");

                        players.remove(player.getUniqueId());
                    }

                } else if (Bukkit.getPlayer(targetName) != null) {
                    Player target = Bukkit.getPlayer(players.get(player.getUniqueId()));

                    if (players.containsKey(target.getUniqueId())) {
                        player.sendMessage("§2Ce Joueur a déjà une demande du duel en cours");
                        return true;
                    }

                    new SelectionKit().open(player);
                    Practice.getInstance().getPlayerduelselect().put(player.getUniqueId(), player.getUniqueId());
                    players.put(player.getUniqueId(), player.getUniqueId());
                } else {
                    player.sendMessage("§dLe joueur §r" + targetName + " §dn'est pas connecté sur le serveur");
                }

                return true;
            }


        }

        return false;
    }

}

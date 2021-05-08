package fr.xenover.practice.Gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemPractice implements Listener {


    //Event quand un joueur join
    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();
        player.getInventory().clear();
        player.getInventory().setArmorContents(new ItemStack[4]);

        // création de l'item quand un joueur join
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta Sword = sword.getItemMeta();
        Sword.setDisplayName("§eDuel");
        sword.setItemMeta(Sword);
        player.getInventory().setItem(4, sword);

    }

    //Event quand un joueur click droit sur l'épée
    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack it = e.getItem();

        if(it == null) return;

        //Inventaire sélection des kits

        if(it.getType() == Material.DIAMOND_SWORD && it.getItemMeta().getDisplayName().equalsIgnoreCase("§eDuel")){

            new SelectionKit().open(player);

        }
    }

}

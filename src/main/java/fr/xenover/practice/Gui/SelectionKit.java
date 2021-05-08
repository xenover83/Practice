package fr.xenover.practice.Gui;

import fr.mrmicky.fastinv.FastInv;
import fr.xenover.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import java.util.Arrays;

public class SelectionKit extends FastInv {
    private final boolean preventClose = false;

    public SelectionKit() {
        super(9, "§bSélection des kits");

        Potion pot = new Potion(PotionType.INSTANT_HEAL, 1);
        pot.setSplash(true);
        ItemMeta potMeta = pot.toItemStack(1).getItemMeta();
        potMeta.setDisplayName("§eNo Debuff");
        potMeta.setLore(Arrays.asList("En jeu : 4","En attente : 1"));
        ItemStack is = pot.toItemStack(1);
        is.setItemMeta(potMeta);
        setItem(0, is, e -> {
            Player target = Bukkit.getPlayer(Practice.getInstance().getPlayerduelselect().get(e.getWhoClicked().getUniqueId()));
            Practice.getInstance().getPlayerduelselect().remove(e.getWhoClicked().getUniqueId());
            if(target == null) return;

            Player player = (Player) e.getWhoClicked();
            player.sendMessage("§bVous demandez un duel contre : §r" + target);
            target.sendMessage("§9Vous venez de recevoir une demande de duel de §r" + player.getName());
            player.closeInventory();
        });



    }
}

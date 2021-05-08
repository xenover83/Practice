package fr.xenover.practice.Listener;

import fr.xenover.practice.Practice;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class GDamageListeners implements Listener {

    private final Practice main;

    public GDamageListeners(Practice main) {
        this.main = main;
    }

    @EventHandler
    public void onDamage(EntityDamageEvent e){

        Entity victim = e.getEntity();

        if(victim instanceof Player){

            Player player = (Player)victim;
            if(player.getHealth() <= e.getDamage()){
                e.setDamage(0);
                main.eliminate(player);
            }

        }

    }

    @EventHandler
    public void onPvp(EntityDamageByEntityEvent e){

        Entity victim = e.getEntity();

        if(victim instanceof Player){

            Player player = (Player)victim;
            Entity damager = e.getDamager();
            Player killer = player;

            if(player.getHealth() <= e.getDamage()){
                if(damager instanceof Player) killer = (Player)damager;

                killer.sendMessage("tu as tué : " + player.getName());
                e.setDamage(0);
                main.eliminate(player);
            }

        }

    }
}

package euorg.nuvoprojects.cachezero1.loottables;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World.Environment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import euorg.nuvoprojects.cachezero1.items.ItemCreator;

public class StarFragment implements Listener {
    
    @EventHandler
    public void entityDeath(EntityDeathEvent event) {

        LivingEntity dead = event.getEntity();
        EntityType type = dead.getType();
        if (!(dead.getWorld().getEnvironment().equals(Environment.NORMAL))) { return; }
        if (dead.getKiller() == null) { return; }

        long time = dead.getWorld().getTime();
        Player killer = dead.getKiller();


        if (time >= 13000 && time <= 23000) {

            if (
                type.equals(EntityType.ZOMBIE) ||
                type.equals(EntityType.SKELETON) ||
                type.equals(EntityType.SPIDER) ||
                type.equals(EntityType.WITCH) ||
                type.equals(EntityType.CREEPER)
            ) {

                Random random = new Random();

                if (random.nextInt(101) <= 2) {
                
                    event.getDrops().clear(); 
                    event.getDrops().add(ItemCreator.starFragment);

                    Bukkit.getServer().broadcastMessage(ChatColor.GOLD + killer.getDisplayName() + ChatColor.AQUA + " has found " + ChatColor.YELLOW + "Ocelot's Blessing " + ChatColor.GOLD + "(2% Drop Chance)");
                   
                }

            }

        }

    }

}

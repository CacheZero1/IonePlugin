package euorg.nuvoprojects.cachezero1.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import euorg.nuvoprojects.cachezero1.items.ItemCreator;

public class ItemEffects implements Listener {

    // Star Fragment Moon effect
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {

        if (event.getDamager() == null || event.getEntity() == null) { return; }

        if (event.getDamager() instanceof Player && event.getEntity() instanceof LivingEntity) {

            Player player = (Player) event.getDamager();
            LivingEntity entity = (LivingEntity) event.getEntity();

            if ((!(player.getInventory().getItemInMainHand().getItemMeta() == null)) && (!(player.getInventory().getItemInMainHand().getType() == Material.AIR))) {

            
                if (player.getInventory().getItemInMainHand().getItemMeta().equals(ItemCreator.starFragment.getItemMeta())) {

                    PotionEffect levitateEffect = new PotionEffect(PotionEffectType.LEVITATION, 240, 12, false, false, false);
                    levitateEffect.apply(entity);

                }

            }
        
        }

    }

    // Ocelot's Blessing Speed effect
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand() == null || player.getInventory().getItemInMainHand().getType() == Material.AIR) { return; }
        if (event.getAction() == null) { return; }

        if (
            event.getAction() == Action.RIGHT_CLICK_AIR && player.getInventory().getItemInMainHand().getItemMeta().equals(ItemCreator.ocelotsBlessing.getItemMeta()) || 
            event.getAction() == Action.RIGHT_CLICK_BLOCK && player.getInventory().getItemInMainHand().getItemMeta().equals(ItemCreator.ocelotsBlessing.getItemMeta())
        ) {
            player.sendMessage(ChatColor.AQUA + "You used 1 " + ChatColor.YELLOW + ChatColor.BOLD + "Ocelot's Blessing" + ChatColor.RESET + ChatColor.AQUA + " for 5 minutes of benefits!");

            ItemStack heldItem = player.getInventory().getItemInMainHand();

            // Remove 1 Item from Stack
            player.getInventory().getItemInMainHand().setAmount(heldItem.getAmount() - 1);

            PotionEffect speedEffect = new PotionEffect(PotionEffectType.SPEED, 6000, 3, false, false, true);
            PotionEffect jumpEffect = new PotionEffect(PotionEffectType.JUMP, 6000, 3, false, false, true);
            
            player.addPotionEffect(speedEffect);
            player.addPotionEffect(jumpEffect);

        }

    }
    
}

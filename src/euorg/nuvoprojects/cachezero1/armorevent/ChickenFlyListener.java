package euorg.nuvoprojects.cachezero1.armorevent;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import euorg.nuvoprojects.cachezero1.customevent.ArmorEquipEvent;
import euorg.nuvoprojects.cachezero1.items.ArmorCreator;

public class ChickenFlyListener implements Listener {
    
    @EventHandler
    public void onArmorEquip(ArmorEquipEvent event) {

        Player player = event.getPlayer();
        EntityEquipment playerInv = event.getPlayer().getEquipment();

        ItemStack helmet = playerInv.getHelmet();
        ItemStack chestplate = playerInv.getChestplate();
        ItemStack leggings = playerInv.getLeggings();
        ItemStack boots = playerInv.getBoots();

        // Equip Check and Set Invisible
        if ((!(event.getNewArmorPiece() == null)) && (!(event.getNewArmorPiece().getType() == Material.AIR)) && (!(event.getNewArmorPiece().getItemMeta() == null))) {

            if (
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.chickenFlyHelmet.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.chickenFlyChestplate.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.chickenFlyLeggings.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.chickenFlyBoots.getItemMeta())
            ) {

                if (event.getNewArmorPiece().getType().equals(Material.LEATHER_HELMET)) {

                    if (
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.chickenFlyChestplate.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.chickenFlyLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.chickenFlyBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.WHITE + "[CHICKENFLIER] " + ChatColor.WHITE + player.getDisplayName());

                        PotionEffect fly = new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 1, false, false, false);
                        player.addPotionEffect(fly);

                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.WHITE + "CHICKENFLIER" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_CHESTPLATE)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.chickenFlyHelmet.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.chickenFlyLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.chickenFlyBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.WHITE + "[CHICKENFLIER] " + ChatColor.WHITE + player.getDisplayName());

                        PotionEffect fly = new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 1, false, false, false);
                        player.addPotionEffect(fly);

                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.WHITE + "CHICKENFLIER" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_LEGGINGS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.chickenFlyHelmet.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.chickenFlyChestplate.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.chickenFlyBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.WHITE + "[CHICKENFLIER] " + ChatColor.WHITE + player.getDisplayName());

                        PotionEffect fly = new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 1, false, false, false);
                        player.addPotionEffect(fly);

                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.WHITE + "CHICKENFLIER" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_BOOTS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.chickenFlyHelmet.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.chickenFlyChestplate.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.chickenFlyLeggings.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.WHITE + "[CHICKENFLIER] " + ChatColor.WHITE + player.getDisplayName());

                        PotionEffect fly = new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 1, false, false, false);
                        player.addPotionEffect(fly);

                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.WHITE + "CHICKENFLIER" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                }

            }

        } else if (player.getDisplayName().startsWith(ChatColor.WHITE + "[CHICKENFLIER] ")) {

            player.removePotionEffect(PotionEffectType.SLOW_FALLING);
            player.setDisplayName(player.getDisplayName().replace(ChatColor.WHITE + "[CHICKENFLIER] ", ""));

        }

    }

}

package euorg.nuvoprojects.cachezero1.armorevent;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import euorg.nuvoprojects.cachezero1.customevent.ArmorEquipEvent;
import euorg.nuvoprojects.cachezero1.items.ArmorCreator;
import euorg.nuvoprojects.cachezero1.worldevents.MessageSend;

public class RussianFurListener implements Listener {

    public MessageSend msgSend = new MessageSend();

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
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.russianFurHood.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.russianFurJacket.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.russianFurLeggings.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.russianFurBoots.getItemMeta())
            ) {

                if (event.getNewArmorPiece().getType().equals(Material.LEATHER_HELMET)) {

                    if (
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.russianFurJacket.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.russianFurLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.russianFurBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.GRAY + "[WOLF WARRIOR] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect res = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1, false, false, false);

                        player.addPotionEffect(res);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.GRAY + "WOLF WARRIOR" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_CHESTPLATE)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.russianFurHood.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.russianFurLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.russianFurBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.GRAY + "[WOLF WARRIOR] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect res = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1, false, false, false);

                        player.addPotionEffect(res);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.GRAY + "WOLF WARRIOR" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_LEGGINGS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.russianFurHood.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.russianFurJacket.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.russianFurBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.GRAY + "[WOLF WARRIOR] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect res = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1, false, false, false);

                        player.addPotionEffect(res);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.GRAY + "WOLF WARRIOR" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_BOOTS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.russianFurHood.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.russianFurJacket.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.russianFurLeggings.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.GRAY + "[WOLF WARRIOR] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect res = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1, false, false, false);

                        player.addPotionEffect(res);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.GRAY + "WOLF WARRIOR" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                }

            }

        } else if (player.getDisplayName().startsWith(ChatColor.GRAY + "[WOLF WARRIOR] ")) {

            player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
            player.setDisplayName(player.getDisplayName().replace(ChatColor.GRAY + "[WOLF WARRIOR] ", ""));

        }

    }

    // Check for Wolf Entity
    @EventHandler
    public void onEntityInteract(PlayerInteractEntityEvent event) {

        Player player = event.getPlayer();
        if (player.getHealth() > 9.9) { return; }

        if (
            event.getRightClicked().getType().equals(EntityType.WOLF) &&
            player.getDisplayName().startsWith(ChatColor.GRAY + "[WOLF WARRIOR] ") &&
            player.getHealth() <= 9.9
        ) {

            msgSend.sendCustomMessage(player, ChatColor.AQUA + "You have gathered this Wolf's Strength", Sound.ENTITY_PLAYER_LEVELUP, 1, 3);
            player.setHealth(player.getHealth() + 5);

        }

    }

}

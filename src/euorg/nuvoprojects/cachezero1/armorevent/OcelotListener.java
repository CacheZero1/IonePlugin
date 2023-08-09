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
import euorg.nuvoprojects.cachezero1.items.ItemCreator;

public class OcelotListener implements Listener {

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
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.ocelotHelmet.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.ocelotChestplate.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.ocelotLeggings.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.ocelotBoots.getItemMeta())
            ) {

                if (event.getNewArmorPiece().getType().equals(Material.LEATHER_HELMET)) {

                    if (
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.ocelotChestplate.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.ocelotLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.ocelotBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.YELLOW + "[OCELOT'S SENT] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 4, false, false, false);
                        PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 4, false, false, false);

                        player.addPotionEffect(jump);
                        player.addPotionEffect(speed);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.YELLOW + "OCELOT'S SENT" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_CHESTPLATE)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.ocelotHelmet.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.ocelotLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.ocelotBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.YELLOW + "[OCELOT'S SENT] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 4, false, false, false);
                        PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 4, false, false, false);

                        player.addPotionEffect(jump);
                        player.addPotionEffect(speed);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.YELLOW + "OCELOT'S SENT" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_LEGGINGS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.ocelotHelmet.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.ocelotChestplate.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.ocelotBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.YELLOW + "[OCELOT'S SENT] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 4, false, false, false);
                        PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 4, false, false, false);

                        player.addPotionEffect(jump);
                        player.addPotionEffect(speed);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.YELLOW + "OCELOT'S SENT" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_BOOTS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.ocelotHelmet.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.ocelotChestplate.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.ocelotLeggings.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.YELLOW + "[OCELOT'S SENT] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 4, false, false, false);
                        PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 4, false, false, false);

                        player.addPotionEffect(jump);
                        player.addPotionEffect(speed);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.YELLOW + "OCELOT'S SENT" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                }

            }

        } else if (player.getDisplayName().startsWith(ChatColor.YELLOW + "[OCELOT'S SENT] ")) {

            player.removePotionEffect(PotionEffectType.JUMP);
            player.removePotionEffect(PotionEffectType.SPEED);
            player.setDisplayName(player.getDisplayName().replace(ChatColor.YELLOW + "[OCELOT'S SENT] ", ""));

        }

    }

    @EventHandler
    public void onPlayerEntityClick(PlayerInteractEntityEvent event) {

        Player player = event.getPlayer();

        if (
            event.getRightClicked().getType().equals(EntityType.OCELOT) &&
            player.getInventory().getItemInMainHand().getType() == Material.GOLD_NUGGET
        ) {

            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
            player.getInventory().addItem(ItemCreator.ocelotsBlessing);

        }

    }
    
}

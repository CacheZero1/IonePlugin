package euorg.nuvoprojects.cachezero1.armorevent;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import euorg.nuvoprojects.cachezero1.Plugin;
import euorg.nuvoprojects.cachezero1.customevent.ArmorEquipEvent;

import euorg.nuvoprojects.cachezero1.items.ArmorCreator;
import euorg.nuvoprojects.cachezero1.items.ItemCreator;
import euorg.nuvoprojects.cachezero1.worldevents.MessageSend;

public class CultistListener implements Listener {

    public World cultLair = Bukkit.getWorld("cultlair");
    MessageSend custSend = new MessageSend();
    
    
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
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.cultistHood.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.cultistRobe.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.cultistLeggings.getItemMeta()) ||
                event.getNewArmorPiece().getItemMeta().equals(ArmorCreator.cultistBoots.getItemMeta())
            ) {

                if (event.getNewArmorPiece().getType().equals(Material.LEATHER_HELMET)) {

                    if (
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.cultistRobe.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.cultistLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.cultistBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.DARK_AQUA + "[CULTIST] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect invis = new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 3, false, false, false);

                        player.addPotionEffect(invis);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.DARK_AQUA + "CULTIST" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_CHESTPLATE)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.cultistHood.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.cultistLeggings.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.cultistBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.DARK_AQUA + "[CULTIST] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect invis = new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 3, false, false, false);

                        player.addPotionEffect(invis);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.DARK_AQUA + "CULTIST" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_LEGGINGS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.cultistHood.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.cultistRobe.getItemMeta()) &&
                        boots != null && boots.getItemMeta().equals(ArmorCreator.cultistBoots.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.DARK_AQUA + "[CULTIST] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect invis = new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 3, false, false, false);

                        player.addPotionEffect(invis);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.DARK_AQUA + "CULTIST" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                } else if (event.getNewArmorPiece().getType().equals(Material.LEATHER_BOOTS)) {

                    if (
                        helmet != null && helmet.getItemMeta().equals(ArmorCreator.cultistHood.getItemMeta()) &&
                        chestplate != null && chestplate.getItemMeta().equals(ArmorCreator.cultistRobe.getItemMeta()) &&
                        leggings != null && leggings.getItemMeta().equals(ArmorCreator.cultistLeggings.getItemMeta())
                    ) {

                        player.setDisplayName(ChatColor.DARK_AQUA + "[CULTIST] " + ChatColor.WHITE + player.getDisplayName());
                        PotionEffect invis = new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 3, false, false, false);

                        player.addPotionEffect(invis);
                        player.sendMessage(ChatColor.AQUA + "You are now a " + ChatColor.DARK_AQUA + "CULTIST" + ChatColor.AQUA + "!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1, 2);

                    }

                }

            }

        } else if (player.getDisplayName().startsWith(ChatColor.DARK_AQUA + "[CULTIST] ")) {

            player.removePotionEffect(PotionEffectType.INVISIBILITY);
            player.setDisplayName(player.getDisplayName().replace(ChatColor.DARK_AQUA + "[CULTIST] ", ""));

        }

    }

    @EventHandler
    public void onEntityNotice(EntityTargetLivingEntityEvent event) {

        if (event.getTarget() != null) {

            if (event.getTarget() instanceof Player){

                Player player = (Player) event.getTarget();

                if (
                    player.getDisplayName().startsWith(ChatColor.DARK_AQUA + "[CULTIST] ") &&
                    player.getWorld().getEnvironment().equals(Environment.NORMAL) &&
                    player.getWorld().getTime() >= 13000 &&
                    player.getWorld().getTime() <= 23000
                ) {

                    event.setCancelled(true);

                }

            }

        }

    }

    @EventHandler
    public void onPortalEnter(PlayerPortalEvent event) throws InterruptedException {

        Player player = event.getPlayer();

        if (
            event.getFrom().getWorld().getEnvironment() == Environment.NORMAL &&
            event.getTo().getWorld().getEnvironment() == Environment.NETHER &&
            event.getPlayer().getDisplayName().startsWith(ChatColor.DARK_AQUA + "[CULTIST] ") &&
            player.getWorld().getTime() >= 17000 &&
            player.getWorld().getTime() <= 18000
        ) {

            event.setCancelled(true);
            player.teleport(cultLair.getSpawnLocation(), TeleportCause.UNKNOWN);

            final boolean hasItem;

            if (player.getInventory().contains(new ItemStack(Material.BEACON, 1), 1)) {

                hasItem = true;

            } else {

                hasItem = false;

            }

            // Dialog
            new BukkitRunnable() {
                int counter = 0;
                public void run() {

                    counter++;
                    
                    switch(counter) {

                        case 1:
                            custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "Well, well, well...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            return;

                        case 2:
                            custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "A mere Mortal has entered my Dimension...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            return;

                        case 3:
                            custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "But you're not one of my worshippers...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            return;

                        case 4:
                            custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "I'll give you a chance tho...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            return;

                        case 5:
                            if (hasItem) {
                                custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "And you already have the Item I am looking for...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            } else {
                                custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "Return to me if you have obtained a specific Item...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            }
                            return;

                        case 6:
                            if (hasItem) {
                                custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "For that I will Reward you...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            } else {
                                custSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "One that is only obtained by slaying a Wither...", Sound.ENTITY_WITHER_AMBIENT, 1, 1);
                            }
                            return;

                        case 7:
                            if (hasItem) {
                                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 5);
                                player.getInventory().addItem(ItemCreator.galaxyFragment);
                                player.getInventory().remove(new ItemStack(Material.BEACON, 1));
                            } else {
                                player.teleport(Bukkit.getWorlds().get(0).getSpawnLocation(), TeleportCause.UNKNOWN);
                            }
                            return;

                        case 8:
                            if (hasItem) {
                                player.teleport(Bukkit.getWorlds().get(0).getSpawnLocation(), TeleportCause.UNKNOWN);

                            }
                            return;

                        case 9:
                            cancel();
                            return;

                    }

                }
            }.runTaskTimer(Plugin.getPlugin(Plugin.class), 100, 50);

        }

    }

}

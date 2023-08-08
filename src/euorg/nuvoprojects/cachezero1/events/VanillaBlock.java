package euorg.nuvoprojects.cachezero1.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.EntityPlaceEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import euorg.nuvoprojects.cachezero1.items.ArmorCreator;
import euorg.nuvoprojects.cachezero1.items.ItemCreator;
import euorg.nuvoprojects.cachezero1.worldevents.MessageSend;

public class VanillaBlock implements Listener {

    // Classes
    MessageSend msgSend = new MessageSend();

    // Item list
    public static ItemStack[] customList = {
        ItemCreator.starFragment,
        ItemCreator.featherBlock,
        ItemCreator.ocelotsBlessing,
        ArmorCreator.cultistHood,
        ArmorCreator.cultistRobe,
        ArmorCreator.cultistLeggings,
        ArmorCreator.cultistBoots,
        ArmorCreator.russianFurHood,
        ArmorCreator.russianFurJacket,
        ArmorCreator.russianFurLeggings,
        ArmorCreator.russianFurBoots,
        ArmorCreator.chickenFlyHelmet,
        ArmorCreator.chickenFlyChestplate,
        ArmorCreator.chickenFlyLeggings,
        ArmorCreator.chickenFlyBoots,
        ArmorCreator.ocelotHelmet,
        ArmorCreator.ocelotChestplate,
        ArmorCreator.ocelotLeggings,
        ArmorCreator.ocelotBoots
    };

    public static ItemStack[] blockList = {
        ItemCreator.featherBlock,
        ItemCreator.galaxyFragment
    };

    public static ItemStack[] entityList = {
        ItemCreator.galaxyFragment,
    };

    // Compare Block Items
    public boolean isCustomBlock(ItemStack checkItem, ItemStack[] itemList) {

        for (ItemStack item : itemList) {

            if (item.getItemMeta().equals(checkItem.getItemMeta())) {

                return true;

            }

        }

        return false;

    }

    @EventHandler
    public void craftItem(PrepareItemCraftEvent event) throws NullPointerException {

        ItemStack[] slots = event.getInventory().getMatrix();

        boolean isNull = false;

        for (ItemStack slot : slots) {
            if (slot == null || slot.getType() == Material.AIR) { //We filter out air slots and null items
                
                isNull = true;

            }
        }


        if (!isNull && !(event.getInventory().getResult() == null)) {

            if (event.getInventory().getResult().getType().equals(Material.BEACON)) {

                event.getInventory().setResult(new ItemStack(Material.AIR));

            }

        }

    }

    @EventHandler
    public void enchantItem(PrepareItemEnchantEvent event) {

        if (isCustomBlock(event.getItem(), customList)) {

            event.setCancelled(true);

        }

    }

    @EventHandler
    public void tinkerItem(PrepareAnvilEvent event) {

        for (ItemStack item : customList) {

            if (event.getInventory().contains(item)) {

                event.setResult(new ItemStack(Material.AIR));

            }

        }

    }

    @EventHandler
    public void onPlaceBlock(BlockPlaceEvent event) {

        if (isCustomBlock(event.getItemInHand(), blockList)) {

            event.setCancelled(true);

        }

    }

    @EventHandler
    public void onPlaceEntity(EntityPlaceEvent event) {

        if (
            isCustomBlock(event.getPlayer().getInventory().getItemInMainHand(), entityList) ||
            isCustomBlock(event.getPlayer().getInventory().getItemInOffHand(), entityList)
        ) {

            Player player = event.getPlayer();

            event.setCancelled(true);
            player.getWorld().strikeLightning(player.getLocation());
            msgSend.sendCustomMessage(player, "<" + ChatColor.GOLD + ChatColor.MAGIC + "UNKNOWN" + ChatColor.WHITE + ">" + ChatColor.RED + ChatColor.BOLD + "YOU SHALL NOT DISRESPECT MY GIFT, MORTAL!", Sound.ENTITY_WITHER_SPAWN, 1, 1);
            player.getWorld().setStorm(true);

        }

    }
    
}

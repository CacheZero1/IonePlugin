package euorg.nuvoprojects.cachezero1.items;

import java.util.Collections;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemCreator {

    // Items
    public static ItemStack starFragment;
    public static ItemStack featherBlock;
    public static ItemStack ocelotsBlessing;
    public static ItemStack galaxyFragment;

    // Initialise
    public static void init() {

        // Create Items
        createStarFragment();
        createFeatherBlock();
        createOcelotsBlessing();
        createMoonDestabilizer();

    }

    private static void createStarFragment() {

        // Create new Item
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();

        // Edit Meta
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Star Fragment");
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "A gift from the " + ChatColor.WHITE + ChatColor.BOLD + "Moon"));
        meta.addEnchant(Enchantment.KNOCKBACK, 12, true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setCustomModelData(12);

        // Set Item
        item.setItemMeta(meta);
        starFragment = item;

    }

    private static void createFeatherBlock() {

        // Create new Item
        ItemStack item = new ItemStack(Material.LIGHT_GRAY_WOOL, 1);
        ItemMeta meta = item.getItemMeta();

        // Edit Meta
        meta.setDisplayName(ChatColor.BLUE + "Feather Block");
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Forged from 9 Feathers"));
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        // Set Item
        item.setItemMeta(meta);
        featherBlock = item;

    }

    private static void createOcelotsBlessing() {

        // Create new Item
        ItemStack item = new ItemStack(Material.YELLOW_DYE, 1);
        ItemMeta meta = item.getItemMeta();

        // Edit Meta
        meta.setDisplayName(ChatColor.YELLOW + "Ocelot's Blessing");
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "A gift from Mustafar"));
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        // Set Item
        item.setItemMeta(meta);
        ocelotsBlessing = item;

    }
 
    private static void createMoonDestabilizer() {

        // Create new Item
        ItemStack item = new ItemStack(Material.END_CRYSTAL, 1);
        ItemMeta meta = item.getItemMeta();

        // Edit Meta
        meta.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Galaxy Fragment");
        meta.setLore(Collections.singletonList(ChatColor.GOLD + "The Moon's final gift"));
        meta.addEnchant(Enchantment.KNOCKBACK, 14, true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        // Set Item
        item.setItemMeta(meta);
        galaxyFragment = item;

    }

}

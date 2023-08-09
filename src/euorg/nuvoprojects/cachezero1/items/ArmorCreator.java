package euorg.nuvoprojects.cachezero1.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmorCreator {

    // Cultis's Armor
    public static ItemStack cultistHood;
    public static ItemStack cultistRobe;
    public static ItemStack cultistLeggings;
    public static ItemStack cultistBoots;

    // Russian Armor
    public static ItemStack russianFurHood;
    public static ItemStack russianFurJacket;
    public static ItemStack russianFurLeggings;
    public static ItemStack russianFurBoots;

    // Chicken's Fly-Armor
    public static ItemStack chickenFlyHelmet;
    public static ItemStack chickenFlyChestplate;
    public static ItemStack chickenFlyLeggings;
    public static ItemStack chickenFlyBoots;

    // Ocelot Armor
    public static ItemStack ocelotHelmet;
    public static ItemStack ocelotChestplate;
    public static ItemStack ocelotLeggings;
    public static ItemStack ocelotBoots;

    // Initialise
    public static void init() {

        createCultistSet();
        createRussianFurSet();
        createChickenFlySet();
        createOcelotsSentSet();

    }

    private static void createCultistSet() {

        // Create new Item
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);

        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        LeatherArmorMeta leggingsMeta = (LeatherArmorMeta) leggings.getItemMeta();
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();

        // Edit Meta
        helmetMeta.setColor(Color.BLACK);
        chestplateMeta.setColor(Color.BLACK);
        leggingsMeta.setColor(Color.BLACK);
        bootsMeta.setColor(Color.BLACK);

        helmetMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Cultist's Hood");
        chestplateMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Cultist's Robe");
        leggingsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Cultist's Leggings");
        bootsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Cultist's Boots");

        helmetMeta.setUnbreakable(true);
        chestplateMeta.setUnbreakable(true);
        leggingsMeta.setUnbreakable(true);
        bootsMeta.setUnbreakable(true);

        List<String> helmetLore = new ArrayList<>();
        List<String> chestplateLore = new ArrayList<>();
        List<String> leggingsLore = new ArrayList<>();
        List<String> bootsLore = new ArrayList<>();

        helmetLore.add(ChatColor.DARK_PURPLE + "Let us reign over this world...");
        chestplateLore.add(ChatColor.DARK_PURPLE + "'til the Moon set us apart...");
        leggingsLore.add(ChatColor.DARK_PURPLE + "When the Moon is up high...");
        bootsLore.add(ChatColor.DARK_PURPLE + "Hell's Gate will show us the way...");

        helmetLore.add(" ");
        chestplateLore.add(" ");
        leggingsLore.add(" ");
        bootsLore.add(" ");

        helmetLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Cultist's Set Bonus:");
        chestplateLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Cultist's Set Bonus:");
        leggingsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Cultist's Set Bonus:");
        bootsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Cultist's Set Bonus:");

        helmetLore.add(ChatColor.WHITE + "- Shadow Schemes");
        chestplateLore.add(ChatColor.WHITE + "- Shadow Schemes");
        leggingsLore.add(ChatColor.WHITE + "- Shadow Schemes");
        bootsLore.add(ChatColor.WHITE + "- Shadow Schemes");

        helmetMeta.setLore(helmetLore);
        chestplateMeta.setLore(chestplateLore);
        leggingsMeta.setLore(leggingsLore);
        bootsMeta.setLore(bootsLore);

        helmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        chestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        leggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        bootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        helmetMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_DYE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        // Set Item
        helmet.setItemMeta(helmetMeta);
        chestplate.setItemMeta(chestplateMeta);
        leggings.setItemMeta(leggingsMeta);
        boots.setItemMeta(bootsMeta);

        cultistHood = helmet;
        cultistRobe = chestplate;
        cultistLeggings = leggings;
        cultistBoots = boots;

    }

    private static void createRussianFurSet() {

        // Create new Item
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);

        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        LeatherArmorMeta leggingsMeta = (LeatherArmorMeta) leggings.getItemMeta();
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();

        // Edit Meta
        helmetMeta.setColor(Color.WHITE);
        chestplateMeta.setColor(Color.WHITE);
        leggingsMeta.setColor(Color.WHITE);
        bootsMeta.setColor(Color.WHITE);

        helmetMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Broken Helm of the Conqueror");
        chestplateMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Broken Valiant Heartplate of the Northlands");
        leggingsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Broken Battlegear of the Frostborne");
        bootsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Broken Boots of Eternal Expeditions");

        helmetMeta.setUnbreakable(true);
        chestplateMeta.setUnbreakable(true);
        leggingsMeta.setUnbreakable(true);
        bootsMeta.setUnbreakable(true);

        List<String> helmetLore = new ArrayList<>();
        List<String> chestplateLore = new ArrayList<>();
        List<String> leggingsLore = new ArrayList<>();
        List<String> bootsLore = new ArrayList<>();

        helmetLore.add(ChatColor.WHITE + "\"Through storm and steel, I faced my fate with unyielding resolve!\"");
        chestplateLore.add(ChatColor.WHITE + "\"Cold winds only fueled the fire in my heart as I forged ahead!\"");
        leggingsLore.add(ChatColor.WHITE + "\"In battle, honor resides not only in victory, but in the courage to stand!\"");
        bootsLore.add(ChatColor.WHITE + "\"My spirit knows no bounds; even in death, I journey on!\"");

        helmetLore.add(ChatColor.GRAY + "- Nothern Viking");
        chestplateLore.add(ChatColor.GRAY + "- Northern Viking");
        leggingsLore.add(ChatColor.GRAY + "- Northern Viking");
        bootsLore.add(ChatColor.GRAY + "- Northern Viking");

        helmetLore.add(" ");
        chestplateLore.add(" ");
        leggingsLore.add(" ");
        bootsLore.add(" ");

        helmetLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Broken Viking Fur Set Bonus:");
        chestplateLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Broken Viking Fur Set Bonus:");
        leggingsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Broken Viking Fur Set Bonus:");
        bootsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Broken Viking Fur Set Bonus:");

        helmetLore.add(ChatColor.WHITE + "- Winter Toughness");
        chestplateLore.add(ChatColor.WHITE + "- Winter Toughness");
        leggingsLore.add(ChatColor.WHITE + "- Winter Toughness");
        bootsLore.add(ChatColor.WHITE + "- Winter Toughness");

        helmetLore.add(ChatColor.WHITE + "- Wolf's Strength");
        chestplateLore.add(ChatColor.WHITE + "- Wolf's Strength");
        leggingsLore.add(ChatColor.WHITE + "- Wolf's Strength");
        bootsLore.add(ChatColor.WHITE + "- Wolf's Strength");

        helmetMeta.setLore(helmetLore);
        chestplateMeta.setLore(chestplateLore);
        leggingsMeta.setLore(leggingsLore);
        bootsMeta.setLore(bootsLore);

        helmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        chestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        leggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        bootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        helmetMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_DYE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        // Set Item
        helmet.setItemMeta(helmetMeta);
        chestplate.setItemMeta(chestplateMeta);
        leggings.setItemMeta(leggingsMeta);
        boots.setItemMeta(bootsMeta);

        russianFurHood = helmet;
        russianFurJacket = chestplate;
        russianFurLeggings = leggings;
        russianFurBoots = boots;

    }

    private static void createChickenFlySet() {

        // Create new Item
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);

        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        LeatherArmorMeta leggingsMeta = (LeatherArmorMeta) leggings.getItemMeta();
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();

        // Edit Meta
        helmetMeta.setColor(Color.GRAY);
        chestplateMeta.setColor(Color.GRAY);
        leggingsMeta.setColor(Color.GRAY);
        bootsMeta.setColor(Color.GRAY);

        helmetMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Chicken's Fly Helmet");
        chestplateMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Chicken's Fly Wingsuit");
        leggingsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Chicken's Fly Trousers");
        bootsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Chicken's Fly Shoes");

        helmetMeta.setUnbreakable(true);
        chestplateMeta.setUnbreakable(true);
        leggingsMeta.setUnbreakable(true);
        bootsMeta.setUnbreakable(true);

        List<String> helmetLore = new ArrayList<>();
        List<String> chestplateLore = new ArrayList<>();
        List<String> leggingsLore = new ArrayList<>();
        List<String> bootsLore = new ArrayList<>();

        helmetLore.add(ChatColor.DARK_PURPLE + "A trusty Helmet to shield against possible failure.");
        chestplateLore.add(ChatColor.DARK_PURPLE + "The Mechanism to make this possible.");
        leggingsLore.add(ChatColor.DARK_PURPLE + "Light as a feather.");
        bootsLore.add(ChatColor.DARK_PURPLE + "Sturdy enough for landing.");

        helmetLore.add(" ");
        chestplateLore.add(" ");
        leggingsLore.add(" ");
        bootsLore.add(" ");

        helmetLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Chicken's Fly Set Bonus:");
        chestplateLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Chicken's Fly Set Bonus:");
        leggingsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Chicken's Fly Set Bonus:");
        bootsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Chicken's Fly Set Bonus:");

        helmetLore.add(ChatColor.WHITE + "- \"Flight\"");
        chestplateLore.add(ChatColor.WHITE + "- \"Flight\"");
        leggingsLore.add(ChatColor.WHITE + "- \"Flight\"");
        bootsLore.add(ChatColor.WHITE + "- \"Flight\"");

        helmetLore.add(ChatColor.WHITE + "- Safe Landing");
        chestplateLore.add(ChatColor.WHITE + "- Safe Landing");
        leggingsLore.add(ChatColor.WHITE + "- Safe Landing");
        bootsLore.add(ChatColor.WHITE + "- Safe Landing");

        helmetMeta.setLore(helmetLore);
        chestplateMeta.setLore(chestplateLore);
        leggingsMeta.setLore(leggingsLore);
        bootsMeta.setLore(bootsLore);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        helmetMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_DYE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        // Set Item
        helmet.setItemMeta(helmetMeta);
        chestplate.setItemMeta(chestplateMeta);
        leggings.setItemMeta(leggingsMeta);
        boots.setItemMeta(bootsMeta);

        chickenFlyHelmet = helmet;
        chickenFlyChestplate = chestplate;
        chickenFlyLeggings = leggings;
        chickenFlyBoots = boots;

    }

    private static void createOcelotsSentSet() {

        // Create new Item
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);

        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        LeatherArmorMeta leggingsMeta = (LeatherArmorMeta) leggings.getItemMeta();
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();

        // Edit Meta
        helmetMeta.setColor(Color.YELLOW);
        chestplateMeta.setColor(Color.YELLOW);
        leggingsMeta.setColor(Color.YELLOW);
        bootsMeta.setColor(Color.YELLOW);

        helmetMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Mufasar's Enigmatic Mask");
        chestplateMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Mufasar's Guardian Hauberk");
        leggingsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Mufasar's Whispering Greaves");
        bootsMeta.setDisplayName("" + ChatColor.BOLD + ChatColor.GRAY + "Mufasar's Prowess Treads");

        helmetMeta.setUnbreakable(true);
        chestplateMeta.setUnbreakable(true);
        leggingsMeta.setUnbreakable(true);
        bootsMeta.setUnbreakable(true);

        List<String> helmetLore = new ArrayList<>();
        List<String> chestplateLore = new ArrayList<>();
        List<String> leggingsLore = new ArrayList<>();
        List<String> bootsLore = new ArrayList<>();

        helmetLore.add(ChatColor.DARK_AQUA + "\"In shadows, I guide, unseen but ever watchful.\"");
        chestplateLore.add(ChatColor.DARK_AQUA + "\"Through dense foliage, my grace becomes your strength.\"");
        leggingsLore.add(ChatColor.DARK_AQUA + "\"Footfalls whisper my blessings, swift and unnoticed.\"");
        bootsLore.add(ChatColor.DARK_AQUA + "\"Within these fibers, my spirit entwines with yours.\"");

        helmetLore.add(ChatColor.YELLOW + "- Ocelot God Mufasar");
        chestplateLore.add(ChatColor.YELLOW + "- Ocelot God Mufasar");
        leggingsLore.add(ChatColor.YELLOW + "- Ocelot God Mufasar");
        bootsLore.add(ChatColor.YELLOW + "- Ocelot God Mufasar");

        helmetLore.add(" ");
        chestplateLore.add(" ");
        leggingsLore.add(" ");
        bootsLore.add(" ");

        helmetLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Ocelot's Sent Set Bonus:");
        chestplateLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Ocelot's Sent Set Bonus:");
        leggingsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE +"Full Ocelot's Sent Set Bonus:");
        bootsLore.add("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Full Ocelot's Sent Set Bonus:");

        helmetLore.add(ChatColor.WHITE + "- Hunting Speed");
        chestplateLore.add(ChatColor.WHITE + "- Hunting Speed");
        leggingsLore.add(ChatColor.WHITE + "- Hunting Speed");
        bootsLore.add(ChatColor.WHITE + "- Hunting Speed");

        helmetLore.add(ChatColor.WHITE + "- Ocelot's Glutes");
        chestplateLore.add(ChatColor.WHITE + "- Ocelot's Glutes");
        leggingsLore.add(ChatColor.WHITE + "- Ocelot's Glutes");
        bootsLore.add(ChatColor.WHITE + "- Ocelot's Glutes");

        helmetMeta.setLore(helmetLore);
        chestplateMeta.setLore(chestplateLore);
        leggingsMeta.setLore(leggingsLore);
        bootsMeta.setLore(bootsLore);

        helmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        chestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        leggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        bootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        helmetMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        bootsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        helmetMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestplateMeta.addItemFlags(ItemFlag.HIDE_DYE);
        leggingsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        // Set Item
        helmet.setItemMeta(helmetMeta);
        chestplate.setItemMeta(chestplateMeta);
        leggings.setItemMeta(leggingsMeta);
        boots.setItemMeta(bootsMeta);

        ocelotHelmet = helmet;
        ocelotChestplate = chestplate;
        ocelotLeggings = leggings;
        ocelotBoots = boots;

    }

    
}

package euorg.nuvoprojects.cachezero1.loottables;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import euorg.nuvoprojects.cachezero1.items.ArmorCreator;
import euorg.nuvoprojects.cachezero1.items.ItemCreator;

public class RecipeCreator {

    // Recipes
    private static ShapelessRecipe featherBlockRecipe;

    private static ShapedRecipe cultistHelmet;
    private static ShapedRecipe cultistChestplate;
    private static ShapedRecipe cultistLeggings;
    private static ShapedRecipe cultistBoots;

    private static ShapedRecipe russianfurHelmet;
    private static ShapedRecipe russianfurChestplate;
    private static ShapedRecipe russianfurLeggings;
    private static ShapedRecipe russianfurBoots;

    private static ShapedRecipe chickenflyHelmet;
    private static ShapedRecipe chickenflyChestplate;
    private static ShapedRecipe chickenflyLeggings;
    private static ShapedRecipe chickenflyBoots;
    

    public static void init() {

        // Create Recipes
        createItemRecipes();
        createCultistArmorRecipes();
        createRussianFurArmorRecipes();
        createChickenFlyArmorRecipes();

        // Add Recipes
        addRecipes();

    }

    private static void createItemRecipes() {

        // Recipe (Feather Block)
        featherBlockRecipe = new ShapelessRecipe(NamespacedKey.minecraft("ione_featherblock"), ItemCreator.featherBlock);
        featherBlockRecipe.addIngredient(9, Material.FEATHER);

    }

    private static void createCultistArmorRecipes() {

        // Recipe (Cultist Armor Helmet)
        cultistHelmet = new ShapedRecipe(NamespacedKey.minecraft("ione_cultisthelmet"), ArmorCreator.cultistHood);
        cultistHelmet.shape("B B", " L ", "S S");
        cultistHelmet.setIngredient('B', Material.BLAZE_POWDER);
        cultistHelmet.setIngredient('L', Material.LEATHER_HELMET);
        cultistHelmet.setIngredient('S', new RecipeChoice.ExactChoice(ItemCreator.starFragment));

        // Recipe (Cultist Armor Chestplate)
        cultistChestplate = new ShapedRecipe(NamespacedKey.minecraft("ione_cultistchestplate"), ArmorCreator.cultistRobe);
        cultistChestplate.shape("B B", " L ", "S S");
        cultistChestplate.setIngredient('B', Material.BLAZE_POWDER);
        cultistChestplate.setIngredient('L', Material.LEATHER_CHESTPLATE);
        cultistChestplate.setIngredient('S', new RecipeChoice.ExactChoice(ItemCreator.starFragment));

        // Recipe (Cultist Armor Leggings)
        cultistLeggings = new ShapedRecipe(NamespacedKey.minecraft("ione_cultistleggings"), ArmorCreator.cultistLeggings);
        cultistLeggings.shape("B B", " L ", "S S");
        cultistLeggings.setIngredient('B', Material.BLAZE_POWDER);
        cultistLeggings.setIngredient('L', Material.LEATHER_LEGGINGS);
        cultistLeggings.setIngredient('S', new RecipeChoice.ExactChoice(ItemCreator.starFragment));

        // Recipe (Cultist Armor Boots)
        cultistBoots = new ShapedRecipe(NamespacedKey.minecraft("ione_cultistboots"), ArmorCreator.cultistBoots);
        cultistBoots.shape("B B", " L ", "S S");
        cultistBoots.setIngredient('B', Material.BLAZE_POWDER);
        cultistBoots.setIngredient('L', Material.LEATHER_BOOTS);
        cultistBoots.setIngredient('S', new RecipeChoice.ExactChoice(ItemCreator.starFragment));

    }

    private static void createRussianFurArmorRecipes() {

        // Recipe (Russian Fur Armor Helmet)
        russianfurHelmet = new ShapedRecipe(NamespacedKey.minecraft("ione_russianfurhelmet"), ArmorCreator.russianFurHood);
        russianfurHelmet.shape(" F ", "LAL", " L ");
        russianfurHelmet.setIngredient('F', Material.FEATHER);
        russianfurHelmet.setIngredient('L', Material.LEATHER);
        russianfurHelmet.setIngredient('A', Material.LEATHER_HELMET);

        // Recipe (Russian Fur Armor Chestplate)
        russianfurChestplate = new ShapedRecipe(NamespacedKey.minecraft("ione_russianfurchestplate"), ArmorCreator.russianFurJacket);
        russianfurChestplate.shape(" R ", "LAL", " L ");
        russianfurChestplate.setIngredient('R', Material.RABBIT_HIDE);
        russianfurChestplate.setIngredient('L', Material.LEATHER);
        russianfurChestplate.setIngredient('A', Material.LEATHER_CHESTPLATE);

        // Recipe (Russian Fur Armor Leggings)
        russianfurLeggings = new ShapedRecipe(NamespacedKey.minecraft("ione_russianfurleggings"), ArmorCreator.russianFurLeggings);
        russianfurLeggings.shape(" R ", "LAL", " L ");
        russianfurLeggings.setIngredient('R', Material.RABBIT_HIDE);
        russianfurLeggings.setIngredient('L', Material.LEATHER);
        russianfurLeggings.setIngredient('A', Material.LEATHER_LEGGINGS);

        // Recipe (Russian Fur Armor Boots)
        russianfurBoots = new ShapedRecipe(NamespacedKey.minecraft("ione_russianfurboots"), ArmorCreator.russianFurBoots);
        russianfurBoots.shape(" F ", "LAL", " L ");
        russianfurBoots.setIngredient('F', Material.FEATHER);
        russianfurBoots.setIngredient('L', Material.LEATHER);
        russianfurBoots.setIngredient('A', Material.LEATHER_BOOTS);

    }

    private static void createChickenFlyArmorRecipes() {
        
        // Recipe (Chicken Fly Armor Helmet)
        chickenflyHelmet = new ShapedRecipe(NamespacedKey.minecraft("ione_chickenflyhelmet"), ArmorCreator.chickenFlyHelmet);
        chickenflyHelmet.shape("FFF", "FSF", "   ");
        chickenflyHelmet.setIngredient('F', new RecipeChoice.ExactChoice(ItemCreator.featherBlock));
        chickenflyHelmet.setIngredient('S', Material.SHEARS);

        // Recipe (Chicken Fly Armor Chestplate)
        chickenflyChestplate = new ShapedRecipe(NamespacedKey.minecraft("ione_chickenflychestplate"), ArmorCreator.chickenFlyChestplate);
        chickenflyChestplate.shape("FSF", "FFF", "FFF");
        chickenflyChestplate.setIngredient('F', new RecipeChoice.ExactChoice(ItemCreator.featherBlock));
        chickenflyChestplate.setIngredient('S', Material.SHEARS);

        // Recipe (Chicken Fly Armor Leggings)
        chickenflyLeggings = new ShapedRecipe(NamespacedKey.minecraft("ione_chickenflyleggings"), ArmorCreator.chickenFlyLeggings);
        chickenflyLeggings.shape("FFF", "FSF", "F F");
        chickenflyLeggings.setIngredient('F', new RecipeChoice.ExactChoice(ItemCreator.featherBlock));
        chickenflyLeggings.setIngredient('S', Material.SHEARS);

        // Recipe (Chicken Fly Armor Boots)
        chickenflyBoots = new ShapedRecipe(NamespacedKey.minecraft("ione_chickenflyboots"), ArmorCreator.chickenFlyBoots);
        chickenflyBoots.shape("   ", "FSF", "F F");
        chickenflyBoots.setIngredient('F', new RecipeChoice.ExactChoice(ItemCreator.featherBlock));
        chickenflyBoots.setIngredient('S', Material.SHEARS);

    }

    private static void addRecipes() {

        // Items
        Bukkit.getServer().addRecipe(featherBlockRecipe);

        // Armor (Cultist Set)
        Bukkit.getServer().addRecipe(cultistHelmet);
        Bukkit.getServer().addRecipe(cultistChestplate);
        Bukkit.getServer().addRecipe(cultistLeggings);
        Bukkit.getServer().addRecipe(cultistBoots);

        // Armor (Russian Fur Set)
        Bukkit.getServer().addRecipe(russianfurHelmet);
        Bukkit.getServer().addRecipe(russianfurChestplate);
        Bukkit.getServer().addRecipe(russianfurLeggings);
        Bukkit.getServer().addRecipe(russianfurBoots);

        // Armor (Chicken Fly Set)
        Bukkit.getServer().addRecipe(chickenflyHelmet);
        Bukkit.getServer().addRecipe(chickenflyChestplate);
        Bukkit.getServer().addRecipe(chickenflyLeggings);
        Bukkit.getServer().addRecipe(chickenflyBoots);

        // Armor (Ocelot's Sent Set)


    }
    
}

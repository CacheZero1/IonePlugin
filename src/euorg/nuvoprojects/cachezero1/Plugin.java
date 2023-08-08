package euorg.nuvoprojects.cachezero1;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.World.Environment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import euorg.nuvoprojects.cachezero1.customevent.ArmorListener;
import euorg.nuvoprojects.cachezero1.armorevent.ChickenFlyListener;
import euorg.nuvoprojects.cachezero1.armorevent.CultistListener;
import euorg.nuvoprojects.cachezero1.armorevent.RussianFurListener;
import euorg.nuvoprojects.cachezero1.commands.ItemCommands;
import euorg.nuvoprojects.cachezero1.events.ItemEffects;
import euorg.nuvoprojects.cachezero1.events.VanillaBlock;
import euorg.nuvoprojects.cachezero1.items.ArmorCreator;
import euorg.nuvoprojects.cachezero1.items.ItemCreator;
import euorg.nuvoprojects.cachezero1.loottables.RecipeCreator;

public class Plugin extends JavaPlugin {
    
    @Override
    public void onEnable() {

        // Save Config
        saveDefaultConfig();

        // Create Worlds
        if (Bukkit.getWorld("cultlair") == null) {

            WorldCreator cultLairCreator = new WorldCreator("cultlair");
            cultLairCreator.environment(Environment.NORMAL);
            cultLairCreator.type(WorldType.FLAT);
            cultLairCreator.generateStructures(false);
            cultLairCreator.createWorld();

        }

        // Create Class
        ItemCommands itemCommands = new ItemCommands();

        // Initialise Items
        ItemCreator.init();
        ArmorCreator.init();
        RecipeCreator.init();

        // Register Commands
        getCommand("IoneI1").setExecutor(itemCommands);
        getCommand("IoneI2").setExecutor(itemCommands);
        getCommand("IoneI3").setExecutor(itemCommands);
        getCommand("IoneI4").setExecutor(itemCommands);
        getCommand("IoneAS1").setExecutor(itemCommands);
        getCommand("IoneAS2").setExecutor(itemCommands);
        getCommand("IoneAS3").setExecutor(itemCommands);
        getCommand("IoneAS4").setExecutor(itemCommands);
        getCommand("IoneATZ").setExecutor(itemCommands);

        // Register Events
        getServer().getPluginManager().registerEvents(new ArmorListener(getConfig().getStringList("blocked")), this);
        getServer().getPluginManager().registerEvents(new VanillaBlock(), this);
        getServer().getPluginManager().registerEvents(new ItemEffects(), this);

        getServer().getPluginManager().registerEvents(new CultistListener(), this);
        getServer().getPluginManager().registerEvents(new RussianFurListener(), this);
        getServer().getPluginManager().registerEvents(new ChickenFlyListener(), this);

        // Enabled Message
        getLogger().info("Enabled Successfully [Ione-1.16.5]");

    }

    @Override
    public void onDisable() {

        // Disabled Message
        getLogger().info("Disabled Successfully [Ione-1.16.5]");

    }

    public ItemStack getGalaxyFragment() {

        return ItemCreator.galaxyFragment;

    }

}

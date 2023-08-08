package euorg.nuvoprojects.cachezero1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import euorg.nuvoprojects.cachezero1.items.ArmorCreator;
import euorg.nuvoprojects.cachezero1.items.ItemCreator;

public class ItemCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (!(sender instanceof Player)) { return true; }

        Player player = (Player) sender;

        switch(command.getName()) {

            case "IoneI1":
                player.getInventory().addItem(ItemCreator.starFragment);
                return true;
                
            case "IoneI2":
                player.getInventory().addItem(ItemCreator.featherBlock);
                return true;

            case "IoneI3":
                player.getInventory().addItem(ItemCreator.ocelotsBlessing);
                return true;

            case "IoneI4":
                player.getInventory().addItem(ItemCreator.galaxyFragment);
                return true;

            case "IoneAS1":
                player.getInventory().addItem(ArmorCreator.cultistHood);
                player.getInventory().addItem(ArmorCreator.cultistRobe);
                player.getInventory().addItem(ArmorCreator.cultistLeggings);
                player.getInventory().addItem(ArmorCreator.cultistBoots);
                return true;

            case "IoneAS2":
                player.getInventory().addItem(ArmorCreator.russianFurHood);
                player.getInventory().addItem(ArmorCreator.russianFurJacket);
                player.getInventory().addItem(ArmorCreator.russianFurLeggings);
                player.getInventory().addItem(ArmorCreator.russianFurBoots);
                return true;

            case "IoneAS3":
                player.getInventory().addItem(ArmorCreator.chickenFlyHelmet);
                player.getInventory().addItem(ArmorCreator.chickenFlyChestplate);
                player.getInventory().addItem(ArmorCreator.chickenFlyLeggings);
                player.getInventory().addItem(ArmorCreator.chickenFlyBoots);
                return true;

            case "IoneAS4":
                player.getInventory().addItem(ArmorCreator.ocelotHelmet);
                player.getInventory().addItem(ArmorCreator.ocelotChestplate);
                player.getInventory().addItem(ArmorCreator.ocelotLeggings);
                player.getInventory().addItem(ArmorCreator.ocelotBoots);
                return true;

            case "IoneATZ":
                // Items
                player.getInventory().addItem(ItemCreator.starFragment);
                player.getInventory().addItem(ItemCreator.featherBlock);
                player.getInventory().addItem(ItemCreator.ocelotsBlessing);
                player.getInventory().addItem(ItemCreator.galaxyFragment);

                // Armor 1
                player.getInventory().addItem(ArmorCreator.cultistHood);
                player.getInventory().addItem(ArmorCreator.cultistRobe);
                player.getInventory().addItem(ArmorCreator.cultistLeggings);
                player.getInventory().addItem(ArmorCreator.cultistBoots);

                // Armor 2
                player.getInventory().addItem(ArmorCreator.russianFurHood);
                player.getInventory().addItem(ArmorCreator.russianFurJacket);
                player.getInventory().addItem(ArmorCreator.russianFurLeggings);
                player.getInventory().addItem(ArmorCreator.russianFurBoots);

                // Armor 3
                player.getInventory().addItem(ArmorCreator.chickenFlyHelmet);
                player.getInventory().addItem(ArmorCreator.chickenFlyChestplate);
                player.getInventory().addItem(ArmorCreator.chickenFlyLeggings);
                player.getInventory().addItem(ArmorCreator.chickenFlyBoots);

                // Armor 4
                player.getInventory().addItem(ArmorCreator.ocelotHelmet);
                player.getInventory().addItem(ArmorCreator.ocelotChestplate);
                player.getInventory().addItem(ArmorCreator.ocelotLeggings);
                player.getInventory().addItem(ArmorCreator.ocelotBoots);

                return true;

        }

        return false;

    }

}

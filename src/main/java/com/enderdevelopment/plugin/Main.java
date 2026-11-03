package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import com.enderdevelopment.plugin.items.InfinityBow;
import com.enderdevelopment.plugin.items.InfinityPotion;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("InfinityItems plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("InfinityItems plugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("giveinfinityitems")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                giveInfinityItems(player);
                player.sendMessage(Component.text("You have received infinity items!").color(NamedTextColor.GREEN));
                return true;
            } else {
                sender.sendMessage(Component.text("This command can only be run by a player.").color(NamedTextColor.RED));
                return false;
            }
        }
        return false;
    }

    private void giveInfinityItems(Player player) {
        // Create infinity pickaxe
        ItemStack infinityPickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta pickaxeMeta = infinityPickaxe.getItemMeta();
        pickaxeMeta.setDisplayName("Infinity Pickaxe");
        pickaxeMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:efficiency")), 5, true);
        pickaxeMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer pickaxeData = pickaxeMeta.getPersistentDataContainer();
        pickaxeData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "pickaxe");
        infinityPickaxe.setItemMeta(pickaxeMeta);

        // Create infinity axe
        ItemStack infinityAxe = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta axeMeta = infinityAxe.getItemMeta();
        axeMeta.setDisplayName("Infinity Axe");
        axeMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:efficiency")), 5, true);
        axeMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer axeData = axeMeta.getPersistentDataContainer();
        axeData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "axe");
        infinityAxe.setItemMeta(axeMeta);

        // Create infinity shovel
        ItemStack infinityShovel = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta shovelMeta = infinityShovel.getItemMeta();
        shovelMeta.setDisplayName("Infinity Shovel");
        shovelMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:efficiency")), 5, true);
        shovelMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer shovelData = shovelMeta.getPersistentDataContainer();
        shovelData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "shovel");
        infinityShovel.setItemMeta(shovelMeta);

        // Create infinity sword
        ItemStack infinitySword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = infinitySword.getItemMeta();
        swordMeta.setDisplayName("Infinity Sword");
        swordMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:sharpness")), 5, true);
        swordMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer swordData = swordMeta.getPersistentDataContainer();
        swordData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "sword");
        infinitySword.setItemMeta(swordMeta);

        // Create infinity helmet
        ItemStack infinityHelmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta helmetMeta = infinityHelmet.getItemMeta();
        helmetMeta.setDisplayName("Infinity Helmet");
        helmetMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:protection")), 4, true);
        helmetMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer helmetData = helmetMeta.getPersistentDataContainer();
        helmetData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "helmet");
        infinityHelmet.setItemMeta(helmetMeta);

        // Create infinity chestplate
        ItemStack infinityChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestplateMeta = infinityChestplate.getItemMeta();
        chestplateMeta.setDisplayName("Infinity Chestplate");
        chestplateMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:protection")), 4, true);
        chestplateMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer chestplateData = chestplateMeta.getPersistentDataContainer();
        chestplateData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "chestplate");
        infinityChestplate.setItemMeta(chestplateMeta);

        // Create infinity leggings
        ItemStack infinityLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta leggingsMeta = infinityLeggings.getItemMeta();
        leggingsMeta.setDisplayName("Infinity Leggings");
        leggingsMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:protection")), 4, true);
        leggingsMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer leggingsData = leggingsMeta.getPersistentDataContainer();
        leggingsData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "leggings");
        infinityLeggings.setItemMeta(leggingsMeta);

        // Create infinity boots
        ItemStack infinityBoots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta bootsMeta = infinityBoots.getItemMeta();
        bootsMeta.setDisplayName("Infinity Boots");
        bootsMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:protection")), 4, true);
        bootsMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        PersistentDataContainer bootsData = bootsMeta.getPersistentDataContainer();
        bootsData.set(new NamespacedKey(this, "infinity_item"), PersistentDataType.STRING, "boots");
        infinityBoots.setItemMeta(bootsMeta);

        // Give items to player
        player.getInventory().addItem(infinityPickaxe);
        player.getInventory().addItem(infinityAxe);
        player.getInventory().addItem(infinityShovel);
        player.getInventory().addItem(infinitySword);
        player.getInventory().addItem(infinityHelmet);
        player.getInventory().addItem(infinityChestplate);
        player.getInventory().addItem(infinityLeggings);
        player.getInventory().addItem(infinityBoots);
        player.getInventory().addItem(InfinityBow.createInfinityBow(this));
        player.getInventory().addItem(InfinityPotion.createInfinityPotion(this));
    }
}
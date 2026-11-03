package com.enderdevelopment.plugin.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

public class InfinityBow {
    
    public static ItemStack createInfinityBow(Plugin plugin) {
        ItemStack infinityBow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = infinityBow.getItemMeta();
        bowMeta.setDisplayName("Infinity Bow");
        bowMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:power")), 5, true);
        bowMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:unbreaking")), 3, true);
        bowMeta.addEnchant(Enchantment.getByKey(NamespacedKey.minecraft("minecraft:infinity")), 1, true);
        PersistentDataContainer bowData = bowMeta.getPersistentDataContainer();
        bowData.set(new NamespacedKey(plugin, "infinity_item"), PersistentDataType.STRING, "bow");
        infinityBow.setItemMeta(bowMeta);
        return infinityBow;
    }
}
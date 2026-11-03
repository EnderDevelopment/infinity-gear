package com.enderdevelopment.plugin.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InfinityPotion {
    
    public static ItemStack createInfinityPotion(Plugin plugin) {
        ItemStack infinityPotion = new ItemStack(Material.POTION);
        PotionMeta potionMeta = (PotionMeta) infinityPotion.getItemMeta();
        potionMeta.setDisplayName("Infinity Potion");
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 30, 2), true);
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP_BOOST, 20 * 30, 2), true);
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 30, 1), true);
        PersistentDataContainer potionData = potionMeta.getPersistentDataContainer();
        potionData.set(new NamespacedKey(plugin, "infinity_item"), PersistentDataType.STRING, "potion");
        infinityPotion.setItemMeta(potionMeta);
        return infinityPotion;
    }
}
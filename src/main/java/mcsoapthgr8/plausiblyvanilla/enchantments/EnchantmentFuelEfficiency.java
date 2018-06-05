package mcsoapthgr8.plausiblyvanilla.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentFuelEfficiency extends Enchantment {
    protected EnchantmentFuelEfficiency() {
        super(Rarity.VERY_RARE, EnumEnchantmentType.ALL,EntityEquipmentSlot.values());
    }
}

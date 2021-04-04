package com.mcsoapthgr8.plausiblyvanilla.enchantments;

import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelEfficiencyEnchantment extends Enchantment {
    public static final EquipmentSlot[] ALL_SLOTS = new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND};

    public FuelEfficiencyEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, ALL_SLOTS);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        Item item = stack.getItem();
        return item instanceof IAllowFuelEfficiency;
    }
}

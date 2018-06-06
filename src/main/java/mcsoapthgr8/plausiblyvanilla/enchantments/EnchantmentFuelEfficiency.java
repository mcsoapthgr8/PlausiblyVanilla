package mcsoapthgr8.plausiblyvanilla.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantmentFuelEfficiency extends Enchantment {
    protected EnchantmentFuelEfficiency(String id) {
        super(Rarity.RARE, EnumEnchantmentType.ALL,EntityEquipmentSlot.values());
        setRegistryName(id);
    }

    @Override
    public int getMinEnchantability(int level) {
        return 15;
    }

    @Override
    public int getMaxEnchantability(int level) {
        return getMinEnchantability(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public String getName() {
        return "enchantment.plausiblyvanilla.fuelefficiency";
    }

    @Override
    public boolean canApply(ItemStack stack) {
        Item item = stack.getItem();
        return item instanceof IAllowFuelEfficiency;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return canApply(stack);
    }
}

package mcsoapthgr8.plausiblyvanilla.materials;

import com.google.common.collect.ImmutableList;
import mcsoapthgr8.plausiblyvanilla.base.IInitializer;
import mcsoapthgr8.plausiblyvanilla.base.items.ItemBase;
import mcsoapthgr8.plausiblyvanilla.core.config.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemMaterial extends ItemBase implements IInitializer {
    public static ItemStack groundIron;
    public static ItemStack groundGold;
    public static ItemStack groundCoal;
    public static ItemStack groundCharcoal;
    public static ItemStack groundNetherrack;
    public static ItemStack silicon;
    public static ItemStack sulfur;
    public static ItemStack niter;
    public static ItemStack groundWheat;

    public static ItemStack ingotIron;
    public static ItemStack ingotGold;
    public static ItemStack bread;

    private Map<Integer, MaterialEntry> materialMap = new HashMap<Integer, MaterialEntry>();
    private ArrayList<Integer> materialList = new ArrayList<>();

    public ItemMaterial() {
        setUnlocalizedName("material");
        setCreativeTab(CreativeTabs.MATERIALS);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public boolean preInit() {
        groundIron = addOreDictItem(0, "ground_iron", "dustIron", EnumRarity.COMMON);
        groundGold = addOreDictItem(1, "ground_gold", "dustGold", EnumRarity.COMMON);
        groundCoal = addOreDictItem(20, "ground_coal", "dustCoal", EnumRarity.COMMON);
        groundCharcoal = addOreDictItem(21, "ground_charcoal", "dustCharcoal", EnumRarity.COMMON);
        groundNetherrack = addOreDictItem(31, "ground_netherrack","dustNetherrack", EnumRarity.COMMON);
        silicon = addOreDictItem(50, "silicon", "dustSilicon", EnumRarity.COMMON);
        sulfur = addOreDictItem(51, "sulfur", "dustSulfur", EnumRarity.COMMON);
        niter = addOreDictItem(52, "niter", "dustNiter", EnumRarity.COMMON);
        groundWheat = addOreDictItem(80, "ground_wheat", "dustWheat", EnumRarity.COMMON);

        ingotIron = new ItemStack(Items.IRON_INGOT);
        ingotGold = new ItemStack(Items.GOLD_INGOT);
        bread = new ItemStack(Items.BREAD);

        return true;
    }

    public ItemStack addItem(int number, MaterialEntry entry) {

        if (materialMap.containsKey(number)) {
            return ItemStack.EMPTY;
        }
        materialMap.put(number, entry);
        materialList.add(number);

        return new ItemStack(this, 1, number);
    }

    public ItemStack addItem(int number, String name, EnumRarity rarity) {
        return addItem(number, new MaterialEntry(name, rarity));
    }

    public ItemStack addOreDictItem(int number, String name, String oreName, EnumRarity rarity) {

        ItemStack stack = addItem(number, name, rarity);
        OreDictionary.registerOre(oreName, stack);

        return stack;
    }

    @Override
    public boolean initialize() {
        GameRegistry.addSmelting(groundIron, ingotIron, 0.7F);
        GameRegistry.addSmelting(groundGold, ingotGold, 1.0F);
        GameRegistry.addSmelting(groundWheat, bread , 0.5F);

        return true;
    }

    public ImmutableList<ItemStack> getAllItems() {

        ArrayList<ItemStack> items = new ArrayList<>();

        for (int metadata : materialList) {
            items.add(new ItemStack(this, 1, metadata));
        }
        return ImmutableList.copyOf(items);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {

        if (isInCreativeTab(tab)) {
            for (int metadata : materialList) {
                items.add(new ItemStack(this, 1, metadata));
            }
        }
    }

    @Override
    public boolean isDamageable() {

        return false;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {

        int i = Items.DIAMOND.getDamage(stack);
        if (!materialMap.containsKey(i)) {
            return EnumRarity.COMMON;
        }
        return materialMap.get(Items.DIAMOND.getDamage(stack)).rarity;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {

        int i = Items.DIAMOND.getDamage(stack);
        if (!materialMap.containsKey(i)) {
            return "item.invalid";
        }
        MaterialEntry item = materialMap.get(i);
        return getUnlocalizedName() + "." + item.name;
    }

    @Override
    public Item setUnlocalizedName(String name) {
        this.name = name;
        name = Constants.MOD_ID + "." + name;
        return super.setUnlocalizedName(name);
    }

    public class MaterialEntry {
        public String name;
        public EnumRarity rarity;

        MaterialEntry(String name, EnumRarity rarity) {
            this.name = name;
            this.rarity = rarity;
        }
    }
}

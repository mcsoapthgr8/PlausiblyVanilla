package mcsoapthgr8.plausiblyvanilla.proxy;

import mcsoapthgr8.plausiblyvanilla.ModBlocks;
import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.config.Config;
import mcsoapthgr8.plausiblyvanilla.machines.grinder.BlockGrinder;
import mcsoapthgr8.plausiblyvanilla.machines.grinder.TileEntityGrinder;
import mcsoapthgr8.plausiblyvanilla.machines.itempress.BlockItemPress;
import mcsoapthgr8.plausiblyvanilla.machines.itempress.TileEntityItemPress;
import mcsoapthgr8.plausiblyvanilla.machines.recipeimprinter.BlockRecipeImprinter;
import mcsoapthgr8.plausiblyvanilla.machines.recipeimprinter.TileEntityRecipeImprinter;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), Constants.CONFIG_FILE_NAME));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        // blocks
        registry.register(new BlockGrinder());
        registry.register(new BlockRecipeImprinter());
        registry.register(new BlockItemPress());

        // tile entities
        GameRegistry.registerTileEntity(TileEntityGrinder.class, new ResourceLocation(Constants.MOD_ID, Constants.NAME_BLOCK_GRINDER));
        GameRegistry.registerTileEntity(TileEntityItemPress.class, new ResourceLocation(Constants.MOD_ID, Constants.NAME_BLOCK_ITEM_PRESS));
        GameRegistry.registerTileEntity(TileEntityRecipeImprinter.class, new ResourceLocation(Constants.MOD_ID, Constants.NAME_BLOCK_RECIPE_IMPRINTER));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        // Block items
        registry.register(new ItemBlock(ModBlocks.blockGrinder).setRegistryName(ModBlocks.blockGrinder.getRegistryName()));
        registry.register(new ItemBlock(ModBlocks.blockRecipeImprinter).setRegistryName(ModBlocks.blockRecipeImprinter.getRegistryName()));
        registry.register(new ItemBlock(ModBlocks.blockItemPress).setRegistryName(ModBlocks.blockItemPress.getRegistryName()));

        // item-only items
        //registry.register(new ItemBlazeCore());
    }
}

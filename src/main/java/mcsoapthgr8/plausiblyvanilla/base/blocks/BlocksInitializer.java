package mcsoapthgr8.plausiblyvanilla.base.blocks;

import mcsoapthgr8.plausiblyvanilla.machines.grinder.BlockGrinder;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlocksInitializer {
    public static final BlocksInitializer INSTANCE = new BlocksInitializer();

    public static BlockGrinder blockGrinder;

    private BlocksInitializer() {}

    public static void preInit() {
        blockGrinder = new BlockGrinder();

        MinecraftForge.EVENT_BUS.register(INSTANCE);
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
    }
}

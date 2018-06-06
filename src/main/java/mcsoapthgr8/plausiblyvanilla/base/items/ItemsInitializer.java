package mcsoapthgr8.plausiblyvanilla.base.items;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemsInitializer {
    public static final ItemsInitializer INSTANCE = new ItemsInitializer();

    private ItemsInitializer() {}

    public static void preInit() {

        MinecraftForge.EVENT_BUS.register(INSTANCE);
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
    }
}

package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.base.IInitializer;
import mcsoapthgr8.plausiblyvanilla.items.ItemMaterial;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

public class ItemsInitializer {
    public static final ItemsInitializer INSTANCE = new ItemsInitializer();
    private static ArrayList<IInitializer> initList = new ArrayList<>();

    public static ItemMaterial itemMaterial;

    private ItemsInitializer() {}

    public static void preInit() {

        itemMaterial = new ItemMaterial();

        initList.add(itemMaterial);

        for (IInitializer init : initList) {
            init.preInit();
        }

        MinecraftForge.EVENT_BUS.register(INSTANCE);
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {

        for (IInitializer init : initList) {
            init.initialize();
        }
    }
}

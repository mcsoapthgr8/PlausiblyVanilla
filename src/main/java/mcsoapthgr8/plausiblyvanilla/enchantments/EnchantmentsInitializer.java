package mcsoapthgr8.plausiblyvanilla.enchantments;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class EnchantmentsInitializer {
    public static final EnchantmentsInitializer INSTANCE = new EnchantmentsInitializer();
    public static boolean registered = false;
    public static Enchantment fuelEfficiency;

    private EnchantmentsInitializer() {}

    public static void preInit() {
        fuelEfficiency = new EnchantmentFuelEfficiency("plausiblyvanilla:fuelefficiency");

        MinecraftForge.EVENT_BUS.register(INSTANCE);
    }

    public static void register() {
        if (registered) {
            return;
        }

        ModContainer callingContainer = Loader.instance().activeModContainer();
        ModContainer pvContainer = FMLCommonHandler.instance().findContainerFor(Constants.MOD_ID);

        Loader.instance().setActiveModContainer(pvContainer);
        MinecraftForge.EVENT_BUS.register(INSTANCE);
        registered = true;
        Loader.instance().setActiveModContainer(callingContainer);
    }

    public static boolean registered() {
        return registered;
    }

    @SubscribeEvent
    public void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        IForgeRegistry<Enchantment> registry = event.getRegistry();

        registry.register(fuelEfficiency);
    }

}

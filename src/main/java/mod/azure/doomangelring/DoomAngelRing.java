package mod.azure.doomangelring;

import mod.azure.doomangelring.compat.CuriosCompat;
import mod.azure.doomangelring.register.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("doomangelring")
public class DoomAngelRing {
	public static final String MODID = "doomangelring";

	public DoomAngelRing() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		ItemRegistry.ITEMS.register(modEventBus);
	}

	@SubscribeEvent
	public static void sendImc(InterModEnqueueEvent event) {
		CuriosCompat.sendImc();
	}
}
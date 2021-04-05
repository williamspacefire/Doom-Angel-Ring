package xyz.spacefire.pandoraring;

import xyz.spacefire.pandoraring.ring.ItemPandoraRing;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

@Mod("pandoraring")
public class PandoraRing {
	public static final String MODID = "pandoraring";

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			PandoraRing.MODID);
	public static final RegistryObject<Item> RING = ITEMS.register("itempandoraring", () -> new ItemPandoraRing());

	public PandoraRing() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::enqueueIMC);
		ITEMS.register(modEventBus);
	}

	private void enqueueIMC(InterModEnqueueEvent event) {
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE,
				() -> SlotTypePreset.RING.getMessageBuilder().build());
	}
}
package mod.azure.doomangelring.register;

import mod.azure.doomangelring.DoomAngelRing;
import mod.azure.doomangelring.ring.ItemDoomAngelRing;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			DoomAngelRing.MODID);
	public static final RegistryObject<Item> RING = ITEMS.register("itemdoomangelring", () -> new ItemDoomAngelRing());
}
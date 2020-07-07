package mod.azure.doomangelring.ring;

import mod.azure.doomangelring.compat.CuriosCompat;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class ItemDoomAngelRing extends Item {

	public ItemDoomAngelRing() {
		super(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC));
	}

	@Override
	public ICapabilityProvider initCapabilities(final ItemStack stack, CompoundNBT unused) {

		return CuriosCompat.initCapabilities();
	}
}

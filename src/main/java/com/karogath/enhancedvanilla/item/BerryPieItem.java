
package com.karogath.enhancedvanilla.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class BerryPieItem extends EnhancedvanillaModElements.ModElement {
	@ObjectHolder("enhancedvanilla:berry_pie")
	public static final Item block = null;
	public BerryPieItem(EnhancedvanillaModElements instance) {
		super(instance, 89);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(8).saturation(1.5f).build()));
			setRegistryName("berry_pie");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}

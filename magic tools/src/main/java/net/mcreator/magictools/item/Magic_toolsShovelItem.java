
package net.mcreator.magictools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.magictools.init.MagicToolsModItems;

public class Magic_toolsShovelItem extends ShovelItem {
	public Magic_toolsShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 40f;
			}

			public float getAttackDamageBonus() {
				return 43f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 140;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MagicToolsModItems.MAGICINGOT.get()));
			}
		}, 1, 6f, new Item.Properties());
	}
}

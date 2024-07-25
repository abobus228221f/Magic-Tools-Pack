
package net.mcreator.magictools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.magictools.init.MagicToolsModItems;

public class Magic_toolsSwordItem extends SwordItem {
	public Magic_toolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 56f;
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
		}, 3, 12f, new Item.Properties());
	}
}

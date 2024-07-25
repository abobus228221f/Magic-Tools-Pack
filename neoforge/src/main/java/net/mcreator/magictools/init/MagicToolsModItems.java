
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magictools.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magictools.item.MagicingotItem;
import net.mcreator.magictools.item.Magic_toolsSwordItem;
import net.mcreator.magictools.item.Magic_toolsShovelItem;
import net.mcreator.magictools.item.Magic_toolsPickaxeItem;
import net.mcreator.magictools.item.Magic_toolsHoeItem;
import net.mcreator.magictools.item.Magic_toolsAxeItem;
import net.mcreator.magictools.item.Magic_oreDustItem;
import net.mcreator.magictools.MagicToolsMod;

public class MagicToolsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MagicToolsMod.MODID);
	public static final DeferredHolder<Item, Item> MAGIC_ORE_DUST = REGISTRY.register("magic_ore_dust", Magic_oreDustItem::new);
	public static final DeferredHolder<Item, Item> MAGIC_ORE_ORE = block(MagicToolsModBlocks.MAGIC_ORE_ORE);
	public static final DeferredHolder<Item, Item> MAGIC_ORE_BLOCK = block(MagicToolsModBlocks.MAGIC_ORE_BLOCK);
	public static final DeferredHolder<Item, Item> MAGICINGOT = REGISTRY.register("magicingot", MagicingotItem::new);
	public static final DeferredHolder<Item, Item> MAGIC_TOOLS_PICKAXE = REGISTRY.register("magic_tools_pickaxe", Magic_toolsPickaxeItem::new);
	public static final DeferredHolder<Item, Item> MAGIC_TOOLS_AXE = REGISTRY.register("magic_tools_axe", Magic_toolsAxeItem::new);
	public static final DeferredHolder<Item, Item> MAGIC_TOOLS_SWORD = REGISTRY.register("magic_tools_sword", Magic_toolsSwordItem::new);
	public static final DeferredHolder<Item, Item> MAGIC_TOOLS_SHOVEL = REGISTRY.register("magic_tools_shovel", Magic_toolsShovelItem::new);
	public static final DeferredHolder<Item, Item> MAGIC_TOOLS_HOE = REGISTRY.register("magic_tools_hoe", Magic_toolsHoeItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

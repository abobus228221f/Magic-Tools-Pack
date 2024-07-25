
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magictools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicToolsMod.MODID);
	public static final RegistryObject<Item> MAGIC_ORE_DUST = REGISTRY.register("magic_ore_dust", () -> new Magic_oreDustItem());
	public static final RegistryObject<Item> MAGIC_ORE_ORE = block(MagicToolsModBlocks.MAGIC_ORE_ORE);
	public static final RegistryObject<Item> MAGIC_ORE_BLOCK = block(MagicToolsModBlocks.MAGIC_ORE_BLOCK);
	public static final RegistryObject<Item> MAGICINGOT = REGISTRY.register("magicingot", () -> new MagicingotItem());
	public static final RegistryObject<Item> MAGIC_TOOLS_PICKAXE = REGISTRY.register("magic_tools_pickaxe", () -> new Magic_toolsPickaxeItem());
	public static final RegistryObject<Item> MAGIC_TOOLS_AXE = REGISTRY.register("magic_tools_axe", () -> new Magic_toolsAxeItem());
	public static final RegistryObject<Item> MAGIC_TOOLS_SWORD = REGISTRY.register("magic_tools_sword", () -> new Magic_toolsSwordItem());
	public static final RegistryObject<Item> MAGIC_TOOLS_SHOVEL = REGISTRY.register("magic_tools_shovel", () -> new Magic_toolsShovelItem());
	public static final RegistryObject<Item> MAGIC_TOOLS_HOE = REGISTRY.register("magic_tools_hoe", () -> new Magic_toolsHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

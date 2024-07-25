
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magictools.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.magictools.block.Magic_oreOreBlock;
import net.mcreator.magictools.block.Magic_oreBlockBlock;
import net.mcreator.magictools.MagicToolsMod;

public class MagicToolsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MagicToolsMod.MODID);
	public static final DeferredHolder<Block, Block> MAGIC_ORE_ORE = REGISTRY.register("magic_ore_ore", Magic_oreOreBlock::new);
	public static final DeferredHolder<Block, Block> MAGIC_ORE_BLOCK = REGISTRY.register("magic_ore_block", Magic_oreBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magictools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magictools.block.Magic_oreOreBlock;
import net.mcreator.magictools.block.Magic_oreBlockBlock;
import net.mcreator.magictools.MagicToolsMod;

public class MagicToolsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicToolsMod.MODID);
	public static final RegistryObject<Block> MAGIC_ORE_ORE = REGISTRY.register("magic_ore_ore", () -> new Magic_oreOreBlock());
	public static final RegistryObject<Block> MAGIC_ORE_BLOCK = REGISTRY.register("magic_ore_block", () -> new Magic_oreBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

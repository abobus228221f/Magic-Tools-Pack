
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magictools.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.magictools.MagicToolsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicToolsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicToolsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MagicToolsModBlocks.MAGIC_ORE_ORE.get().asItem());
			tabData.accept(MagicToolsModBlocks.MAGIC_ORE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MagicToolsModItems.MAGIC_TOOLS_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MagicToolsModItems.MAGIC_ORE_DUST.get());
			tabData.accept(MagicToolsModItems.MAGICINGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MagicToolsModItems.MAGIC_TOOLS_PICKAXE.get());
			tabData.accept(MagicToolsModItems.MAGIC_TOOLS_AXE.get());
			tabData.accept(MagicToolsModItems.MAGIC_TOOLS_SHOVEL.get());
			tabData.accept(MagicToolsModItems.MAGIC_TOOLS_HOE.get());
		}
	}
}

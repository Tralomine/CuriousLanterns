package com.psilocke.curiouslanterns.curios;

import com.psilocke.curiouslanterns.CuriousLanterns;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class LanternModels {
	public static ResourceLocation NULL_TEX = new ResourceLocation(CuriousLanterns.MOD_ID, "curio/null_tex");

	public static ResourceLocation getLanternModel(ItemStack item) {
		if(Block.byItem(item.getItem()) != Blocks.AIR) {
			ResourceLocation model = Registry.BLOCK.getKey(Block.byItem(item.getItem()));
			return model;
		}
		else return NULL_TEX;
	}
}

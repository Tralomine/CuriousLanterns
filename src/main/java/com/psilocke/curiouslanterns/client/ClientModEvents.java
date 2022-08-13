package com.psilocke.curiouslanterns.client;

import com.psilocke.curiouslanterns.CuriousLanterns;
import com.psilocke.curiouslanterns.curios.LanternModels;
import com.psilocke.curiouslanterns.curios.LanternRenderer;

import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

@Mod.EventBusSubscriber(modid = CuriousLanterns.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {

//	@SubscribeEvent
//	public static void onClientSetupEvent(FMLClientSetupEvent e) {
//		CuriosRendererRegistry.register(Items.LANTERN, LanternRenderer::new);
//		CuriosRendererRegistry.register(Items.SOUL_LANTERN, LanternRenderer::new);
//	}
//
//	@SubscribeEvent
//	public static void onModelregister(ModelRegistryEvent event) {
//		ForgeModelBakery.addSpecialModel(LanternModels.LANTERN);
//		ForgeModelBakery.addSpecialModel(LanternModels.SOUL_LANTERN);
//	}
}
package client;

import Investiture.InvestitureMod;
import init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = InvestitureMod.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.Aluminum_Ingot);
	}

	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
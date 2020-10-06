package com.sirio120.witheredmod.init;

import com.sirio120.witheredmod.WitheredMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = WitheredMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(WitheredMod.MOD_ID)
public class ItemInit {
	
	public static final Item wither_essence = null;
	public static final Item wither_eye = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("wither_essence"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("wither_eye"));
	}
}

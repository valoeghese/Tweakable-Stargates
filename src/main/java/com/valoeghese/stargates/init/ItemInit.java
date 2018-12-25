package com.valoeghese.stargates.init;

import java.util.ArrayList;
import java.util.List;

import com.valoeghese.stargates.game.items.BaseItem;
import com.valoeghese.stargates.game.items.ItemFuel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item FUEL_SPECIAL = new ItemFuel("naquadah", 120F);
	public static final Item INGOT_SPECIAL = new BaseItem("ingot_naquadah");
}
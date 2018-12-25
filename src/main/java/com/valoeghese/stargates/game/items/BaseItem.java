package com.valoeghese.stargates.game.items;

import com.valoeghese.stargates.TSGCraft;
import com.valoeghese.stargates.init.ItemInit;
import com.valoeghese.stargates.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item implements IHasModel
{
	public BaseItem(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(TSGCraft.getCreativeTab());
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		TSGCraft.proxy.registerModel(this, 0);
	}
}

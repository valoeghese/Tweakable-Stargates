package com.valoeghese.stargates.game.blocks;

import com.valoeghese.stargates.TSGCraft;
import com.valoeghese.stargates.init.BlockInit;
import com.valoeghese.stargates.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BaseBlock extends Block
{
	public BaseBlock(String nameIn, Material materialIn, SoundType soundIn)
	{
		super(materialIn);
		
		this.setUnlocalizedName(nameIn);
		this.setSoundType(soundIn);
		this.setRegistryName(nameIn);
		this.setCreativeTab(TSGCraft.getCreativeTab());
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(nameIn));
	}
	
}

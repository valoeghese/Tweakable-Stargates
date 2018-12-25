package com.valoeghese.stargates.game.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockOre extends BaseBlock
{
	
	private final Item itemDropped;
	private final int minDropped;
	private final int maxDropped;
	
	public BlockOre(String nameIn, Item returnIn, int min, int max)
	{
		super(nameIn, Material.ROCK, SoundType.STONE);
		
		//set the item dropped by the block
		this.itemDropped = returnIn;
		
		//set min&max items dropped
		this.minDropped = min;
		this.maxDropped = max;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this.itemDropped;
	}
	
	@Override
	public int quantityDropped(Random rand)
    {
        return rand.nextInt((this.maxDropped - this.minDropped) + 1) + this.maxDropped;
    }

}

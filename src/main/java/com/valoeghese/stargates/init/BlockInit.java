package com.valoeghese.stargates.init;

import java.util.ArrayList;
import java.util.List;

import com.valoeghese.stargates.game.blocks.BlockOre;

import net.minecraft.block.Block;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_SPECIAL = new BlockOre("ore_naquadah", ItemInit.FUEL_SPECIAL, 3, 4);
}

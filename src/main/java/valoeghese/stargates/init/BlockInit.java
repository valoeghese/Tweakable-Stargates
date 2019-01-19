package valoeghese.stargates.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import valoeghese.stargates.game.blocks.BlockNaquadahOre;
import valoeghese.stargates.game.blocks.BlockOre;
import valoeghese.stargates.game.blocks.BlockStargate;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_SPECIAL = new BlockNaquadahOre("ore_naquadah");
	
	public static final Block STARGATE_RING = new BlockStargate("stargate_ring");
	public static final Block STARGATE_RING_CHEVRON = new BlockStargate("stargate_chevron");
	public static final Block STARGATE_BASE = new BlockStargate("stargate_base");

}

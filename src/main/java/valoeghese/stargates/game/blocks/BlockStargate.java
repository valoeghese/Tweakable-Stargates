package valoeghese.stargates.game.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import valoeghese.stargates.util.HarvestLevelCategory;

public class BlockStargate extends BaseBlock
{

	public BlockStargate(String nameIn)
	{
		super(nameIn, Material.IRON, SoundType.STONE);
		
		this.setHarvestLevel(HarvestLevelCategory.PICKAXE.getType(), 0);
		this.setHardness(3.5F);
	}

}

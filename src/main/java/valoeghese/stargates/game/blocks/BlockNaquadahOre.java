package valoeghese.stargates.game.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import valoeghese.stargates.init.ItemInit;
import valoeghese.stargates.util.HarvestLevelCategory;

public class BlockNaquadahOre extends BlockOre
{

	public BlockNaquadahOre(String nameIn)
	{
		super(nameIn, ItemInit.INGOT_SPECIAL, 3, 6);
		
		this.setHarvestLevel(HarvestLevelCategory.PICKAXE.getType(), 3);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
	}

}

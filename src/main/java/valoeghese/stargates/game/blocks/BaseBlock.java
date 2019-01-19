package valoeghese.stargates.game.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import valoeghese.stargates.TSGCraft;
import valoeghese.stargates.init.BlockInit;
import valoeghese.stargates.init.ItemInit;
import valoeghese.stargates.util.HarvestLevelCategory;
import valoeghese.stargates.util.IHasModel;

public class BaseBlock extends Block implements IHasModel
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
	
	@Override
	public void registerModels()
	{
		TSGCraft.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
	
}

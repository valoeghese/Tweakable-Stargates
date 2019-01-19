package valoeghese.stargates.game.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import valoeghese.stargates.TSGCraft;
import valoeghese.stargates.init.ItemInit;
import valoeghese.stargates.util.IHasModel;

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

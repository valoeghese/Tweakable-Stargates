package valoeghese.stargates.game.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemFuel extends BaseItem
{
	//fuel burn time
	private final float burnTime;
	
	public ItemFuel(String name, float burnTimeIn)
	{
		super(name);
		
		this.burnTime = burnTimeIn;		
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack)
	{
		return (int)Math.floor((20*this.burnTime));
	}
	
}

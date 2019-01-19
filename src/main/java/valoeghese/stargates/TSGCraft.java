package valoeghese.stargates;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import valoeghese.stargates.proxy.ClientProxy;
import valoeghese.stargates.proxy.CommonProxy;
import valoeghese.stargates.util.main.GameSide;

import org.apache.logging.log4j.Logger;

@Mod(modid = TSGCraft.MODID, name = TSGCraft.NAME, version = TSGCraft.VERSION)
public class TSGCraft
{
    public static final String MODID = "sgcraft2";
    public static final String NAME = "Tweakable Stargates";
    public static final String VERSION = "1.0";
    
    public static final String CLIENT_PROXY_CLASS = "com.valoeghese.stargates.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.valoeghese.stargates.proxy.CommonProxy";
    private static Logger logger;
    
    public GameSide preSide;
    
    @Instance
    public static TSGCraft instance;
    
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    	//Initialize utility instance for Client/Server for possible further use.
    	preSide = new GameSide(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    }
    
    public static final CreativeTabs TAB = new CreativeTabs("sgcraft") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Blocks.LIT_FURNACE);
		}
    	
    };
    //get modded creative tab
    public static CreativeTabs getCreativeTab()
    {
    	return CreativeTabs.REDSTONE;
    }
}

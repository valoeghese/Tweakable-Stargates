package com.valoeghese.stargates;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.valoeghese.stargates.util.main.GameSide;

@Mod(modid = TSGCraft.MODID, name = TSGCraft.NAME, version = TSGCraft.VERSION)
public class TSGCraft
{
    public static final String MODID = "gates";
    public static final String NAME = "Tweakable Stargates";
    public static final String VERSION = "1.0";
    
    public static final String CLIENT_PROXY_CLASS = "com.valoeghese.stargates.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.valoeghese.stargates.proxy.CommonProxy";
    private static Logger logger;
    
    public GameSide preSide;
    
    @Instance
    public static TSGCraft instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    	//Initialize utility instance for Client/Server
    	preSide = new GameSide(e);

        if (preSide.isClient()) {
        	
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}

package com.valoeghese.stargates.util.main;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.client.MinecraftForgeClient;
public class GameSide {
	
	private final boolean isClient, isServer;
	
	public boolean isClient() {
		return isClient;
	}
	public boolean isServer() {
		return isServer;
	}
	
	public GameSide(FMLPreInitializationEvent e)
	{
		this.isClient = e.getSide().isClient();
		this.isServer = e.getSide().isServer();
	}
	
}

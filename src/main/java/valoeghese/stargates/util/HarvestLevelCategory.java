package valoeghese.stargates.util;

public enum HarvestLevelCategory
{
	PICKAXE("pickaxe");
	
	private final String type;
	HarvestLevelCategory(String type)
	{
		this.type = type;
	}
	
	public final String getType()
	{
		return this.type;
	}
}

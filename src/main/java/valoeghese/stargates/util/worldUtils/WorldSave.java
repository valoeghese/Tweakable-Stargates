package valoeghese.stargates.util.worldUtils;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.common.util.Constants;
import valoeghese.stargates.TSGCraft;
import valoeghese.stargates.util.Portal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WorldSave extends WorldSavedData {

    private List<Portal> portals;
    private static String DATA = TSGCraft.MODID + "_PORTALS";

    public WorldSave(String name) {
        super(name);
        portals = new ArrayList<>();
    }

    public WorldSave(){
        this(DATA);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        portals.clear();
        NBTTagList list = nbt.getTagList("portals", Constants.NBT.TAG_COMPOUND);
        for (int i = 0 ; i < list.tagCount() ; i++) {
            NBTTagCompound tc = list.getCompoundTagAt(i);
            UUID id = UUID.fromString(tc.getString("id"));
            portals.add(Portal.fromString(tc.getString("value"), id));
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        NBTTagList list = new NBTTagList();
        for(Portal portal: portals){
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("id", portal.getUuid().toString());
            tag.setString("value", portal.toString());
            list.appendTag(tag);
        }
        compound.setTag("portals", list);
        return compound;
    }

    public WorldSave get(World world){
        MapStorage storage = world.getMapStorage();
        WorldSave instance = (WorldSave) storage.getOrLoadData(WorldSave.class, DATA);

        if (instance == null) {
            instance = new WorldSave();
            storage.setData(DATA, instance);
        }
        return instance;
    }
}

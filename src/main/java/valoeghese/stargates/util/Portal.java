package valoeghese.stargates.util;

import java.util.UUID;

public class Portal {

    private final UUID uuid;

    public Portal(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public static Portal fromString(String items, UUID id){
        return new Portal(id);
    }
}

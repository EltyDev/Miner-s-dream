package fr.elty.minersdream.fabric;

import fr.elty.minersdream.MinersDream;
import net.fabricmc.api.ModInitializer;

public final class MinersDreamFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MinersDream.init();
    }
}

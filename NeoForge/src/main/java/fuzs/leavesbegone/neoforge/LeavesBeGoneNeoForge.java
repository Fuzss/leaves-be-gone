package fuzs.leavesbegone.neoforge;

import fuzs.leavesbegone.common.LeavesBeGone;
import fuzs.leavesbegone.common.data.ModBlockTagProvider;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import net.neoforged.fml.common.Mod;

@Mod(LeavesBeGone.MOD_ID)
public class LeavesBeGoneNeoForge {

    public LeavesBeGoneNeoForge() {
        ModConstructor.construct(LeavesBeGone.MOD_ID, LeavesBeGone::new);
        DataProviderBuilder.of(LeavesBeGone.MOD_ID).addProvider(ModBlockTagProvider::new);
    }
}

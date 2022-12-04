package gq.codephon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("qdf")
public class qdf {
    public qdf(){
        ModConfig.init(FMLPaths.CONFIGDIR.get().resolve("qdf-client.toml"));
    }
}

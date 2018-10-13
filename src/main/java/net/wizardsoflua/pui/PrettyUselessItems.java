package net.wizardsoflua.pui;

import java.io.IOException;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.wizardsoflua.pui.init.ModItems;

@Mod(modid = PrettyUselessItems.MODID, name = PrettyUselessItems.MODNAME,
    version = PrettyUselessItems.VERSION,
    acceptedMinecraftVersions = PrettyUselessItems.ACCEPTED_MINECRAFT_VERSIONS)
public class PrettyUselessItems {
  public static final String MODID = "pui";
  public static final String MODNAME = "Pretty Useless Items";
  public static final String VERSION = "@MOD_VERSION@";
  public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12]";

  @Instance
  public static PrettyUselessItems instance;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) throws IOException {
    System.out.println(PrettyUselessItems.MODID + ":preInit");
    ModItems.init();
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    System.out.println(PrettyUselessItems.MODID + ":init");
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    System.out.println(PrettyUselessItems.MODID + ":postInit");
  }

}

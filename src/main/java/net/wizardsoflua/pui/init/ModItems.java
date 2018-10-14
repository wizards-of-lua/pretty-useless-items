package net.wizardsoflua.pui.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.wizardsoflua.pui.PrettyUselessItems;
import net.wizardsoflua.pui.items.ItemBasic;

@Mod.EventBusSubscriber(modid = PrettyUselessItems.MODID)
public class ModItems {

  static List<Item> ITEMS = new ArrayList<>();

  public static void init() {
    ITEMS.add(new ItemBasic("amulet-blue").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("amulet-green").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("amulet-pink").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("amulet-red").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("car").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("clay-golem").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("coin-gold").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("coin-silver").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("dynamite").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("hammer-diamond").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("hammer-gold").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("hammer-stone").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("key").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("money").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("parcel").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("scroll-green").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("scroll-orange").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("scroll-pink").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("scroll-red").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("teddy").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("usb-stick").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("wand-blue").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("wand-green").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("wand-orange").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("wand-red").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));    
    ITEMS.add(new ItemBasic("bottle-broken").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("bottle-message").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("bottle").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("fork").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("key2").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("knive").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("letter").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("matches").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("moneybag").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("paintbrush").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("pencil").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("ring-blue").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("ring-gold").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("ring-green").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("ring-orange").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("ring-pink").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("ring-red").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("rubber-duck").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("sickle-diamond").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("sickle-gold").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("sickle-stone").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1));
    ITEMS.add(new ItemBasic("soccer-ball").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("spoon").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("rock").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("tusk").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));
    ITEMS.add(new ItemBasic("wrench").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64));

  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().registerAll(ITEMS.toArray(new Item[ITEMS.size()]));
  }

  @SubscribeEvent
  public static void registerRenders(ModelRegistryEvent event) {
    for (Item item : ITEMS) {
      registerRender(item);
    }
  }

  private static void registerRender(Item item) {
    ModelLoader.setCustomModelResourceLocation(item, 0,
        new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }
}

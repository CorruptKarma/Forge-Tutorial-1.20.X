package net.karma.tutorialmod.item;

import net.karma.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> VOID_CRYSTAL = ITEMS.register("void_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_AMETHYST = ITEMS.register("void_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_INF_PEARL = ITEMS.register("void_inf_pearl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_CASSING = ITEMS.register("iron_cassing",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

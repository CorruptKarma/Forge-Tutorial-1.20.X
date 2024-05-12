package net.karma.tutorialmod.item;

import net.karma.tutorialmod.TutorialMod;
import net.karma.tutorialmod.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VOID_INGREDIENTS =
            CREATIVE_MOD_TABS.register("void_ingredients",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.VOID_CRYSTAL.get()))
                            .title(Component.translatable("creativetab.void_ingredients"))
                            .displayItems((itemDisplayParameters, pOutput) -> {
                                pOutput.accept(ModItems.VOID_CRYSTAL.get());
                                pOutput.accept(ModItems.VOID_AMETHYST.get());
                                pOutput.accept(ModItems.VOID_INF_PEARL.get());
                                pOutput.accept(ModItems.VOID_INGOT.get());
                                pOutput.accept(ModItems.IRON_CASSING.get());

                                pOutput.accept(ModBlock.VOID_BLOCK.get());
                                pOutput.accept(ModBlock.VOID_ORE.get());
                            })
                            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}

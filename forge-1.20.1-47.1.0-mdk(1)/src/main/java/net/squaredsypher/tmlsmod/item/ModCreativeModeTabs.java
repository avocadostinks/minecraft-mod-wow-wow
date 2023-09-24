package net.squaredsypher.tmlsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.squaredsypher.tmlsmod.TMLsMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TMLsMod.MODID);

    public static final RegistryObject<CreativeModeTab> TMLS_MOD = CREATIVE_MODE_TABS.register("tmls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONE_BATON.get()))
                    .title(Component.translatable("creativetab.tmls_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STONE_BATON.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

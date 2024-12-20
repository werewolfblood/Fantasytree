package dev.west.fantasytreemod.init.datagen;

import dev.west.fantasytreemod.init.InitBlocks;
import dev.west.fantasytreemod.init.InitItems;
import dev.west.fantasytreemod.init.unit.FantasyTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class FantasyItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public FantasyItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(FantasyTags.Items.TRANSFORMABLE_ITEMS);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(InitItems.MITHRIL)
                .add(InitBlocks.EVIL_LEAVES.asItem())
                .add(InitBlocks.CRYSTAL_LEAVES.asItem())
                .add(InitBlocks.SILVER_LEAVES.asItem())
                .add(InitBlocks.MITHRIL_LEAVES.asItem());





    }
}

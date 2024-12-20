package dev.west.fantasytreemod.init.datagen;

import dev.west.fantasytreemod.init.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class FantasyBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FantasyBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.IRONWOOD_LOG)
                .add(InitBlocks.EVILWOOD_LOG)
                .add(InitBlocks.BlACKWILLOW_LOG)
                .add(InitBlocks.MITHRIL_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.DROW_LOG)
                .add(InitBlocks.PINE_LOG)
                .add(InitBlocks.SILVER_LOG)
                .add(InitBlocks.SUNELF_LOG)
                .add(InitBlocks.UATHAR_LOG)
                .add(InitBlocks.OUFYEW_LOG)
                .add(InitBlocks.AYIFER_LOG)
                .add(InitBlocks.MITHRIL_LEAVES)
                .add(InitBlocks.IORANY_LOG)
                .add(InitBlocks.SHADOW_FIR_LOG)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.YEZHOVE_LOG)
                .add(InitBlocks.EDLIFER_LOG)
                .add(InitBlocks.KLINWOOD_LOG)
                .add(InitBlocks.GREEN_FIR_LOG)
                .add(InitBlocks.ASHRET_LOG)
                .add(InitBlocks.SUNELF_LEAVES)
                .add(InitBlocks.DARKELF_LEAVES)
                .add(InitBlocks.WEEPING_LOG)
                .add(InitBlocks.OTHON_LOG)
                .add(InitBlocks.ALOGRORN_LOG)
                .add(InitBlocks.EIKEW_LOG)
                .add(InitBlocks.DLONET_LOG)
                .add(InitBlocks.DIRE_LOG)
                .add(InitBlocks.BUCKEYE_LOG)
                .add(InitBlocks.DOGWOOD_LOG)
                .add(InitBlocks.SCONET_LOG)
                .add(InitBlocks.OPLOOD_LOG)
                .add(InitBlocks.AEKLOOD_LOG)
                .add(InitBlocks.KRESS_LOG)
                .add(InitBlocks.SMANY_LOG)
                .add(InitBlocks.ICHREAM_LOG)
                .add(InitBlocks.TUFICH_LOG)
                .add(InitBlocks.BLUSHET_LOG)
                .add(InitBlocks.OLEN_LOG)
                .add(InitBlocks.GOLD_ELF_LOG)
                .add(InitBlocks.TREE_ELF_LOG)
                .add(InitBlocks.SILVERELF_LOG)
                .add(InitBlocks.PEACH_LOG)
                .add(InitBlocks.NIGHTELF_LOG)
                .add(InitBlocks.CRYSTALICE_LOG)
                .add(InitBlocks.BLUETRUE_LOG)
                .add(InitBlocks.USK_LOG)
                .add(InitBlocks.IPP_LOG)
                .add(InitBlocks.ELM_LOG)
                .add(InitBlocks.MORDOR_LOG)
                .add(InitBlocks.ANGBAND_LOG)
                .add(InitBlocks.FRER_LOG)
                .add(InitBlocks.BlACKWALNUT_LOG);



        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(InitBlocks.SHADOW_FIR_LOG)
                .add(InitBlocks.SUNELF_LOG)
                .add(InitBlocks.EVILWOOD_LOG)
                .add(InitBlocks.IRONWOOD_LOG)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.SILVER_LOG)
                .add(InitBlocks.PINE_LOG)
                .add(InitBlocks.DROW_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.MITHRIL_LOG)
                .add(InitBlocks.BlACKWILLOW_LOG)
                .add(InitBlocks.UATHAR_LOG)
                .add(InitBlocks.OUFYEW_LOG)
                .add(InitBlocks.AYIFER_LOG)
                .add(InitBlocks.IORANY_LOG)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.YEZHOVE_LOG)
                .add(InitBlocks.EDLIFER_LOG)
                .add(InitBlocks.KLINWOOD_LOG)
                .add(InitBlocks.GREEN_FIR_LOG)
                .add(InitBlocks.ASHRET_LOG)
                .add(InitBlocks.WEEPING_LOG)
                .add(InitBlocks.OTHON_LOG)
                .add(InitBlocks.ALOGRORN_LOG)
                .add(InitBlocks.EIKEW_LOG)
                .add(InitBlocks.DLONET_LOG)
                .add(InitBlocks.DIRE_LOG)
                .add(InitBlocks.BUCKEYE_LOG)
                .add(InitBlocks.DOGWOOD_LOG)
                .add(InitBlocks.SCONET_LOG)
                .add(InitBlocks.OPLOOD_LOG)
                .add(InitBlocks.AEKLOOD_LOG)
                .add(InitBlocks.KRESS_LOG)
                .add(InitBlocks.SMANY_LOG)
                .add(InitBlocks.ICHREAM_LOG)
                .add(InitBlocks.TUFICH_LOG)
                .add(InitBlocks.BLUSHET_LOG)
                .add(InitBlocks.OLEN_LOG)
                .add(InitBlocks.GOLD_ELF_LOG)
                .add(InitBlocks.TREE_ELF_LOG)
                .add(InitBlocks.SILVERELF_LOG)
                .add(InitBlocks.PEACH_LOG)
                .add(InitBlocks.NIGHTELF_LOG)
                .add(InitBlocks.CRYSTALICE_LOG)
                .add(InitBlocks.BLUETRUE_LOG)
                .add(InitBlocks.USK_LOG)
                .add(InitBlocks.IPP_LOG)
                .add(InitBlocks.ELM_LOG)
                .add(InitBlocks.MORDOR_LOG)
                .add(InitBlocks.ANGBAND_LOG)
                .add(InitBlocks.FRER_LOG)
                .add(InitBlocks.BlACKWALNUT_LOG);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(InitBlocks.DARKELF_LEAVES)
                .add(InitBlocks.SUNELF_LEAVES)
                .add(InitBlocks.EVIL_LEAVES)
                .add(InitBlocks.CRYSTAL_LEAVES)
                .add(InitBlocks.SILVER_LEAVES)
                .add(InitBlocks.MITHRIL_LEAVES);








































    }
}


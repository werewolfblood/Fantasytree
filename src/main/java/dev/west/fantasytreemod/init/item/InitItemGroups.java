package dev.west.fantasytreemod.init.item;

import dev.west.fantasytreemod.FantasyTreeMod;
import dev.west.fantasytreemod.init.InitBlocks;
import dev.west.fantasytreemod.init.InitItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class InitItemGroups {
    public static final ItemGroup MITHRIL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FantasyTreeMod.MOD_ID, "mithril"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mithril"))
                    .icon(() -> new ItemStack(InitItems.MITHRIL)).entries((displayContext, entries) -> {
                       entries.add(InitBlocks.AEKLOOD_LOG);
                       entries.add(InitBlocks.ALOGRORN_LOG);
                       entries.add(InitBlocks.ASHRET_LOG);
                       entries.add(InitBlocks.AYIFER_LOG);
                       entries.add(InitBlocks.BlACKWALNUT_LOG);
                       entries.add(InitBlocks.BlACKWILLOW_LOG);
                       entries.add(InitBlocks.BLUECRYSTAL_LOG);
                       entries.add(InitBlocks.BLUETRUE_LOG);
                       entries.add(InitBlocks.BLUSHET_LOG);
                       entries.add(InitBlocks.BUCKEYE_LOG);
                       entries.add(InitBlocks.CRYSTAL_LEAVES);
                       entries.add(InitBlocks.CRYSTALICE_LOG);
                       entries.add(InitBlocks.DROW_LOG);
                       entries.add(InitBlocks.DOGWOOD_LOG);
                       entries.add(InitBlocks.DLONET_LOG);
                       entries.add(InitBlocks.DARKELF_LEAVES);
                       entries.add(InitBlocks.DIRE_LOG);
                       entries.add(InitBlocks.ELF_LOG);
                       entries.add(InitBlocks.EIKEW_LOG);
                       entries.add(InitBlocks.EDLIFER_LOG);
                       entries.add(InitBlocks.EVIL_LEAVES);
                       entries.add(InitBlocks.EVILWOOD_LOG);
                       entries.add(InitBlocks.GOLD_ELF_LOG);
                       entries.add(InitBlocks.GREEN_FIR_LOG);
                       entries.add(InitBlocks.IRONWOOD_LOG);
                       entries.add(InitBlocks.IORANY_LOG);
                       entries.add(InitBlocks.IPP_LOG);
                       entries.add(InitBlocks.ICHREAM_LOG);
                       entries.add(InitBlocks.KRESS_LOG);
                       entries.add(InitBlocks.KLINWOOD_LOG);
                       entries.add(InitBlocks.MITHRIL_LOG);
                       entries.add(InitBlocks.MITHRIL_LEAVES);
                       entries.add(InitBlocks.MORDOR_LOG);
                       entries.add(InitBlocks.NIGHTELF_LOG);
                       entries.add(InitBlocks.OUFYEW_LOG);
                       entries.add(InitBlocks.OTHON_LOG);
                       entries.add(InitBlocks.OPLOOD_LOG);
                       entries.add(InitBlocks.OLEN_LOG);
                       entries.add(InitBlocks.SILVER_LEAVES);
                       entries.add(InitBlocks.SILVER_LOG);
                       entries.add(InitBlocks.SCONET_LOG);
                       entries.add(InitBlocks.SUNELF_LOG);
                       entries.add(InitBlocks.SILVERELF_LOG);
                       entries.add(InitBlocks.SHADOW_FIR_LOG);
                       entries.add(InitBlocks.SMANY_LOG);
                       entries.add(InitBlocks.SUNELF_LEAVES);
                       entries.add(InitBlocks.TREE_ELF_LOG);
                       entries.add(InitBlocks.TUFICH_LOG);
                       entries.add(InitBlocks.USK_LOG);
                       entries.add(InitBlocks.UATHAR_LOG);
                       entries.add(InitBlocks.WEEPING_LOG);
                       entries.add(InitBlocks.YEZHOVE_LOG);
                       entries.add(InitBlocks.PEACH_LOG);
                       entries.add(InitBlocks.PINE_LOG);
                       entries.add(InitBlocks.ANGBAND_LOG);
                       entries.add(InitBlocks.FRER_LOG);


                    }).build());


    public static void registerItemGroups() {
        FantasyTreeMod.LOGGER.info("Registering Item Groups for " + FantasyTreeMod.MOD_ID);
    }
}

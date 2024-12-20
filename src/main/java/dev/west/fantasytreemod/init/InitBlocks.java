package dev.west.fantasytreemod.init;

import dev.west.fantasytreemod.FantasyTreeMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class InitBlocks {
    public static final Block BlACKWALNUT_LOG = registerBlock("blackwalnut_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BlACKWILLOW_LOG = registerBlock("blackwillow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_LOG = registerBlock("mithril_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUECRYSTAL_LOG = registerBlock("bluecrystal_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_LOG = registerBlock("drow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block PINE_LOG = registerBlock("pine_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SILVER_LOG = registerBlock("silver_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELF_LOG = registerBlock("elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IRONWOOD_LOG = registerBlock("ironwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block EVILWOOD_LOG = registerBlock("evilwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SUNELF_LOG = registerBlock("sunelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block UATHAR_LOG = registerBlock("uathar_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OUFYEW_LOG = registerBlock("oufyew_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AYIFER_LOG = registerBlock("ayifer_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BUCKEYE_LOG = registerBlock("buckeye_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IORANY_LOG = registerBlock("iorany_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SHADOW_FIR_LOG = registerBlock("shadow_fir_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DARKELF_LOG = registerBlock("darkelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block YEZHOVE_LOG = registerBlock("yezhove_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block EDLIFER_LOG = registerBlock("edlifer_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KLINWOOD_LOG = registerBlock("klinwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GREEN_FIR_LOG = registerBlock("green_fir_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ASHRET_LOG = registerBlock("ashret_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block WEEPING_LOG = registerBlock("weeping_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OTHON_LOG = registerBlock("othon_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ALOGRORN_LOG = registerBlock("alogrorn_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block EIKEW_LOG = registerBlock("eikew_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DLONET_LOG = registerBlock("dlonet_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRE_LOG = registerBlock("dire_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DOGWOOD_LOG = registerBlock("dogwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SCONET_LOG = registerBlock("sconet_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OPLOOD_LOG = registerBlock("oplood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AEKLOOD_LOG = registerBlock("aeklood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KRESS_LOG = registerBlock("kress_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SMANY_LOG = registerBlock("smany_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ICHREAM_LOG = registerBlock("ichream_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block TUFICH_LOG = registerBlock("tufich_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUSHET_LOG = registerBlock("blushet_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OLEN_LOG = registerBlock("olen_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GOLD_ELF_LOG = registerBlock("gold_elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block TREE_ELF_LOG = registerBlock("tree_elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SILVERELF_LOG = registerBlock("silverelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block PEACH_LOG = registerBlock("peach_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block NIGHTELF_LOG = registerBlock("nightelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block CRYSTALICE_LOG = registerBlock("crystalice_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUETRUE_LOG = registerBlock("bluetrue_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block USK_LOG = registerBlock("usk_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IPP_LOG = registerBlock("ipp_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELM_LOG = registerBlock("elm_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MORDOR_LOG = registerBlock("mordor_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_LOG = registerBlock("angband_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block FRER_LOG = registerBlock("frer_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));

    public static final Block MITHRIL_LEAVES = registerBlock("mithril_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block SILVER_LEAVES = registerBlock("silver_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block CRYSTAL_LEAVES = registerBlock("crystal_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block EVIL_LEAVES = registerBlock("evil_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block SUNELF_LEAVES = registerBlock("sunelf_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block DARKELF_LEAVES = registerBlock("darkelf_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));






    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FantasyTreeMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FantasyTreeMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        FantasyTreeMod.LOGGER.info("Registering Mod Blocks for " + FantasyTreeMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(InitBlocks.BlACKWALNUT_LOG);
            entries.add(InitBlocks.BlACKWILLOW_LOG);
            entries.add(InitBlocks.MITHRIL_LOG);
            entries.add(InitBlocks.DROW_LOG);
            entries.add(InitBlocks.BLUECRYSTAL_LOG);
            entries.add(InitBlocks.PINE_LOG);
            entries.add(InitBlocks.SILVER_LOG);
            entries.add(InitBlocks.ELF_LOG);
            entries.add(InitBlocks.IRONWOOD_LOG);
            entries.add(InitBlocks.EVILWOOD_LOG);
            entries.add(InitBlocks.SUNELF_LOG);
            entries.add(InitBlocks.UATHAR_LOG);
            entries.add(InitBlocks.OUFYEW_LOG);
            entries.add(InitBlocks.AYIFER_LOG);
            entries.add(InitBlocks.MITHRIL_LEAVES);
            entries.add(InitBlocks.SILVER_LEAVES);
            entries.add(InitBlocks.CRYSTAL_LEAVES);
            entries.add(InitBlocks.EVIL_LEAVES);
            entries.add(InitBlocks.IORANY_LOG);
            entries.add(InitBlocks.SHADOW_FIR_LOG);
            entries.add(InitBlocks.DARKELF_LOG);
            entries.add(InitBlocks.YEZHOVE_LOG);
            entries.add(InitBlocks.EDLIFER_LOG);
            entries.add(InitBlocks.KLINWOOD_LOG);
            entries.add(InitBlocks.GREEN_FIR_LOG);
            entries.add(InitBlocks.ASHRET_LOG);
            entries.add(InitBlocks.SUNELF_LEAVES);
            entries.add(InitBlocks.DARKELF_LEAVES);
            entries.add(InitBlocks.WEEPING_LOG);
            entries.add(InitBlocks.OTHON_LOG);
            entries.add(InitBlocks.ALOGRORN_LOG);
            entries.add(InitBlocks.EIKEW_LOG);
            entries.add(InitBlocks.DLONET_LOG);
            entries.add(InitBlocks.DIRE_LOG);
            entries.add(InitBlocks.BUCKEYE_LOG);
            entries.add(InitBlocks.DOGWOOD_LOG);
            entries.add(InitBlocks.SCONET_LOG);
            entries.add(InitBlocks.OPLOOD_LOG);
            entries.add(InitBlocks.OLEN_LOG);
            entries.add(InitBlocks.AEKLOOD_LOG);
            entries.add(InitBlocks.KRESS_LOG);
            entries.add(InitBlocks.SMANY_LOG);
            entries.add(InitBlocks.ICHREAM_LOG);
            entries.add(InitBlocks.TUFICH_LOG);
            entries.add(InitBlocks.BLUSHET_LOG);
            entries.add(InitBlocks.OLEN_LOG);
            entries.add(InitBlocks.GOLD_ELF_LOG);
            entries.add(InitBlocks.TREE_ELF_LOG);
            entries.add(InitBlocks.SILVERELF_LOG);
            entries.add(InitBlocks.PEACH_LOG);
            entries.add(InitBlocks.NIGHTELF_LOG);
            entries.add(InitBlocks.CRYSTALICE_LOG);
            entries.add(InitBlocks.BLUETRUE_LOG);
            entries.add(InitBlocks.USK_LOG);
            entries.add(InitBlocks.IPP_LOG);
            entries.add(InitBlocks.ELM_LOG);
            entries.add(InitBlocks.MORDOR_LOG);
            entries.add(InitBlocks.ANGBAND_LOG);
            entries.add(InitBlocks.FRER_LOG);

        });
    }
}

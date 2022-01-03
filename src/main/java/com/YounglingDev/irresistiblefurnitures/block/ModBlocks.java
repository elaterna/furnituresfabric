package com.YounglingDev.irresistiblefurnitures.block;

import com.YounglingDev.irresistiblefurnitures.IrresistibleFurnitures;
import com.YounglingDev.irresistiblefurnitures.block.custom.GamingChairBlock;
import com.YounglingDev.irresistiblefurnitures.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {










    public static final Block GAMING_CHAIR = registerBlock("gaming_chair",
            new GamingChairBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));







    private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(IrresistibleFurnitures.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(IrresistibleFurnitures.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.IRRESTIBLEFURNITURES)));
    }



    public static void registerModBlocks() {

        }
}

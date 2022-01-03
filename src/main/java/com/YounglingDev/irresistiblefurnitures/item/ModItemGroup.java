package com.YounglingDev.irresistiblefurnitures.item;

import com.YounglingDev.irresistiblefurnitures.IrresistibleFurnitures;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

    public class ModItemGroup {
        public static final ItemGroup IRRESTIBLEFURNITURES = FabricItemGroupBuilder.build(new Identifier(IrresistibleFurnitures.MOD_ID,"irresistiblefurnitures"),
                ()-> new ItemStack(Items.OAK_BUTTON));

    }


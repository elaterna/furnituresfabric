package com.YounglingDev.irresistiblefurnitures.item;

import com.YounglingDev.irresistiblefurnitures.IrresistibleFurnitures;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {








    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(IrresistibleFurnitures.MOD_ID, name), item);
    }

    public static void registerModItems() {


    }
}

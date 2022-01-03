package com.YounglingDev.irresistiblefurnitures;

import com.YounglingDev.irresistiblefurnitures.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


@Environment(EnvType.CLIENT)
public class IrresistibleFurnituresClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GAMING_CHAIR, RenderLayer.getCutout());
    }
}

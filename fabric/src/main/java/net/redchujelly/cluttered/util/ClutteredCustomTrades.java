package net.redchujelly.cluttered.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.redchujelly.cluttered.blocks.BlockRegistration;

public class ClutteredCustomTrades {
    public static void addTrades(){
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.WILLOW_SAPLING.get(), 1), 8, 4, 0.2f
            )));
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.POPLAR_SAPLING.get(), 1), 8, 4, 0.2f
            )));
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.CRABAPPLE_SAPLING.get(), 1), 8, 4, 0.2f
            )));
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.SYCAMORE_SAPLING.get(), 1), 8, 4, 0.2f
            )));
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.MAPLE_SAPLING.get(), 1), 8, 4, 0.2f
            )));
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.RED_MUSHROOM_SAPLING.get(), 1), 8, 4, 0.2f
            )));
            factories.add(((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BlockRegistration.BLUE_MUSHROOM_SAPLING.get(), 1), 8, 4, 0.2f
            )));

        });
    }
}

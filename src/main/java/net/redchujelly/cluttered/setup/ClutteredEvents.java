package net.redchujelly.cluttered.setup;

import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redchujelly.cluttered.Cluttered;

import java.util.List;

@Mod.EventBusSubscriber(modid = Cluttered.MODID)
public class ClutteredEvents {

    @SubscribeEvent
    public static void addTrades(WandererTradesEvent event){
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(BlockRegistration.WILLOW_SAPLING.get(), 1), 8, 4, 0.2f
        ));
        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(BlockRegistration.POPLAR_SAPLING.get(), 1), 8, 4, 0.2f
        ));
        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(BlockRegistration.BLUE_MUSHROOM_SAPLING.get(), 1), 8, 4, 0.2f
        ));
        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(BlockRegistration.RED_MUSHROOM_SAPLING.get(), 1), 8, 4, 0.2f
        ));

    }
}

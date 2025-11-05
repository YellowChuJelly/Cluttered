package net.redchujelly.cluttered.datagen.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class AddItemModifier extends LootModifier {
    public static final Supplier<MapCodec<AddItemModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.mapCodec(addItemModifierInstance -> codecStart(addItemModifierInstance)
                    .and(BuiltInRegistries.ITEM.byNameCodec().listOf()
                    .fieldOf("item").forGetter(m -> m.items))
                    .and(Codec.FLOAT.fieldOf("chance").forGetter(m -> m.chance))
                    .and(Codec.INT.fieldOf("maxSize").forGetter(m -> m.maxSize))
                    .apply(addItemModifierInstance, AddItemModifier::new)));

    private final List<Item> items;
    private final float chance;
    private final int maxSize;

    protected AddItemModifier(LootItemCondition[] conditionsIn, List<Item> items, float chance, int maxSize) {
        super(conditionsIn);
        this.items = items;
        this.chance = chance;
        this.maxSize = maxSize;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for(LootItemCondition condition : this.conditions){
            if (!condition.test(context)){
                return generatedLoot;
            }
        }

        for (Item item : this.items){
            if (context.getRandom().nextFloat() < chance) {
                generatedLoot.add(new ItemStack(item, context.getRandom().nextIntBetweenInclusive(1, this.maxSize)));
            }
        }
        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}

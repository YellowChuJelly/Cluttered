package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CottageLampBlock extends MultiblockPlacer{
    //public static final BooleanProperty LIT = BlockStateProperties.LIT;

    private static final VoxelShape SHAPE_1 = Shapes.or(Block.box(3,0,3,13,2,13), Block.box(5,2,5,11,4,11), Block.box(6.5,4,6.5,9.5,16,9.5));
    private static final VoxelShape SHAPE_2 = Shapes.or(Block.box(3,4,3,13,15,13), Block.box(6.5,0,6.5,9.5,8,9.5));

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    public CottageLampBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState());
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(getMultiblockPart()) == 1 ? SHAPE_1 : SHAPE_2;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        //if (state.getValue(LIT)){
        //    return 15;
        //}
        //else return 0;
        return 15;
    }

    //@Override
    //protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
    //    if (!pLevel.isClientSide) {
    //        boolean lit = !pState.getValue(LIT);
    //        setOnAndOff(pLevel, pPos, pState, lit);
    //        pLevel.playSound(null, pPos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS);
    //    }
    //    return InteractionResult.SUCCESS;
    //}

    //public static void setOnAndOff(Level level, BlockPos pos, BlockState state, boolean lit){
    //    int part = state.getValue(getMultiblockPart());
    //    BlockPos otherHalfPos = part == 1 ? pos.above() : pos.below();
    //    BlockState otherHalfBlock = level.getBlockState(otherHalfPos);
//
    //    if (state.hasProperty(LIT)) {
    //        level.setBlock(pos, state.setValue(LIT, lit),2);
    //        if (level.getBlockState(otherHalfPos).getBlock().equals(state.getBlock()) && otherHalfBlock.getValue(getMultiblockPart()) != part){
    //            level.setBlock(otherHalfPos, state.setValue(LIT, lit).setValue(getMultiblockPart(), part == 1 ? 2 : 1),2);
    //        }
    //    }
//
    //}

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        //pBuilder.add(LIT);
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }
}

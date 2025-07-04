package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.redchujelly.cluttered.util.LanternPlaceState;

public class HoppinParkLantern extends SmallLampBlock{
    public static final EnumProperty<LanternPlaceState> PLACE_STATE = EnumProperty.create("place_state", LanternPlaceState.class);

    public HoppinParkLantern(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(PLACE_STATE, LanternPlaceState.FLOOR));

    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        Direction surface = pContext.getClickedFace();
        Direction facing = pContext.getHorizontalDirection().getOpposite();
        LanternPlaceState shouldPlaceOn;

        if (surface.equals(Direction.UP)){
            shouldPlaceOn = LanternPlaceState.FLOOR;
        }
        else if (surface.equals(Direction.DOWN)){
            shouldPlaceOn = LanternPlaceState.CEILING;
        }
        else {
            shouldPlaceOn = LanternPlaceState.WALL;
            facing = pContext.getClickedFace().getOpposite();
        }
        return defaultBlockState().setValue(PLACE_STATE, shouldPlaceOn).setValue(FACING, facing);

    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        if (!(pLevel.getBlockState(pPos).getBlock() instanceof HoppinParkLantern)){
            return true;
        }
        LanternPlaceState placedOn = pState.getValue(PLACE_STATE);
        if (placedOn.equals(LanternPlaceState.CEILING)){
            pPos = pPos.above();
        }
        else if (placedOn.equals(LanternPlaceState.FLOOR)){
            pPos = pPos.below();
        }
        else {
            pPos = pPos.relative(pState.getValue(FACING));
        }
        return !pLevel.getBlockState(pPos).isAir();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(PLACE_STATE);
    }
}

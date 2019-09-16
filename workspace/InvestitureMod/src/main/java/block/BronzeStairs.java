package block;

import investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import init.ModBlocks;

public class BronzeStairs extends BlockStairs{

	static IBlockState modelState = ModBlocks.BRONZE_BLOCK.getDefaultState();
	
	public BronzeStairs() {
		super(modelState);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.METAL);
		this.useNeighborBrightness = true;
	}
	
}
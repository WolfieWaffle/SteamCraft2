/**
 * This class was created by BrassGoggledCoders modding team.
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 *
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 *
 */
package steamcraft.common.items.tools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import steamcraft.common.Steamcraft;

/**
 * Base class for drills.
 *
 * @author Decebaldecebal
 *
 */
public class ItemDrill extends ItemModTool
{
	public ItemDrill(ToolMaterial mat)
	{
		super(1.0F, mat);
		this.setCreativeTab(Steamcraft.tabSC2);
		this.setHarvestLevel("shovel", mat.getHarvestLevel());
		this.setHarvestLevel("pickaxe", mat.getHarvestLevel());
	}

	@Override
	public boolean canHarvestBlock(Block block, ItemStack stack)
	{
		return (block.getMaterial() == Material.snow) || (block.getMaterial() == Material.rock) || super.canHarvestBlock(block, stack);
	}
}

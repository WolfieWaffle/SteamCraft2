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
package steamcraft.common.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import steamcraft.common.Steamcraft;
import steamcraft.common.init.InitBlocks;
import steamcraft.common.lib.ModInfo;
import boilerplate.common.baseclasses.BaseMetadataBlock;

/**
 * @author Surseance
 *
 */
public class BlockEngravedSolid extends BaseMetadataBlock
{
	private final IIcon[] icon = new IIcon[10];

	public BlockEngravedSolid()
	{
		super(Material.rock);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		this.setStepSound(Block.soundTypeMetal);
		this.setTickRandomly(true);
		this.setCreativeTab(Steamcraft.tabSC2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(final int side, final int metadata)
	{
		if(metadata < this.icon.length)
			return this.icon[metadata];
		else
			return this.icon[0];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir)
	{
		this.icon[0] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedAluminum");
		this.icon[1] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedCopper");
		this.icon[2] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedTin");
		this.icon[3] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedZinc");
		this.icon[4] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedBrass");
		this.icon[5] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedBronze");
		this.icon[6] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedSteel");
		this.icon[7] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedCastIron");
		this.icon[8] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedUranium");
		this.icon[9] = ir.registerIcon(ModInfo.PREFIX + "blockEngravedEtherium");
	}

	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}

	@SuppressWarnings("all")
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List l)
	{
		for(int var4 = 0; var4 < this.icon.length; ++var4)
			l.add(new ItemStack(InitBlocks.blockEngraved, 1, var4));
	}

}

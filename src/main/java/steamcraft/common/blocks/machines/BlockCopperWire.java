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
package steamcraft.common.blocks.machines;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraftforge.common.util.ForgeDirection;

import steamcraft.client.lib.RenderIDs;
import steamcraft.common.init.InitBlocks;
import steamcraft.common.lib.DamageSourceHandler;
import steamcraft.common.tiles.energy.TileCopperWire;

/**
 * @author warlordjones
 *
 */
public class BlockCopperWire extends BaseContainerBlock
{
	static float pixel = 1 / 16f;

	public BlockCopperWire(Material p_i45394_1_)
	{
		super(p_i45394_1_);

		this.setBlockBounds(6 * pixel, 4 * pixel, 6 * pixel, 1 - (6 * pixel), 1 - (4 * pixel), 1 - (6 * pixel));
		this.useNeighborBrightness = true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_)
	{
		return new TileCopperWire();
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int getRenderType()
	{
		return RenderIDs.blockCopperWireRI;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack is)
	{
		super.onBlockPlacedBy(world, x, y, z, entityLiving, is);

		if(!world.isRemote)
		{
			TileCopperWire tile = (TileCopperWire) world.getTileEntity(x, y, z);

			if(tile != null)
			{
				tile.network = null;
				tile.updateConnections();
			}
		}
	}

	@Override
	public void onNeighborChange(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ)
	{
		if(world.getBlock(tileX, tileY, tileZ) != InitBlocks.blockCopperWire)
		{
			TileCopperWire tile = (TileCopperWire) world.getTileEntity(x, y, z);
			tile.updateConnections();
		}
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
	{
		TileCopperWire tile = (TileCopperWire) world.getTileEntity(x, y, z);

		if(tile != null)
			tile.removeFromNetwork();

		super.breakBlock(world, x, y, z, block, metadata);
	}

	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return this.getBoundingBox(world, x, y, z);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return this.getBoundingBox(world, x, y, z);
	}

	private AxisAlignedBB getBoundingBox(World world, int x, int y, int z)
	{
		TileEntity tile = world.getTileEntity(x, y, z);
		TileCopperWire wire = null;
		if(tile instanceof TileCopperWire)
		{
			wire = (TileCopperWire) tile;
		}

		if(wire != null)
		{
			float minX = (6 * pixel) - (wire.connections[4] != null ? 6 * pixel : 0);
			float maxX = (1 - (6 * pixel)) + (wire.connections[5] != null ? 6 * pixel : 0);

			float minY = (6 * pixel) - (wire.connections[0] != null ? 6 * pixel : 0);
			float maxY = (1 - (6 * pixel)) + (wire.connections[1] != null ? 6 * pixel : 0);

			float minZ = (6 * pixel) - (wire.connections[2] != null ? 6 * pixel : 0);
			float maxZ = (1 - (6 * pixel)) + (wire.connections[3] != null ? 6 * pixel : 0);

			this.setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);
		}

		return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		if(world.getBlockMetadata(x, y, z) == 0)
		{
			TileCopperWire wire = (TileCopperWire) world.getTileEntity(x, y, z);
			if(wire.getEnergyStored(ForgeDirection.UNKNOWN) != 0)
				entity.attackEntityFrom(DamageSourceHandler.electrocution, 0.5F);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(final Item item, final CreativeTabs tab, final List l)
	{
		l.add(new ItemStack(InitBlocks.blockCopperWire, 1, 0));
		l.add(new ItemStack(InitBlocks.blockCopperWire, 1, 1));
	}

}

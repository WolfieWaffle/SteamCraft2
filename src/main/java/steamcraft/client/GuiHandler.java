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
package steamcraft.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import steamcraft.client.gui.GuiArmorEditor;
import steamcraft.client.gui.GuiBattery;
import steamcraft.client.gui.GuiBloomery;
import steamcraft.client.gui.GuiCharger;
import steamcraft.client.gui.GuiNuclearBoiler;
import steamcraft.client.gui.GuiPDA;
import steamcraft.client.gui.GuiSteamBoiler;
import steamcraft.client.gui.GuiTimeBomb;
import steamcraft.client.gui.GuiVanity;
import steamcraft.client.lib.GuiIDs;
import steamcraft.common.container.ContainerVanity;
import steamcraft.common.entities.EntityPlayerExtended;
import steamcraft.common.tiles.TileArmorEditor;
import steamcraft.common.tiles.TileBattery;
import steamcraft.common.tiles.TileBloomery;
import steamcraft.common.tiles.TileCharger;
import steamcraft.common.tiles.TileNuclearBoiler;
import steamcraft.common.tiles.TileSteamBoiler;
import steamcraft.common.tiles.TileTimeBomb;
import steamcraft.common.tiles.container.ContainerArmorEditor;
import steamcraft.common.tiles.container.ContainerBattery;
import steamcraft.common.tiles.container.ContainerBloomery;
import steamcraft.common.tiles.container.ContainerCharger;
import steamcraft.common.tiles.container.ContainerNuclearBoiler;
import steamcraft.common.tiles.container.ContainerSteamBoiler;
import steamcraft.common.tiles.container.ContainerTimeBomb;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * @author Surseance
 *
 */
public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(final int id, final EntityPlayer player, final World world, final int x, final int y, final int z)
	{
		final TileEntity tile = world.getTileEntity(x, y, z);

		switch(id)
		{
			case GuiIDs.STEAM_BOILER:
				return new ContainerSteamBoiler(player.inventory, (TileSteamBoiler) tile);
			case GuiIDs.NUKE_BOILER:
				return new ContainerNuclearBoiler(player.inventory, (TileNuclearBoiler) tile);
			case GuiIDs.VANITY:
				return new ContainerVanity(player, player.inventory, EntityPlayerExtended.get(player).getInventory());
			case GuiIDs.ARMOR_EDITOR:
				return new ContainerArmorEditor(player.inventory, (TileArmorEditor) tile);
			case GuiIDs.BLOOMERY:
				return new ContainerBloomery(player.inventory, (TileBloomery) tile);
			case GuiIDs.BATTERY:
				return new ContainerBattery(player.inventory, (TileBattery) tile);
			case GuiIDs.CHARGER:
				return new ContainerCharger(player.inventory, (TileCharger) tile);
			case GuiIDs.TIMEBOMB:
				return new ContainerTimeBomb(player.inventory, (TileTimeBomb) tile);
			case GuiIDs.PDA:
				return null;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(final int id, final EntityPlayer player, final World world, final int x, final int y, final int z)
	{
		final TileEntity tile = world.getTileEntity(x, y, z);

		switch(id)
		{
			case GuiIDs.STEAM_BOILER:
				return new GuiSteamBoiler(player.inventory, (TileSteamBoiler) tile);
			case GuiIDs.NUKE_BOILER:
				return new GuiNuclearBoiler(player.inventory, (TileNuclearBoiler) tile);
			case GuiIDs.ARMOR_EDITOR:
				return new GuiArmorEditor(player.inventory, (TileArmorEditor) tile);
			case GuiIDs.VANITY:
				return new GuiVanity(player, player.inventory, EntityPlayerExtended.get(player).getInventory());
			case GuiIDs.BLOOMERY:
				return new GuiBloomery(player.inventory, (TileBloomery) tile);
			case GuiIDs.BATTERY:
				return new GuiBattery(player.inventory, (TileBattery) tile);
			case GuiIDs.CHARGER:
				return new GuiCharger(player.inventory, (TileCharger) tile);
			case GuiIDs.TIMEBOMB:
				return new GuiTimeBomb(player.inventory, (TileTimeBomb) tile);
			case GuiIDs.PDA:
				return new GuiPDA();
		}

		return null;
	}
}

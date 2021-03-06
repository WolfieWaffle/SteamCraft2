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
package steamcraft.common.lib;

import java.util.Iterator;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import steamcraft.common.init.InitItems;
import boilerplate.common.baseclasses.CreativeTabBase;

/**
 * @author warlordjones
 *
 */
public class CreativeTabSteamcraft extends CreativeTabBase
{
	public CreativeTabSteamcraft(int id, String name)
	{
		super(id, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return InitItems.itemBrassGoggles;
	}

	/**
	 * only shows items which have tabToDisplayOn == this
	 */
	@SideOnly(Side.CLIENT)
	public void getItemsInTab(List p_78018_1_)
	{
		Iterator iterator = Item.itemRegistry.iterator();

		while(iterator.hasNext())
		{
			Item item = (Item) iterator.next();

			if(item == null)
			{
				continue;
			}

			for(CreativeTabs tab : item.getCreativeTabs())
			{
				if(tab == this)
				{
					item.getSubItems(item, this, p_78018_1_);
				}
			}
		}
	}
}

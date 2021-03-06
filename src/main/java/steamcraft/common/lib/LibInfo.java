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

import boilerplate.common.Boilerplate;
import boilerplate.common.utils.StringUtils;

public class LibInfo
{
	public static String[] metals = { "Aluminum", "Copper", "Tin", "Zinc", "Brass", "Bronze", "Steel", "CastIron" };
	public static String[] metalsV = { "Iron", "Gold" };

	/**
	 *
	 * Karenthian - a5fea247-f804-499a-8c2a-db1e3ad9011e
	 *
	 * DocArcane - 94644c62-f190-4f18-a69a-ad36e7425280
	 *
	 * PeaGreen - d2763f9f-a07e-4cfd-8248-1dbe17f29156
	 *
	 * domi1819 - de7c9903-51fa-4a24-88cd-48faf122ca36
	 *
	 * frothiny - 155248c2-299a-449b-adf5-4162625a8afd
	 *
	 * MrIbby - e59b1bf5-ff7d-44ae-b1d4-90dc74c8f7da
	 *
	 * HCSarise - d2ea8848-7052-45b8-96e8-ac29d4f1024a
	 *
	 * ClockwerkKasier - edb4e6c2-7d07-4438-a0bb-2f4aabbea24d
	 *
	 * BluSunrize - f34afdfb-996b-4020-b8a2-b740e2937b29
	 */
	private static String[] brassBlocksMembers = { "a5fea247-f804-499a-8c2a-db1e3ad9011e", "94644c62-f190-4f18-a69a-ad36e7425280",
	"d2763f9f-a07e-4cfd-8248-1dbe17f29156" };
	public static String[] contributors = { "de7c9903-51fa-4a24-88cd-48faf122ca36", "155248c2-299a-449b-adf5-4162625a8afd",
		"e59b1bf5-ff7d-44ae-b1d4-90dc74c8f7da", "d2ea8848-7052-45b8-96e8-ac29d4f1024a" };
	public static String[] other = { "edb4e6c2-7d07-4438-a0bb-2f4aabbea24d", "f34afdfb-996b-4020-b8a2-b740e2937b29" };
	public static String[] names = StringUtils.merge(brassBlocksMembers, Boilerplate.devs, contributors, Boilerplate.donors, other);

	public static float pixel = 1F / 16F / 2F;
	public static float tPixel = 1F / 32F;
}

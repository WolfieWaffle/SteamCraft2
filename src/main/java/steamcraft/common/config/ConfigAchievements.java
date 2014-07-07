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
package steamcraft.common.config;

import steamcraft.common.lib.LibInfo;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

/**
 * @author warlordjones
 *
 */
public class ConfigAchievements
{
	public static Achievement raygunAchieve, shrinkrayAchieve, boilerAchieve, ingotAchieve, sheetAchieve, intakeAchieve, teaAchieve, engraveAchieve, wingsAchieve, jetpackAchieve, wingpackAchieve, gogglesAchieve, gunAchieve;

	public static AchievementPage sc2AchievePage;

	public static void init()
	{
		String prefix = LibInfo.ID + ".achievement.";
		ingotAchieve = new Achievement(prefix + "ingot", "ingotachieve", 0, 0, ConfigItems.itemIngot, null).registerStat().initIndependentStat();
		sheetAchieve = new Achievement(prefix + "sheet", "sheetachieve", 2, 0, ConfigItems.itemSheet, ingotAchieve).registerStat();
		boilerAchieve = new Achievement(prefix + "boiler", "boilerachieve", 4, 0, ConfigBlocks.blockSteamBoiler, sheetAchieve).registerStat()/* .setSpecial() */;
		intakeAchieve = new Achievement(prefix + "intake", "intakeachieve", 6, 0, ConfigBlocks.blockIntake, boilerAchieve).registerStat();
		teaAchieve = new Achievement(prefix + "tea", "teaachieve", -2, 0, ConfigItems.itemTeacup, null).registerStat().initIndependentStat();

		wingsAchieve = new Achievement(prefix + "wings", "wingsachieve", 0, 10, ConfigItems.itemClockworkWings, null).registerStat().initIndependentStat();
		jetpackAchieve = new Achievement(prefix + "jetpack", "jetpackachieve", 0, 8, ConfigItems.itemSteamJetpack, wingsAchieve).registerStat();
		wingpackAchieve = new Achievement(prefix + "wingpack", "wingpackachieve", 0, 6, ConfigItems.itemSteamWingpack, jetpackAchieve).registerStat();

		raygunAchieve = new Achievement(prefix + "raygun", "raygunachieve", 0, 2, ConfigItems.itemRayGun, ingotAchieve).registerStat().setSpecial();
		shrinkrayAchieve = new Achievement(prefix + "shrinkray", "shrinkrayachieve", 0, -2, ConfigItems.itemShrinkray, ingotAchieve).registerStat().setSpecial();

		sc2AchievePage = new AchievementPage("Steamcraft 2", raygunAchieve, shrinkrayAchieve, boilerAchieve, ingotAchieve, sheetAchieve, intakeAchieve, teaAchieve, wingsAchieve, jetpackAchieve, wingpackAchieve/*, engraveAchieve, gogglesAchieve, gunAchieve*/);
		AchievementPage.registerAchievementPage(sc2AchievePage);
	}

}

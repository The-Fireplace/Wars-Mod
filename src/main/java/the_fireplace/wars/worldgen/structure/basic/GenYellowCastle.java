package the_fireplace.wars.worldgen.structure.basic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class GenYellowCastle {

	ResinresinLoader castleFloor = new ResinresinLoader("castleFloor.resinresin");
	ResinresinLoader castleBase = new ResinresinLoader("castleBase.resinresin");
	ResinresinLoader castleCor = new ResinresinLoader("castleCor.resinresin");//is this used?
	ResinresinLoader castleStorage = new ResinresinLoader("castleStorage.resinresin");//is this used?
	ResinresinLoader castleTop = new ResinresinLoader("castleTop.resinresin");

	public GenYellowCastle(EntityPlayer player, int i, int j, int k) {

		castleFloor.generate(player.worldObj, i - 10, j - 4, k - 10, true);
		castleTop.generate(player.worldObj, i - 13, j, k - 13, true);
		WarsMod.generateBlock(player.worldObj, i, j, k, Blocks.AIR);
		castleBase.generate(player.worldObj, i - 14, j - 14, k - 10, true);

		WarsMod.generateBlockWithMeta(player.worldObj, i - 4, j + 13, k - 11, Blocks.WOOL.getStateFromMeta(4));
		WarsMod.generateBlockWithMeta(player.worldObj, i + 15, j + 13, k - 11, Blocks.WOOL.getStateFromMeta(4));

		WarsMod.generateBlockWithMeta(player.worldObj, i + 12, j + 15, k - 8, Blocks.WOOL.getStateFromMeta(4));
		WarsMod.generateBlockWithMeta(player.worldObj, i - 7, j + 15, k - 8, Blocks.WOOL.getStateFromMeta(4));

		WarsMod.generateBlockWithMeta(player.worldObj, i + 15, j + 13, k + 7, Blocks.WOOL.getStateFromMeta(4));
		WarsMod.generateBlockWithMeta(player.worldObj, i - 4, j + 13, k + 7, Blocks.WOOL.getStateFromMeta(4));

		WarsMod.generateBlockWithMeta(player.worldObj, i + 12, j + 15, k + 10, Blocks.WOOL.getStateFromMeta(4));
		WarsMod.generateBlockWithMeta(player.worldObj, i - 7, j + 15, k + 10, Blocks.WOOL.getStateFromMeta(4));

		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 12, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 12, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 12, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 12, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 12, k + -9, Blocks.AIR);

		// /////////////

		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 13, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 13, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 13, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 13, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 13, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 13, k + -9, Blocks.AIR);

		// //////

		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 11, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 11, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 11, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 11, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 11, k + -9, Blocks.AIR);

		// ////////////

		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 5, j - 10, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 4, j - 10, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 3, j - 10, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 10, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i - 1, j - 10, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 9, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + 1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -1, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -2, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -3, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -4, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -5, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -6, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -7, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -8, Blocks.AIR);
		WarsMod.generateBlock(player.worldObj, i, j - 10, k + -9, Blocks.AIR);

		WarsMod.generateBlock(player.worldObj, i + 8, j - 8, k + 2, Blocks.COBBLESTONE);
		WarsMod.generateBlock(player.worldObj, i + 8, j - 8, k + 3, Blocks.COBBLESTONE);
		WarsMod.generateBlock(player.worldObj, i + 8, j - 8, k + 4, Blocks.COBBLESTONE);

		WarsMod.generateBlock(player.worldObj, i - 11, j - 14, k, Blocks.COBBLESTONE);

		WarsMod.generateBlock(player.worldObj, i - 2, j - 12, k, WarsBlocks.classSelect);
		WarsMod.generateBlock(player.worldObj, i - 2, j - 11, k, WarsBlocks.classSelectDonator);

	}

}

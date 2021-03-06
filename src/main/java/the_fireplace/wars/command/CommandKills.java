package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;

public class CommandKills extends CommandBase {

	@Override
	public String getCommandName() {
		return "kills";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;

			int killstreak = player.getEntityData().getInteger("warsmod_killstreak");
			int totalKills = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
			int deaths = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");
			float kdr;
			if(deaths > 0)
				kdr = totalKills / deaths;
			else
				kdr = totalKills;
			player.addChatMessage(new TextComponentTranslation("command.kills.streak", killstreak));
			player.addChatMessage(new TextComponentTranslation("command.kills.kdr", kdr, totalKills, deaths));
			if(args.length == 5)
				player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", 1000);
		}
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/kills";
	}
}
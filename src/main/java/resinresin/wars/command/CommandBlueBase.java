package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import resinresin.wars.data.WarsSavedData;

public class CommandBlueBase extends CommandBase {

	@Override
	public String getName() {
		return "setBlueBase"; // Name of the command e.g "/Test", "/Command"
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 4;
	}


	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {

		EntityPlayer player1 = (EntityPlayer) sender;
		WarsSavedData savedData = WarsSavedData.get(player1.worldObj);

		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;

			savedData.teamBlue.baseX = (int) player.posX;
			savedData.teamBlue.baseY = (int) player.posY;
			savedData.teamBlue.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage(new ChatComponentText("Blue Team Base Set To: " + savedData.teamBlue.baseX + " " + savedData.teamBlue.baseY + " " + savedData.teamBlue.baseZ));

		}

	}

    @Override
    public int compareTo(Object o) {
        return 0;
    }


    @Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
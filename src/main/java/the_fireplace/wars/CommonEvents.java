package the_fireplace.wars;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import the_fireplace.wars.data.WarsSavedData;
import the_fireplace.wars.init.WarsItems;
import the_fireplace.wars.items.ItemArmorMod;
import the_fireplace.wars.items.Undroppable;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketKills;
import the_fireplace.wars.network.packets.PacketOpenTeamSelect;
import the_fireplace.wars.network.packets.PacketTeams;

import java.util.List;
import java.util.Random;

public class CommonEvents {

	public static int redPlayers = 0;
	public static int greenPlayers = 0;
	public static int bluePlayers = 0;
	public static int yellowPlayers = 0;

	@SubscribeEvent
	public void onLivingAttack(LivingAttackEvent evt) {
		if (evt.entity instanceof EntityPlayer && evt.source instanceof EntityDamageSource) {
			EntityDamageSource source = (EntityDamageSource) evt.source;
			if (source.getEntity() instanceof EntityPlayer) {
				EntityPlayer attacker = (EntityPlayer) source.getEntity();
				EntityPlayer damagee = (EntityPlayer) evt.entity;

				ItemStack attackerBoots = attacker.inventory.armorItemInSlot(0);
				ItemStack damageeBoots = damagee.inventory.armorItemInSlot(0);
				if (attackerBoots != null && damageeBoots != null && attackerBoots == damageeBoots) {
					Item id = damageeBoots.getItem();
					if (id == WarsItems.redBoots || id == WarsItems.greenBoots || id == WarsItems.blueBoots || id == WarsItems.yellowBoots) {
						evt.setCanceled(true);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent evt) {
		if(!evt.entityLiving.worldObj.isRemote)
		if (evt.entity instanceof EntityPlayer) {
			EntityPlayer deadPlayer = (EntityPlayer) evt.entity;

			if(evt.source instanceof EntityDamageSource) {
				Entity attacker = evt.source.getEntity();

				if (attacker instanceof EntityPlayerMP) {
					int attackerTotalKills = attacker.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

					attackerTotalKills++;

					attacker.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", attackerTotalKills);

					int attackerKillstreak = attacker.getEntityData().getInteger("warsmod_killstreak");
					int deadPlayerKillstreak = deadPlayer.getEntityData().getInteger("warsmod_killstreak");

					attackerKillstreak++;

					attacker.getEntityData().setInteger("warsmod_killstreak", attackerKillstreak);

					if (deadPlayerKillstreak > 1) {

						EntityPlayerMP player = (EntityPlayerMP) evt.entity;

						MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.death", player.getName(), deadPlayerKillstreak));
					}

					switch (attackerKillstreak) {
						case 2:
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							break;
						case 3: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 4: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 5: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 8: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 10: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 12: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 15: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 20: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 25: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 30: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 35: {
							attacker.addChatMessage(new ChatComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("killstreak.announcement.offscale", player.getName(), attackerKillstreak));
							break;
						}
						default:
							break;
					}

					int attackerDeaths = attacker.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");

					PacketDispatcher.sendTo(new PacketKills(attackerKillstreak, attackerTotalKills, attackerDeaths), (EntityPlayerMP) attacker);
				}
			}

			deadPlayer.getEntityData().setInteger("warsmod_killstreak", 0);
			int deadPlayerDeaths = deadPlayer.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");
			deadPlayerDeaths++;
			deadPlayer.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_deaths", deadPlayerDeaths);

			PacketDispatcher.sendTo(new PacketKills(0, deadPlayer.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill"), deadPlayerDeaths), (EntityPlayerMP)deadPlayer);

			for(ItemStack stack:deadPlayer.inventory.mainInventory){
				if(stack != null)
					if(stack.getItem() instanceof Undroppable)
						stack.stackSize=0;
			}
			for(ItemStack stack:deadPlayer.inventory.armorInventory){
				if(stack != null)
					if(stack.getItem() instanceof Undroppable)
						stack.stackSize=0;
			}
		}
	}

	@SubscribeEvent
	public void onItemThrown(ItemTossEvent event){
		if(event.entityItem.getEntityItem().getItem() instanceof Undroppable)
			event.setCanceled(true);
	}

	@SubscribeEvent
	public void PlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event) {
		if (event.player instanceof EntityPlayerMP) {
			recalcTeams();

			WarsMod.proxy.genTag(event.player);

			int totalKills = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
			int killStreak = event.player.getEntityData().getInteger("warsmod_killstreak");
			int deaths = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");

			PacketDispatcher.sendTo(new PacketKills(totalKills, killStreak, deaths), (EntityPlayerMP) event.player);

			PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) event.player);

			WarsSavedData savedWarsData = WarsSavedData.get(event.player.worldObj);
			ItemStack playerBoots = event.player.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);
			if (playerBoots == null) {
				if (!savedWarsData.editMode.editModeToggle) {
					scheduleDelayedGui((EntityPlayerMP) event.player);
				}
			}
		}
	}

	private int timer = 0;
	private List scheduledPlayers = Lists.newArrayList();

	@SuppressWarnings("unchecked")
	private void scheduleDelayedGui(EntityPlayerMP player){
		timer += 100;
		scheduledPlayers.add(player);
	}

	@SubscribeEvent
	public void onServerTick(TickEvent.ServerTickEvent event){
		if(timer > 0)
			timer--;
		if(timer % 100 == 1) {
			PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP) scheduledPlayers.get(0));
			scheduledPlayers.remove(0);
		}
	}

	@SuppressWarnings("unchecked")
	public static final List<EntityPlayerMP> getAll() {
		return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
	}

	@SubscribeEvent
	public void PlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent event) {
		recalcTeams();

		int totalKills = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
		int killStreak = event.player.getEntityData().getInteger("warsmod_killstreak");
		int deaths = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");

		PacketDispatcher.sendTo(new PacketKills(totalKills, killStreak, deaths), (EntityPlayerMP) event.player);

		PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) event.player);

		WarsSavedData savedWarsData = WarsSavedData.get(event.player.worldObj);
		if (!savedWarsData.editMode.editModeToggle) {
			PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP) event.player);
		}

	}

	@SubscribeEvent
	public void tickEvent(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		if (ItemArmorMod.hasFullSuit(player, WarsItems.knightArmor)) {
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10, 0));
		} else if (ItemArmorMod.hasFullSuit(player, WarsItems.scoutArmor)) {
			ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, 0.15F, 6);
			player.fallDistance = 0;
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 10, 1));
		} else if (ItemArmorMod.hasFullSuit(player, WarsItems.ninjaArmor)) {
			ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, 0.17F, 6);
			player.fallDistance = 0;
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 10, 1));
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 10, 1));
			if(player.motionY < 0 && player.motionY > -0.5){
				player.motionY *= 1.5;
			}
		}

		else if (ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.ninjaArmor)) {

			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10, 0));

		}

		if (ItemArmorMod.hasFullSuit(player, WarsItems.archerArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.techArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.knightArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.healerArmor)
				|| ItemArmorMod.hasFullSuit(player, WarsItems.guardArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.scoutArmor)) {
			ItemStack boots = player.inventory.armorItemInSlot(0);
			if (!(boots != null)) {
				Random random = new Random();
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10, 10));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 10, 100));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 10, 10));

				int num = random.nextInt(50);

				if (num == 1) {
					player.addChatMessage(new ChatComponentTranslation("needteamboots"));
				}
			}
		}

		int killstreakBefore = player.getEntityData().getInteger("warsmod_killstreak");

		if (killstreakBefore > 1) {
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 0));

		}
		if (killstreakBefore > 3) {
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 10, 0));

		}
		if (killstreakBefore > 7) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 20 * 15, 0));

		}
		if (killstreakBefore > 11) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10, 0));

		}
		if (killstreakBefore > 19) {
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 1));

		}
		if (killstreakBefore > 29) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10, 1));

		}
		if (killstreakBefore > 2) {
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 10, 0));
		}
	}

	public static void recalcTeams(){
		redPlayers = 0;
		bluePlayers = 0;
		greenPlayers = 0;
		yellowPlayers = 0;
		for (EntityPlayerMP playerMP : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

			if(playerMP.inventory.getStackInSlot(36) != null) {
				Item playerBoots = playerMP.inventory.getStackInSlot(36).getItem();// playerMP.inventory.armorItemInSlot(0);

				if (playerBoots != null) {
					if (playerBoots == WarsItems.redBoots) {
						redPlayers++;
					}
					if (playerBoots == WarsItems.blueBoots) {
						bluePlayers++;
					}
					if (playerBoots == WarsItems.greenBoots) {
						greenPlayers++;
					}
					if (playerBoots == WarsItems.yellowBoots) {
						yellowPlayers++;
					}
				}
			}
		}
	}
}

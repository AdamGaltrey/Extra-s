package couk.Adamki11s.Extras.Player;

import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public abstract class PlayerMethods {
	
	/**
	 * Check whether the player is on the ground.
	 * @param p The player to check.
	 * @return A boolean value indicating whether the player is on the ground or not.
	 */
	public abstract boolean isOnGround(Player p);
	
	/**
	 * Check whether the player is underwater.
	 * @param p The player to check.
	 * @return A boolean value indicating whether the player is underwater or not.
	 */
	public abstract boolean isUnderWater(Player p);
	
	/**
	 * Mounts the specified player onto the specified entity.
	 * @param p The player who will mount the entity.
	 * @param e The entity which the player will mount.
	 */
	public abstract void mountEntity(Player p, Entity e);
	
	/**
	 * Mounts the specified player onto another player.
	 * @param mounter The player who will mount the target player.
	 * @param playerToMount The player who will be mounted.
	 */
	public abstract void mountPlayer(Player mounter, Player playerToMount);
	
	/**
	 * Sets the block on the player's head.
	 * @param p The player to set.
	 * @param m The material to set the player's head to.
	 */
	public abstract void setBlockOnPlayerHead(Player p, Material m);
	
	/**
	 * Sets the block on the player's head.
	 * @param p The player to set.
	 * @param id The item id to set the player's head to.
	 */
	public abstract void setBlockOnPlayerHead(Player p, int id);
	
	public abstract int getSecondsLived(Player p);
	
	public abstract int getMinutesLived(Player p);
	
	public abstract int getHoursLived(Player p);
	
	public abstract UUID getUniqueUUID(Player p);
	
	public abstract void forceChat(Player p, String message);
	
	public abstract int getDimension(Player p);	
	
	public abstract void removeBlockOnPlayerHead(Player p);

}

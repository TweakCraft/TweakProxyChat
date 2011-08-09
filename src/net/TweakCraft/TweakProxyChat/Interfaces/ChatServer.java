package net.TweakCraft.TweakProxyChat.Interfaces;

import org.bukkit.World;

public interface ChatServer {
    /**
     * returns the world the server is running, for worldchat
     */
    public World getWorld();
    
    /**
     * returns true if the player specified is on this server
     */
    public boolean getPlayerOnServer(String name);
    
}

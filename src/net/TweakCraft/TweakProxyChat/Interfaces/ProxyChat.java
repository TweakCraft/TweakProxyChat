package net.TweakCraft.TweakProxyChat.Interfaces;

public interface ProxyChat {
    
    /**
     * Broadcasts a message to all servers and to the IRC channel
     */
    public String broadCastMessage();
    
    
    /**
     * Broadcasts a message to all servers running the same world, but not to the IRC channel
     */
    
    public String broadCastWorldMessage();
    
    /**
     * Broadcasts a message to a single person
     */
    
    public String sendPrivateMessage(String playername);
    
}

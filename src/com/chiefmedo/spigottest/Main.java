package src.com.chiefmedo.spigottest;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){
        bukkit.broadcastMessage(ChatColor.GREEN + "INITIALIZED spigot-test");
    }

}

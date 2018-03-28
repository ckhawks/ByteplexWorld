package net.byteplex.ByteplexWorld;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.plugin.java.JavaPlugin;
import net.byteplex.ByteplexCore.util.ChatFormat;

public class ByteplexWorld extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(new RemoveRecipes(), this);
    }

    @Override
    public void onDisable(){

    }

}

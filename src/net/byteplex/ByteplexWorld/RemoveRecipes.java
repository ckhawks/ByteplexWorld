package net.byteplex.ByteplexWorld;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

public class RemoveRecipes implements Listener {
    @EventHandler
    public void onCraftPrepare(PrepareItemCraftEvent e){

        e.getInventory().setResult(null);
    }
}

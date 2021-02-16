package com.yourname.terraaddon;

import com.dfsek.terra.api.core.TerraPlugin;
import com.dfsek.terra.api.core.event.EventListener;
import com.dfsek.terra.api.core.event.events.config.ConfigPackPreLoadEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

@SuppressWarnings("unused")
public class TerraAddonTemplate extends JavaPlugin implements EventListener {
    @Override
    public void onLoad() {
        TerraPlugin main = (TerraPlugin) Bukkit.getPluginManager().getPlugin("Terra"); // Get Terra plugin instance.
        Objects.requireNonNull(main).getEventManager().registerListener(this); // Register this class as an event listener.
    }

    public void onPackLoad(ConfigPackPreLoadEvent event) { // Listen for ConfigPackPreLoadEvent
        getLogger().info("Hello, World!"); // Log "Hello, World!" to the console whenever a config pack is loaded.
    }
}

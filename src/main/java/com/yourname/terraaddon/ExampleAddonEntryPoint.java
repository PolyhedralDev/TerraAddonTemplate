package com.yourname.terraaddon;

import com.dfsek.terra.api.TerraPlugin;
import com.dfsek.terra.api.addons.TerraAddon;
import com.dfsek.terra.api.addons.annotations.Addon;
import com.dfsek.terra.api.addons.annotations.Author;
import com.dfsek.terra.api.addons.annotations.Depends;
import com.dfsek.terra.api.addons.annotations.Version;
import com.dfsek.terra.api.event.EventListener;
import com.dfsek.terra.api.event.annotations.Global;
import com.dfsek.terra.api.event.events.config.ConfigPackPreLoadEvent;
import com.dfsek.terra.api.injection.annotations.Inject;

import java.util.logging.Logger;

@SuppressWarnings("unused")
@Addon("ExampleAddon") // Mark this class as an addon entry point with ID ExampleAddon.
@Author("yourname") // Name of the addon author
@Version("0.1.0") // Addon version
@Depends({}) // Optional dependencies for this addon.
public class ExampleAddonEntryPoint extends TerraAddon implements EventListener {
    @Inject // Dynamic dependency injection for TerraPlugin instance.
    private TerraPlugin main;

    @Inject // Dynamic dependency injection for Logger instance.
    private Logger logger;

    public void onPackLoad(ConfigPackPreLoadEvent event) { // Listen for ConfigPackPreLoadEvent.
        logger.info("Hello, World!"); // Log "Hello, World!" to the console whenever a config pack specifying this addon is loaded.
    }

    @Global
    public void onPackLoadGlobal(ConfigPackPreLoadEvent event) { // Listen for ConfigPackPreLoadEvent.
        logger.info("Hello, World! (Global handler)"); // Log "Hello, World!" to the console whenever any config pack is loaded.
    }

    @Override
    public void initialize() { // This method is invoked on load, when the addon is initialized.
        main.getEventManager().registerListener(this, this);
        // Register events. This class is both an addon class and an event handler.
    }
}

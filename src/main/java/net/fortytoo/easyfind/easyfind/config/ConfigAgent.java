package net.fortytoo.easyfind.easyfind.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class ConfigAgent extends MidnightConfig {
    @Entry(category = "text") public static boolean saveHistory = true;
    
    @Entry(category = "text") public static boolean showDescription = true;
    @Entry(category = "text") public static boolean coloredRarity = true;
    
    @Entry(category = "text") public static boolean showDisabledItem;
    
    // TBA
    public static boolean creativeHotbarAgent;
}
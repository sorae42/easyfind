package net.fortytoo.easyfind.easyfind.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class ConfigAgent extends MidnightConfig {
    public enum ReplaceNeighbor { CURRENT, NEXT, PREVIOUS }
    public enum KeepScreen { SHIFT, ALWAYS }
    
    // Cosmetics
    @Entry(category = "text") public static boolean blurredBG = true;
    @Entry(category = "text") public static boolean showDescription = true;
    @Entry(category = "text") public static boolean coloredRarity = true;
    
    // Behaviour
    @Entry(category = "text") public static ReplaceNeighbor replaceNeighbor = ReplaceNeighbor.CURRENT;
    @Entry(category = "text") public static KeepScreen keepScreenOn = KeepScreen.SHIFT;
    @Entry(category = "text") public static boolean forcedReplace = false;
    @Entry(category = "text") public static boolean ignoreExisting = false;
    
    @Entry(category = "text") public static boolean saveHistory = true;
    @Entry(category = "text") public static boolean showDisabledItem;
}

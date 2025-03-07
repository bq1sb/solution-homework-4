import java.util.HashMap;
import java.util.Map;
// Singleton class to manage configurations
class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> configSettings;
    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        configSettings = new HashMap<>();
        loadDefaultSettings();
    }
    // Lazy initialization for Singleton instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();

        }
        return instance;
    }
    // Load default settings
    private void loadDefaultSettings() {
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");

    }
    // Retrieve a configuration value
    public String getConfig(String key) {
        return configSettings.get(key);
    }
    // Print all configurations
    public void printConfigurations() {
        System.out.println("Configuration Settings:");
        for(Map.Entry<String, String> entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

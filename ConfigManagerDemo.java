// Demo class to test ConfigurationManager
public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("MaxPlayers: " + configManager.getConfig("MaxPlayers"));
        configManager.printConfigurations();
    }
}

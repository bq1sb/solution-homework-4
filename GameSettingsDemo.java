// Demo class to test GameSettings
public class GameSettingsDemo {
    public static void main(String[] args) {
        GameSettings settings = GameSettings.getInstance();
        settings.printSettings();
        settings.setDifficulty("Hard");
        settings.setScreenResolution("2560x1440");
        settings.setSoundEnabled("False");
        settings.setVolumeLevel(75);
        settings.setFullscreenMode(true);

        System.out.println("\nUpdated settings:");
        settings.printSettings();
    }
}

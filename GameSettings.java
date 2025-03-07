import java.util.Scanner;
// Singleton class to manage global game settings
class GameSettings {
    private static GameSettings instance;
    private String screenResolution;
    private String difficulty;
    private String soundEnabled;
    private int volumeLevel;
    private boolean fullscreenMode;

    private GameSettings() {
        this.screenResolution = "1920х1080";
        this.difficulty = "medium";
        this.soundEnabled = "on";
        this.volumeLevel = 50;
        this.fullscreenMode = false;
    }
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public static void setInstance(GameSettings instance) {
        GameSettings.instance = instance;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(String soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isFullscreenMode() {
        return fullscreenMode;
    }

    public void setFullscreenMode(boolean fullscreenMode) {
        this.fullscreenMode = fullscreenMode;
    }
    public void printSettings() {
        System.out.println("GameSettings");
        System.out.println("Screen Resolution: " + screenResolution);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Sound Enabled: " + soundEnabled);
        System.out.println("Volume Level: " + volumeLevel);
        System.out.println("Fullscreen: " + fullscreenMode);

    }
}

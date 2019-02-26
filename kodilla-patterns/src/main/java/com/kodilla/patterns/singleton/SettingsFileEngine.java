package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine() {

    }

    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {
                settingsFileEngineInstance = new SettingsFileEngine();
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(String fileName) {
        this.fileName = fileName;
        System.out.println("opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("load settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("saving settings to file");
        return true;
    }
}

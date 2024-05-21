public class UserSettings {
    private static UserSettings instance;
    private Theme theme;
    private int volume;
    private Language language;

    private UserSettings() {
        this.theme = Theme.Light;
        this.volume = 50;
        this.language = Language.EN;
    }

    public static UserSettings getIntance() {
        if(instance == null)
            instance = new UserSettings();
        return instance;
    }

    public enum Theme {
        Dark, Light
    }
    public enum Language {
        EN, ES, PL, DE, CH;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}

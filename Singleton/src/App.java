public class App {
    public static void main(String[] args) throws Exception {
        UserSettings settings1 = UserSettings.getIntance();
        settings1.setTheme(UserSettings.Theme.Dark);
        UserSettings settings2 = UserSettings.getIntance();
        System.out.println(settings2.getTheme());
    }
}

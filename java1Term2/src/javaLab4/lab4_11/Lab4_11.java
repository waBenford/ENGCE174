package javaLab4.lab4_11;
import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode);
    }
}

public class Lab4_11 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println( "Theme:" );
        String baseTheme = getValue.next();
        int baseFontSize = getValue.nextInt();
        boolean baseDarkMode = getValue.nextBoolean();

        String userTheme = getValue.next();
        int userFontSize = getValue.nextInt();
        boolean userDarkMode = getValue.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseFontSize, baseDarkMode);
        Configuration userConfig = new Configuration(userTheme, userFontSize, userDarkMode);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
        
        getValue.close();
    }
}
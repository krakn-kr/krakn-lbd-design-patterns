package org.krashokkumarnaidu.designpatterns.Creational.AbstractFactory;

// ============================================
// FACTORY PATTERN EXAMPLE
// Creates objects of a single type
// ============================================

// Product interface
interface Button {
    void render();
    void onClick();
}

// Concrete products
class AndroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Android-style button with Material Design");
    }

    @Override
    public void onClick() {
        System.out.println("Android button clicked - Ripple effect");
    }
}

class IOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering iOS-style button with Cupertino design");
    }

    @Override
    public void onClick() {
        System.out.println("iOS button clicked - Subtle animation");
    }
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows-style button with Fluent Design");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked - Smooth transition");
    }
}

// Factory class - creates objects of single type (Button)
class ButtonFactory {
    public static Button createButton(String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new AndroidButton();
            case "ios":
                return new IOSButton();
            case "windows":
                return new WindowsButton();
            default:
                throw new IllegalArgumentException("Unknown platform: " + platform);
        }
    }
}

// ============================================
// ABSTRACT FACTORY PATTERN EXAMPLE
// Creates families of related objects
// ============================================

// Abstract products - multiple types
interface UIButton {
    void render();
}

interface UITextField {
    void render();
}

interface UICheckbox {
    void render();
}

// Concrete products for Dark Theme family
class DarkButton implements UIButton {
    @Override
    public void render() {
        System.out.println("🌙 Dark Button: Black background, white text, glowing border");
    }
}

class DarkTextField implements UITextField {
    @Override
    public void render() {
        System.out.println("🌙 Dark TextField: Dark gray background, white text, blue accent");
    }
}

class DarkCheckbox implements UICheckbox {
    @Override
    public void render() {
        System.out.println("🌙 Dark Checkbox: White checkmark on dark background");
    }
}

// Concrete products for Light Theme family
class LightButton implements UIButton {
    @Override
    public void render() {
        System.out.println("☀️ Light Button: White background, dark text, subtle shadow");
    }
}

class LightTextField implements UITextField {
    @Override
    public void render() {
        System.out.println("☀️ Light TextField: White background, dark text, gray border");
    }
}

class LightCheckbox implements UICheckbox {
    @Override
    public void render() {
        System.out.println("☀️ Light Checkbox: Dark checkmark on white background");
    }
}

// Concrete products for Neon Theme family
class NeonButton implements UIButton {
    @Override
    public void render() {
        System.out.println("⚡ Neon Button: Black background, cyan text, glowing neon border");
    }
}

class NeonTextField implements UITextField {
    @Override
    public void render() {
        System.out.println("⚡ Neon TextField: Black background, green text, pulsing border");
    }
}

class NeonCheckbox implements UICheckbox {
    @Override
    public void render() {
        System.out.println("⚡ Neon Checkbox: Bright pink checkmark, electric blue background");
    }
}

// Abstract Factory interface
interface UIThemeFactory {
    UIButton createButton();
    UITextField createTextField();
    UICheckbox createCheckbox();
}

// Concrete factories - each creates a family of related objects
class DarkThemeFactory implements UIThemeFactory {
    @Override
    public UIButton createButton() {
        return new DarkButton();
    }

    @Override
    public UITextField createTextField() {
        return new DarkTextField();
    }

    @Override
    public UICheckbox createCheckbox() {
        return new DarkCheckbox();
    }
}

class LightThemeFactory implements UIThemeFactory {
    @Override
    public UIButton createButton() {
        return new LightButton();
    }

    @Override
    public UITextField createTextField() {
        return new LightTextField();
    }

    @Override
    public UICheckbox createCheckbox() {
        return new LightCheckbox();
    }
}

class NeonThemeFactory implements UIThemeFactory {
    @Override
    public UIButton createButton() {
        return new NeonButton();
    }

    @Override
    public UITextField createTextField() {
        return new NeonTextField();
    }

    @Override
    public UICheckbox createCheckbox() {
        return new NeonCheckbox();
    }
}

// Application class that uses the factories
class Application {
    private UIThemeFactory themeFactory;

    public Application(UIThemeFactory factory) {
        this.themeFactory = factory;
    }

    public void createUI() {
        UIButton button = themeFactory.createButton();
        UITextField textField = themeFactory.createTextField();
        UICheckbox checkbox = themeFactory.createCheckbox();

        button.render();
        textField.render();
        checkbox.render();
    }
}

// ============================================
// DEMONSTRATION
// ============================================
public class FactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== FACTORY PATTERN DEMO ===");
        System.out.println("Creates single type of object (Button only)\n");

        // Factory Pattern - creates only buttons
        Button androidBtn = ButtonFactory.createButton("android");
        Button iosBtn = ButtonFactory.createButton("ios");
        Button windowsBtn = ButtonFactory.createButton("windows");

        androidBtn.render();
        iosBtn.render();
        windowsBtn.render();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== ABSTRACT FACTORY PATTERN DEMO ===");
        System.out.println("Creates families of related objects\n");

        // Abstract Factory Pattern - creates complete UI families
        System.out.println("🌙 DARK THEME APPLICATION:");
        Application darkApp = new Application(new DarkThemeFactory());
        darkApp.createUI();

        System.out.println("\n☀️ LIGHT THEME APPLICATION:");
        Application lightApp = new Application(new LightThemeFactory());
        lightApp.createUI();

        System.out.println("\n⚡ NEON THEME APPLICATION:");
        Application neonApp = new Application(new NeonThemeFactory());
        neonApp.createUI();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("KEY DIFFERENCES:");
        System.out.println("• Factory Pattern: Creates ONE type of object");
        System.out.println("• Abstract Factory: Creates FAMILIES of related objects");
        System.out.println("• Factory Pattern: ButtonFactory creates only buttons");
        System.out.println("• Abstract Factory: ThemeFactory creates buttons + textfields + checkboxes");
        System.out.println("• Abstract Factory ensures all objects work together cohesively");
    }
}
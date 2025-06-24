package org.krashokkumarnaidu.designpatterns.Creational.Factory.ExampleTwo;

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
public class Main{
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
    }
}
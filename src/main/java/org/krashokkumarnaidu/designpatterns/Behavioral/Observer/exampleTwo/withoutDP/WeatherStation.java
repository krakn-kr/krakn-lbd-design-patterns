package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleTwo.withoutDP;

class WeatherStation {
    private int temperature;
    private Display tvDisplay;
    private Display mobileDisplay;

    public void setTvDisplay(Display d) { tvDisplay = d; }
    public void setMobileDisplay(Display d) { mobileDisplay = d; }

    public void setTemperature(int temp) {
        this.temperature = temp;
        if (tvDisplay != null) tvDisplay.show(temperature);
        if (mobileDisplay != null) mobileDisplay.show(temperature);
    }
}

interface Display {
    void show(int temperature);
}

class TVDisplay implements Display {
    public void show(int temperature) {
        System.out.println("TV Display: Temperature is " + temperature);
    }
}

class MobileDisplay implements Display {
    public void show(int temperature) {
        System.out.println("Mobile Display: Temperature is " + temperature);
    }
}

// Usage
class Main{
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        ws.setTvDisplay(new TVDisplay());
        ws.setMobileDisplay(new MobileDisplay());
        ws.setTemperature(30);

    }
}
public class Converter {

    public double temperature;

    public Converter(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void CelsiusToKelvin(double temperature) {this.temperature += 273.15;}
    public void CelsiusToFahrenheit(double temperature) {this.temperature = temperature * 9.0 / 5.0 + 32.0;}

    public void KelvinToCelsius(double temperature) {this.temperature -= 273.15;}
    public void KelvinToFahrenheit(double temperature) {this.temperature = (temperature - 273.15) * 9.0 / 5.0 + 32.0;}

    public void FahrenheitToCelsius(double temperature) {this.temperature = (temperature - 32) * 5.0 / 9.0;}
    public void FahrenheitToKelvin(double temperature) {
        FahrenheitToCelsius(temperature);
        this.temperature += 273.15;
    }

    @Override
    public String toString() {
        return "Temperature: " + String.format("%.1f", temperature);
    }
}

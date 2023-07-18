public class TempConversion {
    private float fahrenheit;
    private float celsius;
    private float kelvin;
    public TempConversion() {
        this.fahrenheit = 0;
        this.celsius = 0;
    }
    public void cToF(float celsius) {
        this.fahrenheit = (celsius * 1.8f) + 32.0f;
    }
    public void fToC(float fahrenheit) {
        this.celsius = (fahrenheit - 32f) * (5f / 9f);
    }
    public void cToK(float celsius) {
        this.kelvin = (celsius + 273.15f);
    }
    public void kToC(float kelvin) {
        this.celsius = (kelvin - 273.15f);
    }
    public float getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public float getCelsius() {
        return celsius;
    }
    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }
    public float getKelvin() {
        return kelvin;
    }
    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }
}

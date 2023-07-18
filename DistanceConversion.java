public class DistanceConversion {
    private float inch;
    private float centimeter;
    private float mile;
    private float kilometer;
    public DistanceConversion() {
        this.inch = 0;
        this.centimeter = 0;
        this.mile = 0;
        this.kilometer = 0;
    }
    public void iToC(float inch) {
        this.centimeter = inch * 2.54f;
    }
    public void cToI(float centimeter) {
        this.inch = centimeter / 2.54f;
    }
    public void mToK(float mile) {
        this.kilometer = mile * 1.609347f;
    }
    public void kToM(float kilometer) {
        this.mile = kilometer / 1.609347f;
    }
    public float getInch() {
        return inch;
    }
    public void setInch(float inch) {
        this.inch = inch;
    }
    public float getCentimeter() {
        return centimeter;
    }
    public void setCentimeter(float centimeter) {
        this.centimeter = centimeter;
    }
    public float getMile() {
        return mile;
    }
    public void setMile(float mile) {
        this.mile = mile;
    }
    public float getKilometer() {
        return kilometer;
    }
    public void setKilometer(float kilometer) {
        this.kilometer = kilometer;
    }
}

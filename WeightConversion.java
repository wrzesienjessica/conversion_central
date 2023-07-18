public class WeightConversion {
    private float pound;
    private float kilogram;
    private float ounce;
    private float gram;
    public WeightConversion() {
        this.pound = 0;
        this.kilogram = 0;
        this.ounce = 0;
        this.gram = 0;
    }
    public void pToK(float pound) {
        this.kilogram = pound / 2.20462262185f;
    }
    public void kToP(float kilogram) {
        this.pound = kilogram * 2.20462262185f;
    }
    public void oToG(float ounce) {
        this.gram = ounce * 28.3495f;
    }
    public void gToO(float gram) {
        this.ounce = gram / 28.3495f;
    }
    public float getPound() {
        return pound;
    }
    public void setPound(float pound) {
        this.pound = pound;
    }
    public float getKilogram() {
        return kilogram;
    }
    public void setKilogram(float kilogram) {
        this.kilogram = kilogram;
    }
    public float getOunce() {
        return ounce;
    }
    public void setOunce(float ounce) {
        this.ounce = ounce;
    }
    public float getGram() {
        return gram;
    }
    public void setGram(float gram) {
        this.gram = gram;
    }
}

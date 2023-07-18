public class CurrencyConversion {
    private float dollar;
    private float euro;
    private float rupee;
    public CurrencyConversion() {
        this.dollar = 0;
        this.euro = 0;
        this.rupee = 0;
    }
    public void dToE(float dollar) {
        this.euro = dollar / 1.1254f;
    }
    public void eToD(float euro) {
        this.dollar = euro * 1.1254f;
    }
    public void dToR(float dollar) {
        this.rupee = dollar * 82.0575f;
    }
    public void rToD(float rupee) {
        this.dollar = rupee / 82.0575f;
    }
    public float getDollar() {
        return dollar;
    }
    public void setDollar(float dollar) {
        this.dollar = dollar;
    }
    public float getEuro() {
        return euro;
    }
    public void setEuro(float euro) {
        this.euro = euro;
    }
    public float getRupee() {
        return rupee;
    }
    public void setRupee(float rupee) {
        this.rupee = rupee;
    }
}

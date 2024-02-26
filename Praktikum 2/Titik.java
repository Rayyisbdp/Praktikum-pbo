public class Titik {
    private double x;
    private double y;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Titik refleksiSumbuX() {
        return new Titik(this.x, -this.y);
    }

    public Titik refleksiSumbuY() {
        return new Titik(-this.x, this.y);
    }
    
    public Titik refleksiX() {
        return this.__refleksiSumbuX();
    }

    public Titik refleksiY() {
        return this.__refleksiSumbuY();
    }

    // Metode privat untuk refleksi sumbu X
    private Titik __refleksiSumbuX() {
        return this.refleksiSumbuX();
    }

    // Metode privat untuk refleksi sumbu Y
    private Titik __refleksiSumbuY() {
        return this.refleksiSumbuY();
    }
}
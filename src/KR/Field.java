package KR;

public class Field {
    private double w, h;
    private double mu, g;

    public Field(double w, double h, double mu, double g) {
        this.w = w;
        this.h = h;
        this.mu = mu;
        this.g = g;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getMu() {
        return mu;
    }

    public void setMu(double mu) {
        this.mu = mu;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
}

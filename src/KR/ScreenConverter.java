package KR;

public class ScreenConverter {
    public ScreenConverter(double xr, double yr, double wr, double hr, int ws, int hs) {
        this.xr = xr;
        this.yr = yr;
        this.wr = wr;
        this.hr = hr;
        this.ws = ws;
        this.hs = hs;
    }

    private double xr;
    private double yr;
    private double wr;

    public ScreenPoint r2s(Vector2 p){
        int i = (int)((p.getX() - xr)*ws/wr);
        int j = (int)((yr - p.getY())*hs/hr);
        return new ScreenPoint(i,j);
    }

    public Vector2 s2r(ScreenPoint p){
        double x = xr + p.getI()*wr/ws;
        double y = yr - p.getJ()*hr/hs;
        return new Vector2(x,y);
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getYr() {
        return yr;
    }

    public void setYr(double yr) {
        this.yr = yr;
    }

    public double getWr() {
        return wr;
    }

    public void setWr(double wr) {
        this.wr = wr;
    }

    public double getHr() {
        return hr;
    }

    public void setHr(double hr) {
        this.hr = hr;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    private double hr;
    private int ws, hs;
}

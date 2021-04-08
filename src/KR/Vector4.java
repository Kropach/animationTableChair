package KR;

public class Vector4 {
    private double Top, Back, LR, Leg;

    public Vector4(double top, double back, double lr, double leg) {
        this.Top = top;
        this.Back = back;
        this.LR = lr;
        this.Leg = leg;
    }

    public Vector4 add(Vector4 other){
        return new Vector4(Top + other.getTop(), Back + other.getBack(),
                LR + other.getLR(), Leg + other.getLeg());
    }

    public Vector4 mul(double n){
        return new Vector4(Top*n, Back*n, LR*n, Leg*n);
    }

    public Vector4 mul(Vector4 v4F, Vector4 v4N){
        return new Vector4(v4F.getTop()*v4N.getTop(),v4F.getBack()*v4N.getBack(),
                v4F.getLR()*v4N.getLR(),v4F.getLeg()*v4N.getLeg());
    }


    public double length() {
        return Math.sqrt(Top*Top + Back*Back + LR*LR + Leg*Leg);
    }
    public Vector4 normalized(){
        double d =length();
        if (Math.abs(d) < 1e-15){
            return new Vector4(0,0,0,0);
        }
        return new Vector4(Top/d,Back/d, LR/d,Leg/d);
    }

    public void setTop(double top) {
        Top = top;
    }

    public void setBack(double back) {
        Back = back;
    }

    public void setLR(double LR) {
        this.LR = LR;
    }

    public void setLeg(double leg) {
        Leg = leg;
    }

    public double getTop() {
        return Top;
    }

    public double getBack() {
        return Back;
    }

    public double getLR() {
        return LR;
    }

    public double getLeg() {
        return Leg;
    }
}

package KR;

public class Furniture {
    private double wTop;
    private double wLRBoard;
    private double hLeg;
    private double hBack;

    public Furniture(double wTop, double wLRBoard, double hLeg, double hBack) {
        this.wTop = wTop;
        this.wLRBoard = wLRBoard;
        this.hLeg = hLeg;
        this.hBack = hBack;
    }

    public Furniture() {
    }

    public static Furniture getFurniture(Vector4 v){
        return new Furniture(v.getTop(), v.getLR(), v.getLeg(), v.getBack());
    }

    public double getwTop() {
        return wTop;
    }

    public Vector4 getVector(){
        return new Vector4(wTop, hBack, wLRBoard, hLeg);
    }

    public void setwTop(double wTop) {
        this.wTop = wTop;
    }

    public double getwLRBoard() {
        return wLRBoard;
    }

    public void setwLRBoard(double wLRBoard) {
        this.wLRBoard = wLRBoard;
    }

    public double gethLeg() {
        return hLeg;
    }

    public void sethLeg(double hLeg) {
        this.hLeg = hLeg;
    }

    public double gethBack() {
        return hBack;
    }

    public void sethBack(double hBack) {
        this.hBack = hBack;
    }
}

package KR;

import java.awt.*;

public class World {
    private Table table;
    private Chair chair;
    private double currentTime;
    private double w = Main.W/2, h = Main.H/2;
    private Furniture currentF;
    private Vector4 vStart, vEnd, delta, one, vCurrent;
    private double length;
    private double deltaValue = 0.01;

    public World(Table table, Chair chair) {
        this.table = table;
        this.chair = chair;
        currentTime = 0;
        currentF = new Furniture();
        vStart = table.getVector();
        vEnd = chair.getVector();
        delta = vEnd.add(vStart.mul(-1));
        one = delta.normalized();

        length = delta.length();
    }

    //    принимает интевал времени
    public void update(double dt) {
        currentTime += deltaValue;
        if (currentTime >= 1)
            deltaValue =-0.01;
        else if (currentTime <= 0)
                deltaValue = 0.01;
        vCurrent = one.mul(currentTime*length).add(vStart);
        currentF = Furniture.getFurniture(vCurrent);
    }

    public void draw(Graphics2D g, ScreenConverter sc) {
        g.setColor(Color.RED);
        ScreenPoint pT1 = sc.r2s(new Vector2(w - currentF.getwTop() / 2, h));
        ScreenPoint pT2 = sc.r2s(new Vector2(w + currentF.getwTop() / 2, h));
        g.drawLine(pT1.getI(),pT1.getJ(), pT2.getI(),pT2.getJ());

        ScreenPoint pB1 = sc.r2s(new Vector2(pT1.getI() - currentF.getwLRBoard(), h));
        ScreenPoint pB2 = sc.r2s(new Vector2(pT2.getI() + currentF.getwLRBoard(), h));
        g.drawLine(pB1.getI(), pB1.getJ(), pT1.getI(),pT1.getJ());
        g.drawLine(pT2.getI(), pT2.getJ(), pB2.getI(),pB2.getJ());

        ScreenPoint pL1 = sc.r2s(new Vector2(pT1.getI(), h-currentF.gethLeg()));
        ScreenPoint pL2 = sc.r2s(new Vector2(pT2.getI(), h-currentF.gethLeg()));
        g.drawLine(pT1.getI(),pT1.getJ(), pL1.getI(), pL1.getJ());
        g.drawLine(pT2.getI(),pT2.getJ(), pL2.getI(), pL2.getJ());

        ScreenPoint pBack = sc.r2s(new Vector2(pT1.getI(), pT1.getJ()+currentF.gethBack()));
        g.drawLine(pT1.getI(),pT1.getJ(), pBack.getI(), pBack.getJ());

    }
}

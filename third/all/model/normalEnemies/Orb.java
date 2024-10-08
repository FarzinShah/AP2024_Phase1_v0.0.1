package third.all.model.normalEnemies;

import third.all.data.booleans.BooleansOf_IsValidToShow;
import third.all.data.PanelsData;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import static third.all.controller.Constants.ORB;

public class Orb extends NormalEnemy implements NormalEnemyModel {
    public static ArrayList<Orb> instance;
    private Point location;
    private int size;
    private int HP;

    Orb(Point location, int HP) {
        size = 50;
        this.location = location;
        this.HP = HP;
    }

    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public static ArrayList<Orb> getInstance() {
        if (instance == null) {
            instance = new ArrayList<>();
            instance.add(0, new Orb(new Point((int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getX() + 25), (int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getY() + 25)), 30));
            instance.add(1, new Orb(new Point((int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getX() + 25), (int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getY() + 25)), 30));
            instance.add(2, new Orb(new Point((int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getX() + 25), (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getY() + 25)), 30));
            instance.add(3, new Orb(new Point((int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getX() + 25), (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getY() + 25)), 30));
            instance.add(4, new Orb(new Point((int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getX() + 25), (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getY() + 25)), 30));

            return instance;
        }
        return instance;
    }

    public void draw(Graphics g, ImageObserver i) {
        g.setColor(new Color(0x94676464, true));
        float[] dashingPattern1 = {5, 30};
        Stroke stroke1 = new BasicStroke(2f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);

        ((Graphics2D) g).setStroke(stroke1);

        g.drawLine(100, 100, 400, 400);
        if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbPanels().get(5)) {

            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(0)) {
                g.drawImage(ORB, Orb.getInstance().get(0).getLocation().x, Orb.getInstance().get(0).getLocation().y, Orb.getInstance().get(0).getSize(), Orb.getInstance().get(0).getSize(), i);
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(1)) {
                g.drawImage(ORB, Orb.getInstance().get(1).getLocation().x, Orb.getInstance().get(1).getLocation().y, Orb.getInstance().get(0).getSize(), Orb.getInstance().get(0).getSize(), i);
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(2)) {
                g.drawImage(ORB, Orb.getInstance().get(2).getLocation().x, Orb.getInstance().get(2).getLocation().y, Orb.getInstance().get(0).getSize(), Orb.getInstance().get(0).getSize(), i);
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(3)) {
                g.drawImage(ORB, Orb.getInstance().get(3).getLocation().x, Orb.getInstance().get(3).getLocation().y, Orb.getInstance().get(0).getSize(), Orb.getInstance().get(0).getSize(), i);
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(4)) {
                g.drawImage(ORB, Orb.getInstance().get(4).getLocation().x, Orb.getInstance().get(4).getLocation().y, Orb.getInstance().get(0).getSize(), Orb.getInstance().get(0).getSize(), i);
            }

            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(0) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(1)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(0) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(2)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(0) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(3)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(0) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(4)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(0).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(2) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(1)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(3) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(1)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(4) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(1)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(1).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(3) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(2)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(4) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(2)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(2).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getY() + 50));
            }
            if (BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(3) && BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().get(4)) {
                g.drawLine((int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(3).getY() + 50)
                        , (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getX() + 50), (int) (PanelsData.getInstance().getBlackOrbPanels().get(4).getY() + 50));
            }
            for (int j = 0; j < Orb.getInstance().size(); j++) {
                if (Orb.getInstance().get(j).HP <= 0) {
//                BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbPanels().set(j,false);
                    BooleansOf_IsValidToShow.getInstance().getIsValidToShowBlackOrbEntity().set(j, false);
                }
            }
        }

    }

    public Rectangle getRectangle() {
        return new Rectangle(location.x, location.y, size, size);
    }

    public static void setInstance(ArrayList<Orb> instance1) {
        instance = instance1;
    }

}

package third.all.model.boss;

import third.all.data.Properties;

import java.awt.*;
import java.awt.image.ImageObserver;

import static third.all.controller.Constants.RIGHT_HAND;

public class RightHand implements Boss {
    public static RightHand instance;
    private Point location;
    private int size;
    private int HP;


    public RightHand(Point location, int size, int HP) {
        this.location = location;
        this.size = size;
        this.HP = HP;
    }

    public Point getLocation() {
        return location;
    }

    public RightHand setLocation(Point location) {
        this.location = location;
        return this;
    }

    public int getSize() {
        return size;
    }

    public RightHand setSize(int size) {
        this.size = size;
        return this;
    }

    public int getHP() {
        return HP;
    }

    public RightHand setHP(int HP) {
        this.HP = HP;
        return this;
    }

    @Override
    public Rectangle getRectangle() {
        return new Rectangle(location.x, location.y, size, size);
    }

    @Override
    public void draw(Graphics g, ImageObserver i) {
        if (HP > 0)
            g.drawImage(RIGHT_HAND, RightHand.getInstance().getLocation().x, RightHand.getInstance().getLocation().y, RightHand.getInstance().getSize(), RightHand.getInstance().getSize(), i);

    }

    public static RightHand getInstance() {
        if (instance == null) {
            instance = new RightHand(Properties.getInstance().locationOfRightHand, 275, Properties.getInstance().handsOfBossHP);
            return instance;
        }
        return instance;
    }

    public static void setInstance(RightHand instance1) {
        instance = instance1;
    }
}

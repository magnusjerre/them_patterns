package jerre.creational.factory;

import java.awt.geom.Point2D;

public class Main {

    public static void main(String... args) {
        DBFactory dbFactory = new DBFactory();

        DB sqlDb = dbFactory.getDatabase("sql://mydburl");
        DB mongoDb = dbFactory.getDatabase("mongodb://mydburl");

        Point2D.Float point = new Point2D.Float(1f, 1f);
        sqlDb.insert(point);
        mongoDb.insert(point);
    }
}

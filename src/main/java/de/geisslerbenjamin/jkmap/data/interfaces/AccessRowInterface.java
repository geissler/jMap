package de.geisslerbenjamin.jkmap.data.interfaces;

import javafx.scene.paint.Paint;

/**
 * Class representing a row in the Access database.
 *
 * @author Benjamin Geißler <benjamin.geissler@gmail.com>
 * @licence MIT
 */
public interface AccessRowInterface {
    public int getId();

    public void setId(int id);

    public String getType();

    public AccessRowInterface setType(String type);

    public double getX();

    public AccessRowInterface setX(double x);

    public double getY();

    public AccessRowInterface setY(double y);

    public double getRotation();

    public AccessRowInterface setRotation(double rotation);

    public String getColor();

    public AccessRowInterface setColor(Paint color);

    public double getTransparency();

    public AccessRowInterface setTransparency(double transparency);

    public double getWidth();

    public AccessRowInterface setWidth(double width);

    public double getHeight();

    public AccessRowInterface setHeight(double height);

    public double getDiameter();

    public AccessRowInterface setDiameter(double diameter);

}

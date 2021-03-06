package de.geisslerbenjamin.jkmap.data;

import de.geisslerbenjamin.jkmap.data.interfaces.AccessRowInterface;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * Class representing a row in the Access database with all possible fields.
 *
 * @author Benjamin Geißler <benjamin.geissler@gmail.com>
 * @licence MIT
 */
public class AccessRow implements AccessRowInterface {
    private int id;
    private double x;
    private double y;
    private String type;
    private String color;
    private double transparency;
    private double width;
    private double height;
    private double rotation;
    private double diameter;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public AccessRowInterface setX(double x) {
        this.x = x;
        return this;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public AccessRowInterface setY(double y) {
        this.y = y;
        return this;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public AccessRowInterface setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public AccessRowInterface setColor(Paint color) {
        if (color.equals(Color.RED)) {
            this.color = "red";
        } else if (color.equals(Color.GREEN)) {
            this.color = "green";
        } else if (color.equals(Color.BLUE)) {
            this.color = "blue";
        } else if (color.equals(Color.YELLOW)) {
            this.color = "yellow";
        } else if (color.equals(Color.ORANGE)) {
            this.color = "orange";
        } else if (color.equals(Color.VIOLET)) {
            this.color = "violet";
        } else if (color.equals(Color.PINK)) {
            this.color = "pink";
        } else if (color.equals(Color.TURQUOISE)) {
            this.color = "turquoise";
        } else if (color.equals(Color.BLACK)) {
            this.color = "black";
        } else if (color.equals(Color.WHITE)) {
            this.color = "white";
        }

        return this;
    }

    @Override
    public double getTransparency() {
        return transparency;
    }

    @Override
    public AccessRowInterface setTransparency(double transparency) {
        this.transparency = transparency;
        return this;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public AccessRowInterface setWidth(double width) {
        this.width = width;
        return this;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public AccessRowInterface setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public double getRotation() {
        return rotation;
    }

    @Override
    public AccessRowInterface setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    @Override
    public double getDiameter() {
        return this.diameter;
    }

    @Override
    public AccessRowInterface setDiameter(double diameter) {
        this.diameter = diameter;
        return this;
    }
}

package factories;

import colors.Color;
import shapes.Shape;

/**
 * Created by ribohe94 on 29/01/17.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}

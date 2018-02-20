/*
 * SimpleTriangle.java
 *
 * @author Gill Windall
 *
 * Represents a triangle that can be drawn on a drawing area
 *
 */
package simpledrawer.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.List;
import simpledrawer.Entity;
import simpledrawer.SShape;

public class STriangle extends SShape {

    
    public STriangle(List<Point> p, Color c, int t, Entity.EntityType et) {
        super(p, c , t, 3 , et);
    }
    /**
     *
     * @return the area in pixels of the triangle. Does this work okay?
     */
    public double getArea() {
        int term1 = getVertices().get(0).x * (getVertices().get(1).y - getVertices().get(2).y);
        int term2 = getVertices().get(1).x * (getVertices().get(2).y - getVertices().get(0).y);
        int term3 = getVertices().get(2).x * (getVertices().get(0).y - getVertices().get(1).y);
        return Math.abs((term1 + term2 + term3) / 2.0);
    }

    public List<Point> getVertices(){
        return this.getStructuralPoints();
    }
    
    
    @Override
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(getColor(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(getThickness()));

        // draw the triangle
        g2d.drawLine(this.getVertices().get(0).x, this.getVertices().get(0).y, this.getVertices().get(1).x, this.getVertices().get(1).y);
        g2d.drawLine(this.getVertices().get(2).x, this.getVertices().get(2).y, this.getVertices().get(1).x, this.getVertices().get(1).y);
        g2d.drawLine(this.getVertices().get(2).x, this.getVertices().get(2).y, this.getVertices().get(0).x, this.getVertices().get(0).y);    
    }
    @Override
    public String toString(){
        return "Color: "+super.getColor()+" Thick: "+super.getThickness()+" Points: "+super.getStructuralPoints().toString()+" width: "+super.getWidth()+" height: "+super.getHeight()+"  "+super.getX()+" , "+super.getX();
    }
}
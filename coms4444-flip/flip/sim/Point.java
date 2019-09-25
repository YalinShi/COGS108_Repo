/*
    Project: Flip
    Course: Programming & Problem Solving
    Year : 2019
    Instructor: Prof. Kenneth Ross
    URL: http://www.cs.columbia.edu/~kar/4444f19/

    Author: Vaibhav Darbari
    Simulator Version: 1.0
    
*/
package flip.sim;
import java.io.Serializable;
public class Point implements Serializable {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point a)
    {
        this.x = a.x;
        this.y = a.y;
    }

    public String toString() 
    { 
        return "(" + x + ", " + y + ")"; 
    } 

    @Override
    public boolean equals(Object other) {
    	if(!(other instanceof Point)) return false;
    	Point o = (Point) other;
    	return x == o.x && y == o.y;
    }

    @Override
    public int hashCode() {
    	return new Integer((int) (x * 10000 + y)).hashCode();
    }
}
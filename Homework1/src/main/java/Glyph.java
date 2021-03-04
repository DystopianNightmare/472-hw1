

import java.awt.*;

abstract class Glyph {
    private Bounds bounds = new Bounds(new Point(0,0),0,0);
    private Glyph parent = null;


    private Window window;



    public void compose() {}


public void adjustParent(Glyph child){}
    abstract void draw(Window window);
    boolean intersects(Point point){

        return false;
    }
     void insert(Glyph glyph, int position) throws NoChildOperationsException, NullChildException {throw new NoChildOperationsException();}
     void remove(Glyph glyph) throws NoChildOperationsException {throw new NoChildOperationsException();}
    Glyph child(int position) throws NoChildOperationsException, NullChildException {throw new NoChildOperationsException();}
    Glyph getParent(){return parent;}
    void setParent(Glyph parent){this.parent = parent;}
    void setBounds(Bounds bounds){ this.bounds=bounds; }
    Bounds getBounds(){ return bounds;}

    void setSize(Window window) {}


    void compose(Glyph glyph) throws NoChildOperationsException {throw new NoChildOperationsException();}
     void setLocation(Point point) {bounds.setPoint(point)
     ;
     }

     public String toString(){
         System.out.println(bounds.getPoint().x + " " +bounds.getPoint().y +" "+ bounds.getHeight() + " "+ bounds.getWidth());
         return "";
     }
}

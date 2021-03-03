

import java.awt.*;

abstract class Glyph {
    private Bounds bounds;
    private Glyph parent;
//    private ArrayList<Glyph> child;
    protected Dimension dimension;





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

    void setSize(int height, int width) { dimension= new Dimension(); this.dimension.setSize(height, width); }
    Dimension getSize(){ return dimension;}
    void compose() throws NoChildOperationsException {throw new NoChildOperationsException();}
    void compose(Glyph glyph) throws NoChildOperationsException {throw new NoChildOperationsException();}
     void setLocation(Point point) {bounds.setPoint(point);
     }
}

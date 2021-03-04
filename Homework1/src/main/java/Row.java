import java.awt.*;

public class Row extends Composition {

    public Row(Compositor compositor) {
        super(compositor);
//        setBounds(new Bounds(new Point(0, 0), 0, 0));
        ;
    }

    @Override
    void draw(Window window) {
        for (Glyph child : children) {
            child.draw(window);
        }
    }

    Glyph child(int position) {
        return children.get(position);
    }





    public Bounds updateCursor(Bounds cursor, Glyph glyph) {
        Bounds bounds = new Bounds(new Point(this.getBounds().getWidth(), this.getBounds().getPoint().y), this.getBounds().getHeight(), this.getBounds().getWidth());



        return bounds;
    }


    public void adjustParent(Glyph child){

        this.getBounds().setHeight((Math.max(child.getBounds().getHeight(), this.getBounds().getHeight())));
        this.getBounds().setWidth(child.getBounds().getPoint().x+child.getBounds().getWidth());
    }

}

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





    public void updateCursor(Bounds cursor, Glyph glyph) {
//        Bounds bounds = new Bounds(new Point(this.getBounds().getPoint().x, glyph.getBounds().getHeight()+cursor.getPoint().y),
//                glyph.getBounds().getHeight()+cursor.getPoint().x, +this.getBounds().getPoint().y+cursor.getPoint().y);

        Bounds bounds = new Bounds(new Point(glyph.getBounds().getWidth()+cursor.getPoint().x, this.getBounds().getPoint().y),
                this.getBounds().getPoint().x+cursor.getPoint().x, glyph.getBounds().getWidth()+cursor.getPoint().y);



    }

    public void adjustParent(Bounds bounds){


        this.getBounds().setWidth(bounds.getPoint().x);
        this.getBounds().setHeight(bounds.getPoint().y);
//        this.getBounds().setWidth(Math.max(child.getBounds().getWidth(),this.getBounds().getWidth()));


    }

}

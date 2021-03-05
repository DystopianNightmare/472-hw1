import java.awt.*;

public class Column extends Composition {

    public Column(Compositor compositor) {
        super(compositor);

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
        Bounds bounds = new Bounds(new Point(this.getBounds().getPoint().x, glyph.getBounds().getHeight()+cursor.getPoint().y),
                glyph.getBounds().getHeight()+cursor.getPoint().x, this.getBounds().getPoint().y+cursor.getPoint().y);



        return bounds;
    }

    public void adjustParent(Bounds bounds, Glyph child){


        this.getBounds().setHeight(bounds.getPoint().y);
        this.getBounds().setWidth(bounds.getPoint().x+child.getBounds().getWidth());
//        this.getBounds().setWidth(Math.max(child.getBounds().getWidth(),this.getBounds().getWidth()));


    }

}

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
    cursor.setX(glyph.getBounds().getWidth()+cursor.getPoint().x);
     cursor.setHeight(Math.max(cursor.getHeight(),Math.max(cursor.getPoint().y,glyph.getBounds().getHeight())));
     cursor.setWidth(cursor.getWidth()+glyph.getBounds().getWidth());
//        cursor.setY(cursor.getPoint().y);
    }

    public void adjustParent(Bounds bounds){
//getBounds().setX(bounds.getPoint().x)
        getBounds().setHeight(bounds.getHeight());
        getBounds().setWidth(bounds.getWidth());
    }

}

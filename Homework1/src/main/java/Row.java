import java.awt.*;

public class Row extends Composition {

    public Row(Compositor compositor) {
        super(compositor);
        setBounds(new Bounds(new Point(0, 0), 0, 0));
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

    void insert(Glyph glyph, int position) {
        glyph.setBounds(new Bounds(new Point(0, 0), 0, 0));
        glyph.setParent(this);
        this.children.add(position, glyph);
        compositor.compose();

    }

    void remove(Glyph glyph) {
        children.set(children.indexOf(glyph), null);
    }

    public Bounds updateCursor(Bounds cursor, Glyph glyph) {
        Bounds bounds = new Bounds(new Point(cursor.getPoint().x+getSize().height , cursor.getPoint().y), cursor.getHeight(), cursor.getWidth());

        bounds.setPointX(cursor.getPoint().x + glyph.getSize().width);
        bounds.setPointY(cursor.getPoint().y);


        return bounds;
    }

    public Bounds  updateParent(Bounds cursor){
        Bounds retval = new Bounds(new Point(0, 0), 0, 0);
        retval = cursor;
        retval.setHeight(cursor.getPoint().x+cursor.getHeight());
        retval.setWidth(cursor.getPoint().y+cursor.getWidth());
        return retval;
    }

}

import java.awt.*;

public class Column extends Composition {

    public Column(Compositor compositor) {
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
        compositor.compose(compositor.getRoot(this));

    }

    void remove(Glyph glyph) {
        children.set(children.indexOf(glyph), null);
    }

    public Bounds updateCursor(Bounds cursor, Glyph glyph) {
        Bounds bounds = new Bounds(new Point(cursor.getPoint().x, cursor.getPoint().y ), cursor.getHeight(), cursor.getWidth());

        bounds.setPointX(cursor.getPoint().x);
        bounds.setPointY(cursor.getPoint().y+ glyph.getSize().width);

        return bounds;
    }

}

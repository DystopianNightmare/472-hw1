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

    public void updateCursor(Bounds cursor, Glyph glyph) {
        cursor.setY(glyph.getBounds().getHeight()+cursor.getPoint().y);
        cursor.setHeight(cursor.getHeight()+glyph.getBounds().getHeight());
        cursor.setWidth(Math.min(cursor.getPoint().x, glyph.getBounds().getWidth()));
    }

    public void adjustParent(Bounds bounds){
        getBounds().setHeight(bounds.getHeight());
        getBounds().setWidth(bounds.getWidth());
    }
}

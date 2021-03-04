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
        Bounds bounds = new Bounds(new Point(this.getBounds().getPoint().x, this.getBounds().getHeight()), this.getBounds().getHeight(), this.getBounds().getWidth());



        return bounds;
    }

    public void adjustParent(Glyph child){

        this.getBounds().setHeight(child.getBounds().getPoint().y+child.getBounds().getHeight());
        this.getBounds().setWidth(Math.max(child.getBounds().getWidth(),this.getBounds().getWidth()));
    }

}

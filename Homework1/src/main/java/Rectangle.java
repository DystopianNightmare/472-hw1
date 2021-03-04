import java.awt.*;

public class Rectangle extends Glyph {



    public Rectangle(int height, int width){
        this.getBounds().setWidth(width);
        this.getBounds().setHeight(height);

    }

    @Override
    void draw(Window window) {
        window.drawRectangle(getBounds().getPoint().x , getBounds().getPoint().y,  getBounds().getHeight(), getBounds().getWidth());
    }



//    public void accept(GlyphVisitor v) { v.visit(this); }

}

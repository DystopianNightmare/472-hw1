import java.awt.*;

public class Rectangle extends Glyph {



    public Rectangle(){
//        setBounds(new Bounds(new Point(0,0),0,0));
        setSize(15,10);
    }

    @Override
    void draw(Window window) {
        window.drawRectangle(getBounds().getPoint().x , getBounds().getPoint().y,  getSize().height, getSize().width);
    }



//    public void accept(GlyphVisitor v) { v.visit(this); }

}

import java.awt.*;

public class Character extends Glyph {

    private char aChar;

    public Character(char aChar){
        this.aChar=aChar;
        setSize(10,10);
    }

    @Override
    void draw(Window window) {
        window.drawCharacter(aChar, getBounds().getPoint().x , getBounds().getPoint().y);
    }




//    public void accept(GlyphVisitor v) { v.visit(this); }

}

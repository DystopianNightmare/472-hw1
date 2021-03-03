import java.awt.*;

public abstract class Compositor {
    abstract void setComposition(Composition composition);
    abstract void compose() ;
    abstract void compose(Glyph glyph) ;

    public Glyph getRoot(Glyph glyph){
        while(glyph.getParent() != null){
            glyph = glyph.getParent();
        }
        return glyph;
    }
}

// this will set position and size
import java.awt.*;
import java.util.ArrayList;

public abstract class Composition extends CompositeGlyph {

    protected Compositor compositor ;

public Composition(Compositor compositor){
    this.compositor=compositor;
    compositor.setComposition(this);
}
abstract Bounds updateCursor(Bounds cursor, Glyph glyph);

}

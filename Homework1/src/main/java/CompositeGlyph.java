import java.awt.*;
import java.util.ArrayList;

public abstract class CompositeGlyph extends Glyph {

    public Composition composition;

    protected ArrayList<Glyph> children = new ArrayList<Glyph>();




    Glyph child(int position) throws NullChildException {
    if(children.get(position) == null){
        throw new NullChildException();
    } return children.get(position);
    }

    void insert(Glyph glyph, int position) {

        glyph.setParent(this);
        this.children.add(position, glyph);
        Glyph root = this;
        while(root.getParent() != null){
            root = root.getParent();
        }
        root.compose();
    }

     void remove(Glyph glyph){}



}

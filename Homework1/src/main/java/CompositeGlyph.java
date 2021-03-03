import java.util.ArrayList;

public abstract class CompositeGlyph extends Glyph {

    public Composition composition;

    protected ArrayList<Glyph> children = new ArrayList<Glyph>();




    Glyph child(int position) throws NullChildException {
    if(children.get(position) == null){
        throw new NullChildException();
    } return children.get(position);
    }
    abstract void insert(Glyph glyph, int position) throws NullChildException, NoChildOperationsException;

    abstract void remove(Glyph glyph);



}

public abstract class Compositor {
    abstract void setComposition(Composition composition);
    abstract void compose();

    public Glyph getRoot(Glyph glyph){
        while(glyph.getParent() != null){
            glyph = glyph.getParent();
        }
        return glyph;
    }
}
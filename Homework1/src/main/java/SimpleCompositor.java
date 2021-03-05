import javax.swing.*;
import java.awt.*;

public class SimpleCompositor extends Compositor {

    protected Window window;


    int i = 0;
    private Bounds cursor;
    private Bounds parent;

    public SimpleCompositor() {
    }

    public SimpleCompositor(Window window) {
        this.window = window;

    }

    @Override
    public void compose() {

        Bounds cursor = new Bounds(new Point(composition.getBounds().getPoint()), 0,0);
        try {
            int i = 0;
            while (true) {
                try {
                    Glyph child = composition.child(i);

                    i++;
                    child.setSize(window);
                    child.setLocation(cursor.getPoint());
                    child.compose();
                    composition.updateCursor(cursor, child);
                    System.out.println("Cursor "+ cursor.toString());
                } catch (NullChildException e) {
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }finally{
        }
        composition.adjustParent(cursor);
    }
}


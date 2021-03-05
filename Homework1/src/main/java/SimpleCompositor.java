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

        Bounds cursor = new Bounds(new Point(super.composition.getBounds().getPoint()), 0, 0);
        try {
            int i = 0;
            int childPos=0;
            while (true) {
                try {
                    Glyph child = composition.child(i);
                    i++;
                    child.setSize(window);
//
//                    if(childPos==0){
//                        child.setLocation(cursor.getPoint());
//                        childPos++;
//                    }else {
//                        cursor = composition.updateCursor(cursor, child);
//                        child.setLocation(cursor.getPoint());
//                    }
                    child.setLocation(cursor.getPoint());
                    cursor = composition.updateCursor(cursor, child);

                    child.compose();

                    composition.adjustParent(child);

                } catch (NullChildException e) {

                }
            }
        } catch (IndexOutOfBoundsException e) {

        }finally{
            composition.setBounds(cursor);
        }
    }


}


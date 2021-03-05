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

        Bounds cursor = new Bounds(new Point(super.composition.getBounds().getPoint()), super.composition.getBounds().getHeight(), super.composition.getBounds().getWidth());
        try {
            int i = 0;
            int childPos=0;
            while (true) {
                try {
                    Glyph child = composition.child(i);

                    i++;
                    child.setSize(window);
//                    if(childPos==0){
//                        child.setLocation(cursor.getPoint());
//                        childPos++;
//                    }else {
//                        cursor = composition.updateCursor(cursor, child);
//                        child.setLocation(cursor.getPoint());
//                    }
                    child.setLocation(cursor.getPoint());
                    child.compose();
                    cursor = composition.updateCursor(cursor, child);
                    composition.adjustParent(cursor, child);

                } catch (NullChildException e) {

                }
            }
        } catch (IndexOutOfBoundsException e) {

        }finally{
//            composition.setBounds(cursor);
        }

    }


}


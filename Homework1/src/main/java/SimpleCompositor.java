import javax.swing.*;
import java.awt.*;

public class SimpleCompositor extends Compositor {

    protected Window window;

    private Composition composition;
    int i = 0;
    private Bounds cursor;
    private Bounds parent;
    public SimpleCompositor(){}
    public SimpleCompositor(Window window){
        this.window = window;
    }
    @Override
    public void compose(Glyph glyph)  {
        Bounds cursor = new Bounds(new Point(glyph.getBounds().getPoint()),0,0);

        for (Glyph child : composition.children) {
            // ask (leaf) child to set size, based on window

            try {

                child.setSize(10,10);
                child.setLocation(cursor.getPoint());
                cursor = composition.updateCursor(cursor, child);

                child.compose();
                composition.setLocation(cursor.getPoint());
                glyph.setLocation(new Point(50,50));
            }catch(Exception e){
            }finally{ continue; }
        }
//        glyph.setBounds(cursor);
    }



    @Override
    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    @Override
    public void compose(){



    }


}
//
//    // create cursor based on parent
////for (... child= ...) {
//        // ask (leaf) child to set size, based on window
//        // ask child to set position, based on cursor
//        // ask child to compose itself, recursively
//        // ask parent to adjust itself and cursor, based on child
////    }
//// ask parent to adjust itself, based on cursor
//}


//set position and size
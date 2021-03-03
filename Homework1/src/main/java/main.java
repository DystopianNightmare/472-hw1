

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args)  {


        SwingWindow swingWindow = new SwingWindow("TEST");


        Row row = new Row(new SimpleCompositor(swingWindow));

        Character character = new Character('1');
        row.insert(character, 0);

        Column column = new Column(new SimpleCompositor(swingWindow));
        row.insert(column,1);

        Character charactero = new Character('2');
        row.insert(charactero, 2);
        Character character1 = new Character('3');
        row.insert(character1, 3);



        Character character4 = new Character('4');
        row.insert(character4, 4);
        Character character5 = new Character('5');
        row.insert(character5, 5);

        Rectangle rectangle = new Rectangle();
        row.insert(rectangle, 6);

        Character character6 = new Character('6');
        row.insert(character6, 7);



        Character charactera = new Character('A');
        column.insert(charactera, 0);
        Character characterb = new Character('B');
        column.insert(characterb, 1);
        Character characterC = new Character('C');
        column.insert(characterC, 2);

//        Row row2 = new Row(new SimpleCompositor(swingWindow));
//        row.insert(row2, 7);
//        Character characterX = new Character('>');
//        row2.insert(characterX,0);

        swingWindow.setContents(row);


//        Column col = new Column();


//
//        Character character1 = new Character('3');
//        row.insert(character1,3);


//        Character character2 = new Character('b');
//        Character character3 = new Character('c');
//        row.insert(col,2);
//
//        col.insert(character1 ,0);
//        col.insert(character2 ,1);
//        col.insert(character3 ,2);


    }
}

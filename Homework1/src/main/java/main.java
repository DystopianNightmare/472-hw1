

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args)  {


        SwingWindow swingWindow = new SwingWindow("TEST");


//        Row row = new Row(new SimpleCompositor(swingWindow));
//
//        Character character = new Character('1');
//        row.insert(character, 0);
//
//        Column column = new Column(new SimpleCompositor(swingWindow));
//        row.insert(column,1);
//
//        Character charactero = new Character('2');
//        row.insert(charactero, 2);
//        Character character1 = new Character('3');
//        row.insert(character1, 3);
//
//
//
//        Character character4 = new Character('4');
//        row.insert(character4, 4);
//        Character character5 = new Character('5');
//        row.insert(character5, 5);
//
//        Rectangle rectangle = new Rectangle();
//        row.insert(rectangle, 6);
//
//        Character character6 = new Character('6');
//        row.insert(character6, 7);
//
//
//
//        Character charactera = new Character('A');
//        column.insert(charactera, 0);
//        Character characterb = new Character('B');
//        column.insert(characterb, 1);
//        Character characterC = new Character('C');
//        column.insert(characterC, 2);
//
//        Row row2 = new Row(new SimpleCompositor(swingWindow));
//        row.insert(row2, 7);
//        Character characterX = new Character('>');
//        row2.insert(characterX,0);

//        Column column = new Column(new SimpleCompositor(swingWindow));
//        Row row1 = new Row(new SimpleCompositor(swingWindow));
//        column.insert(row1,0);
//
//        Character charactera = new Character('a');
//        row1.insert(charactera, 0);
//        Rectangle rectangle = new Rectangle();
//        row1.insert(rectangle, 1);
//
//
//        Column column1 = new Column(new SimpleCompositor(swingWindow));
//        row1.insert(column1,2);
//
//        Character characteraz = new Character('b');
//        row1.insert(characteraz, 3);
//
//        Character characterx = new Character('X');
//        column1.insert(characterx, 0);
//        Character charactery = new Character('Y');
//        column1.insert(charactery, 1);
//        Character characterz = new Character('Z');
//        column1.insert(characterz, 2);
//
//
//Column main = new Column(new SimpleCompositor(swingWindow));
//        main.insert(column,0);
//
//
//        Row row = new Row(new SimpleCompositor(swingWindow));
//        column.insert(row,1);
////        Character charactero = new Character('o');
////        row.insert(charactero, 0);
////        Character character1 = new Character('o');
////        row.insert(character1, 1);
//
//        Row rowBottom = new Row(new SimpleCompositor(swingWindow));
//        main.insert(rowBottom,0);
//        Character charactero = new Character('o');
//        rowBottom.insert(charactero, 0);
//        Character character1 = new Character('o');
//        rowBottom.insert(character1, 1);

//stop here
        Column main = new Column(new SimpleCompositor(swingWindow));
        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Row row = new Row(new SimpleCompositor(swingWindow));
        Row row2 = new Row(new SimpleCompositor(swingWindow));

        main.insert(row,0);


        Character charactera = new Character('a');
        row.insert(charactera, 0);
        Rectangle rectangle = new Rectangle(8,16);
        row.insert(rectangle, 1);


        row.insert(column1,2);

        Character characterx = new Character('X');
        column1.insert(characterx, 0);
        Character charactery = new Character('Y');
        column1.insert(charactery, 1);
        Character characterz = new Character('Z');
        column1.insert(characterz, 2);

        Character characteraz = new Character('b');
        row.insert(characteraz, 3);

       ;


                                                //moving main above or below this block will make a difference in how it is processed
        Character m = new Character('m');
        row2.insert(m, 0);
        Character mm = new Character('m');
        row2.insert(mm, 1);
        Character mmm = new Character('m');
        row2.insert(mmm, 2);
        Character mmmm = new Character('m');
        row2.insert(mmmm, 3);
        main.insert(row2,1);

        System.out.println("main " +main.toString());
        System.out.println("row " +row.toString());
        System.out.println("col " +column1.toString());
        System.out.println("row2 " +row.toString());
//        System.out.println("main " +main.toString());
//        row.toString();
//        charactera.toString();
//        rectangle.toString();
//        column1.toString();
//        characteraz.toString()


        swingWindow.setContents(main);


//        Column col = new Column();
//
//
//
//        Character character1 = new Character('3');
//        row.insert(character1,3);
//
//
//        Character character2 = new Character('b');
//        Character character3 = new Character('c');
//        row.insert(col,2);
//
//        col.insert(character1 ,0);
//        col.insert(character2 ,1);
//        col.insert(character3 ,2);


    }
}

public class main {

    public static void main(String[] args)  {
        SwingWindow swingWindow = new SwingWindow("TEST");

        Column main = new Column(new SimpleCompositor(swingWindow));
        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Row topRow = new Row(new SimpleCompositor(swingWindow));
        Row bottomRow = new Row(new SimpleCompositor(swingWindow));

        main.insert(topRow,0);
        main.insert(bottomRow,1);

        Character a = new Character('a');
        topRow.insert(a, 0);
        Rectangle rectangle = new Rectangle(15,10);
        topRow.insert(rectangle,1);

        topRow.insert(column1,2);

        Character X = new Character('X');
        column1.insert(X, 0);
        Character Y = new Character('Y');
        column1.insert(Y,1);
        Character Z = new Character('Z');
        column1.insert(Z,2);

        Character b = new Character('b');
        topRow.insert(b, 3);


        Character x = new Character('x');
        bottomRow.insert(x, 0);
        Rectangle rectangle1 = new Rectangle(10,15);
        bottomRow.insert(rectangle1,1);
        Character y = new Character('y');
        bottomRow.insert(y, 2);

        swingWindow.setContents(main);
    }
}

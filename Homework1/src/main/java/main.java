
public class main {

    public static void main(String[] args)  {


        SwingWindow swingWindow = new SwingWindow("TEST");

        Column main = new Column(new SimpleCompositor(swingWindow));
        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Column column2 = new Column(new SimpleCompositor(swingWindow));
        Row row = new Row(new SimpleCompositor(swingWindow));
        Row row2 = new Row(new SimpleCompositor(swingWindow));

        main.insert(column1,0);
        main.insert(column2,1);


        Character a = new Character('a');
        column1.insert(a, 0);
        Character b = new Character('b');
        column1.insert(b,1);
        Character c = new Character('c');
        column1.insert(c,2);
        Character d = new Character('d');
        column1.insert(d,3);
        Rectangle rect = new Rectangle(20 ,9);
        column1.insert(rect,4);

        Character A = new Character('A');
        Character B = new Character('B');
        Character C = new Character('C');
        Character D = new Character('D');

        main.insert(row,2);
        Character X = new Character('X');
        Character Y= new Character('R');
        row.insert(X,0);
        row.insert(Y,1);

        column2.insert(A,0);
        column2.insert(B,1);
        column2.insert(C,2);
        column2.insert(D,3);

        System.out.println("main " +main.toString());
        System.out.println("col1 " +column1.toString());
        System.out.println("col2 " +column2.toString());
        System.out.println("a " +a.toString());
        System.out.println("b " +b.toString());
        System.out.println("A " +A.toString());
        System.out.println("B " +B.toString());
        System.out.println("ROW " +row.toString());
        System.out.println("X " +X.toString());
        System.out.println("Y " +Y.toString());

        swingWindow.setContents(main);


    }
}

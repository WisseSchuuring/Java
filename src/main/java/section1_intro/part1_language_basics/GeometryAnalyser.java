package section1_intro.part1_language_basics;

import java.text.NumberFormat;

public class GeometryAnalyser {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        String method = args[4];

        Point p1 = new Point();
        p1.x = x1;
        p1.y = y1;

        Point p2 = new Point();
        p2.x = x2;
        p2.y = y2;

        if (method.equals("surf")){
            Rectangle rectangle = new Rectangle();
            rectangle.upperLeft = p1;
            rectangle.lowerRight = p2;
            System.out.println(rectangle.getSurface());
        }
        else {
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            numberFormat.setMaximumFractionDigits(1);
            System.out.println(numberFormat.format(p1.euclideanDistanceTo(p2)));
        }


        //YOUR CODE HERE
    }
}

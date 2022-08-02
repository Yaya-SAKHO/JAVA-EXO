package Seqence2;

public class TestPoint {

    public static void main(String[] args) {

        Point point00 = new Point();
        Point pointQcq = new Point(4,3);

        point00.affiche();
        pointQcq.affiche();
        System.out.println(point00.getX());
        System.out.println(pointQcq.getY());
        point00.deplaceXY(27,23);
        point00.affiche();



    }
}

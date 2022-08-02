package Seqence2;

public class Cercle {

   private int rayon ;
   public Point centre;


   public Cercle(int monRayon){
      centre = new Point();
      rayon = monRayon;
   }

   public Cercle(int xCentre, int yCentre, int monRayon) {
      centre = new Point(xCentre,yCentre);
      rayon = monRayon;
   }

   public void setRayon(int nouveauRayon) {
      this.rayon = nouveauRayon;
   }

   public int getRayon() {
      return rayon;
   }
   public double getPerimetre(){
      return this.rayon * Math.PI * 2 ;
   }

   public double getSurface(){
      return Math.PI * Math.pow(this.rayon , 2);
   }

   public void deplaceCentre(int dx, int dy){
     centre.deplaceXY(dx,dy);
   }

   public void affiche(){
      System.out.println(toString());
   }

   public String toString() {
      return "Cercle(" + "x=" + this.centre.getX() + ", y=" + this.centre.getY() + ", rayon=" + rayon + ')';
   }
}

package FIGURE;

public class Cercle {
	 private Point centre;                   
     private double rayon; 

     public Cercle(Point c,double r)
     {
    	 this.centre=c;
    	 this.rayon=r;
     }
     public Cercle(Point c,Point p)
     {
        this.centre = c;
        this.rayon=centre.distance(p);
     }
     public double getsurface() {
    	 return Math.PI*rayon*rayon;
     }
     public double getperimetre() {
    	 return 2*Math.PI*rayon;
     }
     public boolean appartient(Point p) {
    	 double d=centre.distance(p);
    	 return(d<=rayon);
     }
    public String toSting() {
    	return ("Cercle("+centre.x+","+centre.y+","+rayon+")");
    }
    public void afficher() {
    	System.out.println("cercle de centre("+centre.x+","+centre.y+") et de rayon "+rayon);
		
	}
}

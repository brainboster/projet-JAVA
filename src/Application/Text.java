package Application;

import FIGURE.Cercle;
import FIGURE.Point;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point (100,100);
		Point p1=new Point(130,100);
		Point p2=new Point(200,200);
		Cercle c1=new Cercle(p,40);
		Cercle c2=new Cercle(p1,p2);
		//Cercle c2=new Cercle(new Point(150,150),new Point(200,200));
		System.out.println("le perimetre du "+c1.toSting()+" est :"+c1.getperimetre());
		System.out.println("la surface du "+c2.toSting()+" est :"+c2.getsurface());
		//Point p1=new Point (130,100);
		if ((c1.appartient(p1)==true)&&(c2.appartient(p1)))
		System.out.println(p.toSting()+ "appartien l'intersection de "+c1.toSting()+" et "+c2.toSting());
		else
		System.out.println(p.toSting()+ "appartien l'intrs de "+c1.toSting()+" et "+c2.toSting());
		c1.afficher();
		c2.afficher();
	}

}

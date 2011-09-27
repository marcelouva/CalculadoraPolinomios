//package calcupol;

 
 /**
 *
 * @author gonza
 */
 
 class Calc {
	
	
	public static void main( String args[] ) {
			
			Calculadora c = new Calculadora();
			// polinomio
			Polinomio p = new Polinomio();
			p.addTermPolinomio(9,3);
			p.addTermPolinomio(6,2);
			p.addTermPolinomio(12,1);
			p.addTermPolinomio(1,4);
			p.addTermPolinomio(5,1);
			System.out.println("POLINOMIO P");
			p.verPolinomio();
			
			// polinomio
			Polinomio q = new Polinomio();
			
			q.addTermPolinomio(12,3);
			q.addTermPolinomio(12,7);
			q.addTermPolinomio(2,5);
			q.addTermPolinomio(2,1);

			
			// suma 1
			Polinomio result = new Polinomio();
			result = c.suma(p,q);
			System.out.println("RES SUMA 1");
			result.verPolinomio();
			//suma 2
			Polinomio result1 = new Polinomio();
			result1 = c.suma(q,p);
			System.out.println("RES SUMA 2");
			result1.verPolinomio();
			
			//Resta
			Polinomio resta = new Polinomio();
			System.out.println("Resta 1");
			q.verPolinomio();
			p.verPolinomio();

			resta = c.resta(q,p);
			System.out.println("RES Resta 1");
			resta.verPolinomio();
			
			
			// multiplicacion
			System.out.println("multiplicacion");
			//H(x) ·  Z(x) = (2x2 − 3) · (2x3 − 3x2 + 4x)
			Polinomio h = new Polinomio();
			// polinomio
			h.addTermPolinomio(2,2);
			h.addTermPolinomio(-3,0);
			//h.verPolinomio();

			// polinomio
			Polinomio z = new Polinomio();
			z.addTermPolinomio(2,3);
			z.addTermPolinomio(-3,2);
			z.addTermPolinomio(4,1);
			//z.verPolinomio();
			// producto
			Polinomio resulMult = new Polinomio();
			resulMult = c.producto(h,z);
			resulMult.verPolinomio();
            
            //suma entre h y z
			Polinomio sumaHyz = new Polinomio();
			sumaHyz = c.suma(h,z);
			System.out.println("RES SUMA h y z");
			sumaHyz.verPolinomio();
            
            
            
            }
}

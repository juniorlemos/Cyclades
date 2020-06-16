import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;



public class Main {

	private static ArrayList<Deus> deuses = new ArrayList();			    
	
	private static Deus zeus = new Deus("zeus");	
	private static Deus hares = new Deus("hares");	
	private static Deus posseidon = new Deus("posseidon");	
	private static Deus atena = new Deus("Atena");	
	private static Deus titan = new Deus ("Titan");
	private static Deus apolo = new Deus("Apolo");
	private static Deus hades = new Deus("Hades");
	private  static int hadesCot=0;
	private static ArrayList<String> semi = new ArrayList();
	
	
	public static void main(String[] args) {

		
		
		 semi.add("afrodite");
		 semi.add("dionisio");
		 semi.add("demeter");
		 semi.add("hefesto");
		 semi.add("hera");
		 semi.add("hermes");
		 semi.add("perserfone");
		 semi.add("hercules");
		 ArrayList<String> bpSemi= semi;

		 
		 
		 
		 deuses.add(zeus);
		 deuses.add(hares);
		 deuses.add(atena);
		 deuses.add(posseidon);
	     deuses.add(titan);

            boolean expHades;
            boolean expTitan;
	        boolean laco = true;
			Scanner entrada = new Scanner(System.in);
			Scanner continua = new Scanner(System.in);

			expHades=true;
			expTitan=true;
			
			
			
			int jogadores=6;
	     
			//System.out.println("Escolha o numero de jogadores");
			//jogadores =entrada.nextInt();
	     switch (jogadores) {
	
	     case 6:
			while (laco) {
				
				System.out.println("digite o numero 1 para continuar");
                jogadores=continua.nextInt();
                 if (jogadores != 1) {
                	 laco = false;
                 }
                 else {
              	    
                	  embaralhar(deuses);
                	  embaralharSemi(semi);
             	     if (hadesCot > 9) {
             	    	 hadesCot=0;
             	    	   for (int i =0 ; i<deuses.size()-1; i++) {
             		    	   System.out.println(deuses.get(i).nome);
             		     }
             	    	   System.out.println(hades.getNome());
             		     System.out.println(apolo.getNome());
             		     semi=bpSemi;
             	     }
             	     else {
             	     System.out.println(hadesCot);	     
             	    

             	     
             	     for (int i =0 ; i<deuses.size(); i++) {
             	    	   System.out.println(deuses.get(i).nome);
             	     }
             	     System.out.println(apolo.getNome());
             	     System.out.println("semideus "+semi.get(0));
             	     semi.remove(0);
             	     }
                 }
				
				
			}
	    	 
			break;
	     case 5:
				 
	    	 
				break;
		default:
			break;
		}
	     
	     
	      
	   
	   
	}
	public static  ArrayList embaralharSemi(ArrayList deuses) {
		Collections.shuffle(deuses);
		dadoHades();
		dadoHades();
	    return deuses;
	}
	
	public static  ArrayList embaralhar(ArrayList deuses) {
		Collections.shuffle(deuses);
	    return deuses;
	}
	public static void dadoHades( ) {
	  int hadnumeros []= {0,1,2,3,1,2};
	  Random random = new Random();
	  int x = random.nextInt(5);
	  hadesCot = hadesCot + hadnumeros[x];
	  
	  System.out.println("valor de hades"+hadesCot);
      
	  
	}
	
	
}

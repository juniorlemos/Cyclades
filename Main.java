import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	private static ArrayList<String> bpSemi = new ArrayList();
	private static boolean entradaHades =true;
	private static List<Deus> aux = new ArrayList();			    

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
			
			
			embaralhar(deuses);
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
	    		
		     
             embaralharSemi(semi);
             
             if (hadesCot >9 ) {
            	             	 
            	 aux.add(deuses.get(deuses.size()-1));
            	 aux.add(deuses.get(deuses.size()-2));
            	 deuses.remove(deuses.get(deuses.size()-1));
            	 deuses.remove(deuses.get(deuses.size()-1));
            	 hadesCot=0;
            	 
            	 
	    		 
            	 
            	 for (int i =0 ; i<deuses.size(); i++) {
    	    		 aux.add(deuses.get(i));
    	    		  
    	    	 }  
            	
            	
            	 
            	 
            	 
            	 for (int i=deuses.size() ; i>0;i--) {
	    			 deuses.remove(i-1);
	    			 
	    		 }
            		 
            	 
            	 for (int i =4 ; i>-1; i--) {
    	    		 deuses.add(aux.get(i));
    	    		  
    	    	 }
            	 
            	 for (int i=semi.size() ; i>0;i--) {
	    			 semi.remove(i-1);
	    			 
	    		 }
            	 
            
            	 for (int i=0; i<bpSemi.size();i++)
        		 {
        			 semi.add(bpSemi.get(i));
        		 }

            	
            	
            	 entradaHades=true;
            	 
            	for (int i =0 ; i<aux.size()-2; i++) {
    	    	 System.out.println(aux.get(i).nome);
    	    		  
    	     } 
            	System.out.println(hades.nome);
            	System.out.println(apolo.nome);
            	
            	for (int i=deuses.size() ; i>0;i--) {
	    			 deuses.remove(i-1);
	    			 
	    		 }
           		 
           	 
           	 for (int i =4 ; i>-1; i--) {
   	    		 deuses.add(aux.get(i));
   	    		  
   	    	 }
           
            	 for (int i=aux.size() ; i>0;i--) {
        			 aux.remove(i-1);
        			 
        		 }
            	 
             }
             
             
             
             
             else {
            		
            	  
            	 
             aux.add(deuses.get(deuses.size()-1));
    		 deuses.remove(deuses.get(deuses.size()-1));
    		 
    		 if (entradaHades==false)
    		 {
             embaralhar(deuses);
    		 }
    		
             for (int i =0 ; i<deuses.size(); i++) {
	         aux.add(deuses.get(i));	 
	    		  
	    	 }
             
            
                  if (entradaHades==true) {
                	  entradaHades=false;  
                	  
                  aux.add(aux.get(0));
                  aux.remove(0);
                  
                  }
	    	
                  
                  
             for (int i=deuses.size() ; i>0;i--) {
	    			 deuses.remove(i-1);
	    			 
	    		 }
	    		             
             for (int i =0 ; i<aux.size(); i++) {
	    		deuses.add(aux.get(i));
	    		  
	    	 } 
             
             
             for (int i =0 ; i<deuses.size()-1; i++) {
	    		 System.out.println(deuses.get(i).nome);
	    		  
	    	 } 
                System.out.println(apolo.nome);    
                System.out.println(semi.get(0));
                semi.remove(0);
                
             for (int i=aux.size() ; i>0;i--) {
    			 aux.remove(i-1);
    			 
    		 }
          
	    		  
	    	 }
             }
	     
	
				break;
				
	  case 4:
 		
		     
          if (hadesCot >9 ) {
         	           	 
         	
         	 aux.add(deuses.get(deuses.size()-1));
         	 aux.add(deuses.get(deuses.size()-2));
         	 deuses.remove(deuses.get(deuses.size()-1));
         	 deuses.remove(deuses.get(deuses.size()-1));
         	 hadesCot=0;
         	  
         	 for (int i =0 ; i<aux.size(); i++) {
     	    	 System.out.println(aux.get(i).nome);
     	    		  
     	     } 
         	 
         	 embaralhar(deuses);
         	  embaralhar(aux);
         	 for (int i =0 ; i<aux.size(); i++) {
 	    		 deuses.add(aux.get(i));
 	    		  
 	    	 }  
         	
         	  
         	 
         	 for (int i=aux.size() ; i>0;i--) {
     			 aux.remove(i-1);
     			 
     		 }
         	
         	 
         	for (int i=semi.size() ; i>0;i--) {
	    		    semi.remove(i-1);
	    			 
	    		 }
         	 
         
         	 for (int i=0; i<bpSemi.size();i++)
     		 {
     			 semi.add(bpSemi.get(i));
     		 }

         	
         	
         	 entradaHades=true;
         	 
          
         	System.out.println(hades.nome);
         	System.out.println(apolo.nome);
        
        
         	 
          }
          
          
          
          
          else {
         		
         	  
	    	 	 
         

          if (entradaHades==true) {
        	  entradaHades=false;  
        	 for (int i =0 ; i<deuses.size()-2; i++) {
	    		 System.out.println(deuses.get(i).nome);
	    		  
	    	 }
        	System.out.println(apolo.nome);    
         System.out.println(semi.get(0));
         semi.remove(0);
        	 
          }
	    	 
          else {
	    	 aux.add(deuses.get(deuses.size()-1));
          aux.add(deuses.get(deuses.size()-2));
          
 		 deuses.remove(deuses.get(deuses.size()-1));
 		 deuses.remove(deuses.get(deuses.size()-1));
 		 
 		
 		 
 		
          embaralhar(deuses);
 		 
 		
 		 
 		 
          for (int i =0 ; i<deuses.size(); i++) {
	         aux.add(deuses.get(i));	 
	    		  
	    	 }
          
         
	    	
               
               
          for (int i=deuses.size() ; i>0;i--) {
	    			 deuses.remove(i-1);
	    			 
	    		 }
	    		             
          for (int i =0 ; i<aux.size(); i++) {
	    		deuses.add(aux.get(i));
	    		  
	    	 } 
          
          
          for (int i =0 ; i<deuses.size()-2; i++) {
	    		 System.out.println(deuses.get(i).nome);
	    		  
	    	 } 
             System.out.println(apolo.nome);    
             System.out.println(semi.get(0));
             semi.remove(0);
             
          for (int i=aux.size() ; i>0;i--) {
 			 aux.remove(i-1);
 			 
 		 }
       
	    		  
	    	 }
          }
	     }
	 	
	
	}
	

	     

		  
         
    	 
			break;
			
			
	  case 3:
		  embaralharSemi(semi);
          
          if (hadesCot >9 ) {
         	 
         	 aux.add(deuses.get(1));
         	 deuses.remove(deuses.get(1));
         	 
         	System.out.println(aux.get(0).nome);
         	 
         	System.out.println(hades.getNome());
         	 
         	System.out.println(apolo.nome);
         	 hadesCot=0;
        
         	 
         	 deuses.add(aux.get(0));
         	 aux.remove(0);

         	 embaralhar(aux);
         	  for (int i=semi.size() ; i>0;i--) {
	    		    semi.remove(i-1);
	    			 
	    		 }
           	 
           
           	 for (int i=0; i<bpSemi.size();i++)
       		 {
       			 semi.add(bpSemi.get(i));
       		 }
         
 		 
          aux.add(deuses.get(0));
          aux.add(deuses.get(1));
          deuses.remove(deuses.get(0));
          deuses.remove(deuses.get(0));
          
 		 for (int i =0 ; i<aux.size(); i++) {
 	         System.out.println("entrada "+aux.get(i).nome);
 	    		  
 	    	 }
 		     System.out.println(apolo.nome);
 		     System.out.println(apolo.nome);    
              System.out.println(semi.get(0));
              semi.remove(0);

 		 for (int i =0 ; i<aux.size(); i++) {
 	         deuses.add(aux.get(i));	 
 	    		  
 	    	 }
 		   
          for (int i=aux.size() ; i>0;i--) {
 			 aux.remove(i-1);
 			 
 		 }
          
           if (reembaralhamento == true)
           {
         	  embaralhar(deuses);
         	  reembaralhamento = false;
           }
         
           else {
           reembaralhamento = true;
           }
          
          }
          }
               
               
          }


			
		  
	         
	    	 
			break;		
		default:
			break;
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

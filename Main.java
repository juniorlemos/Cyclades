import  java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
   
  boolean embaralhar = false;
  int hades = 0;
  int n = 1 ;
 Scanner ler = new Scanner(System.in);
while (true) {
  System.out.printf("digite 0 para continuar");
  n = ler.nextInt();

 if (n == 0) {
embaralhar=true;
}
 


while (embaralhar) {

ArrayList<String> semideuses = new ArrayList<String>();
 semideuses.add("HERA");
 semideuses.add("ARTEMIS");
 semideuses.add("AFRODITE");
 semideuses.add("DIONISIO");
 semideuses.add("HERMES");
semideuses.add("HIPNOS");
 

 ArrayList<String> deuses = new ArrayList<String>();
 deuses.add("ZEUS");
 deuses.add("POSSEIDON");
 deuses.add("ARES");
 deuses.add("ATHENA");
 deuses.add("KRONOS");
deuses.add("TITANS");
  




ArrayList<String> resultado = new ArrayList<String>();
ArrayList<String> novo = new ArrayList<String>();
ArrayList<String> laco = new ArrayList<String>();
// interando a lista do array
ArrayList<String> copia = deuses;
Collections.shuffle(copia);


// 
for (int i=0; i<4; i++){
resultado.add(copia.get(i));

}

novo.add(copia.get(4));
novo.add(copia.get(5));

// primeiro laco

for (int p=0; p<5; p++){
Collections.shuffle(copia);
for(int j=0; j<5; j++){
Collections.shuffle(copia);

for (int i=0;novo.size()<4;i++){
 
 if (!novo.contains(copia.get(i))){
     novo.add(copia.get(i));
}

}

}


//System.out.println(copia + "laco de repeticao");

System.out.println("hades:"+hades);



System.out.println(novo);

for (int i=0;i<6;i++){
 
 if (!novo.contains(copia.get(i))){
     laco.add(copia.get(i));
}

}
novo.clear();
//System.out.println(laco+ "teste");


novo.add(laco.get(0));
novo.add(laco.get(1));

laco.clear();
//System.out.println(novo+ "novo");
}

List<Integer> lista = new ArrayList<Integer>();

lista.add(0);
lista.add(1);
lista.add(1);
lista.add(2);
lista.add(2);
lista.add(3);

Collections.shuffle(lista);

hades = hades + lista.get(1);
System.out.println("numero de hades : "+hades );

 if (hades > 9){

System.out.println("Hades Apareceu !!!" );
hades=0;

}

System.out.println(lista.get(0));
System.out.println(lista.get(1));
System.out.println(lista.get(2));
System.out.println(lista.get(3));
System.out.println(lista.get(4));
System.out.println(lista.get(5));

embaralhar = false ;



}
  }
}
}


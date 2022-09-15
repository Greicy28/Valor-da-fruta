package treinamento;

import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Treinamento {

	public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner teclado=new Scanner(System.in);
System.out.print("Quantas maçãs? ");
double quant=teclado.nextDouble();
double men=0.30;
double desc=0.25;
double reais=quant*men;
double reais2=quant*desc;
Locale localBrasil=new Locale("pt","BR");
String Brasil=NumberFormat.getCurrencyInstance(localBrasil).format(reais2);
String Bra=NumberFormat.getCurrencyInstance(localBrasil).format(reais);

if(quant>=12) {
	System.out.println("O valor ficará:"+Brasil);
    System.out.println("Você teve um desconto de 0.25 centavos em cada maçã! ");
}
else {
	System.out.println("O valor ficará:"+Bra);
    
}	


	}}
	


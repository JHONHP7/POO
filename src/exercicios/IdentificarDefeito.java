package exercicios;

import java.util.Scanner;
public class IdentificarDefeito {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 double x1, y1, x2, y2, distancia;
 
 System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
 x1 = teclado.nextFloat();
 y1 = teclado.nextFloat();
 x2 = teclado.nextFloat();
 y2 = teclado.nextFloat();
 
 distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
 System.out.printf("A distância é: %.2f ", distancia);
 //System.out.println(String.valueOf(distancia).length());
 teclado.close();
 }
}

//	O ERRO OCORRE POIS ESTÁ SENDO DIVIDIDO POR UM 
//	NÚMERO INTEIRO (1/2) SE DIVIDIRMOS POR 0.5 OU 1.0/2.0, TERÁ CASAS DECIMAIS
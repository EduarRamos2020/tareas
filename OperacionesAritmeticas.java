
package ejercisio2;

/**
 *
 * @author EDUAR RAMOS
 */
public class OperacionesAritmeticas {
    //programa para mostrar la suma,resta,multiplicacion y division de cuatro numeros enteros
    
    public static void main(String[]arg){
        
        double numero1=5;
        double numero2=10;
        double numero3=15;
        double numero4=20;
        
        double suma=0;
        double resta=0;
        double multiplicacion=0;
        double division=0;
        
        suma= numero1+numero2+numero3+numero4;
        resta=numero1-numero2-numero3-numero4;
        multiplicacion=numero1*numero2*numero3*numero4;
        
        if(numero2 !=0){
            division= numero1/numero2/numero3/numero4;
        }
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
               
    }
    
}

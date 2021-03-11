
package ejercisio3;

/**
 *
 * @author EDUAR RAMOS
 */
public class VerdareroFalso {
    
    //programa elaborado para saber si las expresiones son verdadero o falso
    //donde: M=6,T=1,K=-10
    // M>T, M+T=7, M-T=1, T/K=-9
    
    public static void main(String[]arg){
        
        double m=6;
        double t=1;
        double k=-10;
        
        double primero=0;
        double segundo=0;
        double tercero=0;
        double cuarto=0;
        
        if (m>t){
            
           System.out.println("La expresion M>T ES VERDADERO  " );
          
        }
        
        segundo= m/t;
        if(segundo==-5){
            System.out.println("La expresion T/K ES VERDADERO  " );
        }
        else{
            System.out.println("La expresion M/T ES FALSO " );
        }
        
        tercero=m+t;
        if(tercero==7){
            System.out.println("La expresion M+T ES VERDADERO " );
        }
        else{
            System.out.println("La expresion M+T ES FALSO  " );
        }
       
        cuarto= m-t;
        if(cuarto==5){
            System.out.println("La expresion M-T ES VERDADERO  " );
        }
        else{
            System.out.println("La expresion M-T ES FALSO  " );
        }
    
        
      
            
        
        
        
                
        
        
    }
}

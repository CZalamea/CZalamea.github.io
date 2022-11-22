public class EjerciciosTema4 {

    
    public static void main(String[] args) {
        
        int numero = 0;
        
        if(numero>0){
            System.out.println("varible a es positiva");        
        }
        else if(numero<0){
                System.out.println("el numero es negativo");
            }
        else {
                System.out.println("el numero es 0");
            }
            
        //int i =0;
        while(numero < 3){
        
            numero++;
            System.out.println("numero" + numero);
        } 
        
        do{ numero++;}
        while(numero<3);{
        
        System.out.println("numero" + numero);
    }
        for(int numero1 = 0;numero1<=3;numero1++){
            
            System.out.println("numero1 " +numero1);
        
        
        }
        String Estacion = "";
        switch(Estacion){
            case "VERANO":
                System.out.println("es verano");
            
            case "INVIERNO":
                System.out.println("es invierno");
            
            case "PRIMAVER":
                System.out.println("es primavera");
                
            case "OTONO":
                System.out.println("es otono");
            
            
        }
    }
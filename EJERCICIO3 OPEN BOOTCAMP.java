public class Main {
    public class Coche {
    
    int puertas;

    public Coche(){
    }
    
    public Coche(int puertas) {
        this.puertas = puertas;
    }
    
    public int Incremento (int puertas){
    
        return puertas++;
    }
}
    
    public  void main(String[] args) {
        
        int a =1;
        int b = 2;
        int c = 3;
        
        suma(a,b,c);
        
        Coche coche1 = new Coche(1);
        
        int name = coche1.puertas;
        System.out.println("Numero de puertas " + name);
        
    }
     public static int suma (int a, int b, int c){
       
       
        return a+b+c;

}
}
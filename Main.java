public class Main{
    
    public static void main(String[] args) {
        //String nombre = null;
        
        Persona persona1 = new Persona();
        
        persona1.setEdad(25);
        persona1.setNombre("Pepito");
        persona1.setTelefono("0958748419");
        
        System.out.println("persona nombre" + persona1.getNombre());
        System.out.println("persona edad" + persona1.getEdad());
        System.out.println("persona telefono" + persona1.getTelefono());
        
    }

}
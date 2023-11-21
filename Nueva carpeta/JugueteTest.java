class JugueteTest {
    public static void main(String[] args) {
        Juguete barbie = new Juguete();
        
        barbie.setAnio(2015);
        barbie.setColor("rosado");
        barbie.setModelo("enfermera");

        System.out.println("El año de esta barbie es:"+barbie.getAnio()+"/"+"El modelo de esta barbie es:"+barbie.getModelo());

        Juguete ken = new Juguete("Azul", "Enfermero");
        System.out.println("El modelo de ken es:"+ken.getModelo()+"/"+"El color de ken es:"+ken.getColor());
    }
  
}
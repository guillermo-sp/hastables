public class Persona {

    //PROPIEDADES
        private String dni;
        private String nombre ;
        private int telefono ;
    //CONSTRUCTORES
        public  Persona(){

        }
        public Persona(String dni, String nombre, int telefono ){
            this.dni = dni ;
            this.nombre = nombre ;
            this.telefono = telefono ;

        }
    //METODOS
        public void ListarPersonas (){
            String mensage ="Nombre %s DNI %s Telefono %s %n";
            System.out.printf(String.format(mensage,getNombre(),getDni(),getTelefono()));
        }
    //GET
        public String getNombre (){
                return  nombre;
        }
        public  String getDni (){
            return dni ;

        }
        public int getTelefono (){
            return telefono;

        }
     //SET
         public void setNombre (String nombre){
                this.nombre = nombre ;
         }
         public void setDni (String dni){
                this.dni = dni;
         }
         public void setTelefono (int telefono){
            this.telefono = telefono ;
         }


    }
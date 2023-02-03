public class Main {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        //Setters Cliente
        miCliente.setEdad(22);
        miCliente.setNombre("Pedro Picapiedra");
        miCliente.setTelefono("867-5309");
        miCliente.setCredito(250000);
        //Getters Cliente
        System.out.println("La edad del cliente es " +miCliente.getEdad()+ " años");
        System.out.println("El nombre del cliente es " +miCliente.getNombre());
        System.out.println("El teléfono del cliente es " +miCliente.getTelefono());
        System.out.println("El crédito disponible del cliente es: " +miCliente.getCredito());

        Trabajador miTrabajador = new Trabajador();
        //Setters Trabajador
        miTrabajador.setEdad(45);
        miTrabajador.setNombre("Johnny Bocacerrada");
        miTrabajador.setTelefono("1122334455");
        miTrabajador.setSalario(5000);
        //Getters Trabajador
        System.out.println("La edad del trabajador es " +miTrabajador.getEdad() + " años");
        System.out.println("El nombre del trabajador es " +miTrabajador.getNombre());
        System.out.println("El teléfono del trabajador es " +miTrabajador.getTelefono());
        System.out.println("El salario del trabajador es " +miTrabajador.getSalario());
    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
}
class Cliente extends Persona{
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}

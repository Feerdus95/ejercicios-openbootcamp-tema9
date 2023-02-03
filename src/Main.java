public class Main {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        //Setters Cliente
        miCliente.setEdad(22);
        miCliente.setNombre("Pedro Picapiedra");
        miCliente.setTelefono("867-5309");
        miCliente.setCredito(250000);
        //Getters Cliente
        System.out.println("Mi nombre es " +miCliente.getNombre()+ ", tengo " +miCliente.getEdad()+ " años, mi teléfono es " +miCliente.getTelefono()+ " y mi crédito disponible es " +miCliente.getCredito()+ " peronios.");

        Trabajador miTrabajador = new Trabajador();
        //Setters Trabajador
        miTrabajador.setEdad(45);
        miTrabajador.setNombre("Johnny Bocacerrada");
        miTrabajador.setTelefono("1122334455");
        miTrabajador.setSalario(5000);
        //Getters Trabajador
        System.out.println("Mi nombre es " +miTrabajador.getNombre()+ ", tengo " +miTrabajador.getEdad()+ " años, mi teléfono es " +miTrabajador.getTelefono()+ " y mi salario es de " +miTrabajador.getSalario()+ " peronios.");

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
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}
class Trabajador extends Persona{
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}

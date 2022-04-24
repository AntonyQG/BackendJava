package practicaMona;

/*
* Para definir a Octocat, que es la clase padre, como caracteristicas (atributos) el nombre, la vestimenta y sus actividades
* Se tendran atributos, constructor, metodos para presentarse
* */

public class Octocat {
    // Atributos
    private String nombre, vestimenta, actividad;

    // Metodos
    public void presentar(String mensaje) {
        System.out.println("Hola desde la case padre Octocat");
    }

    // Cosntructores
    public Octocat() {}

    public Octocat(String nombre, String vestimenta, String actividad) {
        this.nombre = nombre;
        this.vestimenta = vestimenta;
        this.actividad = actividad;
    }

    // Getters
    public String getNombre() { return nombre; }

    public String getVestimenta() { return vestimenta; }

    public String getActividad() { return actividad; }
}

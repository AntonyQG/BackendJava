package practicaMona;

/*
* Para definir a Octocat, que es la clase padre, como caracteristicas (atributos) el nombre, la vestimenta y sus actividades
* Se tendran atributos, constructor, metodos para presentarse
* */

public abstract class Octocat {
    // Atributos
    private String nombre, vestimenta, actividad;

    // Metodos
    public String presentarse(String mensaje) {
        System.out.println("Hola");
        return mensaje;
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

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setVestimenta(String vestimenta) { this.vestimenta = vestimenta; }
    public void setActividad(String actividad) { this.actividad = actividad; }

    // Mostrar estado
    public String showOctocat() {
        return "Nombre: " + nombre +
                "\nVestimenta: " + vestimenta +
                "\nactividad: " + actividad;
    }
}

package practicaHarry;
import java.util.Date;

/*Los personajes que se van a modelar son Harry, Hermione, Ron, Ginny y Albus*/
/*
* Catacteristicas para el modelado:
* Nombre, Genero, Cumpleaños, Sangre (Si es mestizo, nacido de muggles, etc),familia, boggart, patronus, casa
* */

public class Characters {
    // Caracteristicas o atributos
    String nombre;
    String genero;
    String birthday;
    String sangre;
    String boggart;
    String patronus;
    String casa;

    // Constructores
    // Por omision
    public Characters() {}

    // Dandole parametros
    public Characters(String nombre, String genero, String birthday, String sangre, String boggart, String patronus, String casa) {
        this.nombre = nombre;
        this.genero = genero;
        this.birthday = birthday;
        this.sangre = sangre;
        this.boggart = boggart;
        this.patronus = patronus;
        this.casa = casa;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getBirthday() { return birthday; }
    public String getSangre() { return sangre; }
    public String getBoggart() { return boggart; }
    public String getPatronus() { return patronus; }
    public String getCasa() { return casa; }

    // Setters (Solo demostrativo)
    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    // Metodo solo para mostrar estado
    public String showCharacter() {
        return "Nombre: " + nombre +
                "\nGenero: " + genero +
                "\nBirthday: " + birthday +
                "\nSangre: " + sangre +
                "\nBoggart: " + boggart +
                "\nPatronus: " + patronus +
                "\nCasa: " + casa;
    }

}

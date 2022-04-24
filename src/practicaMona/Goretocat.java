package practicaMona;

public class Goretocat extends Octocat{
    public Goretocat() {
        setNombre("Goretocat");
        setVestimenta("Uniforme de los 49ers (Mejor equipo de la NFL)");
        setActividad("Jugar futbol americano, siendo receptor");
    }

    @Override
    public String presentarse(String mensaje) {
        return super.presentarse(mensaje);
    }
}

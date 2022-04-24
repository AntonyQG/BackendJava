package practicaMona;

public class Scubatocat extends Octocat{
    public Scubatocat() {
        setNombre("Scubatocat");
        setVestimenta("Traje de buceador");
        setActividad("Bucear");
    }

    @Override
    public String presentarse(String mensaje) {
        return super.presentarse(mensaje);
    }
}

package practicaMona;

public class Luchadorcat extends Octocat{
    // Constructor de esta clase
    public Luchadorcat() {
        setNombre("Luchadorcat");
        setVestimenta("Máscara y traje de luchador libre");
        setActividad("Luchar");
    }

    @Override
    public String presentarse(String mensaje) {
        return mensaje;
    }
}

package practicaHarry;

public class ShowCharacter {
    public static void main(String[] args) {
        harry();
        hermione();
        ron();
        ginny();
        dumbledore();
    }

    // public Characters(String nombre, String genero, String birthday, String sangre, String boggart, String patronus, String casa) {

    // Construccion de los personajes
    private static void harry() {
        Characters harry = new Characters("Harry Potter", "Masculino", "31 de Julio de 1980", "Half-blood", "Dementor", "Ciervo", "Gryffindor");
        System.out.println(harry.showCharacter());
        System.out.println("************************************");
    }

    private static void hermione() {
        Characters hermione = new Characters("Hermione Granger", "Femenino", "19 de September de 1979", "Muggle-born", "Failure", "Otter", "Gryffindor");
        System.out.println("Nombre: " + hermione.getNombre());
        System.out.println("Genero: " + hermione.getGenero());
        System.out.println("Birthday: " + hermione.getBirthday());
        System.out.println("Sangre: " + hermione.getSangre());
        System.out.println("Boggart: " + hermione.getBoggart());
        System.out.println("Patronus: " + hermione.getPatronus());
        System.out.println("Casa: " + hermione.getCasa());
        System.out.println("************************************");
    }

    private static void ron() {
        Characters ron = new Characters("Ron Weasley", "Masculino", "01 de Marzo de 1980", "Pure-blood", "Aragog", "Jack Russell terrier", "Gryffindor");
        System.out.println(ron.showCharacter());
        System.out.println("************************************");
    }

    private static void ginny() {
        Characters ginny = new Characters("Ginny Weasley", "Femenino", "11 de Agosto de 1981", "Pure-blood", "Lord Voldemort", "Horse", "Gryffindor");
        System.out.println(ginny.showCharacter());
        System.out.println("************************************");
    }

    private static void dumbledore() {
        Characters dumbledore = new Characters("Albus dumbledore", "Masculino", "30 de Junio de 1881", "Half-blood", "Muerte de su hermana Ariana", "Phoenix", "Gryffindor");
        System.out.println(dumbledore.showCharacter());
        System.out.println("************************************");
    }
}

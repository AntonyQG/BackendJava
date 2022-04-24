package practicaMona;

public class ShowOctocat {
    public static void main(String[] args) {
        luchadorcat();
        investcat();
        skatetocat();
        scubatocat();
        saketocat();
        goretocat();
    }

    public static void luchadorcat() {
        Luchadorcat luchador = new Luchadorcat();
        System.out.println(luchador.showOctocat());
        System.out.println(luchador.presentarse("Hola, soy Luchadorcat 🤼‍"));
        System.out.println("**************************");
    }

    public static void investcat() {
        Investcat investcat = new Investcat();
        System.out.println(investcat.showOctocat());
        System.out.println(investcat.presentarse("Hola, soy Investcat 🕵️‍"));
        System.out.println("**************************");
    }

    public static void skatetocat() {
        Skatetocat skatetocat = new Skatetocat();
        System.out.println(skatetocat.showOctocat());
        System.out.println(skatetocat.presentarse("Hola, soy Skatetocat 🛹"));
        System.out.println("**************************");
    }

    public static void scubatocat() {
        Scubatocat scubatocat = new Scubatocat();
        System.out.println(scubatocat.showOctocat());
        System.out.println(scubatocat.presentarse("Hola, soy Scubatocat 🤿"));
        System.out.println("**************************");
    }

    public static void saketocat() {
        Saketocat saketocat = new Saketocat();
        System.out.println(saketocat.showOctocat());
        System.out.println(saketocat.presentarse("Hola, soy Saketocat 🍶"));
        System.out.println("**************************");
    }

    public static void goretocat() {
        Goretocat goretocat = new Goretocat();
        System.out.println(goretocat.showOctocat());
        System.out.println(goretocat.presentarse("Hola, soy Goretocat 🏉"));
        System.out.println("**************************");
    }
}

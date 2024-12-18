public class App {
    public static void main(String[] args) throws Exception {
        Persona carmen = new Persona("Carmen Segarra", 35);
        Persona lucia = new Persona ("Lucia Bertomeu", 42);

        System.out.println(carmen.toString());
        System.out.println(lucia.toString());

        Coche renault = new Coche("CS-2589", 2000);
        Coche seat = new Coche("CO-5475", 1500);


        System.out.println(renault.toString());
        System.out.println(seat.toString());


        //cambio
        System.out.println("Cambio matricula seat");
        seat.setMatricula("CO-5555");

        System.out.println(seat.toString());
    }
}

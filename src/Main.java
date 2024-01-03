public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Fiat", "Panda", 1200, "AB123CD");
        Auto auto2 = new Auto("Opel", "Corsa", 1400, "CA145CD");

        System.out.println("la prima auto è una " + auto1.getMarca() + " " + auto1.getModel() + " con cilindrata " + auto1.getCilindrata() + " e targa " + auto1.getTarga());
        System.out.println("la seconda auto è una " + auto2.getMarca() + " " + auto2.getModel() + " con cilindrata " + auto2.getCilindrata() + " e targa " + auto2.getTarga());
    }
}
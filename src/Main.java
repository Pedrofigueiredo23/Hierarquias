public class Main {
    public static void main(String[] args) {
        Cao cao = new Cao("Luna");
        Gato gato = new Gato("Jade");


        cao.latir();  // Luna está latindo
        cao.emitirSom(); // Som genérico do cão
        gato.miar(); // Jade está miando.
        gato.emitirSom(); // Som genérico do gato

    }
}
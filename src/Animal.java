class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som");
    }
}

class Cao extends Animal {
    public Cao(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(this.nome + " está latindo.");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.println(this.nome + " está miando.");
    }
}
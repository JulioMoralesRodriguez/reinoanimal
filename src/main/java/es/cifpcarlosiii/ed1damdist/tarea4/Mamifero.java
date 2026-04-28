package es.cifpcarlosiii.ed1damdist.tarea4;

public class Mamifero extends Animal {

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.toString());
    }

    public Mamifero(String nombre) {
        super(nombre);
    }
}

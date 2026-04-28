package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un mamifero dentro del reino animal<br>
 * Hereda de la clase {@link Animal} y cambia algunos comportamientos
 */
public class Mamifero extends Animal {
    /**
     * Indica el tipo de reproduccion
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Indica la relacion de un mamifero con otro
     *
     * @param m -> mamifero con el que se relaciona
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.toString());
    }
    /**
     * Crea un mamifero con el nombre indicado
     *
     * @param nombre -> nombre que tendra el mamifero
     */
    public Mamifero(String nombre) {
        super(nombre);
    }
}

package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un gato dentro de la calificacion del mundo animal <br>
 * Hereda de la clase {@link Mamifero} <br>
 * Define comportamientos de los gatos como dormir, maullar y sus relaciones ademas de la cantidad de pelos que tienen
 */
public class Gato extends Mamifero {
    /**
     * Cuantos pelos tiene el gato
     */
    private int pelos;

    /**
     * Muestra por pantalla como duerme el gato
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Muestra por pantalla como maulla el gato
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Muestra por pantalla la relacion de este gato con otro
     *
     * @param g -> Gato con el que se relaciona
     */
    @Override
    void relacionar(Animal g) {
        System.out.println("Con el gato: " + g.toString());
    }

    /**
     * Esto es un getter que devuelve la cantidad de la variable pelos
     *
     * @return pelos -> Cuantos pelos tiene
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Esto es un Setter que marca cuantos pelos tiene el gato
     *
     * @param pelos -> Marca la cantida de pelos
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Crea un gato con el nombre indicado
     *
     * @param nombre -> Nombre del gato
     */
    public Gato(String nombre) {
        super(nombre);
    }
}

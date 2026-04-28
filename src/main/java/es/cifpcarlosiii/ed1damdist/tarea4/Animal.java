package es.cifpcarlosiii.ed1damdist.tarea4;
/**
 * Representa un animal cualquiera
 * Contiene acciones comunes como comer, dormir, reproducirse y relacionarse
 */
public class Animal {
    /**
     * Nombre del animal
     */
    private String nombre;

    /**
     * Muestra por pantalla la accion de comer del animnal
     */
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * Muestra por pantalla la accion de dormir del animal
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Muestra por pantalla la accion de reproducirse del animal
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Muestra por pantalla la relacion de este animal con otro
     *
     * @param a -> animal con el que se relaciona
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     * Crea un animal con el nombre indicado
     *
     * @param nombre -> Nombre del animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del animal
     *
     * @return -> Nombre del animal
     */
    public String toString() {
        return this.getNombre();
    }

    /**
     * Devuelve el nombre del animal
     *
     * @return -> Nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del animal
     *
     * @param nombre -> Nombre nuevo del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

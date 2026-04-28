package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un perro dentro de la clasificacion del reino animal <br>
 * Hereda de la clase {@link Mamifero} <br>
 * Define comportamientos de los perros como dormir, ladrar y gruñir
 */
public class Perro extends Mamifero {

    /**
     * Muestra por pantalla como duerme el perro
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Muestra por pantalla la accion de ladrar
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Muestra por pantalla la accion de gruñir
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Este metodo se utiliza para indicar una relacion con otro
     *
     * @param p -> el perro con el que tiene la relacion
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.toString());
    }
    /**
     * Crea un perro con el nombre indicado
     *
     * @param nombre -> nombre del perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

}

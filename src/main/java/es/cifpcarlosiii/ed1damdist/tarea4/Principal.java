package es.cifpcarlosiii.ed1damdist.tarea4;

public class Principal {

    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal("Tortuga");
        Mamifero mamifero = new Mamifero("Foca");
        Perro perro = new Perro("Lucas");
        Gato gato = new Gato("Mendrugo");
        gato.setPelos(4);

        System.out.println("pelos de gato: " + gato.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = perro;
        array[3] = gato;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}

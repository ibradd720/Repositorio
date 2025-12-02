import java.util.Random;

public class GestionDinero {

    public void gastarDinero(Personaje personaje, int cantidad) {
        if (cantidad <= personaje.getDinero()) {
            personaje.setDinero(personaje.getDinero() - cantidad);
            System.out.println(personaje.getNombre() + " gasta " + cantidad + "$ en ropa nueva.");
        } else {
            System.out.println(personaje.getNombre() + " no tiene suficiente dinero.");
        }
    }

    public void ganarDinero(Personaje personaje, int cantidad) {
        personaje.setDinero(personaje.getDinero() + cantidad);
        System.out.println(personaje.getNombre() + " gana " + cantidad + "$.");
    }

    public void subirNivel(Personaje personaje) {
        personaje.setNivel(personaje.getNivel() + 1);
        System.out.println(personaje.getNombre() + " sube al nivel " + personaje.getNivel() + "!");
    }

    public void cambiarNombre(Personaje personaje, String nuevoNombre) {
        System.out.println(personaje.getNombre() + " ahora se llama " + nuevoNombre + ".");
        personaje.setNombre(nuevoNombre);
    }

    public void randomMission(Personaje personaje) {

        String[] misiones = {
            "Entregar paquetes",
            "Drogarse con unas npcs",
            "Robar un coche",
            "Ir a la tienda de tacones",
            "Matar a los negratas que me caigan mal"
        };

        Random random = new Random();
        int indice = random.nextInt(misiones.length);

        System.out.println(personaje.getNombre() +
                " recibe una misión aleatoria: \"" + misiones[indice] + "\".");
    }
}




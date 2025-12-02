public class Personaje {

    private String nombre;
    private int dinero;
    private int nivel;

    public Personaje(String nombre, int dinero, int nivel) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public int getNivel() {
        return nivel;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dinero: " + dinero + "$");
        System.out.println("Nivel: " + nivel);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Personaje jugador = new Personaje("Trevor", 500, 1);
        GestionDinero gestion = new GestionDinero();

        jugador.mostrarInfo();

        gestion.gastarDinero(jugador, 100);    
        gestion.subirNivel(jugador);           
        gestion.cambiarNombre(jugador, "Mike"); 
        gestion.randomMission(jugador);        

        jugador.mostrarInfo();
    }
}







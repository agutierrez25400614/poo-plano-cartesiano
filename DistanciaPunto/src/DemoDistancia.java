
/**
 * Clase DemoDistancia — clase principal de demostración.
 * Subtema 2.2 — Instanciación de objetos Punto y Distancia.
 * Subtema 2.4 — Paso de objetos como argumentos (paso por referencia).
 */
public class DemoDistancia {

    public static void main(String[] args) {
// Subtema 2.2 — Instanciación de objetos Punto
        Punto puntoA = new Punto("A", 3, -5);
        Punto puntoB = new Punto("B", -2, 6);
        Punto puntoC = new Punto("C", 0, 0); // Origen
        Punto puntoD = new Punto("D", 4, 4);
// Mostrar la representación toString() de cada punto
        System.out.println("--- Puntos creados ---");
        System.out.println(puntoA); // A(3,-5)
        System.out.println(puntoB); // B(-2,6)
        System.out.println(puntoC); // C(0,0)
        System.out.println(puntoD); // D(4,4)

    
}
    }

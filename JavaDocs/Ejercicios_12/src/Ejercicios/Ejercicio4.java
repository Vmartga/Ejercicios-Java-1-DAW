package Ejercicios;

public class Ejercicio4 {

    
    enum Talla {pequeña, mediana, grande, extra_grande}

    public static void main(String[] args) {

        
        Talla talla1 = Talla.pequeña;
        Talla talla2 = Talla.mediana;
        Talla talla3 = Talla.grande;
        Talla talla4 = Talla.extra_grande;

        
        System.out.println("La primera talla es: " + talla1);
        System.out.println("La segunda talla es: " + talla2);
        System.out.println("La tercera talla es: " + talla3);
        System.out.println("La cuarta talla es: " + talla4);
    }
}

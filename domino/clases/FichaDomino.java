package clases;

public class FichaDomino {
    private int ladoIzquierdo;
    private int ladoDerecho;

    // creo el constructor
    public FichaDomino(int ladoIzquierdo, int ladoDerecho) {
        this.ladoDerecho = ladoDerecho;
        this.ladoIzquierdo = ladoIzquierdo;
    }

    // creo los métodos:
    public void voltear() {
        int temporal = this.ladoDerecho;
        this.ladoDerecho = ladoIzquierdo;
        this.ladoIzquierdo = temporal;
    }

    // duevulve true si pueden encajar, si no, devulve false
    public boolean encaja(FichaDomino otra) {
        // posibles combinaciones; :D una vez estan puestas
        // derecho derecho :D
        // derecho izq :D
        // izq izq
        // izq derecho
        if (ladoDerecho == otra.ladoDerecho ||
                ladoDerecho == otra.ladoIzquierdo ||
                ladoIzquierdo == otra.ladoIzquierdo ||
                ladoIzquierdo == otra.ladoDerecho) {
            return true;
        } // este es el if
        else {
            return false;
        }
    }

    // el to String
    @Override
    public String toString() {
        String izq;
        String der;
        if (this.ladoIzquierdo == 0) {
            izq = " ";
        } else {
            izq = "" + this.ladoIzquierdo;
        }
        if (this.ladoDerecho == 0) {
            der = " ";
        } else {
            der = "" + this.ladoDerecho;
        }
        return "[" + izq + "|" + der + "]";
    }
}

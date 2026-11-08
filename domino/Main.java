import clases.FichaDomino;
public class Main{
    public static void main(String[] args) {
        //creo las fichaas
        FichaDomino ficha1 = new FichaDomino(6, 1);
        FichaDomino ficha2 = new FichaDomino(0, 4);
        FichaDomino ficha3 = new FichaDomino(3, 3);
        FichaDomino ficha4 = new FichaDomino(0, 1);
        
        //hago lo que me pide el ejercicio
        //por el ToString lo pongo así
        System.out.println(ficha1);
        System.out.println(ficha2);
        System.out.println(ficha3);
        System.out.println(ficha4);
        ficha2.voltear();
        System.out.println(ficha2);
        System.out.println("Ficha 1 con ficha 4: " + ficha1.encaja(ficha4));
        System.out.println("Ficha 1 con ficha 3: " + ficha1.encaja(ficha3));
        System.out.println("Ficha 1 con ficha 2: " + ficha1.encaja(ficha2));
    
    }
}
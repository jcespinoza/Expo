enum NumeroCarta{
    AS(1, "As"), DOS(2, "Dos"), TRES(3, "Tres"),
    CUATRO(4, "Cuatro"), CINCO(5, "Cinco"), SEIS(6, "Seis"),
    SIETE(7, "Siete"), OCHO(8, "Ocho"), NUEVE(9, "Nueve"),
    DIEZ(10, "Diez"), JACK(11, "Jack"), REYNA(12, "Reyna"), REY(13, "Rey");
    private int numero;
    private String nombre;
    
    private NumeroCarta(int orden, String nom){
        numero = orden;
        nombre = nom;
    }

    public String nombre(){
        return this.nombre;
    }
    public int toInt(){
        return this.ordinal() + 1;
    }
}

enum SimboloCarta{
    PICAS("Picas"), CORAZONES("Corazones"),
    DIAMANTES("Diamantes"), TREBOLES("Treboles");
    
    private String nombre;
    private SimboloCarta(String nom){
        nombre = nom;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}

class Carta{
    SimboloCarta simb;
    NumeroCarta num;
    
    public Carta(SimboloCarta s, NumeroCarta n){
        this.simb = s;
        this.num = n;
    }

    public Carta(int s, int n){
        this.num = NumeroCarta.values()[n - 1];
        this.simb = SimboloCarta.values()[s];
    }

    public static void main(String[] args){
        Carta c1 = new Carta(SimboloCarta.CORAZONES, NumeroCarta.AS);
        Carta c2 = new Carta(0, 5);

        System.out.println("La carta c1 es un " + c1.num.name() + " de " + c1.simb.toString());
        System.out.println("La carta c2 es un " + c2.num.nombre() + " de " + c2.simb.toString());
        System.out.println("El valor de la constante \"PICAS\" en SimboloCarta es: " + SimboloCarta.valueOf("PICAS"));
        System.out.println("El valor del Seis de Corazones es: " + ( new Carta(1,6).num.toInt()) );
    }
}
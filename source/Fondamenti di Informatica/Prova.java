public class Prova{
    public static void main (String args[]) {
        boolean primo = true;
        boolean secondo = true;
        boolean risultatoA = secondo || primo && !secondo;
        System. out.println(risultatoA);
        boolean risultatoB = (secondo || primo) && !secondo;
        System. out.println(risultatoB);
        boolean sonoUguali = risultatoA == risultatoB;
        System. out.println("Le due operazioni danno lo stesso risultato: " + sonoUguali);
    }
}
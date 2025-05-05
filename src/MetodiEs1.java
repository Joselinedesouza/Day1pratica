public class MetodiEs1 {
    public static int moltiplica(int a,int b){
        return a*b;
    }
    public static String concateno(String testo , int numero){
        return testo + numero;
    }
    public static String[] InserisciInArray(String[] array, String nuovaStringa){
        String[] nuovoArray= new String[6];

        nuovoArray[0]= array [0];
        nuovoArray[1]= array [1];
        nuovoArray[2]= nuovaStringa;
        nuovoArray[3]= array[2];
        nuovoArray[4]= array[3];
        nuovoArray[5]= array[4];
        return nuovoArray;
    }
    public static void main(String[] args){
        int risultato= moltiplica(3,4);
        System.out.println(risultato);

        String concateno = ("Risultato finale: " + risultato);
        System.out.println(concateno);

        String[] arrayIniziale = {"ho","bisogno","di","andare","in VACANZE!"};
        String[] nuovoArray= InserisciInArray(arrayIniziale,"ORA:");
        for (String elem: nuovoArray) {
            System.out.println(elem);
        }
    }
}

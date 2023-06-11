
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika kristian = new Matematika (5, 7);
        
        System.out.println("Hasil dari Pertambahan = "+kristian.setPenjumlahan());
        System.out.println("Hasil dari Pengurangan = "+kristian.setPengurangan());
        System.out.println("Hasil dari Perkalian = "+kristian.setPerkalian());
        System.out.println("Hasil dari Pembagian = "+kristian.setPembagian());
    }
}

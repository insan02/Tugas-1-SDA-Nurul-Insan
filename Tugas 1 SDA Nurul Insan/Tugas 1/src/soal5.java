import java.util.ArrayList;

public class soal5 {

    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("N");
        nama.add("S");
        nama.add("A");
        nama.add("N");

        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut:
        //remove(0), remove(3),remove(2)

        nama.remove(0);
        System.out.println("Hasil remove(0) = " + nama);

        nama.remove(3);
        System.out.println("Hasil remove(2) = " + nama);

        nama.remove(2);
        System.out.println("Hasil remove(3) = " + nama);

    }
}

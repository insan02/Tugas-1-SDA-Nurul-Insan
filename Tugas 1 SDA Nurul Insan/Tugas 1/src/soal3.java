import java.util.ArrayList;

public class soal3 {

    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("N");
        nama.add("S");
        nama.add("A");
        nama.add("N");

        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut:
        //get(0), get(2),get(6),get(-3)

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
    }
}

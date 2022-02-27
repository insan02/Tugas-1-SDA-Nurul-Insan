import java.util.ArrayList;

public class soal4 {

    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("N");
        nama.add("S");
        nama.add("A");
        nama.add("N");

        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut:
        //indexOf(a),indexOf(c),indexOf(q)

        System.out.println(nama.indexOf("A"));
        System.out.println(nama.indexOf("C"));
        System.out.println(nama.indexOf("Q"));
    }
}


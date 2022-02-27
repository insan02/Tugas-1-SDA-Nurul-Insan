import java.util.ArrayList;
public class soal6 {
    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("N");
        nama.add("S");
        nama.add("A");
        nama.add("N");

        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut:
        //add(0,e),add(2,f),add(3,g),add(4,h),add(6,h),add(-3,j)

        nama.add(0,"E");
        System.out.println("Element setelah string E di indeks 0 ditambahkan: " + nama);

        nama.add(2,"F");
        System.out.println("Element setelah string F di indeks 2 ditambahkan: " + nama);

        nama.add(3,"G");
        System.out.println("Element setelah string G di indeks 3 ditambahkan: " + nama);

        nama.add(4,"H");
        System.out.println("Element setelah string H di indeks 4 ditambahkan: " + nama);

        nama.add(6,"H");
        System.out.println("Element setelah string H di indeks 6 ditambahkan: " + nama);

        nama.add(-3,"J");
        System.out.println("Element setelah string J di indeks -3 ditambahkan: " + nama);
    }
}

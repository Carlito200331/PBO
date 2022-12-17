
// membuat class dengan sebagai template
class mahasiswa{
    String nama ;
    String NIM;
    String jurusan;
}

public class App {
    public static void main(String[] args) throws Exception {
       //menginisialisasi / membuat object dengan nama "mahasiswa1"
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "asep";
        mahasiswa1.NIM = "22241";
        mahasiswa1.jurusan = "elektro";

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa1.nama = "carlito";
        mahasiswa1.NIM = "22251";
        mahasiswa1.jurusan = "elektro";

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
    }
}

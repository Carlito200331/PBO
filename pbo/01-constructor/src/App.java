class mahasiswa{
    // data member
    String nama;
    int NIM;
    String jurusan;

    // constructor dibuat saat object pertama kali dibuat
    // constructor dengan parameter
    mahasiswa(String inputnama, int inputNIM, String inputjurusan){
        nama = inputnama;
        NIM = inputNIM;
        jurusan = inputjurusan;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
       mahasiswa mahasiswa1 = new mahasiswa("carlito", 221398, "elektro");
       System.out.println(mahasiswa1.nama);
       System.out.println(mahasiswa1.NIM);
       System.out.println(mahasiswa1.jurusan);

       mahasiswa mahasiswa2 = new mahasiswa("eminem", 221399, "elektro");
       System.out.println(mahasiswa2.nama);
       System.out.println(mahasiswa1.NIM);
       System.out.println(mahasiswa1.jurusan);
    }
}

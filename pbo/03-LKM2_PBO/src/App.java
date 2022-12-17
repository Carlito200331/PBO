class mahasiswa{
    String nama;
    int angkatan;
    String asal;
    

    mahasiswa(){
        nama = "arif";
        angkatan = 2022;
        asal = "padang";
    }

    void ubah(String nm, int ang, String as){
        nama = nm;
        angkatan = ang;
        asal = as;
    }

    void cetak(){
        System.out.println("nama : " + nama);
        System.out.println("angkatan : " + angkatan);
        System.out.println("asal : " + asal);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa MHS = new mahasiswa();

        MHS.cetak();
        MHS.ubah("ebel", 2021, "medan");
        MHS.cetak();
    }
}

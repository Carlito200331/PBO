
class motor{
    String merk;
    int tahun;
    String nopolisi;
    String warna;

    motor(String merk, int tahun, String nopolisi, String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.nopolisi = nopolisi;
        this.warna = warna;
    }

    void showinfomotor(){
        System.out.println("merk : " + merk);
        System.out.println("tahun : " + tahun);
        System.out.println("nopolisi : " + nopolisi);
        System.out.println("warna : " + warna);
    }
}

public class motorku {
    public static void main(String[] args) {
        motor motor1 = new motor("Yamaha/king", 1989, "DK 34526", "Hitam");

        motor1.showinfomotor();
    }
}

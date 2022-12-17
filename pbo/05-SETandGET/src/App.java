
class ling{
    private double diameter;


    public ling( double diameter){
        this.diameter = diameter;
    }


    //membuat method setter untuk mengubah nilai diameter
    public void setDiameter( double diameter){
        this.diameter = diameter;
    }


    //membuat method getter untuk mendapatkan nilai jari2
    public double getJari2(){
        return this.diameter/2;
    }
    
    //membaut method getter untuk menghitung luas lingkaran
    public double getHitungLuas(){
        return 3.14*getJari2()*getJari2();

    }

    //membuat method getter untuk mencari keliling lingkaran
    public double getKeliling(){
        return 2 * 3.14 * getJari2();
    }

    public void display(){
        System.out.println("jari-jari : " + getJari2());
        System.out.println("Luas lingkaran : " + getHitungLuas());
        System.out.println("Keliling Lingkaran : " + getKeliling());
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        ling  lingkaran1 = new ling(13.8);
        lingkaran1.display();

    }
}

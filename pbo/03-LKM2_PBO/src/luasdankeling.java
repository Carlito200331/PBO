
class lingkaran{
    double L;
    double K;
    double phi = 3.14;
    double r;

    void setR(double r){
        this.r = r;
    }

    double luas(){
        return this.L = this.phi * this.r * this.r;
    }

    double keliling(){
        return 2 * phi * r;
    }
}

public class luasdankeling {
    public static void main(String[] args) {
        lingkaran ling = new lingkaran();
        ling.setR(15.0);
        System.out.println("luas lingkaran = " +ling.luas());
        System.out.println("keliling lingkaran = " + ling.keliling());
    }
}

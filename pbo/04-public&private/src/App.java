class player{
    // modifier public akan membuat member class bisa di akses dari mana saja
    public String nama;

    //modifier akan membuat member hanya bisa di akses oleh dari class itu sendiri
    private double power;

    player(String nama, double power){
        this.nama = nama;
        this.power = power;
    }

    void display(){
        System.out.println("nama player : "+this.nama);
        System.out.println("power : " + this.power);
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        player player1 = new player("carlito", 56.0);

        player1.display();
    }
}

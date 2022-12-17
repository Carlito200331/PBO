
class mahasiswa{
    //data member
    String nama;
    int NIM;
    String jurusan;

    // constructor
    mahasiswa(String nama, int NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("nama : " + this.nama );
        System.out.println("NIM : " + this.NIM);
        System.out.println("jurusan : " + this.jurusan);
    }

    //method tanpa return dengan parameter
    void showmhs(String nama, int NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    //method dengan return tanpa parameter
    String getNAMA(){
        return this.nama;
    }

    int getNIM(){
        return this.NIM;
    }

    //method dengan return dan dengan parameter
    String ucapSALAM(String dialog){
        return dialog + "hola, apa kabar semuanya. nama saya : " + this.nama;

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa mahasiswa1 = new mahasiswa("ice cube", 66489, "elektro");
        
        mahasiswa1.show();
        mahasiswa1.showmhs("snoop dog", 66490, "elektro");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNAMA());
        System.out.println(mahasiswa1.getNIM());
    
        String kata = mahasiswa1.ucapSALAM("wiii !! ");
        System.out.println(kata);
    }
}

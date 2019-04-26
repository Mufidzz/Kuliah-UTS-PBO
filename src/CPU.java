public class CPU {
    protected String nama;
    protected int kecepatan;

    CPU(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public CPU() {
    }

    public String getCPUData(){
        return nama + " " + kecepatan + " GHz";
    }
}

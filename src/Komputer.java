public class Komputer {
    private CPU cpu;

    Komputer(CPU cpu){
        this.cpu = cpu;
    }

    Komputer(){}

    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU: " + this.cpu.getCPUData() + " dipasang");
    }

    public void mencabut(){
        System.out.println("CPU: " + this.cpu.getCPUData() + " dicabut");
        this.cpu = null;
    }

    public void cetakInfo(){
        System.out.println("Spesifikasi: CPU: " + this.cpu.getCPUData());
    }
}

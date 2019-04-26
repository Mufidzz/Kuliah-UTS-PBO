public class AMD extends CPU{
    AMD(int kecepatan){
        super.nama = this.getClass().getSimpleName();
        super.kecepatan = kecepatan;
    }
}

public class Intel extends CPU{
    Intel(int kecepatan){
        super.nama = this.getClass().getSimpleName();
        super.kecepatan = kecepatan;
    }
}

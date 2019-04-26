public class Rakitan {
    public static void main(String[] args) {
        CPU intel1 = new Intel(2);
        CPU amd1 = new AMD(3);
        Komputer komputer1 = new Komputer(intel1);

        komputer1.cetakInfo();
        komputer1.mencabut();
        komputer1.memasang(amd1);
        komputer1.cetakInfo();

    }
}

public class Main {
    public static void main(String[] args) {
        int bmi;
        double mass = 98; // вес телa в кг
        double height = 1.87; // рост в метрaх
        BmiService service = new BmiService();

        double indexMy = service.calculate(height, mass);
        int index = (int) indexMy;
        System.out.println("Индекс массы тела" + index);
    }
}
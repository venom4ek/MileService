public class Main {
    public static void main(String[] args) {
        MileService mileService = new MileService();
  //      int price = 15_000_00; // цена с копейками
        int miles = mileService.calculate(15_000_00); // price можно указывать сразу сюда
        int miles1 = mileService.calculate(25_000_00);
     System.out.println(miles);
     System.out.println(miles1);
    }
}

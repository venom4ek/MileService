public class MileService {
    public int calculate(int price){
        int bonus = 5; // бонус, начислемый за каждые 20 рублей = 1 миля
        int miles = bonus * price /100 /100; // расчет полученных миль

        return miles;
    }
}

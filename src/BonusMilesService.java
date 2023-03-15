public class BonusMilesService {
    public int calculate(int price, int amount) {

        int miles = price / amount;
        return miles;
    }
}

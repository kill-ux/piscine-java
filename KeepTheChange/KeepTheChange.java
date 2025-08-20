import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coinsSet) {
        List<Integer> list = new ArrayList<>();
        List<Integer> coins = new ArrayList<>(coinsSet);
        coins.sort((a, b) -> b.compareTo(a));
        int len = coins.size();
        for (Integer coin : coins) {
            while (coin <= amount) {
                list.add(coin);
                amount -= coin;
                if (amount == 0) {
                    break;
                }
            }
        }

        return list;
    }
}
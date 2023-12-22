package homeWork3.ex4;

public class LotteryTicket {
    public static int counter = 0;

    public int checkWin() {
        counter++;
        if (counter % 100 == 0) {
            return 5000;
        } else if (counter % 10 == 0) {
            return 100;
        }
        return 0;
    }
}

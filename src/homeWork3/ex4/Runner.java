package homeWork3.ex4;

public class Runner {
    public static void main(String[] args) {
       int countTickets = 110;
        LotteryTicket[] lotteryTickets = new LotteryTicket[countTickets];
        for (int i = 0; i < countTickets; i++) {
            lotteryTickets[i] = new LotteryTicket();
        }
            int winSum = 0;
        for (int i = 0; i < lotteryTickets.length; i++) {
          winSum += lotteryTickets[i].checkWin();
        }
        System.out.println("Выигрыш составил: " + winSum );
    }

}
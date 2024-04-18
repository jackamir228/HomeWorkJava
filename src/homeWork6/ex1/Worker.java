package homeWork6.ex1;

import java.util.Queue;
public class Worker {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void dropCases(Queue<Caseplane> caseplanes) {
        System.out.printf("\n%s: Мужики, кидаю чемодан ", name + caseplanes.poll().getFlightNumber() + "  \n");
    }
}






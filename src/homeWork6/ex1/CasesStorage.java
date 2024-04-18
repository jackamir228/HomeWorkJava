package homeWork6.ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CasesStorage {
    private Queue<Caseplane> caseplanes = new LinkedList<>();
    private final List<Worker> workers = List.of(
            new Worker("Петр"),
            new Worker("Александр"),
            new Worker("Дмитрий")
    );

    public void planeArrival(String flightNumber ) {
        for (int i = 0; i < 20; i++) {
            caseplanes.add(new Caseplane(flightNumber));
        }
    }

    public void unloadCases() {
        while (!caseplanes.isEmpty()) {
            unloadHelper();
        }

    }
    private void unloadHelper() {
        for(Worker worker : workers) {
            worker.dropCases(caseplanes);
            if (caseplanes.isEmpty()) {
                return;
            }
        }
    }
}

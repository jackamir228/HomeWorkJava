package homeWork6.ex1;

//Создать раннер, в нем багажное отделение. Организовать два прилета SU-077, AO-222.
//Разгрузить багажное отделение. Сначала должны выйти чемоданы su-077, потом ao-222.
public class Runner {
    public static void main(String[] args) {
        Caseplane caseplane1 = new Caseplane("SU-077");
        Caseplane caseplane2 = new Caseplane("AO-222");
        CasesStorage casesStorage = new CasesStorage();
        casesStorage.planeArrival("SU-077");
        casesStorage.planeArrival("AO-222");
        casesStorage.unloadCases();
    }


}

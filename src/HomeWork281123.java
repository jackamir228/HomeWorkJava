public class HomeWork281123 {
        public static void main(String[] args) {
            ex1();
            ex2();
            ex3();
            ex4();
        }

        public static void ex1() {
            //Дана строка
            String name = "     ПЕтРов Олег Иванович     ";
            //Необходимо
            //1. убрать лишние пробелы,
            //2. перевести текст в верхний регистр
            //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
            // Если содержит "ов " то печатаем на экран: Уважаемый {name}
            // В иных случаях печатаем на экран: Неизвестное лицо {name}

            //обрезка пробелов
            System.out.println(name.trim( ));

            //перевод текста в нижний регистр
            System.out.println(name.toLowerCase());

            if (name.contains("ова")) {
                System.out.println("Уважаемая " + name);
            } else if (name.contains("ов")) {
                System.out.println("Уважаемый " + name);
            } else {
                System.out.println("Неизвестное лицо " + name);
            }
        }

        public static void ex2() {
            //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
            //Количество топлива
            double fuel = 10;
            //Проверка двигателя
            boolean isEngineWork = true;
            //Проверка отсутствия ошибок (false - ошибок нет)
            boolean hasErrors = false;
            //Датчики давления шин
            boolean isWheelWork1 = true;
            boolean isWheelWork2 = true;
            boolean isWheelWork3 = true;
            boolean isWheelWork4 = true;

            // общая переменная для всех проверки работоспособности всех шин
            boolean isWorkAllWheels = isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4;

            //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
            // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
            //В ином случае, машина не должна запускаться

            if ((fuel >= 10 && isEngineWork && isWorkAllWheels && (hasErrors == false))) {
                System.out.println("Машина работает");
            } else {
                System.out.println("Машина не работает");
            }
        }

        public static void ex3() {
            //Работа на самостоятельное изучение методов.
            //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
            //Распечатать полученный индекс
            String simply = String.valueOf("this is simply. This is my favorite song."
                    .replaceAll("this is","those are")
                    .replaceAll("This is", "Those are"));

            System.out.println(simply.charAt(20));


        }

        public static void ex4() {
            //Компания Рога и Копыта производит мясные продукты.
            //Перечень производимых товаров :

            //Колбаса - стоимость 800 руб,
            //себестоимость при производстве меньше 1000 кг - 412руб,
            //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
            //себестоимость при производстве от 2000кг - 404 руб
            //Ветчина - стоимость 350 руб
            //себестоимость при производстве - 275 руб

            //Шейка - стоимость 500 руб
            //себестоимость при производстве меньше 500кг - 311 руб
            //себестоимость при производстве больше или равно 500кг - 299 руб

            //Финансовые показатели
            //Доход компании считается как умножение стоимости на количество проданных кг
            //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
            //Прибыль до налогов считается как: доход - расход

            //Налоги считаются так:
            // прибыль до налогов больше 2_000_000, облагается ставкой 13%
            // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
            // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
            //пример расчета налогов для прибыли до налогов 2_500_000:

            //1_000_000 - налог 80_000 - по ставке 8%
            //1_000_000 - налог 100_000 - по ставке 10%
            //500_000 - 65_000 - по ставке 13%
            //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
            //Прибыль после налогов: прибыль до налогов - налог.

            //Необходимо создать универсальную систему расчетов прибыли после налогов,
            //Т.е на вход подаются данные по количеству произведенных продуктов
            // и печатается прибыль после налогов компании
            //Узнать прибыль после налогов, при продаже:
            //Колбасы 2000кг
            //Ветчины 8511кг
            //Шейки 6988кг


            int numberOfSausages = 2000; //количество колбас
            int priceOfSausages = 800; //цена колбасы
            int costPriceSausages = 0; //себестоимость колбасы
            int amountOfSausagesSold = 0; //сумма проданных сосисок
            int sausageProductionCostsTotal = 0; //сумма издержек колбасы
            int sausagesResult = 0; //доход от колбасы

            int numberOfHam = 8511; //количество ветчины
            int priceOfHam = 350; //цена ветчины
            int costPriceOfHam = 275; //cебестоимость ветчины
            int amountHamSold = priceOfHam * numberOfHam; //сумма проданной ветчины
            int hamProductionCostsTotal = numberOfHam * costPriceOfHam;  //сумма издержек

            int numberOfPorkNeck = 6988; //цена шейки
            int priceOfPorkNeck = 500; //цена шейки
            int costPriceOfPorkNeck = 0; //себестоимость шейки
            int amountPorkNeckSold = 0; //сумма всей проданной шейки
            int porkNeckProductionCostsTotal = 0; //сумма издержек шейки
            int porkNeckResult = 0; //доход от шейки

            //считаю доходы и расходы в зависимости от объема продукции
            if (numberOfSausages < 1000) {
                costPriceSausages = 412;
                amountOfSausagesSold = numberOfSausages * priceOfSausages;
                sausageProductionCostsTotal = numberOfSausages * costPriceSausages;


            } else if ((numberOfSausages >1000) && (numberOfSausages < 2000)) {
                costPriceSausages = 408;
                amountOfSausagesSold = numberOfSausages * priceOfSausages;
                sausageProductionCostsTotal = numberOfSausages * costPriceSausages;

            } else if (numberOfSausages >= 2000) {
                costPriceSausages = 404;
                amountOfSausagesSold = numberOfSausages * priceOfSausages;
                sausageProductionCostsTotal = numberOfSausages * costPriceSausages;
            }

            //себестоимость шейки в зависимости от количества произв-ой шейки
            if (numberOfPorkNeck < 500 ) {
                costPriceOfPorkNeck = 311;
                amountPorkNeckSold = numberOfPorkNeck * priceOfPorkNeck;
                porkNeckProductionCostsTotal = numberOfPorkNeck * costPriceOfPorkNeck;

            } else if (numberOfPorkNeck > 500) {
                costPriceOfPorkNeck = 299;
                amountPorkNeckSold = numberOfPorkNeck * priceOfPorkNeck;
                porkNeckProductionCostsTotal = numberOfPorkNeck * costPriceOfPorkNeck;
            }

            //подсчет доходов и расходов до вычета налога

            int mandatoryExpenses = 1_000_000;
            int allCosts = sausageProductionCostsTotal + hamProductionCostsTotal + porkNeckProductionCostsTotal;
            int allAmountSold = amountOfSausagesSold + amountHamSold + amountPorkNeckSold;
            int resultBeforeTax = allAmountSold - (allCosts + mandatoryExpenses );


            //подсчет доходов после вычета налога
            int taxSum = 0;
            int finalResult = 0;

            if (resultBeforeTax > 2_000_000) {

                taxSum = (int) (resultBeforeTax * 0.13);
                finalResult = resultBeforeTax - taxSum;

            } else if (resultBeforeTax < 2_000_000) {

                taxSum = (int) (resultBeforeTax * 0.1);
                finalResult = resultBeforeTax - taxSum;

            } else if (resultBeforeTax < 1_000_000) {

                taxSum = (int) (resultBeforeTax * 0.8);
                finalResult = resultBeforeTax - taxSum;
            }
            System.out.println("Доход компании после вычета налогов: " + finalResult);
            System.out.println("Cумма налога: " + taxSum);



        }
    }


package homework7.ex4;
//Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
//любого типа.
public interface Burn<T> {
    T burning(T t);

}

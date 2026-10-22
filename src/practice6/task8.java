package practice6;

public class task8 {
    String name;

    public static void main(String[] args) {
        task8 first = new task8();
        first.name = "Іван";

        task8 second = first;

        second.name = "Петро";

        System.out.println(first.name);
        // Змінна first.name також змінилася на "Петро", оскільки змінні
        // об'єктного типу в Java зберігають посилання на область в пам'яті.
        // Змінні first і second посилаються на один і той самий об'єкт,
        // тому зміна поля через одне посилання впливає на цей же об'єкт для іншого.
    }
}

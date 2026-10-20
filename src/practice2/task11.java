package practice2;

public class task11 {
    public static void main(String[] args) {
        int a = 22;
        int b = 13;
        System.out.println("Сума без дужок " + a + b);
//    виводиться 2213 тому що система сприйняла це не як математичний приклад через текстове значення на початку
        System.out.println("Сума з дужками " + (a + b));
//    тепер виводиться сума тому що система сприйняла їх як числові значення
    }
}

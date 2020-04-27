public class Variables {
    public static void main(String[] args) {
        int myInt = 657; // 32 бита
        short myShort = 3266; // только 16 битные числа от -32000 до 32000
        long myLong = 354987897; // 64 бит для хранения больших чисел

        // Вещественные типы данных
        double myDouble = 235.35; // хранит 64 бита информации
        float myFloat = 2362.4f; // 32 бита информации, в конце числа поставить символ f

        char myChar = 'a'; // символы, буквы
        boolean b = true; // логический тип данных, может принимать либо true либо false

        byte myByte = 100; // вмещает 8 бит информации или 1 байт для числел -128 до 128
        System.out.println(myInt);
    }
}

public class Arrays_of_String {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "Java";

        for (String s:strings) {
            System.out.println(s);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null; // переменная s ссылается на пустоту
        System.out.println(s);
    }
}

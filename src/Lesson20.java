public class Lesson20 {
    public static void main(String[] args) {
        Humanoid humanoid1 = new Humanoid();
    }
}

class Humanoid {
    private String name;
    private int age;

    // конструктор имя конструктора должно совпадать с именем класса
    // при создании объекта сразу же вызывается конструктор
    public Humanoid() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Humanoid(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Humanoid(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
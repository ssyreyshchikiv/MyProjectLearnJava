package javaLearn;

public class Player {
    int number = 0;//здесь хрантиться вариант числа

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}

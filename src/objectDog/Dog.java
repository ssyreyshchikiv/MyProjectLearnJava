package objectDog;

public class Dog {
    String name;

    public static void main(String[] args) {
        //создаем объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        //Теперь создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        //и поместим в него несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //Теперь получаем доступ к объектам Dog
        //с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        //Хмм.. какое имя у myDog[2]
        System.out.println("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        //Теперь переберем все эелементы массива
        //и вызовем для каждого метод bark()
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }
}

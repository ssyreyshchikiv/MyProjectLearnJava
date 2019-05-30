import com.sun.prism.shader.Solid_ImagePattern_Loader;

public class BeerSong {

    public static void main(String[] args) {

        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка"; // В единственном числе - ОДНА бутылка.
            }


            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println(beerNum + " " + word + " пива.");
                System.out.println("Возьми одну.");
                System.out.println("Пусти по кругу.");
                beerNum = beerNum - 1;
            } else {
                System.out.println("Нет бутылок пива на стене");
            }//конец else
        }//конец цикла while
        System.out.println("Нет бутылок пива на стене");
    }//конец метода main
}//конец класса

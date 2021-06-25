public class HomeWorkApp {
    public static void main(String[] args){
        pryntThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void pryntThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    public static void checkSumSign(){
        int A = -5;
        int B = 2;
        if ((A + B)>=0) { System.out.println("Сумма положительная");}
        else { System.out.println("Сумма отрицательная");}
    }
    public static void printColor(){
        int value = 107;
        if (value<=0){ System.out.println("Красный");}
        else if (value<=100 && value>0){ System.out.println("Жёлтый");}
        else System.out.println("Зелёный");
    }
    public static void compareNumbers(){
        int a = 7;
        int b = 2;
        if (a>=b){ System.out.println(a+" >= "+b);}
        else System.out.println(a+" < "+b);

    }
}

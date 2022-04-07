package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {
    public static void main(String[] args) {
        System.out.println(multiplicate(-1,5));
    }

    public static int multiplicate(int number1, int number2){
        int erg = -1;
        if(number1 ==0 || number2 ==0){
            erg = 0;
        }
        if(number2>0){
            erg = number1 + multiplicate(number1, number2-1);
        }
        return erg;
    }


}

public class Main {

    public static void main(String[]args){
        System.out.println("Exercitiul 1:");
        printMyName();
        double sum = operation()[0];
        double division = operation()[1];
        System.out.println(sum);
        System.out.println(division);

        System.out.println("Exercitiul 2:");
        System.out.println("Result of addition: "+add(2,3));
        System.out.println("Result of subtraction: "+add(2,-3));
        System.out.println("result of multiplication: "+multiplication(3,7));
        System.out.println("result of division: "+div(3,7));

        System.out.println("Exercitiul 3: ");
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
        System.out.println("Exercitiul 4:");
        System.out.println("Media numerelor: "+media(10,7,9));

        System.out.println("Ex 5:");
        System.out.println("Restul impartirii: "+restImpartire(7,3));

        System.out.println("Exercitiul 6:");
        convertInCelsius(45);

        System.out.println("Ex 7: ");
        inchToMeterConversion(5);

        System.out.println("Ex 8: ");
        timeConv(20,1,30,4);

        System.out.println("Ex 9:");
        double r = 3;
        double perimetru = cerc(r)[0];
        double aria = cerc(r)[1];
        System.out.println("Perimetru: "+perimetru);
        System.out.println("Aria: "+aria);



    }

    public static void printMyName(){
        String name = "Stefana";
        System.out.println("Hello\n"+name);
    }

    public static double[] operation(){
        double firstNumber = 10;
        double secondNumber = 20;
        double sum = firstNumber+secondNumber;
        double product = firstNumber/secondNumber;
        double[] result = {sum,product};
        return result;

    }


    public static int add(int nr1,int nr2){
        return nr1+nr2;
    }

    public static double multiplication(double nr1,double nr2){
        return nr1*nr2;
    }

    public static double div(double nr1,double nr2){
        return nr1/nr2;
    }

    private static double media(double n1,double n2, double n3){
        return (n1+n2+n3)/3;
    }

    private static int restImpartire(int n1,int n2){
        return n1%n2;
    }

    private static void convertInCelsius(double number){
        System.out.println((5f/9f)*(number-32f));

    }

    private static void inchToMeterConversion(int inch){
        System.out.println(inch*0.0254);
    }

    private static void timeConv(int m,int h,int min,int s){
        int hToS = h*3600;
        int minToS = min*60;
        System.out.println("Viteza: "+m/(hToS+minToS+s));

        double mintoH = min*0.0166666667;
        double sToH = s* 0.000277777778;
        System.out.println("Km/h:" + m*0.001 / (h+mintoH+sToH));
        System.out.println("Mile/h:" + (m/1609)/ (h+mintoH+sToH));
    }

    private static double[] cerc(double raza){
        double perimetru = 2*3.14*raza;
        double aria = 3.14*raza*raza;
        double[] result = {perimetru,aria};
        return result;
    }
}

public class Methods {
    public static void main(String[] args) {
        System.out.println(Method3(5,10));
    }
    static void Method1()

    {
        int a = 227;            //Объявляем переменные
        byte b = 12;
        char c = 2265;
        float e = 1242f;
        double g = 12.34;
        boolean h = false;
        long n = 123l;
        short i = 12;
    }
    static void Method2(){
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;
        int e = a * (b + (c / d));
    }
    public static boolean Method3(int a,int b){
        int e = a + b;
        return (e<=10) || (e<=20);
    }
    public static boolean Method4(int x){
        return x<0;
    }
    public static void Method5(String name){
        System.out.println("Привет,"+name);
    }
    public static void Method6(int year){
        if (((year % 4) == 0) && !((year % 100) == 0)) {
            System.out.println("Год випсокосный");
        } else if ((year % 400) == 0) {
            System.out.println("Год високосный");
        }
        System.out.println("Год не високосный");
    }
}

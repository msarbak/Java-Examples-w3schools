public class Main {
    public static void main(String[] args) {
        String name = "AMD";
        System.out.println(name);
        final int sayi;
        sayi = 25;
        //float kesirli = 0.375f;
        //char yazi = 'M';
        //boolean bool = true;

        System.out.println(sayi); 

        int x = 5;
        int y = 3;
        int z = 7;
        System.out.println( x + y + z);


    String firstName = "Mehmet";
    String lastName = "SARBAK";
    String fullName = firstName + lastName;
    System.out.println(fullName);



        byte number = 126;
        short number2 = 32000;
        int number3 = 2147483630;
        long number4 = 9223372036854775800L;
        long numbers = number + number2 + number3 + number4;
        System.out.println(numbers);

        float number5 = 5.76f;
        double number6 = 19.99d;
        double numbers2 = number5 + number6;
        System.out.println(numbers2);


        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1 + d1);


        boolean isJavaHard = true;
        boolean isAMDBad = false;

        System.out.println(isJavaHard);
        System.out.println(isAMDBad);

        char c = 'M';
        System.out.println(c);

        char abc1 = 65, abc2 = 66, abc3 = 67;
        System.out.println(abc1 + abc2 + abc3);

        String tanisma = "Merhaba!";
        System.out.println(tanisma + "JAVA");

        int int1 = 9;
        double double1 = int1; //oto cast - k > b
        System.out.println(int1);
        System.out.println(double1);   

        double double2 = 9.78d;
        int int2 = (int) double2; //manuel cast b > k
        System.out.println(int2);
        System.out.println(double2);

       // && ve , || veya , ! değil 
       

    }
}
package com.company;

  //  private static final int HOURSE = 1;// not understand
  //  HOURSE = 2;

//    public class Main {

 //   public static void main(String[] args) {

public class Main {

    public static void main(String args[]) {
        String str = new String("Welcome-to-the-prog.kiev.ua");

        System.out.println("Result: ");
        for (String retval : str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Result: ");
        for (String retval : str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Result: ");
        for (String retval : str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Result: ");
        for (String retval : str.split("-")) {
            System.out.println(retval);
        }
    }
}
//2
    //    float floatVar = 526f;
    //    int intVar = 12;
    //    string strtringVar = "java";

    //    System.out.printf("Значение переменной float = " +

    //            "%f, пока значение integer " +

    //            "переменная = %d, и string " +

     //           "= %s", floatVar, intVar, stringVar);
//1
     //       String string1 = "отличным ";

    //        System.out.println("Я стану " + string1 + "программистом!");

    //    String s = "Я стану отличным программистом!";

    //    int len = s.length();


     //   System.out.println("Длина строки: " + len + " символ.");
 //   }
//}

// D/z 11.02.2017 part 1
        //   boolean result1 = 10 > 1;
        //   System.out.println(result1);

        //   boolean result2 = 10 ==1;
        //   System.out.println(result2);

        //   boolean value1 = true;
        //   boolean value2 = false;
        //   System.out.println(value1 == value2);
        //   System.out.println(!value1);
        //   System.out.println(!value2);

        //   System.out.println();

        //    char hart = '3';
        //   System.out.println(hart);
        //  String[] array = {'hello', 'world', '!'};
        //  System.out.println(array);

        //  String str1="abc";
        //  System.out.println(str1);
        //  char data[] = {'a', 'b', 'c'};
        //  String str2 = new String(data);
        //  System.out.println(str2);

        //  System.out.println(str1.toCharArray());


        //  System.out.println("Hello "+args[0]+ " start "+args[1]);
        //1)   System.out.println("Hello " + args[0]);

        //2) int a = 5;
        //   int b = 7;
        //   int c = (a + b);
        //   System.out.println(c);

        //3)   int a = 4;
        //   int b = 3;
        //   int c = (a + b);
        //   System.out.println(a "+"b, "="c);
        //   System.out.print(b " = ");
        //  System.out.print(c);
        //5)   int i = 0;
        //   System.out.println(i + " ");
        //   ++i;
        //   System.out.println(i + " ");
        //   i++;
        //   System.out.println(i);
        //6 & 7)
        //   boolean value1 = true;
        //   boolean value2 = false;
        //   System.out.println(!value1);
        //   System.out.println(!value2);
        //8-13)
        //   boolean a = true;
        //   boolean b = false;
        //   System.out.println(a|b);
        //   System.out.println(a&b);
        //   System.out.println(a^b);
        //   System.out.println(b|=a);
        //   System.out.println(a^=b);
        //   System.out.println(a&=b);
        //14)   int a = 74;
        //   int b = 97;
        //   int c = 118;
        //   System.out.print("char = " + a);
        //   System.out.print(" char = " + b);
        //   System.out.print(" char = " + c);
        //   System.out.print(" char = " + b);
        //15)
        //   int x = 1;
        //   int y = 4;
        //   System.out.println(x<10&&y>3); result = true
        //   int x = 13;
        //   int y = 1;
        //   System.out.println(x<10&&y>3); result = false
        // 16
        //   int x = 10;
        //   int y = 4;
        //   int z = 1;
        //   System.out.println(!(x>y&&y>z)); result = false
        //17
        //   double d = 0.1;
        //   System.out.print("double d = " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //   System.out.print(" + " + d);
        //18
        //   float f = 0.1f;
        //   System.out.print("float f = " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //   System.out.print(" + " + f + "f");
        //19
        //   int a = 3;
        //   int b = 4;
        //   int c = 8;
        //   System.out.println(a + b * c); result 35.
        //20
        //   int a = 7;
        //   int b = 7;
        //   int c = 7;
        //   System.out.println((a + b)* c); result 98.
        //21
        //   int a = 2;
        //   int v = ++a + ++a * ++a;
        //   System.out.println(v); result = 23.
        //22
        //   System.out.println("Total: " + 3 + 4); result = 34.
        //   int a = 3;
        //   int b = 4;
        //   System.out.println("Total: " + a + b); result = 34.
        //23
        //   System.out.println(12%3); result = 0.
        //24
        //   System.out.println(13%3); result = 1;
        //25
        //   System.out.println(Byte.MAX_VALUE); result = 127.
        //26
        //   System.out.println(Short.SIZE); result = 16.
        //27
        //   System.out.println(Integer.MIN_VALUE); result = -2147483648.
        //28
        //   System.out.println();
        //29
        //    for (int a = 1; a < 11; a++){
        //       for (int b = 1; b < 11; b++){
        //           System.out.println(b * a + " *");
        //    }
        //    System.out.println(" ");
        // }
        //30

        //    int s = 3529;
        //    int hourse = s%(60*60);// rest hourse = 0 (3529%3600)
        //    int min = s%60;
        //    int m = s / 60;

        // need variant
        //   int s = 3529;
        //   int sec = s%60;// hours
        //   int m = s / 60;//
        //   int min = m%60;// 58 min
        //   int h = min / 60;//0

        //   System.out.println(h + ":" + min + ":" + sec );
     //   private static final int HOURSE = 1;
     //   HOURSE = 2;


 //           }
//        }


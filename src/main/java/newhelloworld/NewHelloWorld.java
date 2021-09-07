package newhelloworld;

public class NewHelloWorld {

    public static int getLastIndex(String[] names) {
        return names.length-1;
    }

    public static int getSecondToLastIndex(String[] names) {
        return names.length-2;
    }

    public static String getFirstElement(String[] names) {
        return names[0];
    }
    public static void main(String[] args) {
    // notes
//        byte aByte = 120;
//        System.out.println(aByte);
//
//        short aShort = 10;
//        System.out.println(aShort);
//
//        int aInt = 5;
//        System.out.println(aInt);
//
//        long aLong = 1000000000;
//        System.out.println(aLong);
//
//        float aFloat = 44.5f;
//        System.out.println(aFloat);
//
//        double aDouble = 10.089;
//        System.out.println(aDouble);
//
//        boolean aBoolean = true;
//        System.out.println(aBoolean);
//
//        char aChar = 10;
//        System.out.println(aChar);
//
//
//        String modgreeting = "hello \nhow are you\tim watching";
//        System.out.println(modgreeting);
//        int added = 5+5;
//
//        float fiveInHalf = (float)5/2;
//        System.out.println(fiveInHalf);
//
//        // string concatenation
//        String greeting = "Hello there";
//        String name = "ishmell";
//        System.out.println(greeting.concat(" ")+name);
//
//
//        String s = "Yo, Chill";
//        System.out.println(s.charAt(6));
//

        String[] nameArray = {"robert", "strey","georgy"};
        System.out.println(getFirstElement(nameArray));

        System.out.println(getSecondToLastIndex(nameArray));

        System.out.println(getLastIndex(nameArray));


    }

}
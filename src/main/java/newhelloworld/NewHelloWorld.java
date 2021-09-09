package newhelloworld;
import java.util.*;

public class NewHelloWorld {
//    Question 4
    public static String getLastElement(String[] names) {
        return names[names.length-1];
    }
//    Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length-2];
    }
//    Question 6
    public static int getSum(int[] ints) {
        return Arrays.stream(ints).sum();
    }
//    Question 7
    public static int getAverage(int[] ints) {
        return (int)(Arrays.stream(ints).average().getAsDouble());
    }
//    Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String string_odd_numbers = "";
        int[] oddNumbers = Arrays.stream(numbers).filter(num->num%2!=0).toArray();
        for (int oddnumber : oddNumbers){
            string_odd_numbers+=",";
            string_odd_numbers+=oddnumber;
        }

        return string_odd_numbers.substring(1);
    }
//    Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String string_even_numbers = "";
        int[] oddnumbers = Arrays.stream(numbers).filter(num->num%2==0).toArray();
        for (int oddnumber : oddnumbers){
            string_even_numbers+=",";
            string_even_numbers+=oddnumber;
        }
        return string_even_numbers.substring(1);
    }
//    Question 10
    public static boolean contains(String[] names, String element) {
        for (String name : names){
            if (name.equals(element)){
                return true;
            }
        }
        return false;
    }
//    Question 11
    public static int getIndexByElement(String[] names, String element) {
        int idx = 0 ;
        for (String name: names){
            if (name.equals(element)){
                return idx;
            }
            idx+=1;
        }
        return -1;
    }
//    Question 12
    public static void printOddNumbersInRange(int start, int end){
        for (int i =start;i<=end;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
//    Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String totalString = "";
        for(int i =0;i<n;i++){
            totalString+=str;
        }
        return totalString;
    }
//    Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String totalLetters = "";
        String firstThreeLetters = str.substring(0,2);
        for (int i =0;i<n;i++){
            totalLetters+=firstThreeLetters;
        }
        return totalLetters;
    }
//    Question 15
//// Write a java method to count all the words in a string
//
    public static int WordsInAStringCounter(String str){
        if (str.equals(" ")){
            return 0;
        }

        int wordCounter = 0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                wordCounter+=1;
            }
        }
        return wordCounter+1;
    }
//    Question 16
//    A, E, I, O, U, and sometimes Y
//
//    public static int VowelsCounter(String str){
//        return 0;
//    }
//    Question 17
//    Swap the first element in an array with the last element in an array and return
//
//    public static String[] swap(String[] stringArray) {
//        return null;
//    }
//    Question 18
//    /**
//     * Given the following legend
//     *
//     * f   >>   7
//     * s   >>   $
//     * 1   >>   !
//     * a   >>   @
//     *
//     * your method should replace any character represented by a key in the legend, with its corresponding value.
//     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
//     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
//     *
//     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
//     */
//
//    public static String replaceCharacters(String str) {
//        return null;
//    }
//    Question 19
//            " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
//
//    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
//        return null;
//    }
//    Question 20
//    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
//        return null;
//    }
//
//    public static int getLastIndex(String[] names) {
//        return names.length-1;
//    }
//
//    public static int getSecondToLastIndex(String[] names) {
//        return names.length-2;
//    }
//
//    public static String getFirstElement(String[] names) {
//
//        return names[0];
//    }

//    public static void createReceipt(String product,int qty,double price){
//        double total = qty * price;
//        System.out.println("Product     Qty     Price     Total");
//        System.out.println("-----     -----     -----     -----");
//        System.out.printf("%s       %d        %.2f      %.2f\n\n",product,qty,price,total);
//
//    }
    public static void main(String[] args) {

        int[] numbers = {3,4,56,798,4,4,6,7,55,4,456};
        String[] names = {"bob","joey","suzane","roberto","crystal","john"};


        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));
        System.out.println(contains(names,"joey"));
        System.out.println(getIndexByElement(names,"joey"));
        printOddNumbersInRange(5,7);



//        Scanner sc = new Scanner(System.in);
//        boolean loggedIn = false;
//        while(!loggedIn){
//            System.out.println("What is your username");
//            String username = sc.nextLine();
//            if (username.equals("alice") || username.equals("bob")){
//                loggedIn = true;
//                String name = username.equals("alice")?"alice":"bob";
//                System.out.printf("welcome %s",name);
//            }
//
//            else if(username.equals("mikaila")){
//                System.out.println();
//            }
//
//        }





//        int dice_roll = (int)(Math.random()*7);
//
//        switch(dice_roll){
//            case 1:
//                System.out.println("You rolled a 1");
//                break;
//            case 2:
//                System.out.println("You rolled a 2");
//                break;
//            case 3:
//                System.out.println("You rolled a 3");
//                break;
//            case 4:
//                System.out.println("You rolled a 4");
//                break;
//            case 5:
//                System.out.println("You rolled a 5");
//                break;
//            case 6:
//                System.out.println("You rolled a 6");
//                break;
//            default:
//                System.out.println("roll again");
//        }

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

//        String[] nameArray = {"robert", "strey","georgy"};
//        System.out.println(getFirstElement(nameArray));
//
//        System.out.println(getSecondToLastIndex(nameArray));
//
//        System.out.println(getLastIndex(nameArray));
//
//        createReceipt("tacos",5,2.5);
//        createReceipt("bacon",8,1.0);

//
//        String firstname = "Christopher";
//        System.out.println(firstname.substring(0,5));
//        System.out.println(firstname.substring(4,8));
//        System.out.println(firstname.substring(8,11));
//
//        StringBuilder reversestop = new StringBuilder(firstname.substring(4,8)).reverse();
//        String capitalreverse = reversestop.substring(0, 1).toUpperCase() + reversestop.substring(1);
//        System.out.println(capitalreverse);
//
//
//        Scanner sc = new Scanner(System.in); //high, low, or humid
//        System.out.print("Enter Temperature\n");
//
//        String temp = sc.nextLine();
//
//        if (temp.equals("high")){
//            System.out.println("sunblock may be needed\n");
//        }
//        else if (temp.equals("low")){
//            System.out.println("a coat may be needed\n");
//        }
//        else if (temp.equals("humid")){
//            System.out.println("It's muggy\n");
//        }


//        double random_num = (int)(Math.random()*11);
//        System.out.println(random_num);
//        if (random_num>0){
//            if(random_num<10){
//                System.out.print("number is greater than zero and less than 10");
//                if(random_num%2==0){
//                    System.out.print(" and even");
//                }
//            }
//        }
//
//        String temperature = "high";
//
//        switch (temperature){
//            case "high":
//                System.out.println("bruh it's hot");
//                break;
//            case "low":
//                System.out.println("put on a jacket it's cold");
//                break;
//            case "humid":
//                System.out.println("ewww gross");
//                break;
//        }
//
//        String[] cars = {"volvo",""};
//
//
        //nested if statement to check a randum_grade
        //which you must randomly generate 0-100
        //if students grade
        //90-100 print you got an A

        //must use nested if statement
//        int random_num = (int)(Math.random()*101);
//        if (random_num>88){
//            if (random_num<101){
//                System.out.println("you got an A");
//            }
//        }
//
//        int grade_num = (int)(Math.random()*101);
//
//        String success = grade_num>50? "you passed":"you failed";
//
//        System.out.println(success);




    }

}
// Hello class
public class Hello {
    // main method
    public static void main(String[] args) {
        // print text to console
        System.out.println("Hello, Camus hi hi hi hi");
        System.out.println("Water, Fire, Ice, Earth, Air\n, Iron, Metal, ");
        System.out.println("");

        // Declaration Statement: Used to define a variable by indicating the data type,
        // and the name, and optionally to set the variable to a certain value.
        int ppc = 8999;
        int i = 10000000;
        int num = 5 * i;    // variable of type int with the name num assigned to value 5
        int total = ppc * i * num;
        int lastTotal = total - 1000 -i;
        System.out.println("my total is "+ total + " - 1000 - i is: ");
        System.out.println(lastTotal);
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1)); // overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // underflow

        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Byte minimum " + minByteVal);
        System.out.println("Byte maximum " + maxByteVal);

        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Short minimum " + minShortVal);
        System.out.println("Short maximum " + maxShortVal);

        long myLongValue = 100;
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Long minimum " + minLongVal);
        System.out.println("Long maximum " + maxLongVal);
        long bigLong = 2147483647234L;
        System.out.println(bigLong);
        
        short bigShort = 32767;
        
        int myTotal = (myMinIntValue / 2);

        // Casting like a fucking mage
        byte myNewVal = (byte)  (myMinIntValue / 2);
        
        short myNewShortValue = (short) (myMinIntValue);

        //********** Challenge ******************//
        byte validByteNumber = 22;

        short validShortNumber = 3333;

        int validIntNumber = 474836;

        long validLongNumber = 50000L + 10L * (validIntNumber + validShortNumber + validByteNumber);
        System.out.println(validLongNumber);

        // Casting a short
        short shortTotal = (short) (1000 + 10 * (validByteNumber + validShortNumber + validIntNumber));
        System.out.println(shortTotal);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.250977987;
        byte anotherByte = (byte) 423425;
        double myDoubleValue = 5.39D;

        char myChar = 'D';
        char myUnicodeChar = '\u0555';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        //*** BOOLEAN PRIMITIVE TYPES ***//
        /* A boolean value allows for two choices True or False, Yes or No, 1 or 0. In Java terms we
           have a boolean primitive type, and it can be set to two values only. true or false. */
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        //*** RECAP: PRIMITIVE TYPES ***// - not used much, ~ medium usage, * used alot
        // byte -
        // short
        // int *
        // long ~
        // float -
        // double *
        // char ~
        // boolean *

        //* String is a sequence of characters. *//
        String myString = "This my string";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019" + "\u00B3";
        System.out.println("My string is " + myString);
        String numberString = "230.44";
        numberString = numberString + "49.94";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        String shamanKing = "Soul integration process ";
        shamanKing = shamanKing + "Look out lul Itako";
        System.out.println(shamanKing + lastString + numberString + myString);

        String taoJun = "Tao Jun";
        taoJun = taoJun + taoJun + taoJun;
        System.out.println(taoJun);

        int result = 1 + 2;     // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("20 / 5 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("345 % 5555 = " + result);



    }
}
//********************************************************************************************************************\\
//--------------------------------------IEEE-754 decimal to binary convertor------------------------------------------\\
//********************************************************************************************************************\\

package com.company;

import java.util.Scanner;

public class Main {
//      Get 32-bits IEEE 754 format of real decimal value
    static String GetBinary32(float value) {
        int intBits = Float.floatToIntBits(value);
        return Integer.toBinaryString(intBits);
    }

//      Get 64-bits IEEE 754 format value of real decimal number
    static String GetBinary64(double value) {
        long intoBits = Double.doubleToLongBits(value);
        return Long.toBinaryString(intoBits);
    }

    public static void main(String[] args) {
//      Converts number into IEEE 754 32-bits & 64-bits binary format

        Scanner n = new Scanner(System.in);
        System.out.print("enter decimal number: ");
        double num = n.nextFloat();

        String str32 = GetBinary32((float) num);
        if (num > 0) {
            str32 = "0" + str32;
        }
        System.out.println("Binary equivalent of " + num + " in 32-bits : " + str32);

        String str64 = GetBinary64(num);
        if (num > 0) {
            str64 = "0" + str64;
        }
        System.out.println("Binary equivalent of " + num + " in 64-bits : " + str64);
    }
}

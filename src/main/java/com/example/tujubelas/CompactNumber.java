package com.example.tujubelas;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {

    public static void kompek(NumberFormat.Style style) {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, style);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }
}

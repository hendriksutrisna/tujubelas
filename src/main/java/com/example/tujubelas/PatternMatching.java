package com.example.tujubelas;

public class PatternMatching {
    public static void oldStyle() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass) {
            GrapeClass grape = (GrapeClass) o;
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    public static void patternMatching() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    public static void patternMatchingScope() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape && grape.getNbrOfPits() == 2) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    public static void patternMatchingScopeException() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (!(o instanceof  GrapeClass grape)) {
            throw new RuntimeException();
        }
        System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
    }
}

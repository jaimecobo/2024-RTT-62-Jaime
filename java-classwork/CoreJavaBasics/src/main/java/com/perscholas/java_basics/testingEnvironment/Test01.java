package com.perscholas.java_basics;

//import java.util.StringJoiner;
//
//public class Test01 {
//        public static void main(String[] args) {
//            StringJoiner sj1 = new StringJoiner(":", "{", "}");
//            StringJoiner sj2 = new StringJoiner(",", "[", "]");
//            sj1.add("Name").add("Tony");
//            sj2.add("LastName").add("Strak");
//            System.out.println(sj1.merge(sj2).toString());
//
//            int x = 2;
//            int y = 0;
//            for (; y < 10; ++y) {
//                if (y % x == 0)
//                    continue;
//                else if (y == 8)
//                    break;
//                else
//
//                    System.out.print(y + " ");
//            }
//
//        }
//    }

//class A {
//    public String[] getSdlc() {
//        return sdlc;
//    }
//
//    String sdlc[] = {
//            "requirement analysis",
//            "design",
//            "development",
//            "testing",
//            "implementation",
//            "maintenance"
//    };
//}
//class B extends A {
//    public String[] getSdlc() {
//        return sdlc;
//    }
//
//    private String sdlc[] = {
//            "r","d","d","t","i","m"
//    };
//}
//class C extends B {
//    public String[] getSdlc() {
//        return sdlc;
//    }
//
//    String sdlc[] = {
//            "s","d","l","c"
//    };
//}
//public class Test01 {
//    public static void main(String args[]) {
//        B obj = new C();
//        for (int i = 0; i < obj.getSdlc().length;
//             i++) {
//            System.out.print(obj.getSdlc()[i] + "");
//        }
//    }
//}


//class A {
//    String E = "extraction ";
//    String T = "transformation ";
//    String L = "loading ";
//
//    final void ETL() {
//        System.out.println(L + T + E);
//    };
//}
//
//class B extends A {
//    void ETL() {
//        System.out.println(E + T + L);
//    }
//}
//
//public class Test01 {
//    public static void main(String args[]) {
//        A obj = new B();
//        obj.ETL();
//    }
//}


//public class Test01 {
//    public static void main(String[] args) {
//        Element e = new Iodine();
//        System.out.println(e.appearance());
//    }
//}


class A {

    void ETL() {
        String E = "mySQL";
        String T = "Sqoop";
        String L = "hdfs";
        System.out.println(E + T + L);
    };

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }
    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }
}

public class Test01 {

    public static void main(String args[]) {
        String E = "extraction1";
        String T = "transformation2";
        String L = "loading3";

        A obj = new A();
        obj.ETL(E + T + L);
    }
}
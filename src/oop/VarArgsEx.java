package oop;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300")); // 100200300
        System.out.println(concatenate("-", strArr)); // 100-200-300-
        System.out.println(concatenate(",", new String[]{"1","2","3"})); // 1,2,3,
        System.out.println("["+concatenate(",", new String[0])+"]"); // []
        System.out.println("["+concatenate(",")+"]"); // []


    }

    // concatnate 메서드는 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결합해서 반환한다.
    static String concatenate(String delim, String... args){
        String result = "";

        for(String str: args){
            result += str+delim;
        }

        return result;
    }

//    static String concatenate(String... args){
//        return concatenate("", args);
//    }
}

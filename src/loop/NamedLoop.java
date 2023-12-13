package loop;

public class NamedLoop {
    public static void main(String[] args) {
        // for 문에 Loop1 이름 붙임
        Loop1 : for (int i = 2; i <= 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == 5) {
                    break Loop1;
//                    break;
//                    continue Loop1;
//                    continue;
                }
                System.out.println(i+"*"+j+"="+i*j);
            } // end for
            System.out.println();
        } // end Loop1
    }
}

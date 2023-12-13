package array;

public class CliCalc {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("매개 변수는 총 세 개여야 합니다. (피연산자 연산자 피연산자)");
            System.exit(0);
        }
        int num1 = Integer.parseInt(args[0]); // 문자열을 정수로 형변환
        int op = args[1].charAt(0); // 문자열을 문자로 형변환
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case 'x':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("미지원 연산 형식");
                System.exit(0);
        }
        System.out.println("결과 : "+result);
    }
}

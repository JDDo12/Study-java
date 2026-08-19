package ex5_work;

public class CalculatorMain {
    
    public int printCal(int su1, int su2, String op){

        switch( op ){

            case "+":
                return su1 + su2;
            case "-":
                return su1 - su2;
            case "*":
                return su1 * su2;
            case "/":
                return su1 / su2;
            default:
                System.out.println("연산기호가 올바르지 않음");
                return -1;
        }//switch

    }

}

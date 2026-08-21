package ex7_work;

public class WorkMain {
    public static void main(String[] args) {
        
        //가장 큰 값 : 20
        int[] arr = {12, 35, 84, 14, 64, 57};

        WorkSub ws = new WorkSub();
        int res = ws.getBigger(arr);

        System.out.println("가장 큰 값 : " + res);
        
    }//main
}

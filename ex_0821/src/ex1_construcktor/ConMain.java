package ex1_construcktor;

public class ConMain {
    public static void main(String[] args) {
        
        //생성자 : 
        //객체가 생성될 때 메모리 할당을 위해 딱 한번 반드시 호출되는 것
        //ConSub cs = new ConSub();
        //cs.ConSub(); 강제로 한 번 호출 됐다면 그 다음엔 절대로 나오지 않음(오류임)

        ConSub[] cs = new ConSub[2];

        cs[0] = new ConSub();
        cs[1] = new ConSub();

    }//main
}

public class Ex2_ifelse {
    public static void main(String[] args) {
        //if - else 하나의 조건식에 대해서 참일때와 거짓일 때를 모두 판단할 수 있는 제어문
        int n = 49;
        String str = "";

        if(++n >= 50) str = "n은 50 이상의 수"; //true일때 실행
        else          str = "n은 50 미만인 수"; //false일 때 실행
        
        System.out.println(str);

        // 변수 age에 나이를 대입하고 30이상이면 드실만큼 드셨군요를, 그렇지 않으면 조금만 더 드셔도 돼요를 출력하는 if문 구현
         
        int age = 30;
        String s1 = "";
        if(age >= 30) s1 = "드실만큼 드셨군요";
        else          s1 = "조금만 더 드셔도 돼요";

        System.out.println(s1);

        age = 29;
        s1 = "";
        s1 = (age >= 30) ? "드실만큼 드셨군요" : "조금만 더 드셔도 돼요";
        System.out.println(s1);
    }
}

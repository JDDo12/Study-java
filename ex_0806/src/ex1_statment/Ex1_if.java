public class Ex1_if {
    public static void main(String[] args) {
        // 제어문 - 프로그램의 흐름을 제어하는 문장
        // 분기문과 반복문으로 나뉜다
        // 분기문 : if, switch
        // 반복문 : for, while, do-while
        // if문 : if(조건식){}

        int n = 30; // 정수형 변수 n을 30으로 초기화

        // 1. if-else 기본형태
        String str = "안녕하세요"; // String 타입 변수 str을 "안녕하세요"로 초기화
        if (n == 50) {
            str = "n은 50 입니다.";
        } else {
            str = "n은 50 이 아닙니다.";
        }
        System.out.println(str);

        // 2. if-else문에서 선언과 초기화를 분리
        String str2;
        if (n == 50) {
            str2 = "n은 50 입니다.";
        } else {
            str2 = "n은 50 이 아닙니다.";
        }
        System.out.println(str2);

        // 3. if문만 사용하고 else문에서는 값을 명시적으로 지정
        String str3 = "n은 50 이 아닙니다.";
        if (n == 50) {
            str3 = "n은 50 입니다.";
        }
        System.out.println(str3);

        // 4. 블록 없이 한 줄 if-else (권장되지 않지만, 가독성 예시)
        String str4;
        if (n == 50)
            str4 = "n은 50 입니다.";
        else
            str4 = "n은 50 이 아닙니다.";
        System.out.println(str4);

        // 5. 중첩 불필요 예시: 조건식 내에서 직접 출력
        if (n == 50) {
            System.out.println("n은 50 입니다.");
        } else {
            System.out.println("n은 50 이 아닙니다.");
        }
    }
}

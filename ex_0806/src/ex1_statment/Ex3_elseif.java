public class Ex3_elseif {
    public static void main(String[] args) {
        //다중 if문(else if)
        //여러개의 조건비교가 필요할 경우 사용하는 if문

        int num = 75;
        String str = "";

        float start1 = System.nanoTime();

        if      (num > 90) str = "A";
        else if (num > 80) str = "B";
        else if (num > 70) str = "C";
        else if (num > 60) str = "D";
        else if (num < 59) str = "F";

        float endtime1 = System.nanoTime();
        float t1 = endtime1 - start1;

        float start2 = System.nanoTime();
        str = (num > 90) ? "A" : (num > 80) ? "B" : (num > 70) ? "C" : (num > 60) ? "D" : "F" ;
        float endtime2 = System.nanoTime();
        float t2 = endtime2 - start2;

        System.out.println(str + "del1:" + t1 + "del2:" + t2);

        num = 75;
        str = "";
        int iterations = 10_000_000; // 1,000만 번 반복

        // 1. if-else 측정
        long start3 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            if      (num > 90) str = "A";
            else if (num > 80) str = "B";
            else if (num > 70) str = "C";
            else if (num > 60) str = "D";
            else               str = "F";
        }
        long end3 = System.nanoTime();

        // 2. 삼항 연산자 측정
        long start4 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            str = (num > 90) ? "A" : (num > 80) ? "B" : (num > 70) ? "C" : (num > 60) ? "D" : "F";
        }
        long end4 = System.nanoTime();

        // ns 그대로 출력하거나 double 연산 사용
        System.out.println("if-else 시간: " + (end3 - start3) + " ns (" + ((end3 - start3) / 1_000_000.0) + " ms)");
        System.out.println("삼항연산자 시간: " + (end4 - start4) + " ns (" + ((end4 - start4) / 1_000_000.0) + " ms)");

        //나이가 20이상 -> 성인요금
        //14이상 20미만 -> 청소년 요금
        //8이상 14미만 -> 어린이요금
        //8미만 -> 유아요금

        //ver 1:
        int age2 = (int)(Math.random() * 10);
        System.out.println("나이:" + age2);
        String s2 = "";
        if      (age2 >= 20) s2 = "성인요금";
        else if (age2 >= 14) s2 = "청소년 요금";
        else if (age2 >= 8 ) s2 = "어린이 요금";
        else                 s2 = "유아 요금";
        System.out.println(s2);

        //ver 2:
        age2 = (int)(Math.random() * 10);
        System.out.println("나이:" + age2);
        s2 = (age2 >= 20) ? "성인요금" : (age2 >= 14) ? "청소년요금" : (age2 >= 8) ? "어린이요금" : "유아요금";
        System.out.println(s2);

        //ver 3:
        age2 = (int)(Math.random() * 10);
        System.out.println("나이:" + age2);
        s2 = "";
        if      (age2 >= 20) System.out.println("성인요금");
        else if (age2 >= 14) System.out.println("청소년 요금");
        else if (age2 >= 8 ) System.out.println("어린이 요금");
        else                 System.out.println("유아 요금");
    }
}

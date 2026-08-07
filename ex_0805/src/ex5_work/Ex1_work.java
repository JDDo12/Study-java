package ex5_work;

import java.util.HashMap;

public class Ex1_work {
    public static void main(String[] Args){
        /*
        과수원이 있다.
        배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
        각각 5, 7, 5개

        1. 과수원에서 하루에 생산되는 과일의 총 개수를 출력
        2. 시간당 전체 과일의 평균 생산 갯수
        단, 과일의 갯수를 담는 변수는 int, 평균 계산할 변수는 float
        */

        // ver 1:
        int sum = 5 + 7 + 5;
        float aver = (float)sum / 24;

        System.out.println("하루 총 생산 과일:" + sum);
        System.out.println("시간당 평균 생산 갯수:" +aver);

        //ver 2:
        int pr = 5;
        int ap = 7;
        int og = 5;
        int t = 24;

        System.out.println("하루 총 생산 과일:" + (int)(pr + ap + og));
        System.out.println("시간당 평균 생산 갯수:" + ((float)(pr + ap + og)/(float)t));
        // ver 3:
        int[] as = {5,7,5};
        sum = 0;
        for(int i: as)sum += i;
        
        System.out.println("하루 총 생산 과일:" + sum);
        System.out.println("시간당 평균 생산 갯수:" + ((float)sum/(float)24));

        //ver 4:
        int i4 = 0B101 + 0B111 + 0B101;
        int t4 = 0XC * 2;
        //int ev4 = i4 / 0B10100;

        System.out.println("하루 총 생산 과일:" + i4);
        System.out.println("시간당 평균 생산 갯수:" + ((float)i4/(float)t4));

        //ver 5:
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("pear", 5);
        hm.put("apple", 7);
        hm.put("orenge", 5);

        int sum5 = 0;

        for(var entry:hm.entrySet()){
            sum5 += entry.getValue();
        }

        hm.put("sum", sum5);
        float evg5 = (float)hm.get("sum") / 24.f;

        System.out.println("하루 총 생산 과일:" + hm.get("sum"));
        System.out.println("시간당 평균 생산 갯수:" + evg5);

        //version확인

        /*
        [응용문제]
        과수원에서 하루에 생산되는 배, 사과, 오렌지의 수가 각각 5개, 7개, 5개라고 한다.
        만약 이 과수원에 복숭아가 추가로 하루에 6개씩 생산된다면,

        1. 하루에 생산되는 과일의 총 개수를 출력하는 프로그램을 작성하시오.
        2. 하루에 생산되는 전체 과일의 평균 생산 갯수를 출력하는 프로그램을 작성하시오. (복숭아 포함, int 변수와 float 변수 사용)
        3. 하루에 생산되는 사과와 오렌지의 개수 차이를 구하는 코드를 작성하시오.
        */
  

        

    }
}

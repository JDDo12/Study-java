package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int stuCnt = sc.nextInt();

        // 성적을 입력받아 저장하기 위한 배열
        int[] grade = new int[stuCnt];

        // 총점을 저장할 변수
        int sum = 0;

        for (int i = 0; i < stuCnt; i++) {

            System.out.printf("학생%d의 성적 : ", i + 1);
            grade[i] = sc.nextInt();
            sum += grade[i];

        } // for

        System.out.println("----------------------------");

        float avg = (float) sum / stuCnt;
        System.out.printf("평균성적 : %.2f\n", avg);

        System.out.println("--- 평균 이상인 학생들 ---");

        int avgCnt = 0;// 평균 이상인 학생수를 담을 변수
        
        for( int i = 0; i < stuCnt; i++ ){

            if( grade[i] >= avg ){
                avgCnt++;
                System.out.printf("=> 학생%d : %d\n", i+1, grade[i]);
            }

        } //for

        System.out.println("평균 이상의 학생 수 : " + avgCnt);

    }// main
}

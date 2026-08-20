package ex06_overload;

public class BreadMain {
    public static void main(String[] args) {
        
        //빵을 만들었습니다 <-- 메서드 1 호출
        //--------------
        //빵을 만들었습니다
        //빵을 만들었습니다
        //요청하신 2개의 빵을 만들었습니다 <-- 메서드 2 호출
        //----------------------------
        //크림빵을 만들었습니다
        //크림빵을 만들었습니다
        //요청하신 2개의 크림빵을 만들었습니다 <-- 메서드 3 호출

        Bread bd = new Bread();
        bd.makeBread();

        System.out.println("--------------------");

        bd.makeBread(2);

        System.out.println("--------------------");

        bd.makeBread("크림빵", 2);

    }//main
}

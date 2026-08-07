public class Ex4_study {

    @FunctionalInterface
    interface randage<I>{I apply();}
    interface outprint<I1, I2, S>{S print(I1 i1, I2 i2);}
    public static void main(String[] args){
        //나이가 15세 이상이거나, 키가 150cm이상이면 탑승 가능
        //그렇지 않으면 탑승 불가능

        //디벨롭
        //나이와 키가 렌덤하게 출력되는 함수 추가
        //나이와 키를 출력받아 자동으로 print해주는 함수 추가

        //v1 :

        randage<Integer> randage = () ->{
            int i = (int)(Math.random() * 6) + 10; 
            System.out.println("나이:" + i);
            return i;
        };

        randage<Integer> randstatus = () ->{
            int i = (int)((Math.random() * 20) + 140); 
            System.out.println("키:" + i);
            return i;
        };

        outprint<Integer,Integer,String> outprint = (inage, insatus) -> {
            if(inage >= 15 || insatus > 150) return "탑승가능";
            else                             return "탑승불가능";
        };

        int age = randage.apply();
        int status = randstatus.apply();
        
        String s = outprint.print(age,status);
        System.out.println(s);

        //v2:
        age = randage.apply();
        status = randstatus.apply();
        s = (age >= 15 || status > 150) ? "탑승가능" : "탑승불가능";

        System.out.println(s);

        //v3:
        age = randage.apply();
        status = randstatus.apply();
        System.out.println((age >= 15 || status > 150) ? "탑승가능" : "탑승불가능");
    }
}

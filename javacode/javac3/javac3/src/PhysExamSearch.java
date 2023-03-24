import java.util.*;
public class PhysExamSearch {
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name=name; this.height=height; this.vision=vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        } //PhyscData에서 정의된 this들을 toString으로 반환

        public static final Comparator<PhyscData> HEIGHT_ORDER
        = new HeightOrderComparator(); //HEIGHT_ORDER을 새로운 함수로 생성(이름을 빌려쓴격)

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){ //comparator이라는 함수에서 implement된 함수 hoc 정의
                return (d1.height>d2.height)? 1: (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        PhyscData[] x={
            new PhyscData("이나령", 162, 0.3),
            new PhyscData("유지훈", 168, 0.4),
            new PhyscData("김한결", 179, 0.8)
        };
        System.out.print("몇 cm인 사람을 찾는가 : ");
        int height=stdIn.nextInt();
        int idx=Arrays.binarySearch(
            x,
            new PhyscData("", height, 0.0),
            PhyscData.HEIGHT_ORDER
        );
        if(idx<0)
        System.out.println("요소가 없음");
        else{
            System.out.println("x["+idx+"]에 있음");
            System.out.println("찾은 데이터 : "+x[idx]);
        }
    }
    
}

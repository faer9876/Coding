    class StationList{ //리스트 선언 배열로 안에 값 저장
      public String name;
      public int next;
    }

    

    public class e_pt4{
      public static StationList[] list=new StationList[10];

      public static int head;

      public static void initStationList(){
        for(int i=0;i<list.length;i++){
          list[i]=new StationList();
        }
        list[0].name="부산";
        list[0].next= -1;
        list[1].name="대전";
        list[1].next=3;
        list[2].name="서울";
        list[2].next=4;
        list[3].name="동대구";
        list[3].next=0;
        list[4].name="천안아산";
        list[4].next=1;

        head=2;
      }
      public static void printStationList(){
        int idx=head;
        while(idx!=-1){
          System.out.print("["+list[idx].name+"]->");
          idx=list[idx].next;
        }
        System.out.println("\n");
      }

      public static void insertStationList(int insIdx, String isName, int prevIdx){
        list[insIdx].name=isName;
        list[insIdx].next=list[prevIdx].next;
        list[prevIdx].next=insIdx;
      }

      public static void deleteStationList(int delIdx,int prevIdx){
        list[prevIdx].next=list[delIdx].next;
      }
      public static void main(String[] args){
        initStationList();
        printStationList();

        insertStationList(5, "광명", 2);
        printStationList();

        deleteStationList(5, 2);
        printStationList();
      }
    }


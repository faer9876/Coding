class BST{
  public int data; // 입력값
  public int left; // 왼쪽 연결값
  public int right; // 오른쪽 연결값
}

public class e_pt5 {
  public static BST[] tree=new BST[10]; // 연결요소 최대 10

  public static int rootIdx = 0; // 루트 요소의 물리적 위치 head
  
  public static int newIdx = 0; // 추가 할 요소의 물리적 위치

  public static void addBST(int data){
    int currentIdx; // 현재 입력된 요소의 물리적 위치 인덱스
    boolean addFlag; // 요소 추가가 완료되었는지 확인

    //물리적 위치에 요솟값과 연결 정보 추가
    tree[newIdx].data=data;
    tree[newIdx].left=-1;
    tree[newIdx].right=-1;

    // 루트 요소가 아니면 논리적 순서에 따라 위치 및 탐색 결정
    if(newIdx != rootIdx){
      currentIdx=rootIdx;
      addFlag=false;
      do{
        // 최상위 요솟값 보다 작으면 왼쪽으로 내려감
        if(data<tree[currentIdx].data){
          // 물리적 위치에 인덱스를 추가
          if(tree[currentIdx].left==-1){
            tree[currentIdx].left=newIdx;
            addFlag=true;
          }
          // 왼쪽으로 내려갔을 때 끝이 아니라면 왼쪽의 요소보다 더 내려감
          else{
            currentIdx=tree[currentIdx].left;
          }
        }
        // 최상위 요솟값보다 더 크면 오른쪽으로 내려감 동일값 x
        else{
          // 오른쪽으로 내려갔을 때 끝이면 right에 요소의 물리적 위치 인덱스 추가
          if(tree[currentIdx].right==-1){
            tree[currentIdx].right=newIdx;
            addFlag=true;
          }
          // 오른쪽으로 내려갔을 때 끝이 아니라면 오른쪽의 요소보다 더 내려감
          else{
            currentIdx=tree[currentIdx].right;
          }
        }
      }while(addFlag==false);
    }
    newIdx++;
  }
  public static void printPhysicalBST(){
    int i;

    for(i=0;i<newIdx;i++){
      System.out.printf("tree[%d]:data=%d,left=%d,right=%d\n",i,tree[i].data,tree[i].left,tree[i].right);
    }
  }
  public static void main(String[] args){
    for(int i=0;i<tree.length;i++){
      tree[i]=new BST();
    }
    addBST(4);
    addBST(6);
    addBST(5);
    addBST(2);
    addBST(3);
    printPhysicalBST();
  }
}

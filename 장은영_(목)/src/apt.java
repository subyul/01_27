import java.util.Scanner;
public class apt {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [][] apt = 
         {
               {101, 102, 103},
               {201, 202, 203},
               {301, 302, 303}
         };
      int [][] pay = 
         {
               {1000,2100,1300},
               {4100,2000,1000},
               {3000,1600,800}
         };
      
      
      System.out.println("문제1) 각층별 관리비 합 출력");         // 문제 1
      
      for(int i = 0; i<3;i++)
      {
         int sum = 0;                                 // 관리비의 합을 저장하는 변수
         for(int j = 0; j<3;j++)
         {
            sum += pay[i][j];                        // 2중for문을 사용해 2중 배열의 값을 합함
         }
         System.out.print(i+1+"층: "+sum);                // i를 사용하지만 1층부터 나타내야하기 때문에
         System.out.println();                        // 1을 더함
         
         
         sum = 0;                                 // 변수에 있는 값을 초기화
      }
      
      System.out.println("문제2) 호를 입력하면 관리비 출력");         // 문제 2
      System.out.println("호를 입력하세요");
      int aptnum = sc.nextInt();
      
      for(int i=0; i<3;i++)
      {
         for(int j = 0; j<3;j++)
         {
            if(aptnum == apt[i][j])                     //사용자가 입력한 호와 반복문으로 비교한 
            {                                    //데이터가 같으면
               System.out.println(apt[i][j]+"호의 관리비는 "+pay[i][j]+"입니다.");   //출력
            }
         }
      }
      
      System.out.println("문제3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력");   //문제3
      int max = 0;                                 // 가장 많은 관리비를 저장할 변수
      int min = pay[0][0];                           // 가장 적은 관리비를 담은 변수
      int maxapt = 0;                                 
      int minapt = 0;
      
      for(int i=0; i<3;i++)
      {
         for(int j = 0; j<3;j++)
         {
            if(max<pay[i][j])                        // 변수에 있는 값이 반복문으로 바뀌는 pay 배열의
            {                                    // 값보다 작다면
               max = pay[i][j];                     // 변수의 값을 교체함
               maxapt = apt[i][j];                     // 호를 출력해야 하기때문에 배열을 apt로 바꾸고 [i][j] 인덱스의
            }                                    // 값을 maxapt 변수에 넣음
            else if(min>pay[i][j])
            {                                    // 가장 작은 경우도 위와 동일
               min = pay[i][j];
               minapt = apt[i][j];
            }
         }
      }
      System.out.println("가장 많이 나온 아파트는 "+maxapt+"호 입니다.");
      
      System.out.println("가장 적게 나온 아파트는 "+minapt+"호 입니다.");
      System.out.println();
      
      System.out.println("문제4) 호 2개를 입력하면 관리비 교체");      // 문제 4
      System.out.println("첫번째 아파트:");
      int apt1 = sc.nextInt();                        // 교체할 첫 값을 저장
      System.out.println("두번째 아파트:");
      int apt2 = sc.nextInt();                        // 교체할 두번째 값을 저장
      
      int indexi = 0;
      int indexj = 0;
      
      int index2i = 0;
      int index2j = 0;
      
      
      for(int i = 0; i<3;i++)
      {
         for(int j = 0; j<3;j++)
         {
            if(apt1 == apt[i][j])                     // 첫 값과 배열의 값이 일치한다면
            {         
               indexi = i;                           // 배열의 인덱스를 각 변수에 저장함
               indexj = j;
            }
            else if(apt2 == apt[i][j])                  // 두번째 값도 동일함
            {
               index2i = i;
               index2j = j;
            }
         }
      }
      int temp = pay[indexi][indexj];                     // temp변수를 만들어 바꿀 첫 아파트의 관리비를 저장
       pay[indexi][indexj] =  pay[index2i][index2j];         // 첫 아파트 관리비에는 두번째 아파트 관리비 저장
       pay[index2i][index2j] = temp;                     // 두번째 아파트에는 처음에 저장해두었던 temp 변수의 값을 넣음
       
       for(int i = 0; i<3;i++)
         {
            for(int j = 0; j<3;j++)
            {
               System.out.print(pay[i][j]+" ");         // 반복문을 사용해 출력
            }
            System.out.println();
         }
   }

}
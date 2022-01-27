 import java.util.Scanner;
public class game {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int ladder [][] = {
            {0,0,0,0,0},
            {1,1,0,1,1},
            {0,1,1,0,0},
            {0,0,1,1,0},
            {1,1,0,0,0},
            {0,1,1,0,0},
            {1,1,0,0,0},
            {0,0,0,1,1},
            {0,0,0,0,0}};
      
      System.out.println("[0]~[4] 입력하세요");               // 사용자가 입력한 값을
      int x = sc.nextInt();                           // x 변수에 저장
      
      int y = 0;
      
      for(int i = 0;i<5;i++)
      {
         if(ladder[y][x]==0)                           // ladder 배열에 있는 값이 0이라면
         {
            y++;                                 // y값 증가
         }
         else if(ladder[y][x]==1)                     // 배열의 값이 1이라면
         {
            if(x != 0 && ladder[y][x-1] == 1)
            {                                    // 왼쪽에 있는 값이 1인지 비교 후
               x--;                              // 맞다면 x 값 감소
            }
            else if(x != 5 && ladder[y][x+1] == 1)         // 오른쪽에 있는 값이 1이라면
            {      
               x++;                              // x값 증가
            }
            y++;                                 
         }
      }
      System.out.println(x);
      System.out.println(y);
      
   }

}
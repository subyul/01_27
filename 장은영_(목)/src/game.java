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
      
      System.out.println("[0]~[4] �Է��ϼ���");               // ����ڰ� �Է��� ����
      int x = sc.nextInt();                           // x ������ ����
      
      int y = 0;
      
      for(int i = 0;i<5;i++)
      {
         if(ladder[y][x]==0)                           // ladder �迭�� �ִ� ���� 0�̶��
         {
            y++;                                 // y�� ����
         }
         else if(ladder[y][x]==1)                     // �迭�� ���� 1�̶��
         {
            if(x != 0 && ladder[y][x-1] == 1)
            {                                    // ���ʿ� �ִ� ���� 1���� �� ��
               x--;                              // �´ٸ� x �� ����
            }
            else if(x != 5 && ladder[y][x+1] == 1)         // �����ʿ� �ִ� ���� 1�̶��
            {      
               x++;                              // x�� ����
            }
            y++;                                 
         }
      }
      System.out.println(x);
      System.out.println(y);
      
   }

}
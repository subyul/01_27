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
      
      
      System.out.println("����1) ������ ������ �� ���");         // ���� 1
      
      for(int i = 0; i<3;i++)
      {
         int sum = 0;                                 // �������� ���� �����ϴ� ����
         for(int j = 0; j<3;j++)
         {
            sum += pay[i][j];                        // 2��for���� ����� 2�� �迭�� ���� ����
         }
         System.out.print(i+1+"��: "+sum);                // i�� ��������� 1������ ��Ÿ�����ϱ� ������
         System.out.println();                        // 1�� ����
         
         
         sum = 0;                                 // ������ �ִ� ���� �ʱ�ȭ
      }
      
      System.out.println("����2) ȣ�� �Է��ϸ� ������ ���");         // ���� 2
      System.out.println("ȣ�� �Է��ϼ���");
      int aptnum = sc.nextInt();
      
      for(int i=0; i<3;i++)
      {
         for(int j = 0; j<3;j++)
         {
            if(aptnum == apt[i][j])                     //����ڰ� �Է��� ȣ�� �ݺ������� ���� 
            {                                    //�����Ͱ� ������
               System.out.println(apt[i][j]+"ȣ�� ������� "+pay[i][j]+"�Դϴ�.");   //���
            }
         }
      }
      
      System.out.println("����3) ������ ���� ���� ���� ��, ���� ���� �� ���");   //����3
      int max = 0;                                 // ���� ���� ������ ������ ����
      int min = pay[0][0];                           // ���� ���� ������ ���� ����
      int maxapt = 0;                                 
      int minapt = 0;
      
      for(int i=0; i<3;i++)
      {
         for(int j = 0; j<3;j++)
         {
            if(max<pay[i][j])                        // ������ �ִ� ���� �ݺ������� �ٲ�� pay �迭��
            {                                    // ������ �۴ٸ�
               max = pay[i][j];                     // ������ ���� ��ü��
               maxapt = apt[i][j];                     // ȣ�� ����ؾ� �ϱ⶧���� �迭�� apt�� �ٲٰ� [i][j] �ε�����
            }                                    // ���� maxapt ������ ����
            else if(min>pay[i][j])
            {                                    // ���� ���� ��쵵 ���� ����
               min = pay[i][j];
               minapt = apt[i][j];
            }
         }
      }
      System.out.println("���� ���� ���� ����Ʈ�� "+maxapt+"ȣ �Դϴ�.");
      
      System.out.println("���� ���� ���� ����Ʈ�� "+minapt+"ȣ �Դϴ�.");
      System.out.println();
      
      System.out.println("����4) ȣ 2���� �Է��ϸ� ������ ��ü");      // ���� 4
      System.out.println("ù��° ����Ʈ:");
      int apt1 = sc.nextInt();                        // ��ü�� ù ���� ����
      System.out.println("�ι�° ����Ʈ:");
      int apt2 = sc.nextInt();                        // ��ü�� �ι�° ���� ����
      
      int indexi = 0;
      int indexj = 0;
      
      int index2i = 0;
      int index2j = 0;
      
      
      for(int i = 0; i<3;i++)
      {
         for(int j = 0; j<3;j++)
         {
            if(apt1 == apt[i][j])                     // ù ���� �迭�� ���� ��ġ�Ѵٸ�
            {         
               indexi = i;                           // �迭�� �ε����� �� ������ ������
               indexj = j;
            }
            else if(apt2 == apt[i][j])                  // �ι�° ���� ������
            {
               index2i = i;
               index2j = j;
            }
         }
      }
      int temp = pay[indexi][indexj];                     // temp������ ����� �ٲ� ù ����Ʈ�� ������ ����
       pay[indexi][indexj] =  pay[index2i][index2j];         // ù ����Ʈ �����񿡴� �ι�° ����Ʈ ������ ����
       pay[index2i][index2j] = temp;                     // �ι�° ����Ʈ���� ó���� �����صξ��� temp ������ ���� ����
       
       for(int i = 0; i<3;i++)
         {
            for(int j = 0; j<3;j++)
            {
               System.out.print(pay[i][j]+" ");         // �ݺ����� ����� ���
            }
            System.out.println();
         }
   }

}
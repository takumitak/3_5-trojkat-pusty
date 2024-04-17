import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz liczbe: ");
    int a = scanner.nextInt();
    System.out.println("Znak: ");
    char znak = scanner.next().charAt(0);
    int b=a;
    for(int i=0; i<a; i++)
      {
        for(int j = 0; j < b; j++)
          {
            System.out.print(" ");

          }
        if(i<3)
        {
          for(int j = 0; j < i; j++)
            {
              System.out.print(znak);
            }
        }
        else
        {
            for(int j = 0; j < i; j++)
              {
                if(j==0 || j==i-1)
                {
                  System.out.print(znak);
                }
                else
                {
                  System.out.print(" ");
                }
              }
        }
        b--;
        System.out.print('\n');
      }

    for(int j = 0; j < a; j++)
      {
        System.out.print(znak);
      }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
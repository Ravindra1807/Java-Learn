import java.util.Scanner;

class prime{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Ente Size : ");
    n = sc.nextInt();
    int a[] = new int[n];
    int max = 0;
    System.out.println("Enter A element : ");
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }     
    for (int idx = 0; idx < n; idx++) {
          if(a[idx]>max)
			{
				max=a[idx];
			}
    }
    System.out.println("Maximum Values of : " + max);
     int temp; 
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 9; j++)
        {
            if(a[i] > a[j]){
                temp  = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            
        }
        
    }
    System.out.println("Shorting A Arr : ");
    for (int i = 0; i < n; i++) 
    {
        System.out.println(a[i] + " ");
    }
    
            
        }
    
}
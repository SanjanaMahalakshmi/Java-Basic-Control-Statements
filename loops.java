import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int j = num;
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0)
        {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }


        switch(num){
            case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        
        }

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        
        while(j>0){
            System.out.print(j + " " ); 
            j--;
        }

        System.out.println();
        
        int k=1;
        do { 
            System.out.println(k + " ");
            k++;
        } while (k<=3);


    } 

}
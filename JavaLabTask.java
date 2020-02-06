
/* Import Java Libary Class */
import java.util.Scanner;


public class JavaLabTask {
     public static void main(String[] args) {
        JavaLabTask task = new JavaLabTask();
        /* Just remove the comment and run the problems (^_^) */
        //task.prb1();
        //task.prb2();
        //task.prb3();
        //task.prb4();
        //task.prb5();
        //task.prb6();
        //task.prb7();
        //task.prb8();
    }
    void prb1(){
        
        Scanner input = new Scanner(System.in);
        int salary,total;
        System.out.print("Input your salary: ");
        salary = input.nextInt();
        if(salary <= 10000){
            total = salary+(salary*2/10)+(salary*8/10);
        }else if(salary <= 20000){
            total = salary+(salary*25/100)+(salary*9/10);
        }else{
            total = salary+(salary*3/10)+(salary*9/10);
        }
        System.out.println("Your total Salary: "+total);
    }
    
    void prb2(){
        Scanner input = new Scanner(System.in);
        String st;
        int result[] = new int[11];
        System.out.println("Please a number: ");
        st = input.next();
        char str[] = st.toCharArray();
        for(char ch:str){
            switch(ch){
                case '0':
                    result[0]++;
                    break;
                case '1':
                    result[1]++;
                    break;
                case '2':
                    result[2]++;
                    break;
                case '3':
                    result[3]++;
                    break;
                case '4':
                    result[4]++;
                    break;
                case '5':
                    result[5]++;
                    break;
                case '6':
                    result[6]++;
                    break;
                case '7':
                    result[7]++;
                    break;
                case '8':
                    result[8]++;
                    break;
                case '9':
                    result[9]++;
                    break;
                default:
                    result[10]++;
                    break;
            }
        }
        
        for(int x=0;x<10;x++){
            System.out.println(x+" = "+result[x]);
        }
        System.out.println("Charectars = "+result[10]);
    }
    
    void prb3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a Decimal number: ");
        int inp;
        inp = input.nextInt();
        /* Using Libary Function */
        // System.out.println(Integer.toBinaryString(inp));
        /* Using Logical code */
        int binary[] = new int[32];
        int x=31,reminder;
        while(inp !=0){
            reminder = inp%2;
            inp = inp/2;
            if(reminder == 1){
                binary[x]=1;
            }
            x--;
        }
        boolean term=true;
        for(int b: binary){
            if(term){
                if(b==1){
                    term = false;
                    System.out.print(b);
                }
            }else{
                System.out.print(b);
            }
        }
        System.out.println("");
        
    }
    void prb4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int inp1,inp2;
        inp1 = input.nextInt();
        System.out.println("Please input another number: ");
        inp2 = input.nextInt();
        int big,small;
        if(inp1>inp2){
            big=inp1;
            small=inp2;
        }else{
            big = inp2;
            small = inp1;
        }
        
        int rem=1;
        while(rem != 0){
            rem = big%small;
            if(rem == 0){
                break;
            }
            big=small;
            small = rem;
        }
        System.out.println("LCM is: "+small);
    }
    
    void prb5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a charactar: ");
        char inp;
        inp = input.next().charAt(0); 
        if((inp >= 'a' && inp <= 'z') || (inp >= 'A' && inp <= 'Z')){
            System.out.println("You input is a alphabate.");
        }else if(inp>='0' && inp<='9'){
            System.out.println("Your input is a Digit");
        }else{
            System.out.println("Your input is a special charactar.");
        }
    }
    void prb6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input n value: ");
        int n;
        n = input.nextInt();
        for(int i=2;i<=n;i++){
            int count = 0;
            for(int j=2;j<=i;j++){
                if(i%j == 0){
                    count++;
                    if(count>2){
                        break;
                    }
                }
            }
            if(count<=1){
                System.out.println(i);
            }
        }
    }
    void prb7(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input n value: ");
        int n;
        n = input.nextInt();
        int a=0;
        int b=1;
        System.out.println(b);
        while(a<=n){
            int sum;
            sum = a+b;
            if(sum>n){
                break;
            }
            System.out.println(sum);
            a = b;
            b = sum;
        }
    
    }
    void prb8(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Input a number for star: ");
        n= input.nextInt();
        int j=n;
        for(int i=1;i<=n;i++){
            for(int x=1;x<=j;x++){
                System.out.print("*");
            }
            System.out.println("");
            j--;
        }
    }
}


   import java.util.Scanner;
class course {

    
    public static void main(String[] args) {
        //      System.out.println("hello");
        //     //  JOptionPane.showInternalMessageDialog(null, "hello");
        //  JOptionPane.sblueprinthowMessageDialog(null, "hello", "good", 3);
        // // JOptionPane.showMessageDialog("soo gali magacaa");
        // String sof;
        // sof = JOptionPane.showInputDialog("soo gali magacaaga:");
        // JOptionPane.showConfirmDialog(null, "magacaaga waa "+sof, "hu", 0);
        // by using keybourd (NB)
        //  Scanner ob=new Scanner(System.in);
        //  int a,b,sum;
        //  System.out.println("enter num1:");
        //  a=ob.nextInt();
        //  System.out.println("enter num2:");
        //  b=ob.nextInt();
        //  sum=a+b;
        //  System.out.println("sum is :"+sum);

        // condition = if , else.else--if,switch , incremental 
        //  int x=10;
        //  if(x>10) {
        //   System.out.println("welcome");
        //  }  else
        //     System.out.println("go back");
        //   


        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int marks = s.nextInt(); // Corrected this line
        if (marks > 90 && marks <= 100) {
            System.out.println("A+ grade");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("B+ grade");
        } else {
            System.out.println("Invalid");
        }
    }
}

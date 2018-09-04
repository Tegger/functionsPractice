import java.util.Scanner;

public class main {

    public static void main(String[] args){

        int nUserNum1, nUserNum2, nUserNum3, nResult = 0;

        nUserNum1 = getInput("Enter a number ");
        System.out.println("The first number is " + nUserNum1);

        nUserNum2 = getInput("Enter another number ");
        System.out.println("The second number is " + nUserNum2);

        nUserNum3 = getInput("Enter a third number ");
        System.out.println("The third number is " + nUserNum3);

        nResult = bigger(nUserNum1, nUserNum2, nUserNum3);


        System.out.println(nResult + " is the bigger number.");





    }


    public static int getInput(String sLabel){
        int nItem = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextInt();

        return nItem;

    }

    public static int bigger(int num1, int num2){
        int result;

        if (num1 > num2){
            result = num1;

        }else{
            result = num2;
        }

        return result;
    }

    public static int bigger(int num1, int num2, int num3){
        int result;

        if (num1 > num2 && num1 >num3){
            result = num1;

        }else if (num2 > num1 && num2 > num3){
            result = num2;
        }else{
            result = num3;
        }

        return result;
    }


}

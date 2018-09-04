import java.util.Scanner;

public class main {

    public static void main(String[] args){

        int nUserNum1, nUserNum2, nUserNum3, nResult = 0;

        nUserNum1 = getInput("Enter a number ");//calling function
        System.out.println("The first number is " + nUserNum1);

        nUserNum2 = getInput("Enter another number ");//calling function
        System.out.println("The second number is " + nUserNum2);

        nUserNum3 = getInput("Enter a third number ");//calling function
        System.out.println("The third number is " + nUserNum3);

        nResult = bigger(nUserNum1, nUserNum2, nUserNum3);//calling function


        System.out.println(nResult + " is the bigger number.");

        arrayTest();//calling function



    }


    public static int getInput(String sLabel){
        int nItem = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextInt();

        return nItem;

    }
    //Function
    public static int bigger(int num1, int num2){
        int result;

        if (num1 > num2){
            result = num1;

        }else{
            result = num2;
        }

        return result;
    }
    //overloading the function is A OK!
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
    //arrays
    public static void arrayTest (){
        int [] aNumber; //declaration
        aNumber = new int[10]; // init, setting the array to be 10 spaces large. 0-9

        //int [] aNumber1 = new int[10]; //Same thing as above but shorter

       // int aNumber2 [] = new int[10];//same thing as above

        aNumber [0] = 1; //sets the first section of the array to 5
        aNumber [9] = 10; // sets the last section of the array to 10

        //prints the array
        for(int i = 0; i < aNumber.length; i++){
            System.out.println("Array element is :" + aNumber[i]);
        }


    }

    //checkerboard array
    public static void dblArray(){
        int [][] aMultiArray = new int [5][6];

        aMultiArray[3][4] = 50; //sets column 3 line 4 = 50


    }

}

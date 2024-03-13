import java.util.Scanner;
public class student {

    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
       System.out.println("Enter the number of subjects:");
       int numSub = S.nextInt();

       if(numSub<=0){
        System.out.println("Please enter valid number of subject:");
        return;
       }

       int totalMarks = 0;
       int maxMarksSub = 100;
       for(int i=1;i<=numSub;i++)
       {
        System.out.println("Enter the Marks in each Subject (Out of 100):" +i);
        int marks = S.nextInt();
        if(marks < 0 || marks> maxMarksSub)
        {
            System.out.println("Please enter the marks in valid range i.e. 1 to 100");
            i--;
        }
        else{
            totalMarks += marks;
            }
       }


       double avgPercentage = (double) totalMarks / (numSub * maxMarksSub)*100;
       System.out.println("Total Marks: " +totalMarks);
       System.out.println("Average Percentage:" + avgPercentage + "%");

       String Grade;
       if(avgPercentage>=90){
        Grade= "A+";
       }
       else if (avgPercentage>=80){
        Grade= "A";
       }
       else if (avgPercentage>=70){
        Grade= "B";
       }
       else if (avgPercentage>=60)
       {
        Grade= "C";
       }
       else if (avgPercentage>=50)
       {
        Grade= "D";
       }
       else {
        Grade= "F";
       }
       System.out.println("Grades:" +Grade);
       }
    }

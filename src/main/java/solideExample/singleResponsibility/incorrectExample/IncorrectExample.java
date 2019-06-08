package solideExample.singleResponsibility.incorrectExample;

public class IncorrectExample {

    public int summarize(int ... arr){

        int sum = 0;

        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    public void printInformation(int number){
        System.out.println(number);
    }
}

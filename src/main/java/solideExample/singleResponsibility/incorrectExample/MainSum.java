package solideExample.singleResponsibility.incorrectExample;

public class MainSum {
    public static void main(String[] args){
        IncorrectExample printInformation = new IncorrectExample();
        printInformation.printInformation(printInformation.summarize(1, 2, 3, 4, 5, 6));
    }
}

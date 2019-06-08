package solideExample.singleResponsibility.correctExample;

public class MainSum {
    public static void main(String[] args){
        Sum sum = new Sum();
        PrintInformation printInformation = new PrintInformation();
        printInformation.printInformation(sum.summarize(1, 2, 3, 4, 5, 6));
    }
}

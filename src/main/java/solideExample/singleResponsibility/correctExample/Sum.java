package solideExample.singleResponsibility.correctExample;

import java.util.List;

public class Sum {

    public int summarize(int ... arr){

        int sum = 0;

        for (int number : arr) {
            sum += number;
        }
        return sum;
    }
}


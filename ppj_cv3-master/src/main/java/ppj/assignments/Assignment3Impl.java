package ppj.assignments;

import java.util.List;

public class Assignment3Impl implements Assignment3{
    @Override
    public int deepSumOfEvenSquaredNumbers(List<List<Integer>> src) {
        int value = 0;
        for (List<Integer> list: src) {
            for (Integer number: list) {
                if(number%2 == 0) value+=number*number;
            }
        }
        return value;
    }

    @Override
    public int sumOfDivisibleInRange(int from, int to, List<Integer> divisibleBy) {
        if(from < 0 || to < 0) return 0;

        int number = 1;
        for (Integer i: divisibleBy) {
            number=i*number/greatestCommonDivisor(i,number);
        }

        int value = 0;
        for (int i = ((from - 1)/number + 1)*number; i < to; i+=number) {
            value+=i;
        }
        return value;
    }

    private int greatestCommonDivisor(int x, int y){
        //Eukleidův algoritmus
        if(y == 0) return x;
        return greatestCommonDivisor(y,x%y);
    }
}

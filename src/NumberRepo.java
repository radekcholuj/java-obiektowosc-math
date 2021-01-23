public class NumberRepo {
    double[] numbers;

    NumberRepo(int size){
        numbers = new double[size];
    }

    void displayAll(){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    void generateValues(){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
    }

    double findMin(){
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        return min;
    }

    double findMax(){
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }

    double[] logNumbers(){
        double[] tmp = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tmp[i] = Math.log(numbers[i]);
        }
        return tmp;
    }
}

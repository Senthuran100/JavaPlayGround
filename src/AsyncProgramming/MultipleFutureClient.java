package AsyncProgramming;

import java.util.concurrent.*;

public class MultipleFutureClient {

    public static void main(String[] args) {
        Callable<String> result = () -> "Task is done";

        int number = 100;
        Callable<Integer> sumEvenNumber = () -> {
            int sum = 0;
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0)
                    sum += i;
            }
            return sum;
        };

        Callable<Integer> sumOddNumber = () -> {
            int sum = 0;
            for (int i = 0; i < number; i++) {
                if (i % 2 == 1)
                    sum += i;
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future1 = executorService.submit(result);
        Future<Integer> future2 = executorService.submit(sumEvenNumber);
        Future<Integer> future3 = executorService.submit(sumOddNumber);

        try {
            System.out.println(future1.get());
            System.out.println("Sum of Even numbers " + future2.get());
            System.out.println("Sum of Odd numbers " + future3.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}

package AsyncProgramming;

import java.util.concurrent.*;

public class ClientTest {

    public static void main(String[] args) {
        System.out.println("Hi");
        Callable<String> task1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 1 is done";
            }
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(task1);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hi3");
    }
};


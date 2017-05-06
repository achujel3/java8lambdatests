public class RunnableExample {

    public static void main(String[] args) {
        // Normal way:
        Thread myThread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running inside a thread");
            }
        };
        myThread.run();

        // Lambda way:
        Thread myLambdaThread = new Thread(()-> {
            System.out.println("This is running inside a lambda thread");
            System.out.println("Also this");});
        myLambdaThread.run();

    }

}

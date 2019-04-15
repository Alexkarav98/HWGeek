public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Task1 task1 = new Task1();
        PrintLetter plt1 = new PrintLetter(task1, 'A', 'B');
        PrintLetter plt2 = new PrintLetter(task1, 'B', 'C');
        PrintLetter plt3 = new PrintLetter(task1, 'C', 'A');

        try {
            plt1.getThread().join();
            plt2.getThread().join();
            plt3.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

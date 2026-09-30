public class infiniteLoopDoWhile {
    static void infinite(){
        do { 
            System.err.println("infinite loop");
            
        } while (true);
    }
    public static void main(String[] args) {
        infinite();
    }
}

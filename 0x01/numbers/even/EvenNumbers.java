public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 98; i++){
            if (i % 2 == 0) {
                if (i < 98)
                System.out.printf(i + ", ");
                else
                System.out.printf(i + "\n");
            }
        }  
    }
}
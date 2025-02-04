public class   rebours{

    public static void main(String[] args) {
        System.out.println("Lancement");
        
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Décollage !");
    }
}

public class Messages {

    public static void printWelcomeMessage(){
        System.out.println("The Engine welcomes you");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".\n");

    }

    public static void printAvailableFuntions(){
        System.out.println("Available Funtions: NONE");
    }

    public static void printEndMessage(){
        System.out.println("\n\nGoodbye Master");
    }

    static private void sleep(int ns){

        try{
            Thread.sleep(500);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

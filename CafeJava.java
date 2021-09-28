public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 1.5;
        double lattePrice = 2.25;
        double cappuccinoPrice = 2.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage); // cind, order made but not ready

        // noah ordered a capp
        System.out.println(generalGreeting + customer4);
        if( isReadyOrder4 ) {
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
        System.out.println(customer4 + pendingMessage);
        }
        // sam ordered 2 lattes
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (lattePrice*2));
        isReadyOrder2 = false;
        if( isReadyOrder2 ) {
        System.out.println(customer2 + readyMessage);
        } else {
        System.out.println(customer2 + pendingMessage);
        }
        // jimmy got charged for coffee but ordered a latte, he owes how much
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}

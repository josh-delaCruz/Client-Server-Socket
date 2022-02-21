
package ClientSocket;


public class App {

    
    public static void main(String[] args) {
         CSocket client = new CSocket(6789, "localhost");
        
        client.connetti();
        client.comunica();
    }
    
}

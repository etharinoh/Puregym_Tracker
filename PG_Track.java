import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;  
import java.net.http.HttpResponse.BodyHandlers;


/**
 * PG_Track
 */
public class PG_Track {

    // Variables

    // Constants

    public static void main(String[] args) {
        getNASATest();
    }

    public String getUserGyms(String user, String pass) {

        return user;
    }

    public static void getNASATest() {
        String nasa  = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";

        HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(nasa))
         .build();
   client.sendAsync(request, BodyHandlers.ofString())
         .thenApply(HttpResponse::body)
         .thenAccept(System.out::println)
         .join(); 
        
    }
}
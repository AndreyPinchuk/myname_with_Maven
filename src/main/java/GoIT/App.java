package GoIT;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        Map<String, String> customer = new HashMap<>();
        customer.put("name", "Andrii");
        customer.put("lastName", "Pinchuk");

        System.out.println(new Gson().toJson(customer));
    }
}

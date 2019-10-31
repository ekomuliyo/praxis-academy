/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JSON;

import com.google.gson.*;

public class App{

    public static void main(String[] args) {

        // Encoding JSON atau membuat data menjadi JSON 

        JsonObject obj = new JsonObject();

        obj.addProperty("Name", "Foo");
        obj.addProperty("Num", 1000);
        obj.addProperty("Balance", 200);
        obj.addProperty("is_vip", true);

        System.out.println(obj);

        // Decoding JSON atau membaca data dari JSON
        JsonParser parser = new JsonParser();
        String data = "{ \"f1\":\"Hello\",\"f2\":{\"f3:\":\"World\", \"f4:\":\"Dunia\"}}";

        JsonElement jsonTree = parser.parse(data);

        if(jsonTree.isJsonObject()){
            JsonObject jsonObject = jsonTree.getAsJsonObject();

            JsonElement f1 = jsonObject.get("f2");
            System.out.println(f1);
            System.out.println(jsonObject);
        }
        System.out.println(jsonTree);
    }
}

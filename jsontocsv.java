package csvtojson11;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class jsontocsv {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        StringBuilder content = null;
        String result = null;
        reader = new BufferedReader(new FileReader("C:\\Users\\devayani.mandapalli\\Downloads\\json1.json"));
        String line = null;
        content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();
        result = content.toString();
        JsonElement jelement = new JsonParser().parse(result);
        print(jelement);
        //System.out.println(jelement);

    }

    public static void print(JsonElement jelement) {
        if (jelement.isJsonPrimitive()) {
            System.out.println(jelement.getAsString());
            return;
        }
        if (jelement.isJsonArray()) {
            JsonArray jarray = jelement.getAsJsonArray();
            for (int i = 0; i < jarray.size(); i++) {
                JsonElement element = jarray.get(i);
                //  System.out.println(element);
                //  JsonObject obj;
                //  obj = new JsonObject(element.toString());
                //    JSONObject params = obj.getJSONObject("params");
//Make string a JSONObject

                print(element);
            }
            return;
        }
        JsonObject jobject = jelement.getAsJsonObject();
        Set<Map.Entry<String, JsonElement>> set = jobject.entrySet();
        for (Map.Entry<String, JsonElement> s : set) {
            System.out.println(s.getKey());
            print(s.getValue());
            }

    }
}
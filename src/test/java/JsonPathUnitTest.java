
import com.jayway.jsonpath.JsonPath;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;
import net.minidev.json.JSONArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User-PC
 */
public class JsonPathUnitTest {
    
    private static String json  = "{\"delivery_codes\": [{\"postal_code\": {\"district\": \"Ghaziabad\", \"pin\": 201001, \"pre_paid\": \"Y\", \"cash\": \"Y\", \"pickup\": \"Y\", \"repl\": \"N\", \"cod\": \"Y\", \"is_oda\": \"N\", \"sort_code\": \"GB\", \"state_code\": \"UP\"}}]}";
 
    private static File jsonFile = new File("src/main/resources/online_store.json");

    private static String readFile(File file, Charset charset) throws IOException {
    return new String(Files.readAllBytes(file.toPath()), charset);
    }
    
     public static void main (String [] Args) {  
         Map<String, String> objectMap = JsonPath.read(json, "$");
         JSONArray jsonArray = JsonPath.read(json, "$.delivery_codes");
         System.out.print(jsonArray);
    
     }
    
//   
//    @Test
//    public void shouldMatchCountOfObjects() {
//        Map<String, String> objectMap = JsonPath.read(json, "$");
//        assertEquals(3, objectMap.keySet()
//            .size());
//    }
//
//    @Test
//    public void shouldMatchCountOfArrays() {
//        JSONArray jsonArray = JsonPath.read(json, "$.items.book[*]");
//        assertEquals(2, jsonArray.size());
//    }

}

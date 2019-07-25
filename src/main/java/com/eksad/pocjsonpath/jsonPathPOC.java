/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eksad.pocjsonpath;

import java.util.Map;
import net.minidev.json.JSONArray;

/**
 *
 * @author User-PC
 */
public class jsonPathPOC {
    private static String json  = "{\"delivery_codes\": [{\"postal_code\": {\"district\": \"Ghaziabad\", \"pin\": 201001, \"pre_paid\": \"Y\", \"cash\": \"6\", \"pickup\": \"Y\", \"repl\": \"N\", \"cod\": \"Y\", \"is_oda\": \"N\", \"sort_code\": \"GB\", \"state_code\": \"UP\"}}]}";
 
     public static void main (String [] Args) {  
//         get root
         Map<String, String> objectMap = com.jayway.jsonpath.JsonPath.read(json, "$");
//         get element all in delivery_codes
         JSONArray jsonArray = com.jayway.jsonpath.JsonPath.read(json, "$.delivery_codes");
//         get all element postal code
         JSONArray jsonArrayGetIndex = com.jayway.jsonpath.JsonPath.read(json, "$.delivery_codes[*].postal_code");
//         get by index always single value
         String jsonArrayGetIndexa = com.jayway.jsonpath.JsonPath.read(json, "$.delivery_codes[0].postal_code.sort_code");
//         get by alement atribut district array value
         JSONArray jsonArrayGetIndexb = com.jayway.jsonpath.JsonPath.read(json, "$..district");
         Map<String, String> jsonArrayMap = com.jayway.jsonpath.JsonPath.read(json, "$");
         System.out.println("GET ROOT => " + objectMap);
         System.out.println("GET ALL => " + jsonArray);
         System.out.println("GET INDEX => " + jsonArrayGetIndex);
         System.out.println("GET SINGGLE => " + jsonArrayGetIndexa);
         System.out.println("GET SINGGLE => " + jsonArrayGetIndexb);
         System.out.println("GET ALL ARRAY => " + jsonArrayMap);
    
     }
    
}

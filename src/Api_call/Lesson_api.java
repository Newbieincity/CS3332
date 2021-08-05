/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api_call;


import Model.Lesson;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Stack;

public class Lesson_api {
    
    public static Stack<Lesson> getAllLesson() {
        //Endpoint
        String getAllLessonURL = "http://cs3332projectapi-env.eba-ym28ar2b.ap-southeast-1.elasticbeanstalk.com/api/v1/lesson";
//        String getLessonByID = "";
Stack<Lesson> lessons = new Stack<>();
        try {
            URL url = new URL(getAllLessonURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            InputStream br = new BufferedInputStream(conn.getInputStream());
            String output = IOUtils.toString(br, "UTF-8");

            JSONObject myRes = new JSONObject(output);
            JSONArray data = (JSONArray) myRes.get("data");
            System.out.println("");
            System.out.println("Data details: ");
            //Lesson[] lessons = new Lesson[data.length()];
            for (int i = 0; i < data.length(); i++) {
                
              lessons.add(i,new Lesson(
                        data.getJSONObject(i).get("lesson_id").toString(),
                        data.getJSONObject(i).get("title").toString(),
                        data.getJSONObject(i).get("description").toString(),
                        data.getJSONObject(i).get("content").toString(),
                        data.getJSONObject(i).get("created_at").toString(),
                        data.getJSONObject(i).get("created_by").toString(),
                        data.getJSONObject(i).get("modified_at").toString(),
                        data.getJSONObject(i).get("modified_by").toString(),
                        data.getJSONObject(i).get("status").hashCode()
              ));
            }
            for (int i = 0; i < lessons.size(); i++) {
                System.out.println(lessons.get(i));
            }
            br.close();
            conn.disconnect();
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        
  return lessons;
}
    
    public static boolean createLesson (String title , String description,String content){
        String createLessonURL = "http://cs3332projectapi-env.eba-ym28ar2b.ap-southeast-1.elasticbeanstalk.com/api/v1/lesson";
         String json ="{\n" +
                "    \"title\":\""+  title + "\",\n" +
                "    \"description\":\"" + description + "\",\n" +
                   "    \"content\":\"" + content + "\"\n" + 
                "}";
         boolean postCheck=false;
        
     try {
          URL url = new URL(createLessonURL);
          HttpURLConnection conn = (HttpURLConnection) url.openConnection();
          conn.setConnectTimeout(5000);
           conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("POST");
           OutputStream os = conn.getOutputStream();
           os.write(json.getBytes("UTF-8"));
          // System.out.println(os);
           os.close();
           //
           InputStream in = new BufferedInputStream(conn.getInputStream());
           String result =IOUtils.toString(in, "UTF-8");
           System.out.println(result);
           System.out.println("result after..");
           JSONObject myRes =new JSONObject(result);
           
           System.out.println(myRes.get("status"));
           if (myRes.get("status").hashCode()==1){
               postCheck =true;
           }
           else postCheck =false;
           in.close();
           conn.disconnect();
           
      }catch (Exception e){
          System.out.println(e);
          postCheck=false;
                  
         
      }      
     return postCheck;
    }
      public static boolean updateLesson (String lessonID,String title , String description,String content,int status){
        String createLessonURL = "http://cs3332projectapi-env.eba-ym28ar2b.ap-southeast-1.elasticbeanstalk.com/api/v1/lesson/"+lessonID;
         String json ="{\n" +
                "    \"title\":\""+  title + "\",\n" +
                "    \"description\":\"" + description + "\",\n" +
                   "    \"content\":\"" + content + "\",\n" + 
                    "    \"status\":\"" + status + "\"\n" + 
                "}";
         boolean updatecheck=false;
        
     try {
          URL url = new URL(createLessonURL);
          HttpURLConnection conn = (HttpURLConnection) url.openConnection();
          conn.setConnectTimeout(5000);
           conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("PUT");
           OutputStream os = conn.getOutputStream();
           os.write(json.getBytes("UTF-8"));
          // System.out.println(os);
           os.close();
           //
           InputStream in = new BufferedInputStream(conn.getInputStream());
           String result =IOUtils.toString(in, "UTF-8");
           System.out.println(result);
           System.out.println("result after..");
           JSONObject myRes =new JSONObject(result);
           
           System.out.println(myRes.get("status"));
           if (myRes.get("status").hashCode()==1){
               updatecheck =true;
           }
           else updatecheck =false;
           in.close();
           conn.disconnect();
           
      }catch (Exception e){
          System.out.println(e);
          updatecheck=false;
                  
         
      }      
     return updatecheck;
    }
        
      public static boolean deleteLesson (String lessonID){
        String deleteLessonURL = "http://cs3332projectapi-env.eba-ym28ar2b.ap-southeast-1.elasticbeanstalk.com/api/v1/lesson/"+lessonID;
         
         boolean deletecheck=false;
          System.out.println(lessonID);
     try {
          URL url = new URL(deleteLessonURL);
          HttpURLConnection conn = (HttpURLConnection) url.openConnection();
          conn.setConnectTimeout(5000);
           conn.setDoOutput(true);
           //conn.setDoInput(true);
           conn.setRequestProperty("Accept", "application/json");
           conn.setRequestProperty("Content-Type", "application/x-www-form-urlenconded");
            conn.setRequestMethod("DELETE");
            conn.connect();
            conn.getInputStream();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            
           InputStream in = new BufferedInputStream(conn.getInputStream());
           String result =IOUtils.toString(in, "UTF-8");
           System.out.println(result);
           System.out.println("result after..");
           JSONObject myRes =new JSONObject(result);
           
           System.out.println(myRes.get("status"));
           if (myRes.get("status").hashCode()==1){
               deletecheck =true;
           }
           else deletecheck =false;
           in.close();
           conn.disconnect();
           
           
      }catch (Exception e){
          System.out.println(e);
          deletecheck=false;
                  
         
      }    
     return deletecheck;
    }  
           
   
}

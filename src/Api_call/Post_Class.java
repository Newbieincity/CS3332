/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api_call;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

/**
 *
 * @author duyto
 */
public class Post_Class {
    public static boolean  login (String userName ,String password) {
        String json ="{\n" +
                "    \"username\":\""+  userName + "\",\n" +
                "    \"password\":\"" + password + "\"\n" +
                "}";
        String query_url_post ="http://cs3332projectapi-env.eba-ym28ar2b.ap-southeast-1.elasticbeanstalk.com/api/v1/auth_admin/login";
       // System.out.println(json);
        boolean check =false;
      try {
          URL url = new URL(query_url_post);
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
               check =true;
           }
           else check =false;
           
           in.close();
           conn.disconnect();
           
      }catch (Exception e){
          System.out.println(e);
         check =false;
      }       

    return check;
    }
}
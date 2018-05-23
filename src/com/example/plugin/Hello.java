package com.example.plugin;
import com.video.MainVideoActivity;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log; 
import android.content.Intent;
import android.content.Context;
public class Hello extends CordovaPlugin {
   @Override
   public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
      // Log.d("Hello.javafile", data.getString(0));
       if (action.equals("greet")) {
            String message = data.getString(0);      // message we sent from Hybrid View.
            Context context = cordova.getActivity().getApplicationContext();       // get current view on which native view is to be displayed.
            Intent intent = new Intent(context, MainVideoActivity.class);      // use intent to switch between views.
            cordova.getActivity().startActivity(intent);       // start switching.
          
       }
        return true;
   }
}



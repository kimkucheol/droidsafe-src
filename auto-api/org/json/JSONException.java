package org.json;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class JSONException extends Exception {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.218 -0400", hash_original_method = "D7D56E71DBC1CB75BB9A8A89BF06234E", hash_generated_method = "F5CC0B0C7C84C28DA2AB6A2CEC56BC3E")
    public  JSONException(String s) {
        super(s);
        addTaint(s.getTaint());
        
    }

    
}


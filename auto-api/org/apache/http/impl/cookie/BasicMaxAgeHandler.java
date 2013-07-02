package org.apache.http.impl.cookie;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.936 -0400", hash_original_method = "B0446CDE16622CCB68895B794F750D42", hash_generated_method = "DA4D840327CEBBF0C24EEEA6E9EA8A83")
    public  BasicMaxAgeHandler() {
        super();
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.936 -0400", hash_original_method = "A8EE51F3135F41C00ED9344CF5263715", hash_generated_method = "CBDC93842CA7828D6280A659FE206BC7")
    public void parse(final SetCookie cookie, final String value) throws MalformedCookieException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Cookie may not be null");
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new MalformedCookieException("Missing value for max-age attribute");
        } 
        int age;
        try 
        {
            age = Integer.parseInt(value);
        } 
        catch (NumberFormatException e)
        {
        	throw new MalformedCookieException ("Invalid max-age attribute: " 
                    + value);
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new MalformedCookieException ("Negative max-age attribute: " 
                    + value);
        } 
        cookie.setExpiryDate(new Date(System.currentTimeMillis() + age * 1000L));
        addTaint(cookie.getTaint());
        addTaint(value.getTaint());
        
        
            
        
        
            
        
        
        
            
        
            
                    
        
        
            
                    
        
        
    }

    
}


package org.apache.http.client;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;

public class ClientProtocolException extends IOException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:38.693 -0400", hash_original_method = "3260DCF079E7C772EA6A90502130DC83", hash_generated_method = "FCE7E5BB85943B23D2128F2BCBDDA47B")
    public  ClientProtocolException() {
        super();
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:38.694 -0400", hash_original_method = "98A3EFA06D403E8456E33B2220E5EB15", hash_generated_method = "949A737D612AA78E26792D75B72DA50C")
    public  ClientProtocolException(String s) {
        super(s);
        addTaint(s.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:38.695 -0400", hash_original_method = "CE5566FA43618E2C322AA845802DCAD6", hash_generated_method = "6F658E9893B189D0BD14B49BED58D9C9")
    public  ClientProtocolException(Throwable cause) {
        initCause(cause);
        addTaint(cause.getTaint());
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:38.695 -0400", hash_original_method = "3D3F161C5740C8F0A7A6AC126178E78A", hash_generated_method = "E4A38F0B3D51CE6B56BEC9B46BF6DE61")
    public  ClientProtocolException(String message, Throwable cause) {
        super(message);
        initCause(cause);
        addTaint(message.getTaint());
        addTaint(cause.getTaint());
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:38.695 -0400", hash_original_field = "817BD87F42299068DB46E89E05708687", hash_generated_field = "849904E61BBB72520A629731F16C7F17")

    private static final long serialVersionUID = -5596590843227115865L;
}


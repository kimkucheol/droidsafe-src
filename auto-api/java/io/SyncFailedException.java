package java.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class SyncFailedException extends IOException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.152 -0400", hash_original_method = "B401EEC06D6A312F5D3599A2F76A49BA", hash_generated_method = "EC4259B586D633B9BBB81D8C9A90A2FA")
    public  SyncFailedException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.152 -0400", hash_original_field = "5DA35B563F076BD1140D581EF6527A1C", hash_generated_field = "EB2AD8173B9F6F2C235BC311EF9FE10D")

    private static final long serialVersionUID = -2353342684412443330L;
}


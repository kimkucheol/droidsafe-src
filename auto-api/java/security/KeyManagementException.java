package java.security;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class KeyManagementException extends KeyException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.200 -0400", hash_original_method = "C1C9437036F95280A4529C1CBB03A96B", hash_generated_method = "12290799FE758A646DD4BBABC191F2F2")
    public  KeyManagementException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.201 -0400", hash_original_method = "DE152C48BD78964F95EBFDDBEC69C54C", hash_generated_method = "B8734ACC6C474635792EA54D4600570D")
    public  KeyManagementException() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.201 -0400", hash_original_method = "81AAB74590EA3C5396EE9D20F7BBE3DD", hash_generated_method = "BCD74327524F6BAACBDE3A418ED27A46")
    public  KeyManagementException(String message, Throwable cause) {
        super(message, cause);
        addTaint(message.getTaint());
        addTaint(cause.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.201 -0400", hash_original_method = "E6EDC076BA6A403E961006D69F90ADCE", hash_generated_method = "AE80041D9385FDB751F3E8E6332E1E5F")
    public  KeyManagementException(Throwable cause) {
        super(cause);
        addTaint(cause.getTaint());
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.201 -0400", hash_original_field = "0819FDBF7CCBB92DD360734FD894B65F", hash_generated_field = "89D5F685E2DD3F83FC2D5B9AF7510AA0")

    private static final long serialVersionUID = 947674216157062695L;
}


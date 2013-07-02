package java.security;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class KeyStoreException extends GeneralSecurityException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.315 -0400", hash_original_method = "7369A8C363020ACD6ED9F21AE7042369", hash_generated_method = "6724E2B6D063B954254D89FE652261EB")
    public  KeyStoreException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.315 -0400", hash_original_method = "A81CEEB8E106BDB258202C5859E57972", hash_generated_method = "B0CFCB7D37C93DFA922912D5B07DB53B")
    public  KeyStoreException() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.316 -0400", hash_original_method = "B8FD54DFEAD6E5AF89E6549D49EE9467", hash_generated_method = "F7F39E569D25A86DD1E1BABD1D6DCB77")
    public  KeyStoreException(String message, Throwable cause) {
        super(message, cause);
        addTaint(message.getTaint());
        addTaint(cause.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.317 -0400", hash_original_method = "4819C5194870119A368744981D172EEA", hash_generated_method = "272D78745DC00DCC27EDCE6B35C30324")
    public  KeyStoreException(Throwable cause) {
        super(cause);
        addTaint(cause.getTaint());
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.317 -0400", hash_original_field = "0B3A4A21076FD09510AF3E6C5D3B5FD9", hash_generated_field = "9E8817162139C00CFA46CC9F751DAE7C")

    private static final long serialVersionUID = -1119353179322377262L;
}


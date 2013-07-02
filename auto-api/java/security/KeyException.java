package java.security;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class KeyException extends GeneralSecurityException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.178 -0400", hash_original_method = "DF716A570A039E910D1B39CE7ED06D52", hash_generated_method = "0C4481BC34EF84589E3E6CBBA0125AC7")
    public  KeyException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.178 -0400", hash_original_method = "FF58C5A0C82C3954DB19F7723F0C2CA4", hash_generated_method = "974664EB1A4375B6CDF06EAAEE7EF681")
    public  KeyException() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.178 -0400", hash_original_method = "93F87888548BE89CB4AA687EEDB8405D", hash_generated_method = "C9D5FCC900912FD27AB69E227DD5A6B5")
    public  KeyException(String message, Throwable cause) {
        super(message, cause);
        addTaint(message.getTaint());
        addTaint(cause.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.178 -0400", hash_original_method = "ED6FE96D5D1CB668863944D14AFF3EBE", hash_generated_method = "B61BDB6BD30DEED1E8037EFACDE6C4BD")
    public  KeyException(Throwable cause) {
        super(cause);
        addTaint(cause.getTaint());
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:57.178 -0400", hash_original_field = "ACFCA8838A3642C0C8A34B2202545F41", hash_generated_field = "BC3993799412C0E44E7504AF1A370A7B")

    private static final long serialVersionUID = -7483676942812432108L;
}


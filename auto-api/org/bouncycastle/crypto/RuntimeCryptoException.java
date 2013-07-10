package org.bouncycastle.crypto;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class RuntimeCryptoException extends RuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.575 -0400", hash_original_method = "967763ED132A6B5D59753D4D73A06C5A", hash_generated_method = "D6A2F7F0EC5B2291AE5C6C87E6295099")
    public  RuntimeCryptoException() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.575 -0400", hash_original_method = "E9BB75E73BA30AD97FC5CFD7AF8A9F87", hash_generated_method = "383E90D38FAFD32EB8D3C2B60414DEA5")
    public  RuntimeCryptoException(
        String  message) {
        super(message);
        addTaint(message.getTaint());
        
    }

    
}


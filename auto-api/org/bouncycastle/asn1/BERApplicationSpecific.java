package org.bouncycastle.asn1;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class BERApplicationSpecific extends DERApplicationSpecific {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.094 -0400", hash_original_method = "E78D77DEE677FFFF68D062C7ECE7F399", hash_generated_method = "42E0EA3CF15A9DBCC19AEFE50939F55E")
    public  BERApplicationSpecific(int tagNo, ASN1EncodableVector vec) {
        super(tagNo, vec);
        addTaint(tagNo);
        addTaint(vec.getTaint());
        
    }

    
}


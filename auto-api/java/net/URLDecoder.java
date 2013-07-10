package java.net;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import libcore.net.UriCodec;

public class URLDecoder {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:54.611 -0400", hash_original_method = "857A327B54EFC5B6C22CAE0D3F8923A2", hash_generated_method = "857A327B54EFC5B6C22CAE0D3F8923A2")
    public URLDecoder ()
    {
        
    }


    @DSModeled(DSC.SAFE)
    @Deprecated
    public static String decode(String s) {
        return UriCodec.decode(s, true, Charset.defaultCharset());
    }

    
    @DSModeled(DSC.SAFE)
    public static String decode(String s, String encoding) throws UnsupportedEncodingException {
        return UriCodec.decode(s, true, Charset.forName(encoding));
    }

    
}


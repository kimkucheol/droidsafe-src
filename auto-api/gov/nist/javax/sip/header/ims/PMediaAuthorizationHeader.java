package gov.nist.javax.sip.header.ims;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import javax.sip.InvalidArgumentException;
import javax.sip.header.Header;

public interface PMediaAuthorizationHeader extends Header
{

    
    public final static String NAME = "P-Media-Authorization";

    
    public void setMediaAuthorizationToken(String token) throws InvalidArgumentException;

    
    public String getToken();


}

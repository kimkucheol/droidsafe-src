package gov.nist.javax.sip.header.ims;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.text.ParseException;
import javax.sip.header.WWWAuthenticateHeader;

public interface WWWAuthenticateHeaderIms extends WWWAuthenticateHeader
{
    
    public static final String IK = ParameterNamesIms.IK;
    public static final String CK = ParameterNamesIms.CK;


    public void setIK(String ik) throws ParseException;

    public String getIK();

    public void setCK(String ck) throws ParseException;

    public String getCK();

}

package gov.nist.javax.sip;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import javax.sip.Dialog;
import javax.sip.SipProvider;

public interface DialogExt extends Dialog {

    
    public SipProvider getSipProvider();

    
    public void setBackToBackUserAgent();
    
    
    
    public void disableSequenceNumberValidation();

  
    
    

}

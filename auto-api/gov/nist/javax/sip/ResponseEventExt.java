package gov.nist.javax.sip;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import javax.sip.ClientTransaction;
import javax.sip.Dialog;
import javax.sip.ResponseEvent;
import javax.sip.message.Response;

public class ResponseEventExt extends ResponseEvent {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:37.679 -0400", hash_original_field = "D41668E01A43244927876A27588FC413", hash_generated_field = "F64A30969C6A648637B3D7A003D6815C")

    private ClientTransactionExt m_originalTransaction;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:37.680 -0400", hash_original_method = "E0A4B826C1E89C68B173497FA6715B8E", hash_generated_method = "6159CEE6A3BD46B50ABB4729B597F84C")
    public  ResponseEventExt(Object source, ClientTransactionExt clientTransaction, 
            Dialog dialog,  Response response) {
        super(source,clientTransaction,dialog,response);
        m_originalTransaction = clientTransaction;
        addTaint(source.getTaint());
        addTaint(dialog.getTaint());
        addTaint(response.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:37.681 -0400", hash_original_method = "1D5FD647F40A8A30082BEBDADF028E9F", hash_generated_method = "85B0D86FA8420B29CDAEED0112E4FFAA")
    public boolean isForkedResponse() {
        boolean varBC7ABAE0479D6E261A27B5CAE5B32C0E_1434558005 = (super.getClientTransaction() == null && m_originalTransaction != null);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2054441536 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2054441536;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:37.681 -0400", hash_original_method = "86BB48DEB1DDB9180E72A821E2A3AF51", hash_generated_method = "86A3A3109A8873E13BC7122F5738A43E")
    public void setOriginalTransaction(ClientTransactionExt originalTransaction ) {
        m_originalTransaction = originalTransaction;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:37.682 -0400", hash_original_method = "BC8FBC0426D6766D3BE2845167DC7794", hash_generated_method = "B79FA0FA941824F8C513AA0CE29DCB20")
    public ClientTransactionExt getOriginalTransaction() {
        ClientTransactionExt varB4EAC82CA7396A68D541C85D26508E83_924360858 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_924360858 = this.m_originalTransaction;
        varB4EAC82CA7396A68D541C85D26508E83_924360858.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_924360858;
        
        
    }

    
}


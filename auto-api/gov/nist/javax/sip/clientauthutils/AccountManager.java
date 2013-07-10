package gov.nist.javax.sip.clientauthutils;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import javax.sip.ClientTransaction;

public interface AccountManager {

    

    UserCredentials getCredentials(ClientTransaction challengedTransaction, String realm);

}

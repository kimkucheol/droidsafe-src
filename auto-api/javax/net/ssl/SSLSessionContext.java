package javax.net.ssl;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.Enumeration;

public interface SSLSessionContext {
    
    public Enumeration<byte[]> getIds();

    
    public SSLSession getSession(byte[] sessionId);

    
    public int getSessionCacheSize();

    
    public int getSessionTimeout();

    
    public void setSessionCacheSize(int size) throws IllegalArgumentException;

    
    public void setSessionTimeout(int seconds) throws IllegalArgumentException;
}

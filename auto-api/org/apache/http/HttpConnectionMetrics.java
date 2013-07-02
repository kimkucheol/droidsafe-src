package org.apache.http;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public interface HttpConnectionMetrics {

     
    long getRequestCount();
    
     
    long getResponseCount();
    
     
    long getSentBytesCount();
    
     
    long getReceivedBytesCount(); 
    
    
    Object getMetric(String metricName);
    
    
    void reset();
    
}

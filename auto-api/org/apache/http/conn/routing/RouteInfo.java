package org.apache.http.conn.routing;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.net.InetAddress;
import org.apache.http.HttpHost;

public interface RouteInfo {

    
    public enum TunnelType { PLAIN, TUNNELLED }

    
    public enum LayerType  { PLAIN, LAYERED }



    
    HttpHost getTargetHost()
        ;


    
    InetAddress getLocalAddress()
        ;


    
    int getHopCount()
        ;


    
    HttpHost getHopTarget(int hop)
        ;


    
    HttpHost getProxyHost()
        ;


    
    TunnelType getTunnelType()
        ;


    
    boolean isTunnelled()
        ;


    
    LayerType getLayerType()
        ;


    
    boolean isLayered()
        ;


    
    boolean isSecure()
        ;


}

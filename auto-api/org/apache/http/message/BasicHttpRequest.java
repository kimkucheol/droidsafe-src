package org.apache.http.message;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.params.HttpProtocolParams;

public class BasicHttpRequest extends AbstractHttpMessage implements HttpRequest {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.069 -0400", hash_original_field = "52DD8E4929E0B6524949DDA0CE8874AA", hash_generated_field = "1A948EEF4738D8B68129911C16DED26C")

    private RequestLine requestline;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.069 -0400", hash_original_field = "EA9F6ACA279138C58F705C8D4CB4B8CE", hash_generated_field = "F42F15CDE806BBAD7F26F7952D68FCE2")

    private String method;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.069 -0400", hash_original_field = "9305B73D359BD06734FEE0B3638079E1", hash_generated_field = "26AD8F31DE2ECD559067F2936328A369")

    private String uri;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.069 -0400", hash_original_method = "D336B902E966467A394D4F5E82995C23", hash_generated_method = "77274DE07DB6175EBB38F1A5F256BCE1")
    public  BasicHttpRequest(final String method, final String uri) {
        super();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Method name may not be null");
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Request URI may not be null");
        } 
        this.method = method;
        this.uri = uri;
        this.requestline = null;
        
        
            
        
        
            
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.070 -0400", hash_original_method = "32D970961D566BAF565D674274EE91DF", hash_generated_method = "4D6D3FD0CDBB41B3076F8A0779AAE1F0")
    public  BasicHttpRequest(final String method, final String uri, final ProtocolVersion ver) {
        this(new BasicRequestLine(method, uri, ver));
        addTaint(method.getTaint());
        addTaint(uri.getTaint());
        addTaint(ver.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.070 -0400", hash_original_method = "6934C052A0F550106B98ACB21507F0F6", hash_generated_method = "A86690524D8F454C5FE5130A8D68C25A")
    public  BasicHttpRequest(final RequestLine requestline) {
        super();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Request line may not be null");
        } 
        this.requestline = requestline;
        this.method = requestline.getMethod();
        this.uri = requestline.getUri();
        
        
            
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.071 -0400", hash_original_method = "6D74E90047F33871E1F46E26807064EE", hash_generated_method = "BA8AA49EAC67E69BE1C1FB0B01A6425A")
    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion varB4EAC82CA7396A68D541C85D26508E83_1224884611 = null; 
        ProtocolVersion varB4EAC82CA7396A68D541C85D26508E83_852954329 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1224884611 = this.requestline.getProtocolVersion();
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_852954329 = HttpProtocolParams.getVersion(getParams());
        } 
        ProtocolVersion varA7E53CE21691AB073D9660D615818899_1387474219; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1387474219 = varB4EAC82CA7396A68D541C85D26508E83_1224884611;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1387474219 = varB4EAC82CA7396A68D541C85D26508E83_852954329;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1387474219.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1387474219;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.073 -0400", hash_original_method = "C42D62E680F5FCF6E09789DDCB998F05", hash_generated_method = "8D24DAEDD1B1878497D84C9B0DBD3812")
    public RequestLine getRequestLine() {
        RequestLine varB4EAC82CA7396A68D541C85D26508E83_390297383 = null; 
        RequestLine varB4EAC82CA7396A68D541C85D26508E83_1757391612 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_390297383 = this.requestline;
        } 
        {
            ProtocolVersion ver = HttpProtocolParams.getVersion(getParams());
            varB4EAC82CA7396A68D541C85D26508E83_1757391612 = new BasicRequestLine(this.method, this.uri, ver);
        } 
        RequestLine varA7E53CE21691AB073D9660D615818899_1820585529; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1820585529 = varB4EAC82CA7396A68D541C85D26508E83_390297383;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1820585529 = varB4EAC82CA7396A68D541C85D26508E83_1757391612;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1820585529.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1820585529;
        
        
            
        
            
            
        
    }

    
}


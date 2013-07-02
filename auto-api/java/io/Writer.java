package java.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public abstract class Writer implements Appendable, Closeable, Flushable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.178 -0400", hash_original_field = "DCE7C4174CE9323904A934A486C41288", hash_generated_field = "AB852390F41C8C6739EA01C427D6BB51")

    protected Object lock;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.179 -0400", hash_original_method = "673B7AADE5290DAEA83488F65491132B", hash_generated_method = "A151A94197A0C9FE391BFFF503DB9D13")
    protected  Writer() {
        lock = this;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.179 -0400", hash_original_method = "D96C97132BD2547E52536C41B19A9E8C", hash_generated_method = "C7D1EC716B474F3DF52CE4BE77091078")
    protected  Writer(Object lock) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } 
        this.lock = lock;
        
        
            
        
        
    }

    
    public abstract void close() throws IOException;

    
    public abstract void flush() throws IOException;

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.180 -0400", hash_original_method = "3613EF644BBA13BB917F4671227467C0", hash_generated_method = "BBEED4818033725679C6DDA135D21E59")
    public void write(char[] buf) throws IOException {
        write(buf, 0, buf.length);
        addTaint(buf[0]);
        
        
    }

    
    public abstract void write(char[] buf, int offset, int count) throws IOException;

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.180 -0400", hash_original_method = "8F6AF6BA5D86D88C527DBF804753FF5E", hash_generated_method = "E96D90BD94CF70397767F7A1863E0F39")
    public void write(int oneChar) throws IOException {
        {
            char[] oneCharArray = new char[1];
            oneCharArray[0] = (char) oneChar;
            write(oneCharArray);
        } 
        addTaint(oneChar);
        
        
            
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.180 -0400", hash_original_method = "2CB0ACB6DB74A20D3FAA9874B0AAEB97", hash_generated_method = "1B1C6FA9969D47416B15D191A98D6963")
    public void write(String str) throws IOException {
        write(str, 0, str.length());
        addTaint(str.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.181 -0400", hash_original_method = "2D3658401DD29E26DBD40724F9EE6A10", hash_generated_method = "584A693A9010A8754EB84141F5F7B052")
    public void write(String str, int offset, int count) throws IOException {
        {
            boolean var692490DEFA1D61E18F718478B787B00C_1974379115 = ((offset | count) < 0 || offset > str.length() - count);
            {
                if (DroidSafeAndroidRuntime.control) throw new StringIndexOutOfBoundsException(str, offset, count);
            } 
        } 
        char[] buf = new char[count];
        str.getChars(offset, offset + count, buf, 0);
        {
            write(buf, 0, buf.length);
        } 
        addTaint(str.getTaint());
        addTaint(offset);
        addTaint(count);
        
        
            
        
        
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.181 -0400", hash_original_method = "9D99658000F160BDAECAED91EC9BFB5D", hash_generated_method = "A1F6F63A1CB65F17F472C2C8F8189012")
    public Writer append(char c) throws IOException {
        Writer varB4EAC82CA7396A68D541C85D26508E83_1489988433 = null; 
        write(c);
        varB4EAC82CA7396A68D541C85D26508E83_1489988433 = this;
        addTaint(c);
        varB4EAC82CA7396A68D541C85D26508E83_1489988433.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1489988433;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.182 -0400", hash_original_method = "D993D81DE6953743EFA25FF281FB0E15", hash_generated_method = "FC6D4F37D0AC1A087E4DA11057A96ACC")
    public Writer append(CharSequence csq) throws IOException {
        Writer varB4EAC82CA7396A68D541C85D26508E83_1787709894 = null; 
        {
            csq = "null";
        } 
        write(csq.toString());
        varB4EAC82CA7396A68D541C85D26508E83_1787709894 = this;
        addTaint(csq.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1787709894.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1787709894;
        
        
            
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.183 -0400", hash_original_method = "44B7413EC481F793F1919C886AE2AD0E", hash_generated_method = "A96A53E3B15138816E8CE2C84204BEC8")
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        Writer varB4EAC82CA7396A68D541C85D26508E83_1279006820 = null; 
        {
            csq = "null";
        } 
        write(csq.subSequence(start, end).toString());
        varB4EAC82CA7396A68D541C85D26508E83_1279006820 = this;
        addTaint(csq.getTaint());
        addTaint(start);
        addTaint(end);
        varB4EAC82CA7396A68D541C85D26508E83_1279006820.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1279006820;
        
        
            
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:49.183 -0400", hash_original_method = "0FEA708DB7A5B3B6D16FEC9623D0EEF8", hash_generated_method = "2DF97D8A99F7165B7BAE2DBD862AE898")
     boolean checkError() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_640590744 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_640590744;
        
        
    }

    
}


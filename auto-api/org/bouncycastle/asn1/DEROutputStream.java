package org.bouncycastle.asn1;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DEROutputStream extends FilterOutputStream implements DERTags {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.633 -0400", hash_original_method = "D6882926F90F93A386C7D4D8D57DD786", hash_generated_method = "BFCE9163E9403BC3EAA2B2ADD4A25C35")
    public  DEROutputStream(
        OutputStream    os) {
        super(os);
        addTaint(os.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.633 -0400", hash_original_method = "9630CA34FB2F7F75F5B62885DAC93016", hash_generated_method = "33172DC4CF8D9C0FCCF66E476C4787E8")
    private void writeLength(
        int length) throws IOException {
        {
            int size = 1;
            int val = length;
            {
                boolean var0FAB5FFCAEA021B44A1B0650ADAE3E30_1940588175 = ((val >>>= 8) != 0);
            } 
            write((byte)(size | 0x80));
            {
                int i = (size - 1) * 8;
                i -= 8;
                {
                    write((byte)(length >> i));
                } 
            } 
        } 
        {
            write((byte)length);
        } 
        addTaint(length);
        
        
        
            
            
            
            
                
            
            
            
            
                
            
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.634 -0400", hash_original_method = "6A5015CF78D45503CE00711383685F95", hash_generated_method = "8F28C5A299AA7681AA18ABD9BFAF5BD1")
     void writeEncoded(
        int     tag,
        byte[]  bytes) throws IOException {
        write(tag);
        writeLength(bytes.length);
        write(bytes);
        addTaint(tag);
        addTaint(bytes[0]);
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.635 -0400", hash_original_method = "ED4E90E4B3DD7ED52782F2B0BBD7912E", hash_generated_method = "40D37B5C9C2C02ED2F1744EFFD45B000")
     void writeTag(int flags, int tagNo) throws IOException {
        {
            write(flags | tagNo);
        } 
        {
            write(flags | 0x1f);
            {
                write(tagNo);
            } 
            {
                byte[] stack = new byte[5];
                int pos = stack.length;
                stack[--pos] = (byte)(tagNo & 0x7F);
                {
                    tagNo >>= 7;
                    stack[--pos] = (byte)(tagNo & 0x7F | 0x80);
                } 
                write(stack, pos, stack.length - pos);
            } 
        } 
        addTaint(flags);
        addTaint(tagNo);
        
        
        
            
        
        
        
            
            
            
                
            
            
            
                
                
                
                
                
                    
                    
                
                
                
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.636 -0400", hash_original_method = "7680EF084FC261D5865A989D21C79F36", hash_generated_method = "59D50494BF39BDCDC2EEE041F0E2D606")
     void writeEncoded(int flags, int tagNo, byte[] bytes) throws IOException {
        writeTag(flags, tagNo);
        writeLength(bytes.length);
        write(bytes);
        addTaint(flags);
        addTaint(tagNo);
        addTaint(bytes[0]);
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.638 -0400", hash_original_method = "42317E86533FAE5B23E236AC0365BD25", hash_generated_method = "F9103E21E41CA9234FA57E1DA6B62BE5")
    protected void writeNull() throws IOException {
        write(NULL);
        write(0x00);
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.639 -0400", hash_original_method = "1AF5A1D8916987DB77C7DD8735718172", hash_generated_method = "CF599C6311E24EE668BF54BEB2BA583D")
    public void write(byte[] buf) throws IOException {
        out.write(buf, 0, buf.length);
        addTaint(buf[0]);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.641 -0400", hash_original_method = "C3C674084F8E21E9786EAC52DFF53A81", hash_generated_method = "7228C05CDE4BF363BE54BB1267D40784")
    public void write(byte[] buf, int offSet, int len) throws IOException {
        out.write(buf, offSet, len);
        addTaint(buf[0]);
        addTaint(offSet);
        addTaint(len);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.643 -0400", hash_original_method = "F19F4C73BB689B28C331EE3D14B18253", hash_generated_method = "98E5D274A588319C7BFED4D78B32C24D")
    public void writeObject(
        Object    obj) throws IOException {
        {
            writeNull();
        } 
        {
            ((DERObject)obj).encode(this);
        } 
        {
            ((DEREncodable)obj).getDERObject().encode(this);
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("object not DEREncodable");
        } 
        addTaint(obj.getTaint());
        
        
        
            
        
        
        
            
        
        
        
            
        
        
        
            
        
    }

    
}


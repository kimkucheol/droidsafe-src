package org.apache.commons.io.output;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.Writer;

public class NullWriter extends Writer {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.733 -0400", hash_original_method = "354338F8D39FF6509677FF2A4C707E5F", hash_generated_method = "7D6BE1FF7763717B9EA41AB0FA4006B9")
    public  NullWriter() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.736 -0400", hash_original_method = "9925E1DC093C6BADDE8464868171339B", hash_generated_method = "2BD86875EA31B2B5B0367EDF53A80476")
    @Override
    public Writer append(char c) {
        Writer varB4EAC82CA7396A68D541C85D26508E83_731516256 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_731516256 = this;
        addTaint(c);
        varB4EAC82CA7396A68D541C85D26508E83_731516256.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_731516256;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.737 -0400", hash_original_method = "CD2829CDE96B6ED8A5F4CBF7F6F67CA5", hash_generated_method = "5676826879221DAD27CEBCCBE8105F04")
    @Override
    public Writer append(CharSequence csq, int start, int end) {
        Writer varB4EAC82CA7396A68D541C85D26508E83_273676631 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_273676631 = this;
        addTaint(csq.getTaint());
        addTaint(start);
        addTaint(end);
        varB4EAC82CA7396A68D541C85D26508E83_273676631.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_273676631;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.738 -0400", hash_original_method = "FE294A17C0469E68DE350D9B87B2A84C", hash_generated_method = "C015347B1B31E5259DE2E78FD901A189")
    @Override
    public Writer append(CharSequence csq) {
        Writer varB4EAC82CA7396A68D541C85D26508E83_1356130046 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1356130046 = this;
        addTaint(csq.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1356130046.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1356130046;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.738 -0400", hash_original_method = "CB9AED790CD954117728F46FA7B99DE8", hash_generated_method = "0A11CD08F4DDFF096E73C93FC3A3EE98")
    @Override
    public void write(int idx) {
        addTaint(idx);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.739 -0400", hash_original_method = "223F529506D3BF44A149C901A5D55A6B", hash_generated_method = "0A93000A54999BEEC8A2AE5DB2FA9E38")
    @Override
    public void write(char[] chr) {
        addTaint(chr[0]);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.739 -0400", hash_original_method = "1256300F7D5F2E3F918226B727F42637", hash_generated_method = "D612F51A0FFCA0599730406D11E5F8C6")
    @Override
    public void write(char[] chr, int st, int end) {
        addTaint(chr[0]);
        addTaint(st);
        addTaint(end);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.739 -0400", hash_original_method = "44D5CA24014EE7A19866ABFBD1E3495E", hash_generated_method = "887222692CBDAEBF654392A9E74A0A8F")
    @Override
    public void write(String str) {
        addTaint(str.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.739 -0400", hash_original_method = "24E1254AF0599ABF4B37852E6EA59286", hash_generated_method = "A8448EE10969160C01504DD4790E2932")
    @Override
    public void write(String str, int st, int end) {
        addTaint(str.getTaint());
        addTaint(st);
        addTaint(end);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.740 -0400", hash_original_method = "336EB9AA03C5B902D3CE726BD69F433F", hash_generated_method = "4A4713C8ADAF7778CF4E4BBDA39355C2")
    @Override
    public void flush() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.740 -0400", hash_original_method = "B96EF178F3ED1A0DFACDA94649407E5C", hash_generated_method = "1A3F8C083102602A57FB2D0CBE40EA76")
    @Override
    public void close() {
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.740 -0400", hash_original_field = "70FA5E624B4C20E75418B3521969D5A2", hash_generated_field = "7307ED88D0E2B587CEECC7DE309D3B8E")

    public static final NullWriter NULL_WRITER = new NullWriter();
}


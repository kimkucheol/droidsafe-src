package org.bouncycastle.asn1.x509;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class X509NameTokenizer {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.295 -0400", hash_original_field = "2063C1608D6E0BAF80249C42E2BE5804", hash_generated_field = "424F4435B9052E77589D30873B9A7D2B")

    private String value;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.295 -0400", hash_original_field = "6A992D5529F459A44FEE58C733255E86", hash_generated_field = "56A277C77B76B31C1E1045C8C11CA802")

    private int index;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.295 -0400", hash_original_field = "E72814AAA963A3FA498930DCF0ED40FB", hash_generated_field = "9FFFB1A798BF85E8FA366500A206FB25")

    private char seperator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.295 -0400", hash_original_field = "AD725DF80177605E6571F15CF0B24371", hash_generated_field = "22C3EB28ABC67744D189D37B59EAF1C4")

    private StringBuffer buf = new StringBuffer();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.296 -0400", hash_original_method = "E29DC46EF5738DAFDF44DDEEECCCD2C0", hash_generated_method = "530DAC4DCE86DDCE43D9C6AC5EDA6C09")
    public  X509NameTokenizer(
        String  oid) {
        this(oid, ',');
        addTaint(oid.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.297 -0400", hash_original_method = "6C4980154E892C5E33B9260977D1D61C", hash_generated_method = "4BEA75B12AAC351464B943202513991C")
    public  X509NameTokenizer(
        String  oid,
        char    seperator) {
        this.value = oid;
        this.index = -1;
        this.seperator = seperator;
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.298 -0400", hash_original_method = "A840AC1B987121BDC7999220A560F7B6", hash_generated_method = "95122C31F37E12A0FBAA910CE22D6291")
    public boolean hasMoreTokens() {
        boolean var7CD935BF8DE374BC92D8FD35111972EC_1073009248 = ((index != value.length()));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2111527504 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2111527504;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:45.299 -0400", hash_original_method = "609C206EB69C69406C6D19A5ED0989AC", hash_generated_method = "FB6694120AF720698BBEAD0B63F98DA7")
    public String nextToken() {
        String varB4EAC82CA7396A68D541C85D26508E83_1291712470 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_1510474899 = null; 
        {
            boolean varD1FB7B79F55DE8E4676B5276D1B14D19_914718301 = (index == value.length());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1291712470 = null;
            } 
        } 
        int end = index + 1;
        boolean quoted = false;
        boolean escaped = false;
        buf.setLength(0);
        {
            boolean var15C8D7A4D88CE8735C497FC63BBCD1F9_778690722 = (end != value.length());
            {
                char c = value.charAt(end);
                {
                    {
                        quoted = !quoted;
                    } 
                    {
                        {
                            boolean var5E354E81BA73B0495049F0FBF6BAAB34_368648794 = (c == '#' && buf.charAt(buf.length() - 1) == '=');
                            {
                                buf.append('\\');
                            } 
                            {
                                buf.append('\\');
                            } 
                        } 
                        buf.append(c);
                    } 
                    escaped = false;
                } 
                {
                    {
                        {
                            boolean var5E354E81BA73B0495049F0FBF6BAAB34_977514192 = (c == '#' && buf.charAt(buf.length() - 1) == '=');
                            {
                                buf.append('\\');
                            } 
                            {
                                buf.append('\\');
                            } 
                        } 
                        buf.append(c);
                        escaped = false;
                    } 
                    {
                        escaped = true;
                    } 
                    {
                        buf.append(c);
                    } 
                } 
            } 
        } 
        index = end;
        varB4EAC82CA7396A68D541C85D26508E83_1510474899 = buf.toString().trim();
        String varA7E53CE21691AB073D9660D615818899_244902327; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_244902327 = varB4EAC82CA7396A68D541C85D26508E83_1291712470;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_244902327 = varB4EAC82CA7396A68D541C85D26508E83_1510474899;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_244902327.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_244902327;
        
        
    }

    
}


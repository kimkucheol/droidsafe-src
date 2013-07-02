package org.bouncycastle.util.encoders;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.io.OutputStream;

public class Base64Encoder implements Encoder {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.287 -0400", hash_original_field = "26679137600502689C8A177F50F164AC", hash_generated_field = "477367DCA11A991FB18CE4EB6F2C01EF")

    protected final byte[] encodingTable = {
            (byte)'A', (byte)'B', (byte)'C', (byte)'D', (byte)'E', (byte)'F', (byte)'G',
            (byte)'H', (byte)'I', (byte)'J', (byte)'K', (byte)'L', (byte)'M', (byte)'N',
            (byte)'O', (byte)'P', (byte)'Q', (byte)'R', (byte)'S', (byte)'T', (byte)'U',
            (byte)'V', (byte)'W', (byte)'X', (byte)'Y', (byte)'Z',
            (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f', (byte)'g',
            (byte)'h', (byte)'i', (byte)'j', (byte)'k', (byte)'l', (byte)'m', (byte)'n',
            (byte)'o', (byte)'p', (byte)'q', (byte)'r', (byte)'s', (byte)'t', (byte)'u',
            (byte)'v',
            (byte)'w', (byte)'x', (byte)'y', (byte)'z',
            (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', (byte)'6',
            (byte)'7', (byte)'8', (byte)'9',
            (byte)'+', (byte)'/'
        };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.287 -0400", hash_original_field = "6BFC228E0751465901E4098F8966DFFF", hash_generated_field = "6470484C1DBA83A435D7A06D16D20315")

    protected byte padding = (byte)'=';
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.287 -0400", hash_original_field = "22173E2A74F154E91BA0F39198C1B226", hash_generated_field = "C5A9E5FA83A75FCB14FF277263CBAED5")

    protected final byte[] decodingTable = new byte[128];
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.288 -0400", hash_original_method = "680D3875922DD4E67C0EE2E950D928BD", hash_generated_method = "AABF19D4D0BC5EA370D8438ED4D196CF")
    public  Base64Encoder() {
        initialiseDecodingTable();
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.288 -0400", hash_original_method = "21DA0B3C66110012AEC4B0EF8A985DB1", hash_generated_method = "333A93F36A4047292D723904CDB52B68")
    protected void initialiseDecodingTable() {
        {
            int i = 0;
            {
                decodingTable[encodingTable[i]] = (byte)i;
            } 
        } 
        
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.289 -0400", hash_original_method = "9CA1F48AAB7841E0E0CBD16E0BA7D360", hash_generated_method = "058E6807D738EA0A9290EDE8E4485EED")
    public int encode(
        byte[]                data,
        int                    off,
        int                    length,
        OutputStream    out) throws IOException {
        int modulus = length % 3;
        int dataLength = (length - modulus);
        int a1;
        int a2;
        int a3;
        {
            int i = off;
            i += 3;
            {
                a1 = data[i] & 0xff;
                a2 = data[i + 1] & 0xff;
                a3 = data[i + 2] & 0xff;
                out.write(encodingTable[(a1 >>> 2) & 0x3f]);
                out.write(encodingTable[((a1 << 4) | (a2 >>> 4)) & 0x3f]);
                out.write(encodingTable[((a2 << 2) | (a3 >>> 6)) & 0x3f]);
                out.write(encodingTable[a3 & 0x3f]);
            } 
        } 
        int b1;
        int b2;
        int b3;
        int d1;
        int d2;
        
        d1 = data[off + dataLength] & 0xff;
        
        
        b1 = (d1 >>> 2) & 0x3f;
        
        
        b2 = (d1 << 4) & 0x3f;
        
        
        out.write(encodingTable[b1]);
        
        
        out.write(encodingTable[b2]);
        
        
        out.write(padding);
        
        
        out.write(padding);
        
        
        d1 = data[off + dataLength] & 0xff;
        
        
        d2 = data[off + dataLength + 1] & 0xff;
        
        
        b1 = (d1 >>> 2) & 0x3f;
        
        
        b2 = ((d1 << 4) | (d2 >>> 4)) & 0x3f;
        
        
        b3 = (d2 << 2) & 0x3f;
        
        
        out.write(encodingTable[b1]);
        
        
        out.write(encodingTable[b2]);
        
        
        out.write(encodingTable[b3]);
        
        
        out.write(padding);
        
        addTaint(data[0]);
        addTaint(off);
        addTaint(length);
        addTaint(out.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1467767967 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1467767967;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.290 -0400", hash_original_method = "1B2A7D609CA1F47FC87AA118398B5C86", hash_generated_method = "ADEB092B1D61A7C1B152FE3ABC3D3EB3")
    private boolean ignore(
        char    c) {
        addTaint(c);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_574242635 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_574242635;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.291 -0400", hash_original_method = "211C1414D28F35039504B68D95AB9ED9", hash_generated_method = "D0E9084F13884A43BB384AEA449A916E")
    public int decode(
        byte[]          data,
        int             off,
        int             length,
        OutputStream    out) throws IOException {
        byte b1;
        byte b2;
        byte b3;
        byte b4;
        int outLen = 0;
        int end = off + length;
        {
            {
                boolean var8734AAABA8B2B8BCF029CC1C18593F13_703689859 = (!ignore((char)data[end - 1]));
            } 
        } 
        int i = off;
        int finish = end - 4;
        i = nextI(data, i, finish);
        {
            b1 = decodingTable[data[i++]];
            i = nextI(data, i, finish);
            b2 = decodingTable[data[i++]];
            i = nextI(data, i, finish);
            b3 = decodingTable[data[i++]];
            i = nextI(data, i, finish);
            b4 = decodingTable[data[i++]];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            out.write((b3 << 6) | b4);
            outLen += 3;
            i = nextI(data, i, finish);
        } 
        outLen += decodeLastBlock(out, (char)data[end - 4], (char)data[end - 3], (char)data[end - 2], (char)data[end - 1]);
        addTaint(data[0]);
        addTaint(off);
        addTaint(length);
        addTaint(out.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_693727781 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_693727781;
        
        
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.292 -0400", hash_original_method = "1225BA5A886EEC007862013ADD842450", hash_generated_method = "F10E7D7B5C3EC5AB1BE3505C5032F3E7")
    private int nextI(byte[] data, int i, int finish) {
        {
            boolean var284A5091A1A635AAB256EACDF893A56A_17047180 = ((i < finish) && ignore((char)data[i]));
        } 
        addTaint(data[0]);
        addTaint(i);
        addTaint(finish);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_272131621 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_272131621;
        
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.293 -0400", hash_original_method = "304E01512ABEE5D32E29AD105C8F9759", hash_generated_method = "25971479C154087EEF8E01A4AAB97403")
    public int decode(
        String          data,
        OutputStream    out) throws IOException {
        byte b1;
        byte b2;
        byte b3;
        byte b4;
        int length = 0;
        int end = data.length();
        {
            {
                boolean varC2A9184A6FDB10F7AA879085E67E2E47_1239373195 = (!ignore(data.charAt(end - 1)));
            } 
        } 
        int i = 0;
        int finish = end - 4;
        i = nextI(data, i, finish);
        {
            b1 = decodingTable[data.charAt(i++)];
            i = nextI(data, i, finish);
            b2 = decodingTable[data.charAt(i++)];
            i = nextI(data, i, finish);
            b3 = decodingTable[data.charAt(i++)];
            i = nextI(data, i, finish);
            b4 = decodingTable[data.charAt(i++)];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            out.write((b3 << 6) | b4);
            length += 3;
            i = nextI(data, i, finish);
        } 
        length += decodeLastBlock(out, data.charAt(end - 4), data.charAt(end - 3), data.charAt(end - 2), data.charAt(end - 1));
        addTaint(data.getTaint());
        addTaint(out.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1781343195 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1781343195;
        
        
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.294 -0400", hash_original_method = "9E52D5CA91DB497317BE2B1E69827671", hash_generated_method = "746F9AD69B131672D770346231E4C23B")
    private int decodeLastBlock(OutputStream out, char c1, char c2, char c3, char c4) throws IOException {
        byte b1;
        byte b2;
        byte b3;
        byte b4;
        {
            b1 = decodingTable[c1];
            b2 = decodingTable[c2];
            out.write((b1 << 2) | (b2 >> 4));
        } 
        {
            b1 = decodingTable[c1];
            b2 = decodingTable[c2];
            b3 = decodingTable[c3];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
        } 
        {
            b1 = decodingTable[c1];
            b2 = decodingTable[c2];
            b3 = decodingTable[c3];
            b4 = decodingTable[c4];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            out.write((b3 << 6) | b4);
        } 
        addTaint(out.getTaint());
        addTaint(c1);
        addTaint(c2);
        addTaint(c3);
        addTaint(c4);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1691061582 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1691061582;
        
        
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.294 -0400", hash_original_method = "4A002F2B2C5A42BB007C07A5E9BC2D50", hash_generated_method = "164834795E391688B958C40BD0690836")
    private int nextI(String data, int i, int finish) {
        {
            boolean varA9105DFAE90C03A8F17A10F45775F060_106050785 = ((i < finish) && ignore(data.charAt(i)));
        } 
        addTaint(data.getTaint());
        addTaint(i);
        addTaint(finish);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_211336018 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_211336018;
        
        
        
            
        
        
    }

    
}


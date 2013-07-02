package org.apache.harmony.security.x509;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;
import org.apache.harmony.security.asn1.ASN1Choice;
import org.apache.harmony.security.asn1.ASN1Implicit;
import org.apache.harmony.security.asn1.ASN1OctetString;
import org.apache.harmony.security.asn1.ASN1Oid;
import org.apache.harmony.security.asn1.ASN1StringType;
import org.apache.harmony.security.asn1.ASN1Type;
import org.apache.harmony.security.asn1.BerInputStream;
import org.apache.harmony.security.asn1.ObjectIdentifier;
import org.apache.harmony.security.utils.Array;
import org.apache.harmony.security.x501.Name;

public final class GeneralName {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.035 -0400", hash_original_field = "E4D23E841D8E8804190027BCE3180FA5", hash_generated_field = "3577E5E669CAE3960DB734B50E9992AB")

    private int tag;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.035 -0400", hash_original_field = "B068931CC450442B63F5B3D276EA4297", hash_generated_field = "FE36A33A4EC3AF4107DD5978C357772B")

    private Object name;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.035 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "ACB189C73E1A6432570001B3B9D3D516")

    private byte[] encoding;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.035 -0400", hash_original_field = "B044FB6FD80FBC2A60F506E8E61FE96C", hash_generated_field = "10022A525E7D3ACB3B0BC2E8BD5FE9A3")

    private byte[] name_encoding;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.036 -0400", hash_original_method = "E8D4D2361F943CCDDF33AB5563ED886E", hash_generated_method = "F9E9FF418B0A4DD15DA803A536C4BCA2")
    public  GeneralName(int tag, String name) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("name == null");
        } 
        this.tag = tag;
        
        if (DroidSafeAndroidRuntime.control) throw new IOException("Unknown string representation for type [" + tag + "]");
        
        
        checkDNS(name);
        
        
        this.name = name;
        
        
        checkURI(name);
        
        
        this.name = name;
        
        
        this.name = name;
        
        
        this.name = oidStrToInts(name);
        
        
        this.name = new Name(name);
        
        
        this.name = ipStrToBytes(name);
        
        
        if (DroidSafeAndroidRuntime.control) throw new IOException("Unknown type: [" + tag + "]");
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.036 -0400", hash_original_method = "E499E58677EFB5DC6AB5C0B464CEB8CF", hash_generated_method = "A7E878DFEBBD99087D212C020B471EED")
    public  GeneralName(OtherName name) {
        this.tag = OTHER_NAME;
        this.name = name;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.036 -0400", hash_original_method = "6111C4D1FF1E577BF7541C1C985772FA", hash_generated_method = "2274B23BB02D19178F6F1924487CB55F")
    public  GeneralName(ORAddress name) {
        this.tag = X400_ADDR;
        this.name = name;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.036 -0400", hash_original_method = "4A8D46C1231B71B1B6714BAB7338B8B6", hash_generated_method = "A414828AEF9526E2BF08611BC7117D8C")
    public  GeneralName(Name name) {
        this.tag = DIR_NAME;
        this.name = name;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.036 -0400", hash_original_method = "E96CC43FEA6BBB964F564DC514331182", hash_generated_method = "4265CE90B2DB501796206157F9B8D102")
    public  GeneralName(EDIPartyName name) {
        this.tag = EDIP_NAME;
        this.name = name;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.037 -0400", hash_original_method = "F3BB557A640D5A23013E1A6A6D3E3A5F", hash_generated_method = "B1BA869E2DE9C26A156AB2CC762737D4")
    public  GeneralName(byte[] name) throws IllegalArgumentException {
        int length = name.length;
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("name.length invalid");
        } 
        this.tag = IP_ADDR;
        this.name = new byte[name.length];
        System.arraycopy(name, 0, this.name, 0, name.length);
        
        
        
            
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.037 -0400", hash_original_method = "0D9E6D76CFD125A61E2F4A9B060ECF6F", hash_generated_method = "589875FE639B90585BC3F58960D788E8")
    public  GeneralName(int tag, byte[] name) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("name == null");
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("GeneralName: unknown tag: " + tag);
        } 
        this.tag = tag;
        this.name_encoding = new byte[name.length];
        System.arraycopy(name, 0, this.name_encoding, 0, name.length);
        this.name = nameASN1[tag].decode(this.name_encoding);
        
        
            
        
        
            
        
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.038 -0400", hash_original_method = "749703D76C1808D33D4CAAFA8A986840", hash_generated_method = "6CB71D7FB34A6C9F37A1AC2AE8995BA6")
    public int getTag() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1928648389 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1928648389;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.039 -0400", hash_original_method = "20B60556BB46EC823C9319E49D0425A2", hash_generated_method = "C39E8A78E2BAA604AA1537ED3885295A")
    public Object getName() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1733504197 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1733504197 = name;
        varB4EAC82CA7396A68D541C85D26508E83_1733504197.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1733504197;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.040 -0400", hash_original_method = "47F6A98481038A57781CC8365511AC09", hash_generated_method = "BE3C0B8F71D3F9FC5FF39349CF5D8F1B")
    public boolean equals(Object other) {
        GeneralName gname = (GeneralName) other;
        
        boolean var194F9158761720EAB09623E0A647A17A_1045475101 = (((String) name).equalsIgnoreCase(
                        (String) gname.getName()));
        
        
        boolean var5D87C1952D9E0CFEDEE04A72280F0FCB_1327989186 = (Arrays.equals((int[]) name, (int[]) gname.name));
        
        
        boolean varB2D76B6F04C44BFEB89B4B19A9DB979A_597286983 = (Arrays.equals((byte[]) name, (byte[]) gname.name));
        
        
        boolean varB869665F568B838050B4A7A147786AE3_639722041 = (Arrays.equals(getEncoded(), gname.getEncoded()));
        
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1592615978 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1592615978;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.040 -0400", hash_original_method = "A1EE40CF64275F91ADFBB9AA6974DBAD", hash_generated_method = "E49DD5232F2A5BE83155A32AF52ADD49")
    public int hashCode() {
        
        int var8EF65A1839C36EED6A25646011513717_1495087835 = (name.hashCode());
        
        
        int varB4B145FD73615F1FD889E3E60CE45553_1305269406 = (Arrays.hashCode(getEncoded()));
        
        
        int varC489EB7FF487A920847CC016ED55AE09_700886769 = (super.hashCode());
        
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_732126885 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_732126885;
        
        
        
        
        
        
        
            
        
        
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.041 -0400", hash_original_method = "3054283C8DAE746EB9FE98BB22A2F7C2", hash_generated_method = "392E5BE84B49FDAB7F451679F2A27121")
    public boolean isAcceptable(GeneralName gname) {
        {
            boolean var428ABB11BAACC71DA3DCB0C819080230_903568021 = (this.tag != gname.getTag());
        } 
        
        boolean var01DD779FCB1229ED503C607614C4C16C_142432445 = (((String) gname.getName()).toLowerCase(Locale.US)
                    .endsWith(((String) name).toLowerCase(Locale.US)));
        
        
        String dns = (String) name;
        
        
        String _dns = (String) gname.getName();
        
        
        {
            boolean varA59764FE2071F37C7AC521D227BA7BD7_1572988773 = (dns.equalsIgnoreCase(_dns));
            {
                boolean var8B53CA92B86CF0C5D9D8ECCC7A7180EC_1695071832 = (_dns.toLowerCase(Locale.US).endsWith("." + dns.toLowerCase(Locale.US)));
            } 
        } 
        
        
        String uri = (String) name;
        
        
        int begin = uri.indexOf("://")+3;
        
        
        int end = uri.indexOf('/', begin);
        
        
        String host;
        host = uri.substring(begin);
        host = uri.substring(begin, end);
        
        
        uri = (String) gname.getName();
        
        
        begin = uri.indexOf("://")+3;
        
        
        end = uri.indexOf('/', begin);
        
        
        String _host;
        _host = uri.substring(begin);
        _host = uri.substring(begin, end);
        
        
        {
            boolean var0F2DB347CCE89100480373408932E856_1370627968 = (host.startsWith("."));
            {
                boolean var1DC9494B9FEB04BA346108B29537F28D_1942579288 = (_host.toLowerCase(Locale.US).endsWith(host.toLowerCase(Locale.US)));
            } 
            {
                boolean var99919774EE769A44AEAE98D1FE83F48F_1828042954 = (host.equalsIgnoreCase(_host));
            } 
        } 
        
        
        byte[] address = (byte[]) name;
        
        
        byte[] _address = (byte[]) gname.getName();
        
        
        int length = address.length;
        
        
        int _length = _address.length;
        
        
        {
            boolean var8F234405025629C935D9C9D2E589F009_710150417 = (Arrays.equals(address, _address));
        } 
        {
            {
                int i = 0;
                {
                    int octet = _address[i] & 0xff;
                    int min = address[i] & 0xff;
                    int max = address[i + _length] & 0xff;
                } 
            } 
        } 
        
        
        boolean varB869665F568B838050B4A7A147786AE3_1492109810 = (Arrays.equals(getEncoded(), gname.getEncoded()));
        
        addTaint(gname.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1519374931 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1519374931;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.042 -0400", hash_original_method = "8BC63B983D4898BF725054A3D5D39730", hash_generated_method = "905346FEFD1FE4963ACA9EF687A11704")
    public List<Object> getAsList() {
        List<Object> varB4EAC82CA7396A68D541C85D26508E83_707381738 = null; 
        ArrayList<Object> result = new ArrayList<Object>();
        result.add(tag);
        
        result.add(((OtherName) name).getEncoded());
        
        
        result.add(name);
        
        
        result.add(ObjectIdentifier.toString((int[]) name));
        
        
        result.add(((ORAddress) name).getEncoded());
        
        
        result.add(((Name) name).getName(X500Principal.RFC2253));
        
        
        result.add(((EDIPartyName) name).getEncoded());
        
        
        result.add(ipBytesToStr((byte[]) name));
        
        varB4EAC82CA7396A68D541C85D26508E83_707381738 = Collections.unmodifiableList(result);
        varB4EAC82CA7396A68D541C85D26508E83_707381738.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_707381738;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.043 -0400", hash_original_method = "4137EA74AADFAF54538362634CBBCA7A", hash_generated_method = "49232BF7FAA4425777EB2119E27CEA73")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_398114530 = null; 
        String result = "";
        
        result = "otherName[0]: "
                         + Array.getBytesAsString(getEncoded());
        
        
        result = "rfc822Name[1]: " + name;
        
        
        result = "dNSName[2]: " + name;
        
        
        result = "uniformResourceIdentifier[6]: " + name;
        
        
        result = "registeredID[8]: " + ObjectIdentifier.toString((int[]) name);
        
        
        result = "x400Address[3]: "
                         + Array.getBytesAsString(getEncoded());
        
        
        result = "directoryName[4]: "
                         + ((Name) name).getName(X500Principal.RFC2253);
        
        
        result = "ediPartyName[5]: "
                         + Array.getBytesAsString(getEncoded());
        
        
        result = "iPAddress[7]: " + ipBytesToStr((byte[]) name);
        
        varB4EAC82CA7396A68D541C85D26508E83_398114530 = result;
        varB4EAC82CA7396A68D541C85D26508E83_398114530.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_398114530;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.043 -0400", hash_original_method = "8CF73AB8FE0E45F61A0A453F52513BE8", hash_generated_method = "4071185BF83D712650211EE29F0DB4CE")
    public byte[] getEncoded() {
        {
            encoding = ASN1.encode(this);
        } 
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1135044359 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1135044359;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.044 -0400", hash_original_method = "37C9CC72170749FE2E2B5C9DA460C3BB", hash_generated_method = "385D49911DF9C1C09BA3401691735198")
    public byte[] getEncodedName() {
        {
            name_encoding = nameASN1[tag].encode(name);
        } 
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1682442583 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1682442583;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static void checkDNS(String dns) throws IOException {
        String string = dns.toLowerCase(Locale.US);
        int length = string.length();
        boolean first_letter = true;
        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            if (first_letter) {
                if ((length > 2) && (ch == '*') && (string.charAt(1) == '.')) {
                    first_letter = false;
                    continue;
                }
                if ((ch > 'z' || ch < 'a') && (ch < '0' || ch > '9')) {
                    throw new IOException("DNS name must start with a letter: " + dns);
                }
                first_letter = false;
                continue;
            }
            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')
                    || (ch == '-') || (ch == '.'))) {
                throw new IOException("Incorrect DNS name: " + dns);
            }
            if (ch == '.') {
                if (string.charAt(i-1) == '-') {
                    throw new IOException("Incorrect DNS name: label ends with '-': " + dns);
                }
                first_letter = true;
            }
        }
    }

    
    @DSModeled(DSC.SAFE)
    public static void checkURI(String uri) throws IOException {
        try {
            URI ur = new URI(uri);
            if (ur.getScheme() == null || ur.getRawSchemeSpecificPart().isEmpty()) {
                throw new IOException("No scheme or scheme-specific-part in uniformResourceIdentifier: " + uri);
            }
            if (!ur.isAbsolute()) {
                throw new IOException("Relative uniformResourceIdentifier: " + uri);
            }
        } catch (URISyntaxException e) {
            throw (IOException) new IOException("Bad representation of uniformResourceIdentifier: " + uri).initCause(e);
        }
    }

    
    @DSModeled(DSC.SAFE)
    public static int[] oidStrToInts(String oid) throws IOException {
        int length = oid.length();
        if (oid.charAt(length-1) == '.') {
            throw new IOException("Bad OID: " + oid);
        }
        int[] result = new int[length/2+1];
        int number = 0;
        for (int i = 0; i < length; i++) {
            int value = 0;
            int pos = i;
            for (; i < length; i++) {
                char ch = oid.charAt(i);
                if ((ch < '0') || (ch > '9')) {
                    break;
                }
                value = 10 * value + (ch - '0');
            }
            if (i == pos) {
                throw new IOException("Bad OID: " + oid);
            }
            result[number++] = value;
            if (i == length) {
                break;
            }
            char ch = oid.charAt(i);
            if (ch != '.') {
                throw new IOException("Bad OID: " + oid);
            }
        }
        if (number < 2) {
            throw new IOException("OID should consist of no less than 2 components: " + oid);
        }
        return Arrays.copyOfRange(result, 0, number);
    }

    
    @DSModeled(DSC.SAFE)
    public static byte[] ipStrToBytes(String ip) throws IOException {
        if (!InetAddress.isNumeric(ip)) {
            throw new IOException("Not an IP address: " + ip);
        }
        return InetAddress.getByName(ip).getAddress();
    }

    
    @DSModeled(DSC.SAFE)
    public static String ipBytesToStr(byte[] ip) {
        try {
            return InetAddress.getByAddress(null, ip).getHostAddress();
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException("Unexpected IP address: " + Arrays.toString(ip));
        }
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "4E5D9AC1F0E8D9AB781F5EFFC24BAE80", hash_generated_field = "1A317709A171B2139EEB8BD8E4FFD633")

    public static final int OTHER_NAME = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "C9732A793148C7EDFD4428D486FC76F2", hash_generated_field = "8605270A6DEED1E9241E2F779D804DB8")

    public static final int RFC822_NAME = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "4F0C3DDF227592FFCCC3399190B170BA", hash_generated_field = "4068333BBDE31CF8DBD7F63FABF82FFD")

    public static final int DNS_NAME = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "477AAE6DFC7C5FD37E7EA48DF1C7FCED", hash_generated_field = "541798205EE16CF843FD25263108C9BA")

    public static final int X400_ADDR = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "4FB643167CAC0E1227E9EB434BE9D92D", hash_generated_field = "9C79E28158600675871FFC5333F55FE5")

    public static final int DIR_NAME = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "6B8EF3BCF61B405C9BFF6D307557D1CF", hash_generated_field = "F87CA0B39DDF9C21198439CE2BC901D0")

    public static final int EDIP_NAME = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "7C87B966D52898A3326F768DEA8B2305", hash_generated_field = "3BB142C23BDE62C58F9C0B5DCCEFC3C1")

    public static final int UR_ID = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "71FA57B7DB37AB272CE880E0BC58CB80", hash_generated_field = "10C69FE566268D6D08A5BB5FE501A789")

    public static final int IP_ADDR = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "5836D0891E6962611C25E29481F6ACFB", hash_generated_field = "11541C1B6479C5A1E801E2333582AEC6")

    public static final int REG_ID = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "3FDE0A408DACF520036C6E6B288A77A6", hash_generated_field = "0E58F21A000AB906E098E31DBFAAE1B8")

    private static ASN1Type[] nameASN1 = new ASN1Type[9];
    static {
        nameASN1[OTHER_NAME] = OtherName.ASN1;
        nameASN1[RFC822_NAME] = ASN1StringType.IA5STRING;
        nameASN1[DNS_NAME] = ASN1StringType.IA5STRING;
        nameASN1[UR_ID] = ASN1StringType.IA5STRING;
        nameASN1[X400_ADDR] = ORAddress.ASN1;
        nameASN1[DIR_NAME] = Name.ASN1;
        nameASN1[EDIP_NAME] = EDIPartyName.ASN1;
        nameASN1[IP_ADDR] = ASN1OctetString.getInstance();
        nameASN1[REG_ID] = ASN1Oid.getInstance();
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.045 -0400", hash_original_field = "89586BE6D9C4DEF8449E660548BC67AB", hash_generated_field = "CB123AFB6852C7A5EB6A7311122CEEC7")

    public static final ASN1Choice ASN1 = new ASN1Choice(new ASN1Type[] {
           new ASN1Implicit(0, OtherName.ASN1),
           new ASN1Implicit(1, ASN1StringType.IA5STRING),
           new ASN1Implicit(2, ASN1StringType.IA5STRING),
           new ASN1Implicit(3, ORAddress.ASN1),
           new ASN1Implicit(4, Name.ASN1),
           new ASN1Implicit(5, EDIPartyName.ASN1),
           new ASN1Implicit(6, ASN1StringType.IA5STRING),
           new ASN1Implicit(7, ASN1OctetString.getInstance()),
           new ASN1Implicit(8, ASN1Oid.getInstance()) }) {

        public Object getObjectToEncode(Object value) {
            return ((GeneralName) value).name;
        }

        public int getIndex(java.lang.Object object) {
            return  ((GeneralName) object).tag;
        }

        @Override public Object getDecodedObject(BerInputStream in) throws IOException {
            GeneralName result;
            switch (in.choiceIndex) {
                case OTHER_NAME: 
                    result = new GeneralName((OtherName) in.content);
                    break;
                case RFC822_NAME: 
                case DNS_NAME: 
                    result = new GeneralName(in.choiceIndex, (String) in.content);
                    break;
                case X400_ADDR:
                    result = new GeneralName((ORAddress) in.content);
                    break;
                case DIR_NAME: 
                    result = new GeneralName((Name) in.content);
                    break;
                case EDIP_NAME: 
                    result = new GeneralName((EDIPartyName) in.content);
                    break;
                case UR_ID: 
                    String uri = (String) in.content;
                    if (uri.indexOf(":") == -1) {
                        throw new IOException("GeneralName: scheme is missing in URI: " + uri);
                    }
                    result = new GeneralName(in.choiceIndex, uri);
                    break;
                case IP_ADDR: 
                    result = new GeneralName((byte[]) in.content);
                    break;
                case REG_ID: 
                    result = new GeneralName(in.choiceIndex,
                            ObjectIdentifier.toString((int[]) in.content));
                    break;
                default:
                    throw new IOException("GeneralName: unknown tag: " + in.choiceIndex);
            }
            result.encoding = in.getEncoded();
            return result;
        }
    };
    
    
    public int getIndex(java.lang.Object object) {
            return  ((GeneralName) object).tag;
        }
    
    
    public Object getObjectToEncode(Object value) {
            return ((GeneralName) value).name;
        }
    
}


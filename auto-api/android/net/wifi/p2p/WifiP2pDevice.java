package android.net.wifi.p2p;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.os.Parcelable;
import android.os.Parcel;
import android.util.Log;
import java.util.regex.Pattern;

public class WifiP2pDevice implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.683 -0400", hash_original_field = "271FEAE7FBE3640A38493945A82BE63F", hash_generated_field = "9A7D4F81FAFB7D27EA987849BE77B870")

    public String deviceName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "519D99D9C5FAC874DB35B04A27557D9B", hash_generated_field = "AF33174D1ECF5398CFAFDB3DA69ECE9B")

    public String deviceAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "3C3899100031989CA8DC1CD5899032D0", hash_generated_field = "D9677D104688FDB3640FCDFC7678BD77")

    public String interfaceAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "5476575B2F57F8C80F22DEF75E8D228B", hash_generated_field = "C8560C786D68383CDDC32BE9AF81775C")

    public String primaryDeviceType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "92B3FF13AF549C4CD6B5B65E360FEEE7", hash_generated_field = "A0E2331A45EBC682CDD39EC85B9272F4")

    public String secondaryDeviceType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "9B21FABAED5EBC11E1EF7EE8AF35DC3F", hash_generated_field = "057DC56034FD8E15F0EE29D17084FE88")

    public int wpsConfigMethodsSupported;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "01840975B61547AAF4F354C1A4E68B58", hash_generated_field = "24F1D51080FEAB5C6723A8A0299BEEA4")

    public int deviceCapability;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "F8E080D14294024BBDA5AD376B3C6CB0", hash_generated_field = "A7627F4B2A75A5A2B99BAF760EB86A74")

    public int groupCapability;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_field = "44C13B312673A1B4CD877AF886680F7D", hash_generated_field = "0FCEE9D7758B8948ABBBB774FA2E2C5C")

    public int status = UNAVAILABLE;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.684 -0400", hash_original_method = "6DEE1BC764FD2CB933A4912269652401", hash_generated_method = "F64008BCEC449AEC52DED02A9FF6F441")
    public  WifiP2pDevice() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.686 -0400", hash_original_method = "B4DFEB594E50AA2111054B3A3A6DF197", hash_generated_method = "3B430A0595D24FE147F8B3CCA6BEA0B5")
    public  WifiP2pDevice(String string) throws IllegalArgumentException {
        String[] tokens = string.split(" ");
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Malformed supplicant event");
        } 
        {
            deviceAddress = string;
        } 
        {
            String token = tokens[0];
            {
                String[] nameValue = token.split("=");
                {
                    boolean var8AC9DB9DC429149EDA79109543592BA6_1721646771 = (nameValue[0].equals("p2p_dev_addr"));
                    {
                        deviceAddress = nameValue[1];
                    } 
                } 
                {
                    boolean var0E731094D1437FC30119369BCBB0A589_1929714630 = (nameValue[0].equals("pri_dev_type"));
                    {
                        primaryDeviceType = nameValue[1];
                    } 
                } 
                {
                    boolean var09B981DCA6D84DEB8CD275F9C5F3EDB0_576251349 = (nameValue[0].equals("name"));
                    {
                        deviceName = trimQuotes(nameValue[1]);
                    } 
                } 
                {
                    boolean var924CEDDD1099FF99F1FC46ADD3D9A1D8_2000847829 = (nameValue[0].equals("config_methods"));
                    {
                        wpsConfigMethodsSupported = parseHex(nameValue[1]);
                    } 
                } 
                {
                    boolean var9063703FB99A098E2A9B6A2DA9A20F55_905864408 = (nameValue[0].equals("dev_capab"));
                    {
                        deviceCapability = parseHex(nameValue[1]);
                    } 
                } 
                {
                    boolean var9D6445E80ABE9386BFD88F7AE226586D_1178308417 = (nameValue[0].equals("group_capab"));
                    {
                        groupCapability = parseHex(nameValue[1]);
                    } 
                } 
            } 
        } 
        {
            boolean var4E8A7E1B22B5D7A2E828A95A82927AD6_1814383344 = (tokens[0].startsWith("P2P-DEVICE-FOUND"));
            {
                status = AVAILABLE;
            } 
        } 
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.687 -0400", hash_original_method = "8BE5EC4742BDBC547BA4DA345C8E71E1", hash_generated_method = "408E6B8417C36D35766E6B9F3AE1895E")
    public  WifiP2pDevice(WifiP2pDevice source) {
        {
            deviceName = source.deviceName;
            deviceAddress = source.deviceAddress;
            interfaceAddress = source.interfaceAddress;
            primaryDeviceType = source.primaryDeviceType;
            secondaryDeviceType = source.secondaryDeviceType;
            wpsConfigMethodsSupported = source.wpsConfigMethodsSupported;
            deviceCapability = source.deviceCapability;
            groupCapability = source.groupCapability;
            status = source.status;
        } 
        
        
            
            
            
            
            
            
            
            
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.687 -0400", hash_original_method = "76992CA06444764D9CF7DB1AFF10640E", hash_generated_method = "DB50AFECAD5149A845DE6D179898DF50")
    public boolean wpsPbcSupported() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1130737943 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1130737943;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.688 -0400", hash_original_method = "B2A0BAE23B24F963FF842B8EAAF5D840", hash_generated_method = "06E7A0AFD0A8A2F7E478DA1BCA38FB83")
    public boolean wpsKeypadSupported() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1013234801 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1013234801;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.688 -0400", hash_original_method = "89517E0D3099BE3BB50FEAB8A124BB8F", hash_generated_method = "24E992620758F7E52EEBE38965859A38")
    public boolean wpsDisplaySupported() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1221204241 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1221204241;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.688 -0400", hash_original_method = "3FBC138270F4ADEAF27B9A0357206073", hash_generated_method = "E92E45B94070CE1B38CEE0873A4CCE60")
    public boolean isServiceDiscoveryCapable() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_752757843 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_752757843;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.689 -0400", hash_original_method = "A041F8E96FF7F1638DE5EDEE0D23FE8B", hash_generated_method = "3DE41FC275F337B3CE3F6DDFA5BF1471")
    public boolean isGroupOwner() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2074801762 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2074801762;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.690 -0400", hash_original_method = "09392A3C152DA1725DCCBD5DEBB248C2", hash_generated_method = "52B28DA45371B83B58C0F38E032F251C")
    @Override
    public boolean equals(Object obj) {
        WifiP2pDevice other = (WifiP2pDevice) obj;
        boolean varF2FEF16ABB9E6BF81AAF4EE3693DE3E5_647040647 = (other.deviceAddress.equals(deviceAddress));
        addTaint(obj.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_354106661 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_354106661;
        
        
        
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.691 -0400", hash_original_method = "016D59A2B811BA8203F4683B5513F2D5", hash_generated_method = "626D1B20EBB234A403EB76BCD80AFC1C")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1259349350 = null; 
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("Device: ").append(deviceName);
        sbuf.append("\n deviceAddress: ").append(deviceAddress);
        sbuf.append("\n interfaceAddress: ").append(interfaceAddress);
        sbuf.append("\n primary type: ").append(primaryDeviceType);
        sbuf.append("\n secondary type: ").append(secondaryDeviceType);
        sbuf.append("\n wps: ").append(wpsConfigMethodsSupported);
        sbuf.append("\n grpcapab: ").append(groupCapability);
        sbuf.append("\n devcapab: ").append(deviceCapability);
        sbuf.append("\n status: ").append(status);
        varB4EAC82CA7396A68D541C85D26508E83_1259349350 = sbuf.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1259349350.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1259349350;
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.691 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "EFD89173929A7680FFB9AD0D2FC91962")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1871971323 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1871971323;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.692 -0400", hash_original_method = "F1F1C1D05E28ABD7E03ACA6C9259AC2F", hash_generated_method = "4338B9F77A063F8BEA4A8867424D1460")
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(deviceName);
        dest.writeString(deviceAddress);
        dest.writeString(interfaceAddress);
        dest.writeString(primaryDeviceType);
        dest.writeString(secondaryDeviceType);
        dest.writeInt(wpsConfigMethodsSupported);
        dest.writeInt(deviceCapability);
        dest.writeInt(groupCapability);
        dest.writeInt(status);
        addTaint(dest.getTaint());
        addTaint(flags);
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_method = "81EACEB4EB0E2420630EBFC84E59B2A4", hash_generated_method = "9A1700A059CFF99A20257F09B26850FC")
    private String trimQuotes(String str) {
        String varB4EAC82CA7396A68D541C85D26508E83_380327901 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_651949190 = null; 
        str = str.trim();
        {
            boolean varCCC98BB190CD9DF38348CFC1F7E10DC7_236991470 = (str.startsWith("'") && str.endsWith("'"));
            {
                varB4EAC82CA7396A68D541C85D26508E83_380327901 = str.substring(1, str.length()-1);
            } 
        } 
        varB4EAC82CA7396A68D541C85D26508E83_651949190 = str;
        addTaint(str.getTaint());
        String varA7E53CE21691AB073D9660D615818899_872615522; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_872615522 = varB4EAC82CA7396A68D541C85D26508E83_380327901;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_872615522 = varB4EAC82CA7396A68D541C85D26508E83_651949190;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_872615522.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_872615522;
        
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_method = "C0F4185566F115FC2220CE409C454DF3", hash_generated_method = "5A316540028538EE7E7B71BB8F4E9E0F")
    private int parseHex(String hexString) {
        int num = 0;
        {
            boolean var67CDF86B1EA52DCF199AB47995A915FB_1645802480 = (hexString.startsWith("0x") || hexString.startsWith("0X"));
            {
                hexString = hexString.substring(2);
            } 
        } 
        try 
        {
            num = Integer.parseInt(hexString, 16);
        } 
        catch (NumberFormatException e)
        { }
        addTaint(hexString.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2079234067 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2079234067;
        
        
        
            
        
        
            
        
            
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "AE43CB08180DDB93087C004ADAB60C50", hash_generated_field = "2D3FA46E684AAF11DB903AED32FED7F0")

    private static final String TAG = "WifiP2pDevice";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "8598204F3C37E7E1F5019D0FBDF50847", hash_generated_field = "D2C76F901E5BC3A5C02272862E00F60C")

    private static final int WPS_CONFIG_DISPLAY = 0x0008;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "32FDFB589F79EA959F0618C849371C92", hash_generated_field = "78E701778F1AAA542995E26A9F4815B3")

    private static final int WPS_CONFIG_PUSHBUTTON = 0x0080;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "A677601AA4FDC4E1C90E63620FB86358", hash_generated_field = "4441C9AC819F241188C2F8B8A1223F6F")

    private static final int WPS_CONFIG_KEYPAD = 0x0100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "64E3C91CE49305F32DF8E49258AF40F6", hash_generated_field = "ED7E840AF6B67252A5F338FC4F9F5C16")

    private static final int DEVICE_CAPAB_SERVICE_DISCOVERY = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "848A578E2570E7EBD1C50FBED0CC6E34", hash_generated_field = "B3F55D1FD38440F6A01D01E71751E240")

    private static final int DEVICE_CAPAB_CLIENT_DISCOVERABILITY = 1<<1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "22F2BB19D52A359661973536C90EE58F", hash_generated_field = "C11C29B1C6B7394FEDFE0A204E03D494")

    private static final int DEVICE_CAPAB_CONCURRENT_OPER = 1<<2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "D3F2BF333B7E0DE0788F68FB9992E66D", hash_generated_field = "E4889542C18A4CAD394FE39FD0A7E53A")

    private static final int DEVICE_CAPAB_INFRA_MANAGED = 1<<3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "FAE3F8097286B2388CB5E9E722FA9376", hash_generated_field = "C6FDFEE4D831077E17A8F87B79E1542B")

    private static final int DEVICE_CAPAB_DEVICE_LIMIT = 1<<4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "6ADE38D2E2FE37191B2F042452FA7CA6", hash_generated_field = "E11BF5DA4C652DC3885D2F89B8BC8CBC")

    private static final int DEVICE_CAPAB_INVITATION_PROCEDURE = 1<<5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "DE296303D36B91631485D4E1AB7E6C9B", hash_generated_field = "660117B2CCF1684725E38F606720D4F8")

    private static final int GROUP_CAPAB_GROUP_OWNER = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "B5C1065E7C45300EE1C1FEE28BEC039A", hash_generated_field = "1ED43ED6AC42E70FA6E2AE19C57697F9")

    private static final int GROUP_CAPAB_PERSISTENT_GROUP = 1<<1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.693 -0400", hash_original_field = "E6C7146C910619650200D213B9387ED7", hash_generated_field = "0E2B6BAC640107ABB60FC85978FC8B33")

    private static final int GROUP_CAPAB_GROUP_LIMIT = 1<<2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "8C0EFCE86E4ECC424E835E5919446ADF", hash_generated_field = "B55D83B08662B8007693B6A4BCB60BB7")

    private static final int GROUP_CAPAB_INTRA_BSS_DIST = 1<<3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "32DCF2A6593404424A352455EA15DB35", hash_generated_field = "A7083D15E179404DC8C6B584349D2977")

    private static final int GROUP_CAPAB_CROSS_CONN = 1<<4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "15694CADE2F6777E124BD9136061231B", hash_generated_field = "B109428E0DF961D64558D4C2EB0C7A20")

    private static final int GROUP_CAPAB_PERSISTENT_RECONN = 1<<5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "8471780A070C5212C3BE09A278FE278B", hash_generated_field = "ABA5135F62F4403CCC24802B45944736")

    private static final int GROUP_CAPAB_GROUP_FORMATION = 1<<6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "6B5E0957DCB6301BBFD7E668EB84B035", hash_generated_field = "C64FAE939570F571A8BAE24D1B70BD13")

    public static final int CONNECTED   = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "06D821117E1B6D57A639606827F9604E", hash_generated_field = "B6613B33DED36EABAC0CBA0C7B969929")

    public static final int INVITED     = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "72D423E6C58FCDECEC7381F5C89F6C03", hash_generated_field = "CFFB40C2E01759BFC10D884F773E1A4F")

    public static final int FAILED      = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "1478E7FA7161A6AE612B8761D910DB5B", hash_generated_field = "3420700E53DA1A9A7046D001075E3AE8")

    public static final int AVAILABLE   = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "9BB63F437347685327DE4C4126C58692", hash_generated_field = "EBDD50BA8ED35706997081541733CA67")

    public static final int UNAVAILABLE = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:40.694 -0400", hash_original_field = "9AB723F7F4AC03B860BFCAE90A6330E9", hash_generated_field = "C2F80F230659999E6A4528EC4530DF69")

    public static final Creator<WifiP2pDevice> CREATOR =
        new Creator<WifiP2pDevice>() {
            public WifiP2pDevice createFromParcel(Parcel in) {
                WifiP2pDevice device = new WifiP2pDevice();
                device.deviceName = in.readString();
                device.deviceAddress = in.readString();
                device.interfaceAddress = in.readString();
                device.primaryDeviceType = in.readString();
                device.secondaryDeviceType = in.readString();
                device.wpsConfigMethodsSupported = in.readInt();
                device.deviceCapability = in.readInt();
                device.groupCapability = in.readInt();
                device.status = in.readInt();
                return device;
            }

            public WifiP2pDevice[] newArray(int size) {
                return new WifiP2pDevice[size];
            }
        };
    
    public WifiP2pDevice createFromParcel(Parcel in) {
                WifiP2pDevice device = new WifiP2pDevice();
                device.deviceName = in.readString();
                device.deviceAddress = in.readString();
                device.interfaceAddress = in.readString();
                device.primaryDeviceType = in.readString();
                device.secondaryDeviceType = in.readString();
                device.wpsConfigMethodsSupported = in.readInt();
                device.deviceCapability = in.readInt();
                device.groupCapability = in.readInt();
                device.status = in.readInt();
                return device;
            }
    
    
    public WifiP2pDevice[] newArray(int size) {
                return new WifiP2pDevice[size];
            }
    
}


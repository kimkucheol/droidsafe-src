package org.apache.harmony.xnet.provider.jsse;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import javax.crypto.Cipher;

public abstract class ConnectionState {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "7E0281E8D0752C287C7E9EF3D786E7A3", hash_generated_field = "500F69F1C60CEE28C5C2ED8A78A310D1")

    protected Cipher encCipher;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "044C62AA5D8BF5BA0D564C7437A1CF13", hash_generated_field = "8B33CC70399B336F104EFE9D5E043B16")

    protected Cipher decCipher;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "471827D86551EB9B51F054D563C85636", hash_generated_field = "9C8F77FAB651025BE38856FBA3B311B5")

    protected int block_size;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "1B1B65EB7A79A67B26FC4EA2DDB83D99", hash_generated_field = "E1CDB65CF7EE51A58855DD94D92E1EAE")

    protected int hash_size;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "B9120A77E0C9360946200E8F9576819C", hash_generated_field = "2E793588BF371F357B2F4321A1C36EC3")

    protected final byte[] write_seq_num = {0, 0, 0, 0, 0, 0, 0, 0};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "60ADF91A095CBDF38C270EA47CF6BB5A", hash_generated_field = "B0D980ABBBB06862FD52BAC692678808")

    protected final byte[] read_seq_num = {0, 0, 0, 0, 0, 0, 0, 0};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_field = "42B847A03416128B2166C9E5499953D7", hash_generated_field = "20CDF3CF116D1709E473D472063662F7")

    protected Logger.Stream logger = Logger.getStream("conn_state");
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.928 -0400", hash_original_method = "88641B04B82E21943FBE8D6E4F07DC57", hash_generated_method = "88641B04B82E21943FBE8D6E4F07DC57")
    public ConnectionState ()
    {
        
    }


    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.930 -0400", hash_original_method = "A4712167FB5CF3F93D986A297FF936DF", hash_generated_method = "30BFB67CB863AA6E672262D9B25270D5")
    protected int getMinFragmentSize() {
        int var42E7BA7664A2DCCFE7BEE46BE6E36F80_685199972 = (encCipher.getOutputSize(1+hash_size));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1502814190 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1502814190;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.931 -0400", hash_original_method = "DD3B7DF1039350512C674DDBBC384DAA", hash_generated_method = "79B157B5192254F70629ADE2B4E1AA89")
    protected int getFragmentSize(int content_size) {
        int var1B7F35805D7D31794B834252131E8654_1273756028 = (encCipher.getOutputSize(content_size+hash_size));
        addTaint(content_size);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2109731532 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2109731532;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.931 -0400", hash_original_method = "1E3397EF0AF5BC858955A8504765F190", hash_generated_method = "0B729D5A6E5A0CD3959EC2C5D6AEB292")
    protected int getContentSize(int generic_cipher_size) {
        int var454DC8BF516F46D089C3CCFEA3307C93_1563570378 = (decCipher.getOutputSize(generic_cipher_size)-hash_size);
        addTaint(generic_cipher_size);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_906533138 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_906533138;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.932 -0400", hash_original_method = "56D34079E1DEB6511460268571012285", hash_generated_method = "80C7FB205FDA35ED563D33D7BBFF73E6")
    protected int getPaddingSize(int content_size) {
        int mask = block_size - 1;
        addTaint(content_size);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_402233058 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_402233058;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.932 -0400", hash_original_method = "0AD5A21CD5938B7890C178E88EF1C886", hash_generated_method = "36EEA558E5046B64C3BF347CA3A3C4D0")
    protected byte[] encrypt(byte type, byte[] fragment) {
        byte[] var89F0A6FB93D4E8AA94D0DFAF52E4CE3A_1434257820 = (encrypt(type, fragment, 0, fragment.length));
        addTaint(type);
        addTaint(fragment[0]);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1228630244 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1228630244;
        
        
    }

    
    protected abstract byte[] encrypt
        (byte type, byte[] fragment, int offset, int len);

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.933 -0400", hash_original_method = "4CD2779F027BE7D5E16F48C0F5195279", hash_generated_method = "4FE18ACA509682BD7E20CA57DB383C21")
    protected byte[] decrypt(byte type, byte[] fragment) {
        byte[] var492AC30713F1AE92D5066440B1233849_266452871 = (decrypt(type, fragment, 0, fragment.length));
        addTaint(type);
        addTaint(fragment[0]);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1167806644 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1167806644;
        
        
    }

    
    protected abstract byte[] decrypt
        (byte type, byte[] fragment, int offset, int len);

    
    protected static void incSequenceNumber(byte[] seq_num) {
        int octet = 7;
        while (octet >= 0) {
            seq_num[octet] ++;
            if (seq_num[octet] == 0) {
                octet --;
            } else {
                return;
            }
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.934 -0400", hash_original_method = "ECD0F58ABB6F3F91F5B43C452FA3783B", hash_generated_method = "9687B9A25AF6786E654A7D25AEDE0A80")
    protected void shutdown() {
        encCipher = null;
        decCipher = null;
        {
            int i = 0;
            {
                write_seq_num[i] = 0;
                read_seq_num[i] = 0;
            } 
        } 
        
        
        
        
            
            
        
    }

    
}


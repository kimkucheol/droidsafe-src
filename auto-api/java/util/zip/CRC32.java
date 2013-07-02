package java.util.zip;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.Arrays;

public class CRC32 implements Checksum {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.710 -0400", hash_original_field = "55856D1757C7BB6CDB0B9B2914C9C1F8", hash_generated_field = "103DD39C404FCCE4417B434D3EE0291E")

    private long crc = 0L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.710 -0400", hash_original_field = "4A88F108824312CB53CAB17C8073359F", hash_generated_field = "2CA876BB74D9B634ED48B07BACA76027")

    long tbytes = 0L;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.710 -0400", hash_original_method = "D55E28551E901525721E2A005775E885", hash_generated_method = "D55E28551E901525721E2A005775E885")
    public CRC32 ()
    {
        
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.711 -0400", hash_original_method = "854FE5E27AD17353F420BE5FB492E27A", hash_generated_method = "28942AFDDBF3661EAC48D0C13EB80ED7")
    public long getValue() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_192360321 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_192360321;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.711 -0400", hash_original_method = "3C94069B7580B83ACAD9A7049BA1E3DA", hash_generated_method = "1BE2E86E9BDD5C182F7FDC8F08658625")
    public void reset() {
        tbytes = crc = 0;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.711 -0400", hash_original_method = "CC03AC9F84902D02E7C98FF0D9B3A071", hash_generated_method = "BE07B44B65E0EE0F027537581BFB3A3F")
    public void update(int val) {
        crc = updateByteImpl((byte) val, crc);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.712 -0400", hash_original_method = "CE6B29801A6FECCB312673EE525F73B5", hash_generated_method = "13C689D50A12C9C127D21D737DB67415")
    public void update(byte[] buf) {
        update(buf, 0, buf.length);
        addTaint(buf[0]);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.712 -0400", hash_original_method = "FA32CF22527C3BE95E419FDEDA807F82", hash_generated_method = "546EBE55CF74EE123A00022A57002A43")
    public void update(byte[] buf, int offset, int byteCount) {
        Arrays.checkOffsetAndCount(buf.length, offset, byteCount);
        tbytes += byteCount;
        crc = updateImpl(buf, offset, byteCount, crc);
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.712 -0400", hash_original_method = "680551833B0F700FD9FEA4D72A9561BF", hash_generated_method = "2EF4462D474FA579B95F705D76BADED3")
    private long updateImpl(byte[] buf, int offset, int byteCount, long crc1) {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_2029074782 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_2029074782;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.712 -0400", hash_original_method = "90348FBF3DF8B04612B506AE017DBA82", hash_generated_method = "6B860846384077599640689C1C82E728")
    private long updateByteImpl(byte val, long crc1) {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1080907703 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1080907703;
    }

    
}


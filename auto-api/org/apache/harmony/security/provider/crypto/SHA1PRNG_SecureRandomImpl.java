package org.apache.harmony.security.provider.crypto;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.security.SecureRandomSpi;
import libcore.io.Streams;
import libcore.util.EmptyArray;

public class SHA1PRNG_SecureRandomImpl extends SecureRandomSpi implements Serializable, SHA1_Data {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.289 -0400", hash_original_field = "FE4C0F30AA359C41D9F9A5F69C8C4192", hash_generated_field = "B094937ADDF13116DE9FAD14BAA3CD5D")

    private transient int[] seed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.289 -0400", hash_original_field = "CE211E4030A8C050B5CC31371D5C80BC", hash_generated_field = "83E016BC8F9F281AEFFD444105646AA9")

    private transient long seedLength;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.289 -0400", hash_original_field = "BD0B3E6E8D0A4CF50D9E38ED509F257C", hash_generated_field = "78593073E9936326F6808A5236681E64")

    private transient int[] copies;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.289 -0400", hash_original_field = "9263E454B590D054967AC20F8B4CEA0B", hash_generated_field = "0965AA7A7376EC05762FAF3451426E68")

    private transient byte[] nextBytes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.289 -0400", hash_original_field = "6DD1000EFE672064A34C31FB5DA56EDA", hash_generated_field = "E17BB00B83C020C7021F5FEF67FD5BB0")

    private transient int nextBIndex;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.289 -0400", hash_original_field = "886BB73B3156B0AA24AAC99D2DE0B238", hash_generated_field = "AD2EEEFD65883FBF954D83EC27AF4609")

    private transient long counter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.290 -0400", hash_original_field = "9ED39E2EA931586B6A985A6942EF573E", hash_generated_field = "83BF4AAE59CAAA48C8661EF5F4399BE3")

    private transient int state;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.290 -0400", hash_original_method = "D644E56206842370DC4588BE79799AE3", hash_generated_method = "7CC69FE4B2EBF55A1C1DCB7DE02B3CF2")
    public  SHA1PRNG_SecureRandomImpl() {
        seed = new int[HASH_OFFSET + EXTRAFRAME_OFFSET];
        seed[HASH_OFFSET] = H0;
        seed[HASH_OFFSET + 1] = H1;
        seed[HASH_OFFSET + 2] = H2;
        seed[HASH_OFFSET + 3] = H3;
        seed[HASH_OFFSET + 4] = H4;
        seedLength = 0;
        copies = new int[2 * FRAME_LENGTH + EXTRAFRAME_OFFSET];
        nextBytes = new byte[DIGEST_LENGTH];
        nextBIndex = HASHBYTES_TO_USE;
        counter = COUNTER_BASE;
        state = UNDEFINED;
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.291 -0400", hash_original_method = "71D119B7F725F786DBF6F5411B9162C3", hash_generated_method = "9A1FE8C53E30A0D9CF70D743789E86B0")
    private void updateSeed(byte[] bytes) {
        SHA1Impl.updateHash(seed, bytes, 0, bytes.length - 1);
        seedLength += bytes.length;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.291 -0400", hash_original_method = "D3CE71F13CE971E436333BDFEF7BBD46", hash_generated_method = "579540292D31DCC08768B623745FF9F2")
    protected synchronized void engineSetSeed(byte[] seed) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("seed == null");
        } 
        {
            System.arraycopy(copies, HASHCOPY_OFFSET, this.seed, HASH_OFFSET,
                    EXTRAFRAME_OFFSET);
        } 
        state = SET_SEED;
        {
            updateSeed(seed);
        } 
        addTaint(seed[0]);
        
        
            
        
        
            
                    
        
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.292 -0400", hash_original_method = "DD8EBB0EDF44ABE263687E4C98AB74A0", hash_generated_method = "3647FC3093A64450C53A10239E543008")
    protected synchronized byte[] engineGenerateSeed(int numBytes) {
        byte[] myBytes;
        {
            if (DroidSafeAndroidRuntime.control) throw new NegativeArraySizeException(Integer.toString(numBytes));
        } 
        {
            myRandom = new SHA1PRNG_SecureRandomImpl();
            myRandom.engineSetSeed(RandomBitsSupplier.getRandomBits(DIGEST_LENGTH));
        } 
        myBytes = new byte[numBytes];
        myRandom.engineNextBytes(myBytes);
        addTaint(numBytes);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_528110738 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_528110738;
        
        
        
            
        
        
            
        
        
            
            
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.295 -0400", hash_original_method = "788172F4432069DD19F6D1F4ED0FDE85", hash_generated_method = "286679B6BDEA7DE01E457B2EBF43A2CF")
    protected synchronized void engineNextBytes(byte[] bytes) {
        int i;
        int n;
        long bits;
        int nextByteToReturn;
        int lastWord;
        final int extrabytes = 7;
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("bytes == null");
        } 
        lastWord = seed[BYTES_OFFSET] == 0 ? 0
                : (seed[BYTES_OFFSET] + extrabytes) >> 3 - 1;
        {
            updateSeed(RandomBitsSupplier.getRandomBits(DIGEST_LENGTH));
            nextBIndex = HASHBYTES_TO_USE;
        } 
        {
            System.arraycopy(seed, HASH_OFFSET, copies, HASHCOPY_OFFSET,
                    EXTRAFRAME_OFFSET);
            {
                i = lastWord + 3;
                {
                    seed[i] = 0;
                } 
            } 
            bits = (seedLength << 3) + 64;
            {
                seed[14] = (int) (bits >>> 32);
                seed[15] = (int) (bits & 0xFFFFFFFF);
            } 
            {
                copies[EXTRAFRAME_OFFSET + 14] = (int) (bits >>> 32);
                copies[EXTRAFRAME_OFFSET + 15] = (int) (bits & 0xFFFFFFFF);
            } 
            nextBIndex = HASHBYTES_TO_USE;
        } 
        state = NEXT_BYTES;
        nextByteToReturn = 0;
        n = (HASHBYTES_TO_USE - nextBIndex) < (bytes.length - nextByteToReturn) ? HASHBYTES_TO_USE
                - nextBIndex
                : bytes.length - nextByteToReturn;
        {
            System.arraycopy(nextBytes, nextBIndex, bytes, nextByteToReturn, n);
            nextBIndex += n;
            nextByteToReturn += n;
        } 
        n = seed[BYTES_OFFSET] & 0x03;
        {
            {
                seed[lastWord] = (int) (counter >>> 32);
                seed[lastWord + 1] = (int) (counter & 0xFFFFFFFF);
                seed[lastWord + 2] = END_FLAGS[0];
            } 
            {
                seed[lastWord] |= (int) ((counter >>> RIGHT1[n]) & MASK[n]);
                seed[lastWord + 1] = (int) ((counter >>> RIGHT2[n]) & 0xFFFFFFFF);
                seed[lastWord + 2] = (int) ((counter << LEFT[n]) | END_FLAGS[n]);
            } 
            {
                copies[EXTRAFRAME_OFFSET] = seed[FRAME_LENGTH];
                copies[EXTRAFRAME_OFFSET + 1] = seed[FRAME_LENGTH + 1];
            } 
            SHA1Impl.computeHash(seed);
            {
                System.arraycopy(seed, 0, copies, FRAME_OFFSET, FRAME_LENGTH);
                System.arraycopy(copies, EXTRAFRAME_OFFSET, seed, 0,
                        FRAME_LENGTH);
                SHA1Impl.computeHash(seed);
                System.arraycopy(copies, FRAME_OFFSET, seed, 0, FRAME_LENGTH);
            } 
            int j = 0;
            {
                i = 0;
                {
                    int k = seed[HASH_OFFSET + i];
                    nextBytes[j] = (byte) (k >>> 24);
                    nextBytes[j + 1] = (byte) (k >>> 16);
                    nextBytes[j + 2] = (byte) (k >>> 8);
                    nextBytes[j + 3] = (byte) (k);
                    j += 4;
                } 
            } 
            nextBIndex = 0;
            j = HASHBYTES_TO_USE < (bytes.length - nextByteToReturn) ? HASHBYTES_TO_USE
                    : bytes.length - nextByteToReturn;
            {
                System.arraycopy(nextBytes, 0, bytes, nextByteToReturn, j);
                nextByteToReturn += j;
                nextBIndex += j;
            } 
        } 
        addTaint(bytes[0]);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.296 -0400", hash_original_method = "716FAD60FA2495E9DABF23B35E588917", hash_generated_method = "4EB6A3D17F743C8FA5ED7B8C1EE70F6B")
    private void writeObject(ObjectOutputStream oos) throws IOException {
        int[] intData = null;
        final int only_hash = EXTRAFRAME_OFFSET;
        final int hashes_and_frame = EXTRAFRAME_OFFSET * 2 + FRAME_LENGTH;
        final int hashes_and_frame_extra = EXTRAFRAME_OFFSET * 2 + FRAME_LENGTH
                * 2;
        oos.writeLong(seedLength);
        oos.writeLong(counter);
        oos.writeInt(state);
        oos.writeInt(seed[BYTES_OFFSET]);
        int nRemaining = (seed[BYTES_OFFSET] + 3) >> 2;
        {
            intData = new int[only_hash + nRemaining];
            System.arraycopy(seed, 0, intData, 0, nRemaining);
            System.arraycopy(seed, HASH_OFFSET, intData, nRemaining,
                    EXTRAFRAME_OFFSET);
        } 
        {
            int offset = 0;
            {
                intData = new int[hashes_and_frame + nRemaining];
            } 
            {
                intData = new int[hashes_and_frame_extra + nRemaining];
                intData[offset] = seed[FRAME_LENGTH];
                intData[offset + 1] = seed[FRAME_LENGTH + 1];
                intData[offset + 2] = seed[FRAME_LENGTH + 14];
                intData[offset + 3] = seed[FRAME_LENGTH + 15];
                offset += 4;
            } 
            System.arraycopy(seed, 0, intData, offset, FRAME_LENGTH);
            offset += FRAME_LENGTH;
            System.arraycopy(copies, FRAME_LENGTH + EXTRAFRAME_OFFSET, intData,
                    offset, nRemaining);
            offset += nRemaining;
            System.arraycopy(copies, 0, intData, offset, EXTRAFRAME_OFFSET);
            offset += EXTRAFRAME_OFFSET;
            System.arraycopy(seed, HASH_OFFSET, intData, offset,
                    EXTRAFRAME_OFFSET);
        } 
        {
            int i = 0;
            {
                oos.writeInt(intData[i]);
            } 
        } 
        oos.writeInt(nextBIndex);
        oos.write(nextBytes, nextBIndex, HASHBYTES_TO_USE - nextBIndex);
        addTaint(oos.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_method = "87BDC97ACB5596298F61FE4642318DFC", hash_generated_method = "DA91C5E8C7C7A77851DA6816538535F6")
    private void readObject(ObjectInputStream ois) throws IOException,
            ClassNotFoundException {
        seed = new int[HASH_OFFSET + EXTRAFRAME_OFFSET];
        copies = new int[2 * FRAME_LENGTH + EXTRAFRAME_OFFSET];
        nextBytes = new byte[DIGEST_LENGTH];
        seedLength = ois.readLong();
        counter = ois.readLong();
        state = ois.readInt();
        seed[BYTES_OFFSET] = ois.readInt();
        int nRemaining = (seed[BYTES_OFFSET] + 3) >> 2;
        {
            {
                int i = 0;
                {
                    seed[i] = ois.readInt();
                } 
            } 
            {
                int i = 0;
                {
                    seed[HASH_OFFSET + i] = ois.readInt();
                } 
            } 
        } 
        {
            {
                seed[FRAME_LENGTH] = ois.readInt();
                seed[FRAME_LENGTH + 1] = ois.readInt();
                seed[FRAME_LENGTH + 14] = ois.readInt();
                seed[FRAME_LENGTH + 15] = ois.readInt();
            } 
            {
                int i = 0;
                {
                    seed[i] = ois.readInt();
                } 
            } 
            {
                int i = 0;
                {
                    copies[FRAME_LENGTH + EXTRAFRAME_OFFSET + i] = ois.readInt();
                } 
            } 
            {
                int i = 0;
                {
                    copies[i] = ois.readInt();
                } 
            } 
            {
                int i = 0;
                {
                    seed[HASH_OFFSET + i] = ois.readInt();
                } 
            } 
        } 
        nextBIndex = ois.readInt();
        Streams.readFully(ois, nextBytes, nextBIndex, HASHBYTES_TO_USE - nextBIndex);
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "A8EA9F4B39AB0BD01CB0A5F451A09DA2", hash_generated_field = "0572D6ADF8B4E59E97C497432F887795")

    private static final long serialVersionUID = 283736797212159675L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "688E178635EBA2754C476239F377C034", hash_generated_field = "ADA3965BFBB7E9649B91549104A70E5A")

    private static final int[] END_FLAGS = { 0x80000000, 0x800000, 0x8000, 0x80 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "7D84B7231C31338A3A5FDC6CF51747BD", hash_generated_field = "5C807BEE19CE765B4317F673B97DF948")

    private static final int[] RIGHT1 = { 0, 40, 48, 56 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "4D3A3265B305F0BE8079BF4670A33FD8", hash_generated_field = "EAE2B62B1EF3A743512A0964184AADD2")

    private static final int[] RIGHT2 = { 0, 8, 16, 24 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "228FF23FE8EE564235B29EB58558397E", hash_generated_field = "B0E4A4E8E92603834DE04BB669F210A3")

    private static final int[] LEFT = { 0, 24, 16, 8 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "0C56FDB1D1DC1B856CCD247698D5F9EB", hash_generated_field = "5ED2E9AA85783BAD621E242DDC93B094")

    private static final int[] MASK = { 0xFFFFFFFF, 0x00FFFFFF, 0x0000FFFF,
            0x000000FF };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "EA3DA587F0A5417FC02EB99734378DD0", hash_generated_field = "83224B487E823FD3948A81BA23781528")

    private static final int HASHBYTES_TO_USE = 20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "19D7356328F09D2E9E20F61CC1A8EE49", hash_generated_field = "7E064B495B5339B29C44E33FD9B2BEB9")

    private static final int FRAME_LENGTH = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "5D67AB41EC717370F39FB8E3E5B6D590", hash_generated_field = "2915A8CABBBBCA005AECE0558DF33A42")

    private static final int COUNTER_BASE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "B4FFC65D11F6A3C5D531616DECFAAEDB", hash_generated_field = "FC08696CCFA3EE206632295D5608E52A")

    private static final int HASHCOPY_OFFSET = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "7E3DDA1C9321D991F6DBCAEA75EE87B1", hash_generated_field = "BDC895B0D82A3B69363AB3B21E484915")

    private static final int EXTRAFRAME_OFFSET = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "3B83F276D0B6A4C810F3102DEEE5D8F5", hash_generated_field = "D124EA7B91A1E166C74CB5971C4654D2")

    private static final int FRAME_OFFSET = 21;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "AE01E9CB52924DB8F1F451AA07335370", hash_generated_field = "16F5CCEF9F3F7B3A8F222B597A35CCA0")

    private static final int MAX_BYTES = 48;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "65F6F32C0BA954738A0F3455B17A977F", hash_generated_field = "0DF11F4AAB291BF53347A9E765D366AE")

    private static final int UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "032C0F6071BBD65DCABF007145E60CEE", hash_generated_field = "70F1EFD63BAB99FD438DDC5003389359")

    private static final int SET_SEED = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "27B93F02F19E49DE8D63D5C3EB8F61C0", hash_generated_field = "C7803B16145BE4E5D1B39E398B4A7566")

    private static final int NEXT_BYTES = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.297 -0400", hash_original_field = "65ACB974B2A6E383FFD41E6EAA0CF2FA", hash_generated_field = "8D0E7E89B95D023E9161984B3CF40ACF")

    private static SHA1PRNG_SecureRandomImpl myRandom;
}


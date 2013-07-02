package android.nfc.tech;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.nfc.ErrorCodes;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class MifareClassic extends BasicTagTechnology {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.339 -0400", hash_original_field = "70A0825F7C8424D762F96A4610B5A4E1", hash_generated_field = "A5FF4684C8ADE9FC7594EE2E1226C64D")

    private boolean mIsEmulated;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.339 -0400", hash_original_field = "3462A1A18A0EE070E8953CCF1DD788C0", hash_generated_field = "E6B4AC7A48E0E54E09A504C828AF50C5")

    private int mType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.339 -0400", hash_original_field = "27DFA0EFE73BCB065533443A05E9DEE4", hash_generated_field = "1ADF00AF1A5D84662F00519BAA6EB9C0")

    private int mSize;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.340 -0400", hash_original_method = "05B1EEC895D259A0FF8852CB7B561E5D", hash_generated_method = "047A9B2789A5EF1C1A843241ABE522B0")
    public  MifareClassic(Tag tag) throws RemoteException {
        super(tag, TagTechnology.MIFARE_CLASSIC);
        NfcA a = NfcA.get(tag);
        mIsEmulated = false;
        {
            Object var93ACA3F0B48D9F602F8D7CF917D09E5E_762637701 = (a.getSak());
            
            mType = TYPE_CLASSIC;
            
            
            mSize = SIZE_1K;
            
            
            mType = TYPE_CLASSIC;
            
            
            mSize = SIZE_MINI;
            
            
            mType = TYPE_PLUS;
            
            
            mSize = SIZE_2K;
            
            
            mType = TYPE_PLUS;
            
            
            mSize = SIZE_4K;
            
            
            mType = TYPE_CLASSIC;
            
            
            mSize = SIZE_4K;
            
            
            mType = TYPE_CLASSIC;
            
            
            mSize = SIZE_1K;
            
            
            mIsEmulated = true;
            
            
            mType = TYPE_CLASSIC;
            
            
            mSize = SIZE_4K;
            
            
            mIsEmulated = true;
            
            
            mType = TYPE_CLASSIC;
            
            
            mSize = SIZE_1K;
            
            
            mType = TYPE_PRO;
            
            
            mSize = SIZE_4K;
            
            
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                    "Tag incorrectly enumerated as MIFARE Classic, SAK = " + a.getSak());
            
        } 
        addTaint(tag.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static MifareClassic get(Tag tag) {
        if (!tag.hasTech(TagTechnology.MIFARE_CLASSIC)) return null;
        try {
            return new MifareClassic(tag);
        } catch (RemoteException e) {
            return null;
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.341 -0400", hash_original_method = "E9AD68D49398B2B9D86D12D221B14582", hash_generated_method = "428D722F540EB6D62EC71907E3A5C074")
    public int getType() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2098602812 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2098602812;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.341 -0400", hash_original_method = "2098B918320D3D5229820CAB47C60E59", hash_generated_method = "B6E6EA854765881298A9A4310173B0E8")
    public int getSize() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_635843969 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_635843969;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.341 -0400", hash_original_method = "571F1D61EE68738D4B1083BD48C02876", hash_generated_method = "044028EAAA3A88994F3C90E8112E4685")
    public boolean isEmulated() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2032536494 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2032536494;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.342 -0400", hash_original_method = "4AAA3C3D329C939FDD63EF1F58378EDA", hash_generated_method = "6CE7E55379B851FC051EED51EACCF563")
    public int getSectorCount() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_512979136 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_512979136;
        
        
        
            
        
            
        
            
        
            
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.343 -0400", hash_original_method = "94025DFC316C8F4CE80BFCF15B00E224", hash_generated_method = "5288672541AABD280DF9131C26A2564A")
    public int getBlockCount() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1131783781 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1131783781;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.343 -0400", hash_original_method = "4046C9F5F79A621BBA2F7BE2C9D1103D", hash_generated_method = "C7DBEB9C17D62485DDBCE90E43D3D130")
    public int getBlockCountInSector(int sectorIndex) {
        validateSector(sectorIndex);
        addTaint(sectorIndex);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_450771876 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_450771876;
        
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.344 -0400", hash_original_method = "54173D46B73CE605A7C420967C72CF9C", hash_generated_method = "71E4E757BFD2375E88911827DA031DDA")
    public int blockToSector(int blockIndex) {
        validateBlock(blockIndex);
        addTaint(blockIndex);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_412607408 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_412607408;
        
        
        
            
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.344 -0400", hash_original_method = "9D4F0360D229F71B4914DA14E59850F0", hash_generated_method = "8853184C0DE457395C306A33AA8DF5D0")
    public int sectorToBlock(int sectorIndex) {
        addTaint(sectorIndex);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1147348582 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1147348582;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.345 -0400", hash_original_method = "88C199BE0D888C3B911ED6B5CDCE45B3", hash_generated_method = "50DAE6B7D8ACF81C7C5F48E73DBE2D55")
    public boolean authenticateSectorWithKeyA(int sectorIndex, byte[] key) throws IOException {
        boolean var67D2AC1426E5D4EAA35E8B99318A4DB5_1875281920 = (authenticate(sectorIndex, key, true));
        addTaint(sectorIndex);
        addTaint(key[0]);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1240278284 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1240278284;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.346 -0400", hash_original_method = "18C51006B4E85BDBA44E7C237EA48ACA", hash_generated_method = "1475E67958AAB7A06C8FD7668FBA0BA9")
    public boolean authenticateSectorWithKeyB(int sectorIndex, byte[] key) throws IOException {
        boolean varDB5EB89BC26E94298B5CAAB9335E343E_640488746 = (authenticate(sectorIndex, key, false));
        addTaint(sectorIndex);
        addTaint(key[0]);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1755530108 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1755530108;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.347 -0400", hash_original_method = "A4BE9C6E30E6595D3E1AAF1825AE0C43", hash_generated_method = "9C7B94B91917ECF59BB58B3C26D0DE10")
    private boolean authenticate(int sector, byte[] key, boolean keyA) throws IOException {
        validateSector(sector);
        checkConnected();
        byte[] cmd = new byte[12];
        {
            cmd[0] = 0x60;
        } 
        {
            cmd[0] = 0x61;
        } 
        cmd[1] = (byte) sectorToBlock(sector);
        byte[] uid = getTag().getId();
        System.arraycopy(uid, uid.length - 4, cmd, 2, 4);
        System.arraycopy(key, 0, cmd, 6, 6);
        try 
        {
            {
                boolean var5370808FB2F9D1ED4068896E6CB2FBD7_1359364057 = (transceive(cmd, false) != null);
            } 
        } 
        catch (TagLostException e)
        {
            if (DroidSafeAndroidRuntime.control) throw e;
        } 
        catch (IOException e)
        { }
        addTaint(sector);
        addTaint(key[0]);
        addTaint(keyA);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_689743297 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_689743297;
        
        
        
        
        
            
        
            
        
        
        
        
        
        
            
                
            
        
            
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.349 -0400", hash_original_method = "540E686F2680F6F111FB5FE029F249C7", hash_generated_method = "3851AC54C628598D05C9597F011A61CC")
    public byte[] readBlock(int blockIndex) throws IOException {
        validateBlock(blockIndex);
        checkConnected();
        byte[] cmd = { 0x30, (byte) blockIndex };
        byte[] var74A337D194F2176A733474958A472577_235795346 = (transceive(cmd, false));
        addTaint(blockIndex);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1182182023 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1182182023;
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.350 -0400", hash_original_method = "6EB213EA4DA32B7A4304947C71CED66E", hash_generated_method = "508A389F5973ADB28F0A8AD29C49ED17")
    public void writeBlock(int blockIndex, byte[] data) throws IOException {
        validateBlock(blockIndex);
        checkConnected();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("must write 16-bytes");
        } 
        byte[] cmd = new byte[data.length + 2];
        cmd[0] = (byte) 0xA0;
        cmd[1] = (byte) blockIndex;
        System.arraycopy(data, 0, cmd, 2, data.length);
        transceive(cmd, false);
        addTaint(blockIndex);
        addTaint(data[0]);
        
        
        
        
            
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.350 -0400", hash_original_method = "B8563CE393F659B55E0B9D3772EFE7A6", hash_generated_method = "D2564A3D328AFC5CC8E3126DE3EC76B1")
    public void increment(int blockIndex, int value) throws IOException {
        validateBlock(blockIndex);
        validateValueOperand(value);
        checkConnected();
        ByteBuffer cmd = ByteBuffer.allocate(6);
        cmd.order(ByteOrder.LITTLE_ENDIAN);
        cmd.put( (byte) 0xC1 );
        cmd.put( (byte) blockIndex );
        cmd.putInt(value);
        transceive(cmd.array(), false);
        addTaint(blockIndex);
        addTaint(value);
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.351 -0400", hash_original_method = "FAA38C9F5E4C186E0FA530C9A1909DAD", hash_generated_method = "9C4EBAF2FFF33BB8D6C7839850D2F41E")
    public void decrement(int blockIndex, int value) throws IOException {
        validateBlock(blockIndex);
        validateValueOperand(value);
        checkConnected();
        ByteBuffer cmd = ByteBuffer.allocate(6);
        cmd.order(ByteOrder.LITTLE_ENDIAN);
        cmd.put( (byte) 0xC0 );
        cmd.put( (byte) blockIndex );
        cmd.putInt(value);
        transceive(cmd.array(), false);
        addTaint(blockIndex);
        addTaint(value);
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.351 -0400", hash_original_method = "25F048093BEC30F816A6E356A5759AAE", hash_generated_method = "B26CD4B98E4E2E136B2C8B9B5E51298D")
    public void transfer(int blockIndex) throws IOException {
        validateBlock(blockIndex);
        checkConnected();
        byte[] cmd = { (byte) 0xB0, (byte) blockIndex };
        transceive(cmd, false);
        addTaint(blockIndex);
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.352 -0400", hash_original_method = "CA1FBC952F4C8F3DF96DFF31BC2893A2", hash_generated_method = "7311BA73D95EBED861418641A0847578")
    public void restore(int blockIndex) throws IOException {
        validateBlock(blockIndex);
        checkConnected();
        byte[] cmd = { (byte) 0xC2, (byte) blockIndex };
        transceive(cmd, false);
        addTaint(blockIndex);
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.353 -0400", hash_original_method = "E43990821CE38E04B46B3E901EFDFA24", hash_generated_method = "3A260EBF1298ABEF33B0FA1A7274D222")
    public byte[] transceive(byte[] data) throws IOException {
        byte[] var457CAD28AA5A950818B34ED801FB2565_1820108442 = (transceive(data, true));
        addTaint(data[0]);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1344240693 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1344240693;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.361 -0400", hash_original_method = "CF96EF3BF3FCE4DA3D9E7FBB541AEB70", hash_generated_method = "14C956BA5B5FAE67EE16861F947F072A")
    public int getMaxTransceiveLength() {
        int varAD50EB2A6987338433A93D587AD15277_365908756 = (getMaxTransceiveLengthInternal());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1409209627 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1409209627;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.361 -0400", hash_original_method = "F9EC6D04AED06B3DFE22DC9A2A8AC0C3", hash_generated_method = "FDB7CDBC54F694EA96998465D6B95D72")
    public void setTimeout(int timeout) {
        try 
        {
            int err = mTag.getTagService().setTimeout(TagTechnology.MIFARE_CLASSIC, timeout);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("The supplied timeout is not valid");
            } 
        } 
        catch (RemoteException e)
        { }
        addTaint(timeout);
        
        
            
            
                
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.363 -0400", hash_original_method = "59718E6CF1FABD433F7C060A44E5C453", hash_generated_method = "1023955AC675AB67472BEABAAEAAD27D")
    public int getTimeout() {
        try 
        {
            int var5DDA3B385C812217F69F954990357FF1_1748198744 = (mTag.getTagService().getTimeout(TagTechnology.MIFARE_CLASSIC));
        } 
        catch (RemoteException e)
        { }
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_86092937 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_86092937;
        
        
            
        
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    private static void validateSector(int sector) {
        if (sector < 0 || sector >= MAX_SECTOR_COUNT) {
            throw new IndexOutOfBoundsException("sector out of bounds: " + sector);
        }
    }

    
    @DSModeled(DSC.SAFE)
    private static void validateBlock(int block) {
        if (block < 0 || block >= MAX_BLOCK_COUNT) {
            throw new IndexOutOfBoundsException("block out of bounds: " + block);
        }
    }

    
    @DSModeled(DSC.SAFE)
    private static void validateValueOperand(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("value operand negative");
        }
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.364 -0400", hash_original_field = "839E89798F641D78E99C5732B39CA844", hash_generated_field = "BC8F11E4AEAD11E0412B7B53DF0CA6C8")

    private static final String TAG = "NFC";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "F43B62ACBEF62955A892A0125C4E97AC", hash_generated_field = "54FD0024ABE4EEEC2428AB757D9F3016")

    public static final byte[] KEY_DEFAULT =
            {(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "21F9D525110FC9DDAD2D96449A9406BF", hash_generated_field = "15DB5DCB955364C48035DA5E4E953740")

    public static final byte[] KEY_MIFARE_APPLICATION_DIRECTORY =
            {(byte)0xA0,(byte)0xA1,(byte)0xA2,(byte)0xA3,(byte)0xA4,(byte)0xA5};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "E003BDDE321126A7175909200065CC96", hash_generated_field = "12E87E1D5AC9EA588363E4D80F1B1001")

    public static final byte[] KEY_NFC_FORUM =
            {(byte)0xD3,(byte)0xF7,(byte)0xD3,(byte)0xF7,(byte)0xD3,(byte)0xF7};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "5034A85BF931B74EFB4900211957B4BB", hash_generated_field = "384725A35AE2048CC01CB14C667E6F8D")

    public static final int TYPE_UNKNOWN = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "296852A8BBEF25A87785985C2BC0DFC5", hash_generated_field = "7061FCCEF7055B824FD2AA480431DCC6")

    public static final int TYPE_CLASSIC = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "ECD0E35FE52D2DE30F387A5A130B6976", hash_generated_field = "4E9412DEFDF67F37DBAB413F0A64A35E")

    public static final int TYPE_PLUS = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "6712F118318BDDE896831243EAB79997", hash_generated_field = "E54C8D8F5C6AB4014CB13C1AA7F26768")

    public static final int TYPE_PRO = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "44E5C75C5C9E25B08F5E8DAB7426A47C", hash_generated_field = "1768559A5BB2B8E1D785D5C51528A7E2")

    public static final int SIZE_1K = 1024;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "38245792A1CA3B41429F8B68D818111D", hash_generated_field = "29839D581DC916610DC52670577D996D")

    public static final int SIZE_2K = 2048;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "CAB6DD92345B3C8AFAF46DAB9D8D88A7", hash_generated_field = "901EEE828F9926FE0467F5BB2C7B7D08")

    public static final int SIZE_4K = 4096;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "2DBC1251377F3758534631A170319E57", hash_generated_field = "042D532175870A55F83E79C5988117F4")

    public static final int SIZE_MINI = 320;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "B38149A434660ADA03E33C84BD3F6CED", hash_generated_field = "195B8DA56AF39DED77508EB085D1B2A5")

    public static final int BLOCK_SIZE = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "BD15FD57804DE3BC7D61C9ABF03CBDC3", hash_generated_field = "BC260A9D029BA6EDF18C45D0AF8942E9")

    private static final int MAX_BLOCK_COUNT = 256;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.365 -0400", hash_original_field = "B6DBE45B32DD2B5C973502062E9E9DAD", hash_generated_field = "D29CA245349D4EF940C9F42785B91E3A")

    private static final int MAX_SECTOR_COUNT = 40;
}


package android.ddm;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import org.apache.harmony.dalvik.ddmc.Chunk;
import org.apache.harmony.dalvik.ddmc.ChunkHandler;
import org.apache.harmony.dalvik.ddmc.DdmServer;
import org.apache.harmony.dalvik.ddmc.DdmVmInternal;
import android.util.Log;
import java.nio.ByteBuffer;

public class DdmHandleThread extends ChunkHandler {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.058 -0400", hash_original_method = "9014293089915C4268DF07C71EC6FF27", hash_generated_method = "FE5211883165D04E298E22C79DEA3B63")
    private  DdmHandleThread() {
        
    }

    
    @DSModeled(DSC.SAFE)
    public static void register() {
        DdmServer.registerHandler(CHUNK_THEN, mInstance);
        DdmServer.registerHandler(CHUNK_THST, mInstance);
        DdmServer.registerHandler(CHUNK_STKL, mInstance);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.059 -0400", hash_original_method = "FF1AB110B94FCC8AEFA697D75FFC57DD", hash_generated_method = "234EA70F7C5F3B8EA6891C34DC4DD59D")
    public void connected() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.059 -0400", hash_original_method = "7ECE87C8E0B6AC612BF4B05EB3BE89DA", hash_generated_method = "A03BB8B8FD980F77D1775E26C3251D60")
    public void disconnected() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.060 -0400", hash_original_method = "A7F2A84C27DF1EE7C10C6ACC7D9300BF", hash_generated_method = "E2C6F5A2FC1DE6565B15E93563BE3F09")
    public Chunk handleChunk(Chunk request) {
        Chunk varB4EAC82CA7396A68D541C85D26508E83_2085612588 = null; 
        Chunk varB4EAC82CA7396A68D541C85D26508E83_768209179 = null; 
        Chunk varB4EAC82CA7396A68D541C85D26508E83_999564200 = null; 
        int type = request.type;
        {
            varB4EAC82CA7396A68D541C85D26508E83_2085612588 = handleTHEN(request);
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_768209179 = handleTHST(request);
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_999564200 = handleSTKL(request);
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Unknown packet "
                + ChunkHandler.name(type));
        } 
        addTaint(request.getTaint());
        Chunk varA7E53CE21691AB073D9660D615818899_874736788; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_874736788 = varB4EAC82CA7396A68D541C85D26508E83_2085612588;
                break;
            case 2: 
                varA7E53CE21691AB073D9660D615818899_874736788 = varB4EAC82CA7396A68D541C85D26508E83_768209179;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_874736788 = varB4EAC82CA7396A68D541C85D26508E83_999564200;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_874736788.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_874736788;
        
        
            
        
        
            
        
            
        
            
        
            
                
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.061 -0400", hash_original_method = "BC156E08FEFB0A0F13BF2C52AB62FDFE", hash_generated_method = "6148AED64DF8A362C3A4BCDDE32D5458")
    private Chunk handleTHEN(Chunk request) {
        Chunk varB4EAC82CA7396A68D541C85D26508E83_1781129078 = null; 
        ByteBuffer in = wrapChunk(request);
        boolean enable = (in.get() != 0);
        DdmVmInternal.threadNotify(enable);
        varB4EAC82CA7396A68D541C85D26508E83_1781129078 = null;
        addTaint(request.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1781129078.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1781129078;
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.063 -0400", hash_original_method = "2695125C08C32728E983ED92A17A93FC", hash_generated_method = "411504CDF3BFAE8A96A9CE34CA278622")
    private Chunk handleTHST(Chunk request) {
        Chunk varB4EAC82CA7396A68D541C85D26508E83_692933192 = null; 
        Chunk varB4EAC82CA7396A68D541C85D26508E83_1719136106 = null; 
        ByteBuffer in = wrapChunk(request);
        byte[] status = DdmVmInternal.getThreadStats();
        varB4EAC82CA7396A68D541C85D26508E83_692933192 = new Chunk(CHUNK_THST, status, 0, status.length);
        varB4EAC82CA7396A68D541C85D26508E83_1719136106 = createFailChunk(1, "Can't build THST chunk");
        addTaint(request.getTaint());
        Chunk varA7E53CE21691AB073D9660D615818899_1638869029; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1638869029 = varB4EAC82CA7396A68D541C85D26508E83_692933192;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1638869029 = varB4EAC82CA7396A68D541C85D26508E83_1719136106;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1638869029.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1638869029;
        
        
        
        
            
        
            
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.066 -0400", hash_original_method = "D658C618BB2C2BBDA71F6A2C6E25EF76", hash_generated_method = "4ED10C2B89C46350F4C4863740D6C3D7")
    private Chunk handleSTKL(Chunk request) {
        Chunk varB4EAC82CA7396A68D541C85D26508E83_336299697 = null; 
        Chunk varB4EAC82CA7396A68D541C85D26508E83_644725842 = null; 
        ByteBuffer in = wrapChunk(request);
        int threadId;
        threadId = in.getInt();
        StackTraceElement[] trace = DdmVmInternal.getStackTraceById(threadId);
        {
            varB4EAC82CA7396A68D541C85D26508E83_336299697 = createFailChunk(1, "Stack trace unavailable");
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_644725842 = createStackChunk(trace, threadId);
        } 
        addTaint(request.getTaint());
        Chunk varA7E53CE21691AB073D9660D615818899_885318612; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_885318612 = varB4EAC82CA7396A68D541C85D26508E83_336299697;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_885318612 = varB4EAC82CA7396A68D541C85D26508E83_644725842;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_885318612.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_885318612;
        
        
        
        
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.083 -0400", hash_original_method = "B0772B34720138634AE49D68BC346BA3", hash_generated_method = "8FDA84FBFD375151AFFE17987CE00A3D")
    private Chunk createStackChunk(StackTraceElement[] trace, int threadId) {
        Chunk varB4EAC82CA7396A68D541C85D26508E83_338030773 = null; 
        int bufferSize = 0;
        bufferSize += 4;
        bufferSize += 4;
        bufferSize += 4;
        {
            StackTraceElement elem = trace[0];
            {
                bufferSize += 4 + elem.getClassName().length() * 2;
                bufferSize += 4 + elem.getMethodName().length() * 2;
                bufferSize += 4;
                {
                    boolean var93B99DCE0D9ACE48F0C4400FF6C9D466_243846299 = (elem.getFileName() != null);
                    bufferSize += elem.getFileName().length() * 2;
                } 
                bufferSize += 4;
            } 
        } 
        ByteBuffer out = ByteBuffer.allocate(bufferSize);
        out.putInt(0);
        out.putInt(threadId);
        out.putInt(trace.length);
        {
            StackTraceElement elem = trace[0];
            {
                out.putInt(elem.getClassName().length());
                putString(out, elem.getClassName());
                out.putInt(elem.getMethodName().length());
                putString(out, elem.getMethodName());
                {
                    boolean var93B99DCE0D9ACE48F0C4400FF6C9D466_616946958 = (elem.getFileName() != null);
                    {
                        out.putInt(elem.getFileName().length());
                        putString(out, elem.getFileName());
                    } 
                    {
                        out.putInt(0);
                    } 
                } 
                out.putInt(elem.getLineNumber());
            } 
        } 
        varB4EAC82CA7396A68D541C85D26508E83_338030773 = new Chunk(CHUNK_STKL, out);
        addTaint(trace[0].getTaint());
        addTaint(threadId);
        varB4EAC82CA7396A68D541C85D26508E83_338030773.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_338030773;
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.083 -0400", hash_original_field = "DD50DBD67A5E5DC1110188F9F71C903E", hash_generated_field = "6FD8B0A025617CAABDC74F5512BD1925")

    public static final int CHUNK_THEN = type("THEN");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.083 -0400", hash_original_field = "01CEDF6E4A0B4BF2A1DFCF52F7C7E336", hash_generated_field = "76B61FBE133D3C178633BE3ED16C7D88")

    public static final int CHUNK_THCR = type("THCR");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.083 -0400", hash_original_field = "A60580E875FCE044104AAB21C07B6657", hash_generated_field = "6C54A1712C9684C82DFE10C559A7239B")

    public static final int CHUNK_THDE = type("THDE");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.083 -0400", hash_original_field = "BDA31750CF04DAD7FEF6959DFBE41BDC", hash_generated_field = "0037B4EAFA33D36A94E59F46954153B0")

    public static final int CHUNK_THST = type("THST");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.083 -0400", hash_original_field = "02E3E404B7350BC0FCCEAF2613E84FEC", hash_generated_field = "05661DA41737F5FE00F60ABE023BA158")

    public static final int CHUNK_STKL = type("STKL");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:31.084 -0400", hash_original_field = "7633E0A01D950255DC3FF633A87D0525", hash_generated_field = "80D0E25C8F1F0092137DF49E7789674E")

    private static DdmHandleThread mInstance = new DdmHandleThread();
}


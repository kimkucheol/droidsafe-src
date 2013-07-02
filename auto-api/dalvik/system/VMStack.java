package dalvik.system;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public final class VMStack {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:35.820 -0400", hash_original_method = "48F2A5F5D0FB61BCDEE57F0E62DA7F3A", hash_generated_method = "48F2A5F5D0FB61BCDEE57F0E62DA7F3A")
    public VMStack ()
    {
        
    }


    public static ClassLoader getCallingClassLoader() {
                
    	return (ClassLoader) new Object();
    }

    
    @DSModeled(DSC.SAFE)
    public static Class<?> getStackClass2() {
                
    	return Object.class;
    }

    
    @DSModeled(DSC.SAFE)
    public static Class<?>[] getClasses(int maxDepth) {
                
    	return new Class[]{Object.class};
    }

    
    public static StackTraceElement[] getThreadStackTrace(Thread t) {
                
    	return new StackTraceElement[0];
    }

    
    public static int fillStackTraceElements(Thread t,
        StackTraceElement[] stackTraceElements) {
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_892665896 = DSUtils.UNKNOWN_INT;
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_892665896;
    }

    
}


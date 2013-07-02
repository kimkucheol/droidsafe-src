package android.graphics;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class SweepGradient extends Shader {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:14.554 -0400", hash_original_method = "64A53BB5A652BD9568EA8C5A648F5375", hash_generated_method = "463537946803D69503004BC054F19C41")
    public  SweepGradient(float cx, float cy,
                         int colors[], float positions[]) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("needs >= 2 number of colors");
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                        "color and position arrays must be of equal length");
        } 
        native_instance = nativeCreate1(cx, cy, colors, positions);
        native_shader = nativePostCreate1(native_instance, cx, cy, colors, positions);
        addTaint(cx);
        addTaint(cy);
        addTaint(colors[0]);
        addTaint(positions[0]);
        
        
            
        
        
            
                        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.451 -0400", hash_original_method = "1126924377A1AF5E908D05CFB28B37FF", hash_generated_method = "373ADA740D8DE786DBE7403B2FAAFD84")
    public  SweepGradient(float cx, float cy, int color0, int color1) {
        native_instance = nativeCreate2(cx, cy, color0, color1);
        native_shader = nativePostCreate2(native_instance, cx, cy, color0, color1);
        addTaint(cx);
        addTaint(cy);
        addTaint(color0);
        addTaint(color1);
        
        
        
    }

    
    @DSModeled(DSC.SPEC)
    private static int nativeCreate1(float x, float y, int colors[], float positions[]) {
        return DSUtils.UNKNOWN_INT;
    }

    
    private static int nativeCreate2(float x, float y, int color0, int color1) {
        return DSUtils.UNKNOWN_INT;
    }

    
    private static int nativePostCreate1(int native_shader, float cx, float cy,
            int[] colors, float[] positions) {
        return DSUtils.UNKNOWN_INT;
    }

    
    private static int nativePostCreate2(int native_shader, float cx, float cy,
            int color0, int color1) {
        return DSUtils.UNKNOWN_INT;
    }

    
}


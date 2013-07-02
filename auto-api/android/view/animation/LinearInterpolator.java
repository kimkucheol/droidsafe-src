package android.view.animation;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.util.AttributeSet;

public class LinearInterpolator implements Interpolator {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:02.694 -0400", hash_original_method = "13E92F18FAEF7A23B3FECE76D3743C4D", hash_generated_method = "DC13658407D17E107075AA3D5F40CD6F")
    public  LinearInterpolator() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:02.694 -0400", hash_original_method = "29CB619ACC2051B5132F64AAC7117909", hash_generated_method = "A0FBB1222CC0005D5C405B8DCF1AFBD4")
    public  LinearInterpolator(Context context, AttributeSet attrs) {
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:02.695 -0400", hash_original_method = "6F32AC5E234DC575638821E35BB1A952", hash_generated_method = "C3D6FA3C857B5E5164BEAD49D2DB18D2")
    public float getInterpolation(float input) {
        addTaint(input);
        float var546ADE640B6EDFBC8A086EF31347E768_1328212715 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1328212715;
        
        
    }

    
}


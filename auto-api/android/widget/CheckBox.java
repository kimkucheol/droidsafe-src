package android.widget;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import com.android.internal.R;

public class CheckBox extends CompoundButton {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:10.187 -0400", hash_original_method = "07A60C33F591AF3364367476C757E191", hash_generated_method = "57493A5C7895739BD4734FFF00FA922D")
    public  CheckBox(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:10.188 -0400", hash_original_method = "8805AB2AC1AEC0E9A85C20D3125221E0", hash_generated_method = "22CECA2D2350C37DCB95FD24269EBC1B")
    public  CheckBox(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.checkboxStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:10.188 -0400", hash_original_method = "DC2D9AD560E05B0AD2F1F269CCCF9F57", hash_generated_method = "BA468869107AAC4B5F2FCD0B5B9787EC")
    public  CheckBox(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:10.189 -0400", hash_original_method = "270C42284D505CD6CA182328DD88ED30", hash_generated_method = "4D95B253B5F4B0348F8C4FC100B09387")
    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        
        super.onPopulateAccessibilityEvent(event);
        {
            boolean varCEC0E711DC0F7C8E920C6F998438D53D_1929102066 = (isChecked());
            {
                event.getText().add(mContext.getString(R.string.checkbox_checked));
            } 
            {
                event.getText().add(mContext.getString(R.string.checkbox_not_checked));
            } 
        } 
        addTaint(event.getTaint());
        
        
        
            
        
            
        
    }

    
}


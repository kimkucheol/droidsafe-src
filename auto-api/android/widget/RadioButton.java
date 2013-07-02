package android.widget;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import com.android.internal.R;

public class RadioButton extends CompoundButton {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:13.626 -0400", hash_original_method = "8EA0788A6467FFBB5D903E4298CD9D3F", hash_generated_method = "6A37801247D6AF2DB217E7C76AC6D9FB")
    public  RadioButton(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:13.626 -0400", hash_original_method = "FCCFFF736372EBE3F690E025A55A3D26", hash_generated_method = "98BE49F154AA32D97CC47C04539008D5")
    public  RadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.radioButtonStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:13.626 -0400", hash_original_method = "8A4946DCA2378530E5A11522D0746FD0", hash_generated_method = "A1248C0739DCB6A1C12CA097F63A41D4")
    public  RadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:13.627 -0400", hash_original_method = "4F290A4820515377F1C311D5735DB548", hash_generated_method = "9EB6AAB760E783D9065DC453BD5A1A0D")
    @Override
    public void toggle() {
        {
            boolean var7AB0DED7B5B158F799F9F55A9C38731D_1547449799 = (!isChecked());
            {
                super.toggle();
            } 
        } 
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:13.627 -0400", hash_original_method = "800F92BFA9EDE937B28EAF651D664B90", hash_generated_method = "BD89E2059544E81F25568F310C44C450")
    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        
        super.onPopulateAccessibilityEvent(event);
        {
            boolean varCEC0E711DC0F7C8E920C6F998438D53D_766420515 = (isChecked());
            {
                event.getText().add(mContext.getString(R.string.radiobutton_selected));
            } 
            {
                event.getText().add(mContext.getString(R.string.radiobutton_not_selected));
            } 
        } 
        addTaint(event.getTaint());
        
        
        
            
        
            
        
    }

    
}


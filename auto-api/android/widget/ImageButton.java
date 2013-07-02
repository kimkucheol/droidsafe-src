package android.widget;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RemoteViews.RemoteView;
import java.util.Map;

public class ImageButton extends ImageView {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:11.680 -0400", hash_original_method = "D776EEA4260F4386B702AF839A43C27E", hash_generated_method = "C74D4D92DF22322A519BE7CC5DE7B6B8")
    public  ImageButton(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:11.680 -0400", hash_original_method = "69F1C1BA5F8D6B6EC679242C32E07C96", hash_generated_method = "0C7ED95A4504D6C8BF961FD72B2A4769")
    public  ImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.imageButtonStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:11.681 -0400", hash_original_method = "47E1B94896A9BFD998FAA5ACD5A61A9C", hash_generated_method = "1331C2FB348D9FB7AA27944A5659C057")
    public  ImageButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFocusable(true);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:11.681 -0400", hash_original_method = "DC47911C20E58BC47F643D76AAAF3E73", hash_generated_method = "85ED27F50732C9648A8ACF36E9C27CA7")
    @Override
    protected boolean onSetAlpha(int alpha) {
        
        addTaint(alpha);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_235237493 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_235237493;
        
        
    }

    
}


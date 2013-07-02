package android.widget;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;

public class ZoomButton extends ImageButton implements OnLongClickListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.262 -0400", hash_original_field = "C78BEDFC523DB73DF63EFB071AF1C35B", hash_generated_field = "03E47BA0CE42772601F0A13D178B12B5")

    private Handler mHandler;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.262 -0400", hash_original_field = "65BDCBCF196E90740F940F290BEFAB2D", hash_generated_field = "26FFEDCABD497801FADA41E238F232C4")

    private final Runnable mRunnable = new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.262 -0400", hash_original_method = "93C4F1AB03EDEC29398EF344D9566441", hash_generated_method = "5D14CBEFC651639CA9AA3FDE1107D5B8")
        public void run() {
            {
                boolean var5A1FF320AD44FFAE161220CEF22196E1_430321525 = (hasOnClickListeners() && mIsInLongpress && isEnabled());
                {
                    callOnClick();
                    mHandler.postDelayed(this, mZoomSpeed);
                } 
            } 
            
            
                
                
            
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.262 -0400", hash_original_field = "10523967FB2F80A5680451244507ED0E", hash_generated_field = "EEAD05CCF97EA02687293998A0924A76")

    private long mZoomSpeed = 1000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.262 -0400", hash_original_field = "3435F341BF12B5AA17C422C22C3B5E6C", hash_generated_field = "D784F636C36BABB7864D79722AD46F05")

    private boolean mIsInLongpress;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.262 -0400", hash_original_method = "FE073AFFD3994A95FEC890EBCF528CD3", hash_generated_method = "426FFB99417CD80A6D4D96B16656C7ED")
    public  ZoomButton(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.263 -0400", hash_original_method = "2E206A8DD55CDB4EE0CBFCA63CB6A076", hash_generated_method = "4934EB9D4FDABAE4504140DD295600E3")
    public  ZoomButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.263 -0400", hash_original_method = "C3304F204963574721B46CA6BEC245F6", hash_generated_method = "8298FBB655E9B9F98D5F0C15D47855D3")
    public  ZoomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mHandler = new Handler();
        setOnLongClickListener(this);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.263 -0400", hash_original_method = "6BCA096FD56C8C78BA7791883B013378", hash_generated_method = "56A5618410F3D7658B1CAB6168AFD4FE")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        
        {
            boolean var20894F4854ED8A9DE007EB6B4F2C907D_670649291 = ((event.getAction() == MotionEvent.ACTION_CANCEL)
                || (event.getAction() == MotionEvent.ACTION_UP));
            {
                mIsInLongpress = false;
            } 
        } 
        boolean var5D1E90CB51451ACDF0A3114FBC92AA76_1271340350 = (super.onTouchEvent(event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1960111454 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1960111454;
        
        
                
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.264 -0400", hash_original_method = "DEDF5C76C1376B1670A66754E8A8EB41", hash_generated_method = "D68C36E9625129F28B8BB01C9B1C450E")
    public void setZoomSpeed(long speed) {
        mZoomSpeed = speed;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.264 -0400", hash_original_method = "26BCB5A69421DEBA679FF4C8B6DA9672", hash_generated_method = "947995048C54E67EE0988572AC50BAEB")
    public boolean onLongClick(View v) {
        
        mIsInLongpress = true;
        mHandler.post(mRunnable);
        addTaint(v.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_604209366 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_604209366;
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.264 -0400", hash_original_method = "BFA7CE14F9602D57E8995DEC9C69E7C5", hash_generated_method = "DC60342C1CE9A4E421ADFDEE8CB0563D")
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        
        mIsInLongpress = false;
        boolean varEDD771EBF66425AD21882AB08CD0EE48_640930792 = (super.onKeyUp(keyCode, event));
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1686884829 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1686884829;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.265 -0400", hash_original_method = "46BB6036120D403ECAC10DF2C7F6C840", hash_generated_method = "63657863EBDA51DCCBDA3FB14ECB59E4")
    @Override
    public void setEnabled(boolean enabled) {
        {
            setPressed(false);
        } 
        super.setEnabled(enabled);
        addTaint(enabled);
        
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:17.265 -0400", hash_original_method = "F8B564AE722FC7E23EAA2F8FF5648A4E", hash_generated_method = "5FED17B5DE910463162A4C8B71521025")
    @Override
    public boolean dispatchUnhandledMove(View focused, int direction) {
        clearFocus();
        boolean var7806FDB90C43580BB08977F76E469BBD_1751687208 = (super.dispatchUnhandledMove(focused, direction));
        addTaint(focused.getTaint());
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1641145939 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1641145939;
        
        
        
    }

    
}


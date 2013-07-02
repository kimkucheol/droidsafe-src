package android.text.method;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.view.KeyEvent;
import android.text.InputType;

public class DateKeyListener extends NumberKeyListener {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:51.092 -0400", hash_original_method = "09F9B6EA4C38704CC9648D105D359284", hash_generated_method = "09F9B6EA4C38704CC9648D105D359284")
    public DateKeyListener ()
    {
        
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:51.093 -0400", hash_original_method = "FAAA10DF871CFF7A2AF0FCDCA83E30F3", hash_generated_method = "9BCB0DB9A958945B1027EDC907E398F3")
    public int getInputType() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1354577404 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1354577404;
        
        
                
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:51.093 -0400", hash_original_method = "EEC77EA89700D9A449D9FC8461D61396", hash_generated_method = "AABF05426F6017D0745DADF73CF53D2E")
    @Override
    protected char[] getAcceptedChars() {
        char[] var50607924ABD4C17119BAF3A1CE41C0EC_1558995081 = {getTaintChar()};
        return var50607924ABD4C17119BAF3A1CE41C0EC_1558995081;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static DateKeyListener getInstance() {
        if (sInstance != null)
            return sInstance;
        sInstance = new DateKeyListener();
        return sInstance;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:51.094 -0400", hash_original_field = "5540D0A9AFB5BB5B1D50DF52A28BFDFC", hash_generated_field = "6417CC602ED83242D282A9E4E0224150")

    public static final char[] CHARACTERS = new char[] {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '/', '-', '.'
        };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:51.094 -0400", hash_original_field = "06E23A628CBDEAB09E91C69789BB1974", hash_generated_field = "6773A635B34EF84E192EA12F2E9E0C08")

    private static DateKeyListener sInstance;
}


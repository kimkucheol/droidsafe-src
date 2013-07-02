package android.view;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class InflateException extends RuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:53.943 -0400", hash_original_method = "0CE2909AE04CF0521618BA35C7B8DC0B", hash_generated_method = "C46C6AA9FCB10C2CE22351751CFC9C73")
    public  InflateException() {
        super();
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:53.944 -0400", hash_original_method = "AB0AD772D96202B15FD464EB44BD1183", hash_generated_method = "03A486B99A48494615A2E58E1C426F3C")
    public  InflateException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
        addTaint(detailMessage.getTaint());
        addTaint(throwable.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:53.944 -0400", hash_original_method = "D7F4245311806265B6BE5F25BA86EF2F", hash_generated_method = "9EDE77E26096EACF274F9AC8658A7844")
    public  InflateException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:53.944 -0400", hash_original_method = "D6B4BD85C2EC6AC3FF7C8DC3F1D9D2C5", hash_generated_method = "84802837A9222A265E1D2CB5123321A1")
    public  InflateException(Throwable throwable) {
        super(throwable);
        addTaint(throwable.getTaint());
        
    }

    
}


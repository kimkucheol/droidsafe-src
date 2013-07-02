package javax.sip.header;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.text.ParseException;

public interface PriorityHeader extends Header {
    String NAME = "Priority";

    String NON_URGENT = "Non-Urgent";
    String NORMAL = "Normal";
    String URGENT = "Urgent";
    String EMERGENCY = "Emergency";

    String getPriority();
    void setPriority(String priority) throws ParseException;
}

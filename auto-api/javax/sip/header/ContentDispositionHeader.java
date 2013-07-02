package javax.sip.header;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.text.ParseException;

public interface ContentDispositionHeader extends Header, Parameters {
    String NAME = "Content-Disposition";

    String RENDER = "Render";
    String SESSION = "Session";
    String ICON = "Icon";
    String ALERT = "Alert";

    String getDispositionType();
    void setDispositionType(String dispositionType) throws ParseException;

    String getHandling();
    void setHandling(String handling) throws ParseException;
}

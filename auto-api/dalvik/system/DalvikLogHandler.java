package dalvik.system;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface DalvikLogHandler {

    
    void publish(Logger source, String tag, Level level, String message);

    
}

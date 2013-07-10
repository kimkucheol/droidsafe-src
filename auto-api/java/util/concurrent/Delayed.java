package java.util.concurrent;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.*;

public interface Delayed extends Comparable<Delayed> {

    
    long getDelay(TimeUnit unit);
}

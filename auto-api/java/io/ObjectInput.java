package java.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public interface ObjectInput extends DataInput, AutoCloseable {
    
    public int available() throws IOException;

    
    public void close() throws IOException;

    
    public int read() throws IOException;

    
    public int read(byte[] buffer) throws IOException;

    
    public int read(byte[] buffer, int offset, int count) throws IOException;

    
    public Object readObject() throws ClassNotFoundException, IOException;

    
    public long skip(long byteCount) throws IOException;
}

package java.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.Arrays;

public class BufferedOutputStream extends FilterOutputStream {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.445 -0400", hash_original_field = "CB7E52B21171FB9A53B498202607F0BD", hash_generated_field = "083037218D1B4F9535944A48D3FD1BCA")

    protected byte[] buf;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.445 -0400", hash_original_field = "E2942A04780E223B215EB8B663CF5353", hash_generated_field = "CADFF8C1F208C99E14B28CFC1A04442F")

    protected int count;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.446 -0400", hash_original_method = "D896F62F17EBF4CCE50C0B823DA78DD6", hash_generated_method = "DCF2592BEC0A2A9308E8AFC5C2200B2C")
    public  BufferedOutputStream(OutputStream out) {
        this(out, 8192);
        addTaint(out.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.446 -0400", hash_original_method = "D77D548D42DBDD230976FC72C0A9CFDA", hash_generated_method = "CC71CDDA0337366AD71EF29446D511DF")
    public  BufferedOutputStream(OutputStream out, int size) {
        super(out);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("size <= 0");
        } 
        buf = new byte[size];
        addTaint(out.getTaint());
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.446 -0400", hash_original_method = "1ACC3FF49FD09C78DA86C982A642A64A", hash_generated_method = "5BF171C333DC6B7D2DE5007FBC651EFA")
    @Override
    public synchronized void flush() throws IOException {
        checkNotClosed();
        flushInternal();
        out.flush();
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.446 -0400", hash_original_method = "E23D99313D714FF4FE33BC33C5A12E3B", hash_generated_method = "DDEB4E71DB5F9E863DF5CE471686D51B")
    private void checkNotClosed() throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("BufferedOutputStream is closed");
        } 
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.447 -0400", hash_original_method = "EC14898AF1C6D500DEF61C098384315C", hash_generated_method = "80F1B33D7CF89B6FE5C51698B82BC362")
    @Override
    public synchronized void write(byte[] buffer, int offset, int length) throws IOException {
        checkNotClosed();
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("buffer == null");
        } 
        byte[] internalBuffer = buf;
        {
            flushInternal();
            out.write(buffer, offset, length);
        } 
        Arrays.checkOffsetAndCount(buffer.length, offset, length);
        {
            flushInternal();
        } 
        System.arraycopy(buffer, offset, internalBuffer, count, length);
        count += length;
        addTaint(buffer[0]);
        addTaint(offset);
        
        
        
            
        
        
        
            
            
            
        
        
        
            
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.447 -0400", hash_original_method = "C551C170B690A76D4989DEC0BC19E3FB", hash_generated_method = "4D85B03975F8849CF391CD30EF012287")
    @Override
    public synchronized void close() throws IOException {
        try 
        {
            super.close();
        } 
        finally 
        {
            buf = null;
        } 
        
        
            
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.447 -0400", hash_original_method = "45333A97ED5F96C22A3D88C235B79D5A", hash_generated_method = "E08E97BEDD6DCBA0954CBFAAD93363C7")
    @Override
    public synchronized void write(int oneByte) throws IOException {
        checkNotClosed();
        {
            out.write(buf, 0, count);
            count = 0;
        } 
        buf[count++] = (byte) oneByte;
        
        
        
            
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.448 -0400", hash_original_method = "AAC3F75032624F788E22A2E407A017DD", hash_generated_method = "6594BE588B21DD6F677F8C15C2973C6E")
    private void flushInternal() throws IOException {
        {
            out.write(buf, 0, count);
            count = 0;
        } 
        
        
            
            
        
    }

    
}


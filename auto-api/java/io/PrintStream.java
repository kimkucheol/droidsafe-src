package java.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

public class PrintStream extends FilterOutputStream implements Appendable, Closeable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.778 -0400", hash_original_field = "4B4C3D08948825F5FE6B51A1087D503E", hash_generated_field = "C89C47EA16E34DEBAC0E78BF779BC70F")

    private boolean ioError;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.778 -0400", hash_original_field = "9B67A50854B43F683C9C287FC0D8C97B", hash_generated_field = "C3BCA0E638347F15CBD7648899C5AE35")

    private boolean autoFlush;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.778 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "AA03A19AA54A465901EEA798BB232EAE")

    private String encoding;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.778 -0400", hash_original_method = "DA75705BB6C20C2B5C6B266426BAE0E0", hash_generated_method = "ED079146BEBE470BB6AEE67C8D015F2B")
    public  PrintStream(OutputStream out) {
        super(out);
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } 
        addTaint(out.getTaint());
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.779 -0400", hash_original_method = "4DF55F7DB2EC2DB5AB84BECA03073608", hash_generated_method = "7A8308B1D3900EE98DC28069973A3A44")
    public  PrintStream(OutputStream out, boolean autoFlush) {
        super(out);
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } 
        this.autoFlush = autoFlush;
        addTaint(out.getTaint());
        
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.779 -0400", hash_original_method = "88526CF0A98EC9AB97C7088D88161C3A", hash_generated_method = "0B92D1E491B9CFAEC43614DA83D7DE71")
    public  PrintStream(OutputStream out, boolean autoFlush, String enc) throws UnsupportedEncodingException {
        super(out);
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } 
        this.autoFlush = autoFlush;
        try 
        {
            {
                boolean var1619D1065190E523D5CEB80A273EC718_1446867258 = (!Charset.isSupported(enc));
                {
                    if (DroidSafeAndroidRuntime.control) throw new UnsupportedEncodingException(enc);
                } 
            } 
        } 
        catch (IllegalCharsetNameException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new UnsupportedEncodingException(enc);
        } 
        encoding = enc;
        addTaint(out.getTaint());
        
        
            
        
        
        
            
                
            
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.779 -0400", hash_original_method = "029BA830A503765157243541D9849231", hash_generated_method = "D927CED89129EFEE36BBC3AACBED05D4")
    public  PrintStream(File file) throws FileNotFoundException {
        super(new FileOutputStream(file));
        addTaint(file.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.779 -0400", hash_original_method = "7BD29578480474358E31B9B912D3F437", hash_generated_method = "44E965CC6E84FC8D3FADD2BFDA038970")
    public  PrintStream(File file, String csn) throws FileNotFoundException,
            UnsupportedEncodingException {
        super(new FileOutputStream(file));
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } 
        {
            boolean var74A236C162A967F1ECD5EFC7D6467A04_865648155 = (!Charset.isSupported(csn));
            {
                if (DroidSafeAndroidRuntime.control) throw new UnsupportedEncodingException(csn);
            } 
        } 
        encoding = csn;
        addTaint(file.getTaint());
        
        
            
        
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.780 -0400", hash_original_method = "75348CDEFC68D9839C10010605892932", hash_generated_method = "98625306DB9C5CF87A1D339A921DAB22")
    public  PrintStream(String fileName) throws FileNotFoundException {
        this(new File(fileName));
        addTaint(fileName.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.780 -0400", hash_original_method = "8131D7469DBCAB446E9D65623F4F3558", hash_generated_method = "53835B7CD6799A70B71A44542ABA74C9")
    public  PrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        this(new File(fileName), csn);
        addTaint(fileName.getTaint());
        addTaint(csn.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.780 -0400", hash_original_method = "DD851A8041FFB3055294FF15D1DC9C59", hash_generated_method = "1121132F6C065941383265C1B10B36BB")
    public boolean checkError() {
        OutputStream delegate = out;
        flush();
        boolean var1828C5393F7AF357FCA50D6B6EE1E98D_1137482786 = (ioError || delegate.checkError());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1516233967 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1516233967;
        
        
        
            
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.781 -0400", hash_original_method = "785F4CCF429F72C42E20A1AABCB6C5CE", hash_generated_method = "CC852D7FE95E7B5290039A783A243D73")
    protected void clearError() {
        ioError = false;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.781 -0400", hash_original_method = "43C4845D6E61D29AF25E893F4FEF10C8", hash_generated_method = "60AC52D337431F56BE65D46EF65784B9")
    @Override
    public synchronized void close() {
        flush();
        {
            try 
            {
                out.close();
                out = null;
            } 
            catch (IOException e)
            {
                setError();
            } 
        } 
        
        
        
            
                
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.782 -0400", hash_original_method = "02B2E054E74BF295FB5EB637205E6B35", hash_generated_method = "2E5844F294C2AA82ABDA4B68E8A3C411")
    @Override
    public synchronized void flush() {
        {
            try 
            {
                out.flush();
            } 
            catch (IOException e)
            { }
        } 
        setError();
        
        
            
                
                
            
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.783 -0400", hash_original_method = "05D45546979F5891D35AE44E50FD3553", hash_generated_method = "C50E3ACAD754FFECF9E18B0806C594E9")
    public PrintStream format(String format, Object... args) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_1494813156 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1494813156 = format(Locale.getDefault(), format, args);
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1494813156.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1494813156;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.784 -0400", hash_original_method = "A0786364FBC116E551740BAAD4532E24", hash_generated_method = "FDB4A4D985BDC3F472D037470603C6B5")
    public PrintStream format(Locale l, String format, Object... args) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_1192623659 = null; 
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("format == null");
        } 
        new Formatter(this, l).format(format, args);
        varB4EAC82CA7396A68D541C85D26508E83_1192623659 = this;
        addTaint(l.getTaint());
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1192623659.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1192623659;
        
        
            
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.785 -0400", hash_original_method = "AF1C3DC823982E73CFCD03CCF036C65E", hash_generated_method = "1E5E14D19E5F738CCD77E0A4DC2DAA66")
    public PrintStream printf(String format, Object... args) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_166078233 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_166078233 = format(format, args);
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_166078233.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_166078233;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.785 -0400", hash_original_method = "F50C21D98ADC94B4526029B9C256D54E", hash_generated_method = "12B643E46819642F00C24CDCDC825DDE")
    public PrintStream printf(Locale l, String format, Object... args) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_748464096 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_748464096 = format(l, format, args);
        addTaint(l.getTaint());
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_748464096.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_748464096;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.785 -0400", hash_original_method = "171496FE667133D572716C296277B927", hash_generated_method = "26FA29E3F019DA8274A7A58369323ED3")
    private void newline() {
        print(System.lineSeparator());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.786 -0400", hash_original_method = "4DD9E13DA9D3ED57FA18E838A052301E", hash_generated_method = "A7B99A74F708FFE2EEF2211EA2A377CA")
    public void print(char[] chars) {
        print(new String(chars, 0, chars.length));
        addTaint(chars[0]);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.786 -0400", hash_original_method = "C9EF4F31D0CD27922D7B220DA437A7D8", hash_generated_method = "A423FB0DAE3DF49F3F1DE3151CF56E23")
    public void print(char c) {
        print(String.valueOf(c));
        addTaint(c);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.786 -0400", hash_original_method = "7C6D053B4D54D80C9838D841006F1F5C", hash_generated_method = "A44D55428A18D632D6D605E7408DE40E")
    public void print(double d) {
        print(String.valueOf(d));
        addTaint(d);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.786 -0400", hash_original_method = "A190B4C4751A586A57985573C64F773B", hash_generated_method = "23F01502A6F0FDDF25CF60750DB00FD6")
    public void print(float f) {
        print(String.valueOf(f));
        addTaint(f);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.786 -0400", hash_original_method = "9B0E5210436ABAF1CDC241F3CE945D0E", hash_generated_method = "9AA014D7E6804E6B8BEA58F298D12895")
    public void print(int i) {
        print(String.valueOf(i));
        addTaint(i);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.787 -0400", hash_original_method = "ABA84580B4C740A85A05D502E7787C38", hash_generated_method = "B15E0DD854EF0FDBFC3F79C8BF67BC8A")
    public void print(long l) {
        print(String.valueOf(l));
        addTaint(l);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.787 -0400", hash_original_method = "56B00C0EF01C99C01A3E7CAB0AC14873", hash_generated_method = "A4E9E1B724A8819B2DF0E73DAC7B157D")
    public void print(Object o) {
        print(String.valueOf(o));
        addTaint(o.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.787 -0400", hash_original_method = "EC0BC9FFC97B234EE7DA16C4D893B8BD", hash_generated_method = "6845FE4E200C0914CF27001E1FC8A5C8")
    public synchronized void print(String str) {
        {
            setError();
        } 
        {
            print("null");
        } 
        try 
        {
            {
                write(str.getBytes());
            } 
            {
                write(str.getBytes(encoding));
            } 
        } 
        catch (IOException e)
        {
            setError();
        } 
        addTaint(str.getTaint());
        
        
            
            
        
        
            
            
        
        
            
                
            
                
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.787 -0400", hash_original_method = "D26761927DA4C2D28104AACA6719892E", hash_generated_method = "7A8F994EE3DE589DDBE9E5524B5177F1")
    public void print(boolean b) {
        print(String.valueOf(b));
        addTaint(b);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.788 -0400", hash_original_method = "9182DD9F41FA957369047C0FC9C79FCF", hash_generated_method = "AE04CE77FFF014604388A9A7F5E28EEF")
    public void println() {
        newline();
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.788 -0400", hash_original_method = "C86060CC83A142ED26FEFD1C4AFF06F6", hash_generated_method = "8938A2FE5FCD6DCE54D627E26B30D7E0")
    public void println(char[] chars) {
        println(new String(chars, 0, chars.length));
        addTaint(chars[0]);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.788 -0400", hash_original_method = "0AD803DE0349B67DF3766F5E61BB22D0", hash_generated_method = "E883109E58E1B3212A2A4D94C6403399")
    public void println(char c) {
        println(String.valueOf(c));
        addTaint(c);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.788 -0400", hash_original_method = "1C71B315F5691439EEEA0D1A39435B84", hash_generated_method = "19D6C062E79E5EF1FDA3434CB27FFB03")
    public void println(double d) {
        println(String.valueOf(d));
        addTaint(d);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.789 -0400", hash_original_method = "303071589A63282B34174CD2B6A3FE64", hash_generated_method = "2CCEDF413E024865C9B4040D0DB5495F")
    public void println(float f) {
        println(String.valueOf(f));
        addTaint(f);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.789 -0400", hash_original_method = "5AD4BE5FC276B9D22B3857BC3A21F6AF", hash_generated_method = "D517C6540C59690B2D39E32236163C8A")
    public void println(int i) {
        println(String.valueOf(i));
        addTaint(i);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.789 -0400", hash_original_method = "13C762985E9CE0F97BF4916754E07523", hash_generated_method = "D9835000754D2834382A2FC263CF597A")
    public void println(long l) {
        println(String.valueOf(l));
        addTaint(l);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.789 -0400", hash_original_method = "320F49F677524EBEDCEEC6E202E646D4", hash_generated_method = "52FEEBED21684B80C4B2F6E19575DF92")
    public void println(Object o) {
        println(String.valueOf(o));
        addTaint(o.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.792 -0400", hash_original_method = "0E73500566456C691BD3FFBE8C8D630F", hash_generated_method = "B7123BDD2756F3A21144DDEFC4B36DD9")
    public synchronized void println(String str) {
        print(str);
        newline();
        addTaint(str.getTaint());
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.794 -0400", hash_original_method = "63B90E61F0F8C1638BDCBB4A882302BD", hash_generated_method = "BF0988F7DC1409736F6D1A810B4E7CEA")
    public void println(boolean b) {
        println(String.valueOf(b));
        addTaint(b);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.794 -0400", hash_original_method = "203605AE3CB77711209DB798B89166F2", hash_generated_method = "F8950940439079B93D22633B21205292")
    protected void setError() {
        ioError = true;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.796 -0400", hash_original_method = "F607EA18611E8A10720BC492B203762D", hash_generated_method = "B377406C03D0CD26553B771D51031A9D")
    @Override
    public void write(byte[] buffer, int offset, int length) {
        Arrays.checkOffsetAndCount(buffer.length, offset, length);
        {
            {
                setError();
            } 
            try 
            {
                out.write(buffer, offset, length);
                {
                    flush();
                } 
            } 
            catch (IOException e)
            {
                setError();
            } 
        } 
        addTaint(buffer[0]);
        addTaint(offset);
        addTaint(length);
        
        
        
            
                
                
            
            
                
                
                    
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.798 -0400", hash_original_method = "18F006677191AEE023EC3E30B84DCBEE", hash_generated_method = "EF6DA5976EC9D3F165B3EBAB8EA89F8A")
    @Override
    public synchronized void write(int oneByte) {
        {
            setError();
        } 
        try 
        {
            out.write(oneByte);
            int b = oneByte & 0xFF;
            boolean isNewline = b == 0x0A || b == 0x15;
            {
                flush();
            } 
        } 
        catch (IOException e)
        {
            setError();
        } 
        addTaint(oneByte);
        
        
            
            
        
        
            
            
            
            
                
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.800 -0400", hash_original_method = "C72D2A095158FF2DF7FBE0880B8BD63F", hash_generated_method = "5912863826C7C5AC79D484B9A909EC82")
    public PrintStream append(char c) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_1681527610 = null; 
        print(c);
        varB4EAC82CA7396A68D541C85D26508E83_1681527610 = this;
        addTaint(c);
        varB4EAC82CA7396A68D541C85D26508E83_1681527610.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1681527610;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.801 -0400", hash_original_method = "FC28086FFC8546AD8E2DD12638EADD5B", hash_generated_method = "7EA4EF0BF476F685520FAD673D694D2B")
    public PrintStream append(CharSequence charSequence) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_154120699 = null; 
        {
            print("null");
        } 
        {
            print(charSequence.toString());
        } 
        varB4EAC82CA7396A68D541C85D26508E83_154120699 = this;
        addTaint(charSequence.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_154120699.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_154120699;
        
        
            
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:48.802 -0400", hash_original_method = "E6E1D45C488E30FA7AAEB51CD532F3E9", hash_generated_method = "BC3852D7992F3EE4D2807C4FE0622F5D")
    public PrintStream append(CharSequence charSequence, int start, int end) {
        PrintStream varB4EAC82CA7396A68D541C85D26508E83_349352109 = null; 
        {
            charSequence = "null";
        } 
        print(charSequence.subSequence(start, end).toString());
        varB4EAC82CA7396A68D541C85D26508E83_349352109 = this;
        addTaint(charSequence.getTaint());
        addTaint(start);
        addTaint(end);
        varB4EAC82CA7396A68D541C85D26508E83_349352109.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_349352109;
        
        
            
        
        
        
    }

    
}


package java.util.logging;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import dalvik.system.VMStack;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import libcore.util.Objects;

public class Level implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.307 -0400", hash_original_field = "B068931CC450442B63F5B3D276EA4297", hash_generated_field = "531F96E2AEBFB44CD229EC4CB1F012B0")

    private String name;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.307 -0400", hash_original_field = "2063C1608D6E0BAF80249C42E2BE5804", hash_generated_field = "810C3DA5CE7DA1BA423D6BE76816E5C9")

    private int value;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.307 -0400", hash_original_field = "9623BCEF06C4EDCE06D889B615841D11", hash_generated_field = "4BDB4C6F49EE0D4ED40E32BE56CE6580")

    private String resourceBundleName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.307 -0400", hash_original_field = "9E3F4F69757D07F6A0D2AF4F1F2A1103", hash_generated_field = "A47C9414E01189F2E30143A3854D6AFC")

    private transient ResourceBundle rb;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.308 -0400", hash_original_method = "BA2D7DFC8FDB62519DA8B21DD64373B1", hash_generated_method = "9A8AA51721A4D4AE8C00B1A847A1D2CD")
    protected  Level(String name, int level) {
        this(name, level, null);
        addTaint(name.getTaint());
        addTaint(level);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.308 -0400", hash_original_method = "53B5A8F24D3D39AE441B077329C71771", hash_generated_method = "366C7F7E8343589E368EFE9374CD083C")
    protected  Level(String name, int level, String resourceBundleName) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("name == null");
        } 
        this.name = name;
        this.value = level;
        this.resourceBundleName = resourceBundleName;
        {
            try 
            {
                rb = ResourceBundle.getBundle(resourceBundleName,
                        Locale.getDefault(), VMStack.getCallingClassLoader());
            } 
            catch (MissingResourceException e)
            {
                rb = null;
            } 
        } 
        {
            levels.add(this);
        } 
        
        
            
        
        
        
        
        
            
                
                        
            
                
            
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    public static Level parse(String name) throws IllegalArgumentException {
        if (name == null) {
            throw new NullPointerException("name == null");
        }
        boolean isNameAnInt;
        int nameAsInt;
        try {
            nameAsInt = Integer.parseInt(name);
            isNameAnInt = true;
        } catch (NumberFormatException e) {
            nameAsInt = 0;
            isNameAnInt = false;
        }
        synchronized (levels) {
            for (Level level : levels) {
                if (name.equals(level.getName())) {
                    return level;
                }
            }
            if (isNameAnInt) {
                for (Level level : levels) {
                    if (nameAsInt == level.intValue()) {
                        return level;
                    }
                }
            }
        }
        if (!isNameAnInt) {
            throw new IllegalArgumentException("Cannot parse name '" + name + "'");
        }
        return new Level(name, nameAsInt);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.309 -0400", hash_original_method = "6F5A80252F54E883F3837DA0C6833E69", hash_generated_method = "8D86B091AE2B5BB0685B25FB722DA5EE")
    public String getName() {
        String varB4EAC82CA7396A68D541C85D26508E83_723747804 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_723747804 = this.name;
        varB4EAC82CA7396A68D541C85D26508E83_723747804.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_723747804;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.310 -0400", hash_original_method = "6DEDF515FC3DFB06F00973FF806B7B79", hash_generated_method = "64AB1AE7CC284B2DE1BAE12DF292082A")
    public String getResourceBundleName() {
        String varB4EAC82CA7396A68D541C85D26508E83_1705004682 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1705004682 = this.resourceBundleName;
        varB4EAC82CA7396A68D541C85D26508E83_1705004682.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1705004682;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.310 -0400", hash_original_method = "8914B55F694F31BD669F4AB78F5D8E0B", hash_generated_method = "6F544E2E4959AAE4FC9691D097C60E41")
    public final int intValue() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_502089544 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_502089544;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.317 -0400", hash_original_method = "68F6CB700CD961C98FAD85DDC5107742", hash_generated_method = "8CD5828330EA52884B08E68CF9736C70")
    private Object readResolve() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1006705092 = null; 
        Object varB4EAC82CA7396A68D541C85D26508E83_1910012071 = null; 
        {
            {
                Iterator<Level> var107FEB5D64D997F1B50672E11E3E9727_1586500859 = (levels).iterator();
                var107FEB5D64D997F1B50672E11E3E9727_1586500859.hasNext();
                Level level = var107FEB5D64D997F1B50672E11E3E9727_1586500859.next();
                {
                    {
                        boolean var729584BCC66FA55B097FFBF4EF8251E3_404257514 = (!name.equals(level.name));
                    } 
                    {
                        boolean var4BF223D7D3821EB4754EA4BE4641285B_1271109448 = (Objects.equal(resourceBundleName, level.resourceBundleName));
                        {
                            varB4EAC82CA7396A68D541C85D26508E83_1006705092 = level;
                        } 
                    } 
                } 
            } 
            levels.add(this);
            varB4EAC82CA7396A68D541C85D26508E83_1910012071 = this;
        } 
        Object varA7E53CE21691AB073D9660D615818899_1026755348; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1026755348 = varB4EAC82CA7396A68D541C85D26508E83_1006705092;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1026755348 = varB4EAC82CA7396A68D541C85D26508E83_1910012071;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1026755348.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1026755348;
        
        
            
                
                    
                
                
                    
                
                
                    
                
            
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.318 -0400", hash_original_method = "267F1EA9E96531D86D40818D686262D8", hash_generated_method = "2E4B54893C6A310665428CF9ECAACDF3")
    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        in.defaultReadObject();
        {
            try 
            {
                rb = ResourceBundle.getBundle(resourceBundleName);
            } 
            catch (MissingResourceException e)
            {
                rb = null;
            } 
        } 
        addTaint(in.getTaint());
        
        
        
            
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.319 -0400", hash_original_method = "DEC78AA3502D783DBE391483E644D523", hash_generated_method = "0D4A3056A3939FAA149C7CB975024368")
    public String getLocalizedName() {
        String varB4EAC82CA7396A68D541C85D26508E83_1903536930 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_586303890 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_417606707 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1903536930 = name;
        } 
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_586303890 = rb.getString(name);
        } 
        catch (MissingResourceException e)
        {
            varB4EAC82CA7396A68D541C85D26508E83_417606707 = name;
        } 
        String varA7E53CE21691AB073D9660D615818899_622908577; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_622908577 = varB4EAC82CA7396A68D541C85D26508E83_1903536930;
                break;
            case 2: 
                varA7E53CE21691AB073D9660D615818899_622908577 = varB4EAC82CA7396A68D541C85D26508E83_586303890;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_622908577 = varB4EAC82CA7396A68D541C85D26508E83_417606707;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_622908577.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_622908577;
        
        
            
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.319 -0400", hash_original_method = "B7F9927C4C2FEE34F933446CD9D546A4", hash_generated_method = "C9F51426B35A765B2133F479C8D42AB3")
    @Override
    public boolean equals(Object o) {
        boolean var826F12C192C9625CB0288CDC69F40611_91013408 = (((Level) o).intValue() == this.value);
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1847746000 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1847746000;
        
        
            
        
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.319 -0400", hash_original_method = "B2C871D8CEAC47C4CD40779F84B10431", hash_generated_method = "663D589F3D77B8135B80BA322833EE9D")
    @Override
    public int hashCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1305390255 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1305390255;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_method = "1304E162466F7C6D399933DD8CDA12C4", hash_generated_method = "9D8BE97C0A60FA7A14454E1004BC1C1B")
    @Override
    public final String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_567729826 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_567729826 = this.name;
        varB4EAC82CA7396A68D541C85D26508E83_567729826.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_567729826;
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "A510FBD61CF6433DC1B175D364070D99", hash_generated_field = "D33AC5439F5BB9E615F192463618D9E3")

    private static final long serialVersionUID = -8176160795706313070L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "9846B94D1E5D63529397134055FC8E44", hash_generated_field = "5545112DFF5AE761BF55D4BFDB05CF99")

    private static final List<Level> levels = new ArrayList<Level>(9);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "E42B3E38E962DC772837339B0AE785F5", hash_generated_field = "7D4FE1BCF9F743133D4A933C0D2E6229")

    public static final Level OFF = new Level("OFF", Integer.MAX_VALUE);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "F90365F1504FEC505378D81DAE49D65F", hash_generated_field = "4E601095036636FC5637E144C84926F9")

    public static final Level SEVERE = new Level("SEVERE", 1000);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "BB7D329893836B6F2DC449A77E110B41", hash_generated_field = "75B160565D9E8B7BAAAAEBB0EB411DCE")

    public static final Level WARNING = new Level("WARNING", 900);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "273EE4426F2F5988F2F2A2E4F284BD76", hash_generated_field = "268DFBD0EE059C15C2D32B20BC6D11FD")

    public static final Level INFO = new Level("INFO", 800);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "F8A0F12AFB6FA4CF9286E87716E40E3F", hash_generated_field = "566FF1B651D340629CC4A97442061FBB")

    public static final Level CONFIG = new Level("CONFIG", 700);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "B97D2D99EEDF7FDFC8CDD1B32EBF9790", hash_generated_field = "AE5992FAEA9E073263D8DEC10FE933BC")

    public static final Level FINE = new Level("FINE", 500);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "737487473CC170234068CE91617C150E", hash_generated_field = "4B170E8B3034DDA19FAC260F54AECC50")

    public static final Level FINER = new Level("FINER", 400);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "F491ADAF22E215C62AEA59F697BB579B", hash_generated_field = "9EFCE8FEA6DBE72770E62DEF2AFF1BF2")

    public static final Level FINEST = new Level("FINEST", 300);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:16.320 -0400", hash_original_field = "6934F2D5E54432A13EAD330A1F0E862F", hash_generated_field = "F56ECB9CF27A97D320EEC5079D9727A9")

    public static final Level ALL = new Level("ALL", Integer.MIN_VALUE);
}


package java.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

class EmulatedFieldsForDumping extends ObjectOutputStream.PutField {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.727 -0400", hash_original_field = "2F09CF6A0C7823B6AADE31761B07AB12", hash_generated_field = "5423796031E51D6FB469318D4F31ADED")

    private ObjectOutputStream oos;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.727 -0400", hash_original_field = "F6140DD74E8B37A12ABECC3B9897BAA5", hash_generated_field = "B94E58D5D6568A9EC985C6A7207CC5BA")

    private EmulatedFields emulatedFields;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.727 -0400", hash_original_method = "D64C2A148CFECC0338F81243CC161580", hash_generated_method = "A6106B8CAABE6244A96E60C957ED60C5")
      EmulatedFieldsForDumping(ObjectOutputStream oos, ObjectStreamClass streamClass) {
        this.oos = oos;
        this.emulatedFields = new EmulatedFields(streamClass.fields(), (ObjectStreamField[]) null);
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.728 -0400", hash_original_method = "F09D38B717E770EDAB76B08B81548137", hash_generated_method = "4648E23E30C7E1D4D41164AB44726EE5")
     EmulatedFields emulatedFields() {
        EmulatedFields varB4EAC82CA7396A68D541C85D26508E83_711713018 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_711713018 = emulatedFields;
        varB4EAC82CA7396A68D541C85D26508E83_711713018.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_711713018;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.728 -0400", hash_original_method = "BEEEBC5D4806AB4D59848CAB89CBF72F", hash_generated_method = "B244ABBAAA37C058D046A888FC0DCAAE")
    @Override
    public void put(String name, byte value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.728 -0400", hash_original_method = "19C83E4EF6515D56E4873B39EA152436", hash_generated_method = "185988405F4439679532ECB6F7A66E3C")
    @Override
    public void put(String name, char value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.729 -0400", hash_original_method = "AC456BDE0EE43978AFAB7EF96C2FFCE8", hash_generated_method = "6443C388B7BCE84987FDAD2C29C5F490")
    @Override
    public void put(String name, double value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.729 -0400", hash_original_method = "821340AFE72172F29B54D2C504849DA8", hash_generated_method = "5E2209FF80A82D3178825F77633BE7D7")
    @Override
    public void put(String name, float value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.729 -0400", hash_original_method = "63AD54FC39DDE8BE3BBE5131906AC91A", hash_generated_method = "07C3143FB94D21C9FF7D6A295E1526DB")
    @Override
    public void put(String name, int value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.729 -0400", hash_original_method = "7C91E467656A70134D915DC378A85E85", hash_generated_method = "CF827B83847FE735C0E998F644756475")
    @Override
    public void put(String name, long value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.730 -0400", hash_original_method = "B27C87FCD55A2BEDEC6F0B351B72701B", hash_generated_method = "8E2EC95003336B3933A95B8CF1C2C159")
    @Override
    public void put(String name, Object value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.730 -0400", hash_original_method = "8872C66D19E491C8A24E1F3793E76CF5", hash_generated_method = "A337C3426AA21CC28AAA9CA2E2F7998E")
    @Override
    public void put(String name, short value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.730 -0400", hash_original_method = "7776E04A4027209B01392EB6C3502FA8", hash_generated_method = "2FDE79E41EFD6FC6D5F6ED3B2DCDACEE")
    @Override
    public void put(String name, boolean value) {
        emulatedFields.put(name, value);
        addTaint(name.getTaint());
        addTaint(value);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:47.743 -0400", hash_original_method = "AB29CC034AE7D29F14B7C45BD47F3CB4", hash_generated_method = "C0993FB529F89E56E2864F7502375B14")
    @Override
    @Deprecated
    public void write(ObjectOutput output) throws IOException {
        {
            boolean varF39E87CF781D47F95AFBD29731E4D68F_2104929932 = (!output.equals(oos));
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Attempting to write to a different stream than the one that created this PutField");
            } 
        } 
        {
            EmulatedFields.ObjectSlot slot = emulatedFields.slots()[0];
            {
                Object fieldValue = slot.getFieldValue();
                Class<?> type = slot.getField().getType();
                {
                    output.writeInt(fieldValue != null ? ((Integer) fieldValue).intValue() : 0);
                } 
                {
                    output.writeByte(fieldValue != null ? ((Byte) fieldValue).byteValue() : 0);
                } 
                {
                    output.writeChar(fieldValue != null ? ((Character) fieldValue).charValue() : 0);
                } 
                {
                    output.writeShort(fieldValue != null ? ((Short) fieldValue).shortValue() : 0);
                } 
                {
                    output.writeBoolean(fieldValue != null ? ((Boolean) fieldValue).booleanValue() : false);
                } 
                {
                    output.writeLong(fieldValue != null ? ((Long) fieldValue).longValue() : 0);
                } 
                {
                    output.writeFloat(fieldValue != null ? ((Float) fieldValue).floatValue() : 0);
                } 
                {
                    output.writeDouble(fieldValue != null ? ((Double) fieldValue).doubleValue() : 0);
                } 
                {
                    output.writeObject(fieldValue);
                } 
            } 
        } 
        addTaint(output.getTaint());
        
        
    }

    
}


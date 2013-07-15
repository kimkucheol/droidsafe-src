package com.android.i18n.phonenumbers.geocoding;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.SortedMap;

class DefaultMapStorage extends AreaCodeMapStorageStrategy {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.349 -0400", hash_original_field = "0478D9B86559137B4E632D5910E2F2C6", hash_generated_field = "8F024CB0AD263019B845A09CCEFC6C3E")

    private int[] phoneNumberPrefixes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.349 -0400", hash_original_field = "85B807452880EB104BAA9EC003D6DC00", hash_generated_field = "11DEDEF7B2B3D57903FB4636F9144ACA")

    private String[] descriptions;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.349 -0400", hash_original_method = "303B051C40F1A8F79D475AA40AA2373B", hash_generated_method = "4548E228F5AD6C18BCD7D9B123AD0017")
    public  DefaultMapStorage() {
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.349 -0400", hash_original_method = "F69095453A9ABCA4791C551DEF1AF820", hash_generated_method = "8B04EF1004EEC42AAE6A78FD04112888")
    @Override
    public boolean isFlyweight() {
        boolean var68934A3E9455FA72420237EB05902327_982473697 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1895758001 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1895758001;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.350 -0400", hash_original_method = "499E30A17B0C3429D0791D94BC3FA75F", hash_generated_method = "6F4DEDE8D30854802B182011E84EA472")
    @Override
    public int getPrefix(int index) {
        addTaint(index);
        int varB89094D27740C91334100D7B86A0BCD1_551462374 = (phoneNumberPrefixes[index]);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_672058636 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_672058636;
        // ---------- Original Method ----------
        //return phoneNumberPrefixes[index];
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.350 -0400", hash_original_method = "9F6ED4FEDAB6F7BCB8C7B74F1377FE11", hash_generated_method = "D816F94B78D8891127A830DB4650C22E")
    @Override
    public String getDescription(int index) {
        addTaint(index);
String varD8B172789CC5D7844F668D15871503C1_209220406 =         descriptions[index];
        varD8B172789CC5D7844F668D15871503C1_209220406.addTaint(taint);
        return varD8B172789CC5D7844F668D15871503C1_209220406;
        // ---------- Original Method ----------
        //return descriptions[index];
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.352 -0400", hash_original_method = "133A71C9726C43F724F7FEB46F2DAD1A", hash_generated_method = "9E66C90FC877B55894C8044C918ECCF0")
    @Override
    public void readFromSortedMap(SortedMap<Integer, String> sortedAreaCodeMap) {
        addTaint(sortedAreaCodeMap.getTaint());
        numOfEntries = sortedAreaCodeMap.size();
        phoneNumberPrefixes = new int[numOfEntries];
        descriptions = new String[numOfEntries];
        int index = 0;
for(int prefix : sortedAreaCodeMap.keySet())
        {
            phoneNumberPrefixes[index++] = prefix;
            possibleLengths.add((int) Math.log10(prefix) + 1);
        } //End block
        sortedAreaCodeMap.values().toArray(descriptions);
        // ---------- Original Method ----------
        //numOfEntries = sortedAreaCodeMap.size();
        //phoneNumberPrefixes = new int[numOfEntries];
        //descriptions = new String[numOfEntries];
        //int index = 0;
        //for (int prefix : sortedAreaCodeMap.keySet()) {
      //phoneNumberPrefixes[index++] = prefix;
      //possibleLengths.add((int) Math.log10(prefix) + 1);
    //}
        //sortedAreaCodeMap.values().toArray(descriptions);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.353 -0400", hash_original_method = "0264417E3D0614273CCDCAAD5EB78429", hash_generated_method = "4839434E131D829160F1C03195346F39")
    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        numOfEntries = objectInput.readInt();
    if(phoneNumberPrefixes == null || phoneNumberPrefixes.length < numOfEntries)        
        {
            phoneNumberPrefixes = new int[numOfEntries];
        } //End block
    if(descriptions == null || descriptions.length < numOfEntries)        
        {
            descriptions = new String[numOfEntries];
        } //End block
for(int i = 0;i < numOfEntries;i++)
        {
            phoneNumberPrefixes[i] = objectInput.readInt();
            descriptions[i] = objectInput.readUTF();
        } //End block
        int sizeOfLengths = objectInput.readInt();
        possibleLengths.clear();
for(int i = 0;i < sizeOfLengths;i++)
        {
            possibleLengths.add(objectInput.readInt());
        } //End block
        // ---------- Original Method ----------
        //numOfEntries = objectInput.readInt();
        //if (phoneNumberPrefixes == null || phoneNumberPrefixes.length < numOfEntries) {
      //phoneNumberPrefixes = new int[numOfEntries];
    //}
        //if (descriptions == null || descriptions.length < numOfEntries) {
      //descriptions = new String[numOfEntries];
    //}
        //for (int i = 0; i < numOfEntries; i++) {
      //phoneNumberPrefixes[i] = objectInput.readInt();
      //descriptions[i] = objectInput.readUTF();
    //}
        //int sizeOfLengths = objectInput.readInt();
        //possibleLengths.clear();
        //for (int i = 0; i < sizeOfLengths; i++) {
      //possibleLengths.add(objectInput.readInt());
    //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:15.355 -0400", hash_original_method = "7B03681C04FCB0BC9386533E4F9ED1FB", hash_generated_method = "E28CE5DAB41B3AD8F9294F43775B88CD")
    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        addTaint(objectOutput.getTaint());
        objectOutput.writeInt(numOfEntries);
for(int i = 0;i < numOfEntries;i++)
        {
            objectOutput.writeInt(phoneNumberPrefixes[i]);
            objectOutput.writeUTF(descriptions[i]);
        } //End block
        int sizeOfLengths = possibleLengths.size();
        objectOutput.writeInt(sizeOfLengths);
for(Integer length : possibleLengths)
        {
            objectOutput.writeInt(length);
        } //End block
        // ---------- Original Method ----------
        //objectOutput.writeInt(numOfEntries);
        //for (int i = 0; i < numOfEntries; i++) {
      //objectOutput.writeInt(phoneNumberPrefixes[i]);
      //objectOutput.writeUTF(descriptions[i]);
    //}
        //int sizeOfLengths = possibleLengths.size();
        //objectOutput.writeInt(sizeOfLengths);
        //for (Integer length : possibleLengths) {
      //objectOutput.writeInt(length);
    //}
    }

    
}


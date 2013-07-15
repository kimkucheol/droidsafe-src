package org.bouncycastle.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public class IPAddress {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:42.412 -0400", hash_original_method = "5836548C92C6B5CB4E6ABB2C3D2D08AC", hash_generated_method = "5836548C92C6B5CB4E6ABB2C3D2D08AC")
    public IPAddress ()
    {
        //Synthesized constructor
    }


        @DSModeled(DSC.SPEC)
    public static boolean isValid(
        String address) {
        return isValidIPv4(address) || isValidIPv6(address);
    }

    
        @DSModeled(DSC.SPEC)
    public static boolean isValidWithNetMask(
        String address) {
        return isValidIPv4WithNetmask(address) || isValidIPv6WithNetmask(address);
    }

    
        public static boolean isValidIPv4(
        String address) {
        if (address.length() == 0)
        {
            return false;
        }
        int octet;
        int octets = 0;
        String temp = address+".";
        int pos;
        int start = 0;
        while (start < temp.length()
            && (pos = temp.indexOf('.', start)) > start)
        {
            if (octets == 4)
            {
                return false;
            }
            try
            {
                octet = Integer.parseInt(temp.substring(start, pos));
            }
            catch (NumberFormatException ex)
            {
                return false;
            }
            if (octet < 0 || octet > 255)
            {
                return false;
            }
            start = pos + 1;
            octets++;
        }
        return octets == 4;
    }

    
        public static boolean isValidIPv4WithNetmask(
        String address) {
        int index = address.indexOf("/");
        String mask = address.substring(index + 1);
        return (index > 0) && isValidIPv4(address.substring(0, index))
                           && (isValidIPv4(mask) || isMaskValue(mask, 32));
    }

    
        public static boolean isValidIPv6WithNetmask(
        String address) {
        int index = address.indexOf("/");
        String mask = address.substring(index + 1);
        return (index > 0) && (isValidIPv6(address.substring(0, index))
                           && (isValidIPv6(mask) || isMaskValue(mask, 128)));
    }

    
        private static boolean isMaskValue(String component, int size) {
        try
        {
            int value = Integer.parseInt(component);
            return value >= 0 && value <= size;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    
        public static boolean isValidIPv6(
        String address) {
        if (address.length() == 0)
        {
            return false;
        }
        int octet;
        int octets = 0;
        String temp = address + ":";
        boolean doubleColonFound = false;
        int pos;
        int start = 0;
        while (start < temp.length()
            && (pos = temp.indexOf(':', start)) >= start)
        {
            if (octets == 8)
            {
                return false;
            }
            if (start != pos)
            {
                String value = temp.substring(start, pos);
                if (pos == (temp.length() - 1) && value.indexOf('.') > 0)
                {
                    if (!isValidIPv4(value))
                    {
                        return false;
                    }
                    octets++; 
                }
                else
                {
                    try
                    {
                        octet = Integer.parseInt(temp.substring(start, pos), 16);
                    }
                    catch (NumberFormatException ex)
                    {
                        return false;
                    }
                    if (octet < 0 || octet > 0xffff)
                    {
                        return false;
                    }
                }
            }
            else
            {
                if (pos != 1 && pos != temp.length() - 1 && doubleColonFound)
                {
                    return false;
                }
                doubleColonFound = true;
            }
            start = pos + 1;
            octets++;
        }
        return octets == 8 || doubleColonFound;
    }

    
}


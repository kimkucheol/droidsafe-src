package android.content.pm;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Random;

public class VerifierDeviceIdentity implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.280 -0400", hash_original_field = "925EF8231AAA68ACC2C87B01BF3AC56C", hash_generated_field = "C881F5DFD1BC7D567E596FEF17B3CE41")

    private long mIdentity;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.280 -0400", hash_original_field = "2379041CD5DCC44567F03DDDCCCA7E14", hash_generated_field = "2E79569F54EEBC27B02253CAB547B720")

    private String mIdentityString;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.281 -0400", hash_original_method = "E059465E7DB8A2431674A21301113B59", hash_generated_method = "5B40BFFB7D43821ECE66CFA15D91A5D5")
    public  VerifierDeviceIdentity(long identity) {
        mIdentity = identity;
        mIdentityString = encodeBase32(identity);
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.281 -0400", hash_original_method = "C7AE44830E0FC5E69D8DADD2D1F4EE49", hash_generated_method = "22FC9CB18312BDFC48D16CD080A20AE2")
    private  VerifierDeviceIdentity(Parcel source) {
        final long identity = source.readLong();
        mIdentity = identity;
        mIdentityString = encodeBase32(identity);
        addTaint(source.getTaint());
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static VerifierDeviceIdentity generate() {
        final SecureRandom sr = new SecureRandom();
        return generate(sr);
    }

    
    @DSModeled(DSC.SAFE)
    static VerifierDeviceIdentity generate(Random rng) {
        long identity = rng.nextLong();
        return new VerifierDeviceIdentity(identity);
    }

    
    private static final String encodeBase32(long input) {
        final char[] alphabet = ENCODE;
        final char encoded[] = new char[LONG_SIZE + (LONG_SIZE / GROUP_SIZE)];
        int index = encoded.length;
        for (int i = 0; i < LONG_SIZE; i++) {
            if (i > 0 && (i % GROUP_SIZE) == (LONG_SIZE % GROUP_SIZE)) {
                encoded[--index] = SEPARATOR;
            }
            final int group = (int) (input & 0x1F);
            input >>>= 5;
            encoded[--index] = alphabet[group];
        }
        return String.valueOf(encoded);
    }

    
    private static final long decodeBase32(byte[] input) throws IllegalArgumentException {
        long output = 0L;
        int numParsed = 0;
        final int N = input.length;
        for (int i = 0; i < N; i++) {
            final int group = input[i];
            final int value;
            if ('A' <= group && group <= 'Z') {
                value = group - 'A';
            } else if ('2' <= group && group <= '7') {
                value = group - ('2' - 26);
            } else if (group == SEPARATOR) {
                continue;
            } else if ('a' <= group && group <= 'z') {
                value = group - 'a';
            } else if (group == '0') {
                value = 'O' - 'A';
            } else if (group == '1') {
                value = 'I' - 'A';
            } else {
                throw new IllegalArgumentException("base base-32 character: " + group);
            }
            output = (output << 5) | value;
            numParsed++;
            if (numParsed == 1) {
                if ((value & 0xF) != value) {
                    throw new IllegalArgumentException("illegal start character; will overflow");
                }
            } else if (numParsed > 13) {
                throw new IllegalArgumentException("too long; should have 13 characters");
            }
        }
        if (numParsed != 13) {
            throw new IllegalArgumentException("too short; should have 13 characters");
        }
        return output;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.282 -0400", hash_original_method = "A24AB6F6393E3B1D0D15482B7A9B6B3D", hash_generated_method = "0A11EFCE5CE745DC499E673D9C99F180")
    @Override
    public int hashCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2127309038 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2127309038;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.284 -0400", hash_original_method = "C98AD9093350C34D0EE60C856A2859EF", hash_generated_method = "CD8F475057DF0A7D74CE5209FE1C3729")
    @Override
    public boolean equals(Object other) {
        final VerifierDeviceIdentity o = (VerifierDeviceIdentity) other;
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_299139788 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_299139788;
        
        
            
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.285 -0400", hash_original_method = "515E509B017A25F880CBE7C878F2607B", hash_generated_method = "D5DF4C20B16ED870F6311078FBD90BC7")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1253187146 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1253187146 = mIdentityString;
        varB4EAC82CA7396A68D541C85D26508E83_1253187146.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1253187146;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static VerifierDeviceIdentity parse(String deviceIdentity) throws IllegalArgumentException {
        final byte[] input;
        try {
            input = deviceIdentity.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("bad base-32 characters in input");
        }
        return new VerifierDeviceIdentity(decodeBase32(input));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.286 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "C4A21A059304F8AE0626CE7751EE5C3A")
    @Override
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1027383932 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1027383932;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.287 -0400", hash_original_method = "74CC0770FB4A8F3105F468C0A6751DF9", hash_generated_method = "0BB03E06E4B5A233260C88A5B9CB1211")
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mIdentity);
        addTaint(dest.getTaint());
        addTaint(flags);
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.287 -0400", hash_original_field = "A572ACD36A87BD71592D358A7B3194D2", hash_generated_field = "7E38ED9569F38626C4A028FD8A2B8485")

    private static final int LONG_SIZE = 13;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.287 -0400", hash_original_field = "8B311A5067EB27AB6377B5E7A06B9A7C", hash_generated_field = "7A01EEFF778BCF3738D765B30759018C")

    private static final int GROUP_SIZE = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.287 -0400", hash_original_field = "1FC596195D1F9CC23B8ACF683A79358C", hash_generated_field = "20D44E9FEF188B57242BE5C99167ADCE")

    private static final char ENCODE[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'Y', 'Z', '2', '3', '4', '5', '6', '7',
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.287 -0400", hash_original_field = "0964217270BCAAEFE573E27015C0D565", hash_generated_field = "1700CA6C584107CCD7EC123C22C80E8A")

    private static final char SEPARATOR = '-';
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.287 -0400", hash_original_field = "5D332226985CE193A54C57E93EC669C5", hash_generated_field = "B66ADEA0D2643455DE07784BB9BD72C0")

    public static final Parcelable.Creator<VerifierDeviceIdentity> CREATOR
            = new Parcelable.Creator<VerifierDeviceIdentity>() {
        public VerifierDeviceIdentity createFromParcel(Parcel source) {
            return new VerifierDeviceIdentity(source);
        }

        public VerifierDeviceIdentity[] newArray(int size) {
            return new VerifierDeviceIdentity[size];
        }
    };
    
    public VerifierDeviceIdentity createFromParcel(Parcel source) {
            return new VerifierDeviceIdentity(source);
        }
    
    
    public VerifierDeviceIdentity[] newArray(int size) {
            return new VerifierDeviceIdentity[size];
        }
    
}


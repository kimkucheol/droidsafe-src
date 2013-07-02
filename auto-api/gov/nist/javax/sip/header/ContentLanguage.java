package gov.nist.javax.sip.header;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.Locale;

public class ContentLanguage extends SIPHeader implements javax.sip.header.ContentLanguageHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.416 -0400", hash_original_field = "FB216D9E8791E63C8D12BDC420956839", hash_generated_field = "90B62845FED5E7253FA0E87D66166425")

    protected Locale locale;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.416 -0400", hash_original_method = "04F34AE7A99F7FC60EC2CE238423FC91", hash_generated_method = "B92C196A4B4BAB1C64D53F4B3E22B74A")
    public  ContentLanguage() {
        super(CONTENT_LANGUAGE);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.417 -0400", hash_original_method = "AA9A79158F9BAA0E6C86C7EA6B5AA5A0", hash_generated_method = "5B9AC641B839FD0F338D807C0C83B3AA")
    public  ContentLanguage(String languageTag) {
        super(CONTENT_LANGUAGE);
        this.setLanguageTag( languageTag );
        addTaint(languageTag.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.417 -0400", hash_original_method = "969C0CF9A75C29D747322906DB447799", hash_generated_method = "56FDBF733CD6AB52DB1ACC21A9F407CE")
    public String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_95710499 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_95710499 = this.getLanguageTag();
        varB4EAC82CA7396A68D541C85D26508E83_95710499.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_95710499;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.418 -0400", hash_original_method = "97684B013EF42C114E2563BE4754CC3B", hash_generated_method = "F6745B9B8F70709A9449AA175A65A2BD")
    public String getLanguageTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_47133919 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_820220871 = null; 
        {
            boolean var3059A4CD948191C6B3DEA9B5815BB9C7_1252768794 = ("".equals(locale.getCountry()));
            {
                varB4EAC82CA7396A68D541C85D26508E83_47133919 = locale.getLanguage();
            } 
            {
                varB4EAC82CA7396A68D541C85D26508E83_820220871 = locale.getLanguage() + '-' + locale.getCountry();
            } 
        } 
        String varA7E53CE21691AB073D9660D615818899_1250033985; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1250033985 = varB4EAC82CA7396A68D541C85D26508E83_47133919;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1250033985 = varB4EAC82CA7396A68D541C85D26508E83_820220871;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1250033985.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1250033985;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.418 -0400", hash_original_method = "0029980C0556452F57A726D089728FB9", hash_generated_method = "090F4D630A37A25CA455BCB496AFE587")
    public void setLanguageTag(String languageTag) {
        final int slash = languageTag.indexOf('-');
        {
            this.locale = new Locale(languageTag.substring(0,slash), languageTag.substring(slash+1) );
        } 
        {
            this.locale = new Locale(languageTag);
        } 
        
        
        
            
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.419 -0400", hash_original_method = "BB5B9CEBF2423E9AF1F4569292591142", hash_generated_method = "F9969383B44EE72598792F45523F6C55")
    public Locale getContentLanguage() {
        Locale varB4EAC82CA7396A68D541C85D26508E83_1889270511 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1889270511 = locale;
        varB4EAC82CA7396A68D541C85D26508E83_1889270511.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1889270511;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.419 -0400", hash_original_method = "7E2DC8255947AB5497CF8DB62C4D31B5", hash_generated_method = "ECC90E2EED8E215D634D57C08DDAA062")
    public void setContentLanguage(Locale language) {
        this.locale = language;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.420 -0400", hash_original_method = "CEAD9E53DA5FB3A31278ED5B9373A85D", hash_generated_method = "99FD1681ADF81E7BF9BE8987164AE492")
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1176346710 = null; 
        ContentLanguage retval = (ContentLanguage) super.clone();
        retval.locale = (Locale) this.locale.clone();
        varB4EAC82CA7396A68D541C85D26508E83_1176346710 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_1176346710.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1176346710;
        
        
        
            
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:39.420 -0400", hash_original_field = "A721C8379D729DD5077CCBCF1E7A4FA7", hash_generated_field = "51CDCD95970F98C01DA5ED4493E40EC1")

    private static final long serialVersionUID = -5195728427134181070L;
}


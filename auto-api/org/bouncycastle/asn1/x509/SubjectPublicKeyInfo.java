package org.bouncycastle.asn1.x509;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class SubjectPublicKeyInfo extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.918 -0400", hash_original_field = "7E017AD6DBE390CDE33A4543127F45F7", hash_generated_field = "7AD6F6C3D264D25074D6D91921F8050B")

    private AlgorithmIdentifier algId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.919 -0400", hash_original_field = "FBE14519E78E13F41E1D21BCCBD58AF0", hash_generated_field = "B87CF10479B698EDA26B972A47E11904")

    private DERBitString keyData;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.919 -0400", hash_original_method = "DAF161BC79C94F8473696EE08E829AE4", hash_generated_method = "4363098941C5E033671050691A8E48D2")
    public  SubjectPublicKeyInfo(
        AlgorithmIdentifier algId,
        DEREncodable        publicKey) {
        this.keyData = new DERBitString(publicKey);
        this.algId = algId;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.920 -0400", hash_original_method = "01C45324BCF6F8FB0A087E5E236F4467", hash_generated_method = "DCA3B9BB1ABF80FCD998139CDB109A4E")
    public  SubjectPublicKeyInfo(
        AlgorithmIdentifier algId,
        byte[]              publicKey) {
        this.keyData = new DERBitString(publicKey);
        this.algId = algId;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.920 -0400", hash_original_method = "6922DB35904CEC4F9CE097AEE1FB704C", hash_generated_method = "228EAFFB18B8208FBABAB93D37A04558")
    public  SubjectPublicKeyInfo(
        ASN1Sequence  seq) {
        {
            boolean var97DBDEEC2A320E15512526B0CE06A30A_56673165 = (seq.size() != 2);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Bad sequence size: "
                    + seq.size());
            } 
        } 
        Enumeration e = seq.getObjects();
        this.algId = AlgorithmIdentifier.getInstance(e.nextElement());
        this.keyData = DERBitString.getInstance(e.nextElement());
        addTaint(seq.getTaint());
        
        
        
            
                    
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static SubjectPublicKeyInfo getInstance(
        ASN1TaggedObject obj,
        boolean          explicit) {
        return getInstance(ASN1Sequence.getInstance(obj, explicit));
    }

    
    @DSModeled(DSC.SAFE)
    public static SubjectPublicKeyInfo getInstance(
        Object  obj) {
        if (obj instanceof SubjectPublicKeyInfo)
        {
            return (SubjectPublicKeyInfo)obj;
        }
        else if (obj != null)
        {
            return new SubjectPublicKeyInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.921 -0400", hash_original_method = "47532F5520D2937711F415E7F39EF8B8", hash_generated_method = "09CD2D0F6DFE341AACB12BFA10B759AE")
    public AlgorithmIdentifier getAlgorithmId() {
        AlgorithmIdentifier varB4EAC82CA7396A68D541C85D26508E83_527963101 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_527963101 = algId;
        varB4EAC82CA7396A68D541C85D26508E83_527963101.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_527963101;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.921 -0400", hash_original_method = "090BC4B735B0EF996158F2D4FCADB97F", hash_generated_method = "CB4B16384E82DDA42664414F10FCE94F")
    public DERObject getPublicKey() throws IOException {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1214535324 = null; 
        ASN1InputStream aIn = new ASN1InputStream(keyData.getBytes());
        varB4EAC82CA7396A68D541C85D26508E83_1214535324 = aIn.readObject();
        varB4EAC82CA7396A68D541C85D26508E83_1214535324.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1214535324;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.922 -0400", hash_original_method = "FD0FC1FA0D4AD47E47F52CC8C4964141", hash_generated_method = "A4D78C3AB379E888F370B8EC923A9A01")
    public DERBitString getPublicKeyData() {
        DERBitString varB4EAC82CA7396A68D541C85D26508E83_1478335887 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1478335887 = keyData;
        varB4EAC82CA7396A68D541C85D26508E83_1478335887.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1478335887;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:44.923 -0400", hash_original_method = "8E6747A0EE688E54DEDDDF71F404B9F7", hash_generated_method = "BA31C5BFAA8B199338AF38AE04E414DC")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_404473272 = null; 
        ASN1EncodableVector v = new ASN1EncodableVector();
        v.add(algId);
        v.add(keyData);
        varB4EAC82CA7396A68D541C85D26508E83_404473272 = new DERSequence(v);
        varB4EAC82CA7396A68D541C85D26508E83_404473272.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_404473272;
        
        
        
        
        
    }

    
}


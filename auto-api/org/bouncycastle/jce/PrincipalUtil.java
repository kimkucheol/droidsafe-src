package org.bouncycastle.jce;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.*;
import java.security.cert.*;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.x509.*;

public class PrincipalUtil {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.202 -0400", hash_original_method = "86E544B1F15763FE29D0BFED0D83B178", hash_generated_method = "86E544B1F15763FE29D0BFED0D83B178")
    public PrincipalUtil ()
    {
        
    }


    @DSModeled(DSC.SAFE)
    public static X509Principal getIssuerX509Principal(
        X509Certificate cert) throws CertificateEncodingException {
        try
        {
            TBSCertificateStructure tbsCert = TBSCertificateStructure.getInstance(
                    ASN1Object.fromByteArray(cert.getTBSCertificate()));
            return new X509Principal(tbsCert.getIssuer());
        }
        catch (IOException e)
        {
            throw new CertificateEncodingException(e.toString());
        }
    }

    
    @DSModeled(DSC.SAFE)
    public static X509Principal getSubjectX509Principal(
        X509Certificate cert) throws CertificateEncodingException {
        try
        {
            TBSCertificateStructure tbsCert = TBSCertificateStructure.getInstance(
                    ASN1Object.fromByteArray(cert.getTBSCertificate()));
            return new X509Principal(tbsCert.getSubject());
        }
        catch (IOException e)
        {
            throw new CertificateEncodingException(e.toString());
        }
    }

    
    @DSModeled(DSC.SAFE)
    public static X509Principal getIssuerX509Principal(
        X509CRL crl) throws CRLException {
        try
        {
            TBSCertList tbsCertList = TBSCertList.getInstance(
                ASN1Object.fromByteArray(crl.getTBSCertList()));
            return new X509Principal(tbsCertList.getIssuer());
        }
        catch (IOException e)
        {
            throw new CRLException(e.toString());
        }
    }

    
}


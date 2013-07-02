package org.apache.harmony.security.x509;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.math.BigInteger;
import org.apache.harmony.security.asn1.ASN1Implicit;
import org.apache.harmony.security.asn1.ASN1Integer;
import org.apache.harmony.security.asn1.ASN1Sequence;
import org.apache.harmony.security.asn1.ASN1Type;
import org.apache.harmony.security.asn1.BerInputStream;

public final class PolicyConstraints extends ExtensionValue {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.285 -0400", hash_original_field = "B820DDFDE59782AF17624246D7206CD1", hash_generated_field = "1D29512805492C5F9F07DF75C64BA8D6")

    private BigInteger requireExplicitPolicy;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.285 -0400", hash_original_field = "1C93DA670697D341AA08364FBF33A246", hash_generated_field = "0DA85D33DD5F92598C666FBD34AEFE87")

    private BigInteger inhibitPolicyMapping;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.285 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "ACB189C73E1A6432570001B3B9D3D516")

    private byte[] encoding;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.286 -0400", hash_original_method = "4066280A3CCDE594602954A8F84CD571", hash_generated_method = "E4485033E88078E407A778DFBB35B69E")
    public  PolicyConstraints(BigInteger requireExplicitPolicy,
            BigInteger inhibitPolicyMapping) {
        this.requireExplicitPolicy = requireExplicitPolicy;
        this.inhibitPolicyMapping = inhibitPolicyMapping;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.286 -0400", hash_original_method = "D14D123A6A25A0AC6CCBFD6F67D6AABA", hash_generated_method = "83D269FF7B5F5B792D56457B22D7FA8E")
    public  PolicyConstraints(byte[] encoding) throws IOException {
        super(encoding);
        PolicyConstraints pc = (PolicyConstraints) ASN1.decode(encoding);
        this.requireExplicitPolicy = pc.requireExplicitPolicy;
        this.inhibitPolicyMapping = pc.inhibitPolicyMapping;
        addTaint(encoding[0]);
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.286 -0400", hash_original_method = "8B4F6C3FF9A61E2FC4F0FDE77894DD6A", hash_generated_method = "8C4210144D8FCFA261800AC2051CEFB9")
    private  PolicyConstraints(BigInteger requireExplicitPolicy,
                            BigInteger inhibitPolicyMapping, byte[] encoding) {
        this(requireExplicitPolicy, inhibitPolicyMapping);
        this.encoding = encoding;
        addTaint(requireExplicitPolicy.getTaint());
        addTaint(inhibitPolicyMapping.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.286 -0400", hash_original_method = "8CF73AB8FE0E45F61A0A453F52513BE8", hash_generated_method = "2CF7D40F000D866ED4423CC98EC93D90")
    @Override
    public byte[] getEncoded() {
        {
            encoding = ASN1.encode(this);
        } 
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_726457605 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_726457605;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.287 -0400", hash_original_method = "6254749C2BCE6B73C098F3685BA802AD", hash_generated_method = "CAD53FC8EFC0B99077A6D9D16F33700C")
    @Override
    public void dumpValue(StringBuilder sb, String prefix) {
        sb.append(prefix).append("PolicyConstraints: [\n");
        {
            sb.append(prefix).append("  requireExplicitPolicy: ").append(requireExplicitPolicy).append('\n');
        } 
        {
            sb.append(prefix).append("  inhibitPolicyMapping: ").append(inhibitPolicyMapping).append('\n');
        } 
        sb.append(prefix).append("]\n");
        addTaint(sb.getTaint());
        addTaint(prefix.getTaint());
        
        
        
            
        
        
            
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.287 -0400", hash_original_field = "307B8D8F9C29D819EC11FEDBAB6DC908", hash_generated_field = "8A9CB549AEF7F48FC2047943BFC2C1B5")

    public static final ASN1Sequence ASN1 = new ASN1Sequence(new ASN1Type[] {
            new ASN1Implicit(0, ASN1Integer.getInstance()),
            new ASN1Implicit(1, ASN1Integer.getInstance()) }) {
        {
            setOptional(0);
            setOptional(1);
        }

        @Override protected Object getDecodedObject(BerInputStream in) {
            Object[] values = (Object[]) in.content;
            BigInteger requireExplicitPolicy = null;
            BigInteger inhibitPolicyMapping = null;
            if (values[0] != null) {
                requireExplicitPolicy = new BigInteger((byte[]) values[0]);
            }
            if (values[1] != null) {
                inhibitPolicyMapping = new BigInteger((byte[]) values[1]);
            }
            return new PolicyConstraints(
                requireExplicitPolicy, inhibitPolicyMapping,
                    in.getEncoded());
        }

        @Override protected void getValues(Object object, Object[] values) {
            PolicyConstraints pc = (PolicyConstraints) object;
            values[0] = pc.requireExplicitPolicy.toByteArray();
            values[1] = pc.inhibitPolicyMapping.toByteArray();
        }
    };
    
}


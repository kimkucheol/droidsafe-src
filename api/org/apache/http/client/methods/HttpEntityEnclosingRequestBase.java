package org.apache.http.client.methods;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;

import droidsafe.annotations.DSC;
import droidsafe.annotations.DSModeled;
import droidsafe.helpers.DSTaintObject;

public class HttpEntityEnclosingRequestBase extends HttpRequestBase implements
		HttpEntityEnclosingRequest {

	private DSTaintObject taint = new DSTaintObject();
	
	@DSModeled(DSC.SPEC)
	public HttpEntityEnclosingRequestBase() {
        super();
    }
	
	@Override
	public boolean expectContinue() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HttpEntity getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@DSModeled(DSC.SPEC)
	@Override
	public void setEntity(HttpEntity arg0) {
		taint.addTaint(arg0);
	}

	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestLine getRequestLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProtocolVersion getProtocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public URI getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAborted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setConnectionRequest(ClientConnectionRequest arg0)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReleaseTrigger(ConnectionReleaseTrigger arg0)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

}

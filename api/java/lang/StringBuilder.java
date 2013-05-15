package java.lang;

import droidsafe.annotations.*;
import droidsafe.helpers.*;

public class StringBuilder {
	private DSTaintObject taint;
	
	@DSModeled(DSC.SAFE)
	public StringBuilder() {
		taint = new DSTaintObject();
	}
	
	@DSModeled(DSC.SAFE)
	public StringBuilder(int i) {
		this();
		taint.addTaint(i);
	}
	
	@DSModeled(DSC.SAFE)
	public StringBuilder(String str) {
		this();
		taint.addTaint(str);
	}
	
	@DSModeled(DSC.SAFE)
	public String toString() {
		//need a pta object and need to propagate information flow
		String ret = new String();
		ret += taint.getTaintString();
		return ret;
	}

	@DSModeled(DSC.SAFE)
	public StringBuilder append(String str) {
		taint.addTaint(str);
		return this;
	}
	
	@DSModeled(DSC.SAFE)
	public StringBuilder append(Object obj) {
		taint.addTaint(obj.toString());
		return this;
	}
	
	@DSModeled(DSC.SAFE)
	public StringBuilder append(int obj) {
		taint.addTaint(obj);
		return this;
	}

	// GITI DSModeled
	@DSModeled(DSC.SAFE)
	public String substring(int start, int end) {
		return new String();
	}

	// GITI DSModeled
	@DSModeled(DSC.SAFE)
	public void append(char[] buf, int i, int left) {
		taint.addTaint(new String(buf));
		taint.addTaint(i);
		taint.addTaint(left);
	}
	
}

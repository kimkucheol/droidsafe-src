package android.animation;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public interface TypeEvaluator<T> {

    
    public T evaluate(float fraction, T startValue, T endValue);

}

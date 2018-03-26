/**
 * 
 */
package mygenerics;

import com.mycompany.expgenerics.generics.classes.MyGenericClass;
import com.sun.xml.internal.ws.addressing.policy.AddressingPolicyValidator;

import mygenerics.MyGenericI;

/**
 * @author jkris
 *
 */
public class MyGeneric<T> implements MyGenericI<T>
{
	private T value;
	
	public MyGeneric(T _value) 
	{
		// TODO Auto-generated constructor stub
		
		value = _value;
	}
	
	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		
		return value;
	}
	
	@Override
	public void setValue(T newV) {
		// TODO Auto-generated method stub
		value = newV;
	}
	
	public static T addValues(MyGeneric<T> a, MyGeneric<T> b)
	{
		T valueA = a.getValue();
		T valueB = b.getValue();
		
		return valueA + valueB;
	}
	
	public static void use_addValues(MyGeneric<T> a, MyGeneric<T> b) 
	{
		addValues<String>(a, b);
		<Integer>addValues(a,b);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneric<String> genStringA = new MyGeneric<String>("abc");
		MyGeneric<String> genStringB = new MyGeneric<String>("def");
		MyGeneric<Integer> genIntA = new MyGeneric<Integer>(1);
		MyGeneric<Integer> genIntB = new MyGeneric<Integer>(2);
		use_addValues(genStringA, genStringB);
		use_addValues(genIntA, genIntB);
	}

}

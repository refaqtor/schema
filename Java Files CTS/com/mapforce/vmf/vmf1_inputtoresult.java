/**
 * vmf/vmf1_inputtoresult.java
 *
 * This file was generated by MapForce 2016r2.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce.vmf;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class vmf1_inputtoresult extends com.altova.TraceProvider 
{

	
	static class Main implements IEnumerable
	{
		java.lang.String var1_input;
	
		public Main(java.lang.String var1_input)
		{
			this.var1_input = var1_input;
		}

		public IEnumerator enumerator() {return new MFEmptySequence().enumerator();}
				
	}





	public static IEnumerable create(java.lang.String var1_input)
	{
		if (hash == null) init();
		Object o = hash.get(var1_input);
		if (o != null)
			return new MFSingletonSequence(o);
		else
			return new MFEmptySequence();

	}
	
	private static java.util.HashMap hash = null;

	private synchronized static void init()
	{
		hash = new java.util.HashMap();
		hash.put(com.altova.CoreTypes.box("Boiler Plant Improvements"), com.altova.CoreTypes.box("1000"));
		hash.put(com.altova.CoreTypes.box("Chiller Plant Improvements"), com.altova.CoreTypes.box("2000"));
		hash.put(com.altova.CoreTypes.box("Building Automation Systems / EMCS"), com.altova.CoreTypes.box("3000"));
		hash.put(com.altova.CoreTypes.box("Other HVAC"), com.altova.CoreTypes.box("4000"));
		hash.put(com.altova.CoreTypes.box("Lighting Improvements"), com.altova.CoreTypes.box("5000"));
		hash.put(com.altova.CoreTypes.box("Building Envelope Modifications"), com.altova.CoreTypes.box("6000"));
		hash.put(com.altova.CoreTypes.box("CW / HW / Steam Distribution Systems"), com.altova.CoreTypes.box("7000"));
		hash.put(com.altova.CoreTypes.box("Electric Motors and Drives"), com.altova.CoreTypes.box("8000"));
		hash.put(com.altova.CoreTypes.box("Refrigeration"), com.altova.CoreTypes.box("9000"));
		hash.put(com.altova.CoreTypes.box("Distributed Generation"), com.altova.CoreTypes.box("10000"));
		hash.put(com.altova.CoreTypes.box("Renewable Energy Systems"), com.altova.CoreTypes.box("11000"));
		hash.put(com.altova.CoreTypes.box("Energy / Utility Distribution Systems"), com.altova.CoreTypes.box("12000"));
		hash.put(com.altova.CoreTypes.box("Water and Sewer Conservation Systems"), com.altova.CoreTypes.box("13000"));
		hash.put(com.altova.CoreTypes.box("Electrical Peak Shaving / Load Shifting"), com.altova.CoreTypes.box("14000"));
		hash.put(com.altova.CoreTypes.box("Rate Adjustments"), com.altova.CoreTypes.box("15000"));
		hash.put(com.altova.CoreTypes.box("Energy Related Process Improvements"), com.altova.CoreTypes.box("16000"));
		hash.put(com.altova.CoreTypes.box("Advanced Metering Systems"), com.altova.CoreTypes.box("17000"));
		hash.put(com.altova.CoreTypes.box("Appliance / Plug-load reductions"), com.altova.CoreTypes.box("18000"));
		hash.put(com.altova.CoreTypes.box("Commissioning Measures"), com.altova.CoreTypes.box("19000"));
		hash.put(com.altova.CoreTypes.box("Other"), com.altova.CoreTypes.box("20000"));
	}

	public static com.altova.mapforce.IEnumerable eval(java.lang.String var1_input) throws java.lang.Exception
	{

		return create(var1_input);
	
	}

}

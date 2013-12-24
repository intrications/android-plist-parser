/**
 * Licensed under Creative Commons Attribution 3.0 Unported license.
 * http://creativecommons.org/licenses/by/3.0/
 * You are free to copy, distribute and transmit the work, and 
 * to adapt the work.  You must attribute android-plist-parser 
 * to Free Beachler (http://www.freebeachler.com).
 * 
 * The Android PList parser (android-plist-parser) is distributed in 
 * the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.
 */
package com.longevitysoft.android.xml.plist.domain;

/**
 * Represents a simple plist real element.
 * merge https://github.com/TBoehm/android-plist-parser/commit/c45510d861a867b16517cacdf855f3622891080b
 */
public class Real extends PListObject implements IPListSimpleObject<Double> {

	// TODO: Double?
	protected Double real;

	/**
	 * 
	 */
	private static final long serialVersionUID = -4204214862534504729L;

	public Real() {
		setType(PListObjectType.REAL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.longevitysoft.android.xml.plist.domain.IPListSimpleObject#getValue()
	 */
	@Override
	public Double getValue() {
		return real;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.longevitysoft.android.xml.plist.domain.IPListSimpleObject#setValue
	 * (java.lang.Object)
	 */
	@Override
	public void setValue(Double val) {
		this.real = val;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.longevitysoft.android.xml.plist.domain.IPListSimpleObject#setValue
	 * (java.lang.String)
	 */
	@Override
	public void setValue(java.lang.String val) {
		this.real = Double.valueOf(val);
	}
}
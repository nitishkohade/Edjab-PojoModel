//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public final class PhoneNumber {
	
	private final String area;   // area code (3 digits)
    private final String exch;   // exchange  (3 digits)
    private final String ext;    // extension (4 digits)

    public PhoneNumber(String area, String exch, String ext) {
        this.area = area;
        this.exch = exch;
        this.ext  = ext;
    }
	    
    public boolean equals(Object y) {
        if (y == this) return true;
        if (y == null) return false;
        if (y.getClass() != this.getClass()) return false;
        PhoneNumber that = (PhoneNumber) y;
        return (this.area == that.area) && (this.exch == that.exch) && (this.ext == that.ext);
	}	

    // 0 for padding with leading 0s
    public String toString() {
    	return String.format("(" + area + ")" + " " + exch + "-" + ext);
    }

    // satisfies the hashCode contract
    public int hashCode() {
        return 10007 * (Integer.parseInt(area) + 1009 * Integer.parseInt(exch)) + Integer.parseInt(ext);
    }
}
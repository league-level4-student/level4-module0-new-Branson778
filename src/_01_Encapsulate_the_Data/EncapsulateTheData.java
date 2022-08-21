package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	/*
	 * itemsReceived cannot be negative. All negative parameters should set
	 * itemsReceived to 0.
	 */

	private int itemsReceived;

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive. All parameters
	 * outside this range should set degreesTurned to the nearest bound.
	 */

	private double degreesTurned;

	/*
	 * nomenclature must not contain an empty String. An empty String parameter
	 * should set nomenclature to a String with a single space.
	 */

	protected String nomenclature;

	/*
	 * memberObj must not be a String. A String parameter should set memberObj to a
	 * new Object(); Hint: Use the instanceof operator.
	 */

	protected Object memberObj;

	public void setItemsReceived(int randomPositiveNum) {
		if (randomPositiveNum < 0) {
			System.out.println("Invalid Number: setItemsReceived");
			itemsReceived = 0;
		} else {
			itemsReceived = randomPositiveNum;
		}

	}

	public Integer getItemsReceived() {
		return itemsReceived;
	}

	public void setDegreesTurned(double randomPositiveNum) {
		if (randomPositiveNum < 0.0 || randomPositiveNum > 360.0) {
			System.out.println("Invalid Number: setDegreesTurned");
			degreesTurned = 0.0;
		} else {
			degreesTurned = randomPositiveNum;
		}

	}

	public Double getDegreesTurned() {
		return degreesTurned;
	}

	public void setNomenclature(String randomString) {
		if (randomString.isEmpty()) {
			System.out.println("Invalid String: setNomenclature");
			nomenclature = " ";
		} else {
			nomenclature = randomString;
		}
	}

	public Object getNomenclature() {
		return nomenclature;
	}

	public void setMemberObj(Object randomObject) {
    if(randomObject instanceof String) {
    	System.out.println("Invalid Object: setMemberObj");
    	memberObj = new Object();
    }
    else {
    	memberObj = randomObject;
    }
	}

	public Object getMemberObj() {
		return memberObj;
	}

}

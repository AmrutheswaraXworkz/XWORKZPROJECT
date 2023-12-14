package com.xworkz.app.dto;


public class KnifeDTO {

	private String knifeName;
	private String bladeMaterial;
	private double bladeLengthInInches;
	private boolean isFoldable;

	public KnifeDTO(String knifeName, String bladeMaterial, double bladeLengthInInches, boolean isFoldable) {
		this.knifeName = knifeName;
		this.bladeMaterial = bladeMaterial;
		this.bladeLengthInInches = bladeLengthInInches;
		this.isFoldable = isFoldable;
	}

	public String getKnifeName() {
		return knifeName;
	}

	public String getBladeMaterial() {
		return bladeMaterial;
	}

	public double getBladeLengthInInches() {
		return bladeLengthInInches;
	}

	public boolean isFoldable() {
		return isFoldable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bladeLengthInInches);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bladeMaterial == null) ? 0 : bladeMaterial.hashCode());
		result = prime * result + (isFoldable ? 1231 : 1237);
		result = prime * result + ((knifeName == null) ? 0 : knifeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof KnifeDTO)) {
			return false;
		}
		KnifeDTO other = (KnifeDTO) obj;
		if (Double.doubleToLongBits(bladeLengthInInches) != Double.doubleToLongBits(other.bladeLengthInInches)) {
			return false;
		}
		if (bladeMaterial == null) {
			if (other.bladeMaterial != null) {
				return false;
			}
		} else if (!bladeMaterial.equals(other.bladeMaterial)) {
			return false;
		}
		if (isFoldable != other.isFoldable) {
			return false;
		}
		if (knifeName == null) {
			if (other.knifeName != null) {
				return false;
			}
		} else if (!knifeName.equals(other.knifeName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "KnifeDTO [knifeName=" + knifeName + ", bladeMaterial=" + bladeMaterial + ", bladeLengthInInches="
				+ bladeLengthInInches + ", isFoldable=" + isFoldable + "]";
	}

}

package com.xworkz.app.dto;


public class FireDTO {
	private String fireName;
	private String location;
	private int intensity; // Intensity level of the fire
	private boolean isControlled;

	public FireDTO(String fireName, String location, int intensity, boolean isControlled) {
		super();
		this.fireName = fireName;
		this.location = location;
		this.intensity = intensity;
		this.isControlled = isControlled;
	}

	@Override
	public String toString() {
		return "FireDTO [fireName=" + fireName + ", location=" + location + ", intensity=" + intensity
				+ ", isControlled=" + isControlled + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fireName == null) ? 0 : fireName.hashCode());
		result = prime * result + intensity;
		result = prime * result + (isControlled ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof FireDTO)) {
			return false;
		}
		FireDTO other = (FireDTO) obj;
		if (fireName == null) {
			if (other.fireName != null) {
				return false;
			}
		} else if (!fireName.equals(other.fireName)) {
			return false;
		}
		if (intensity != other.intensity) {
			return false;
		}
		if (isControlled != other.isControlled) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		return true;
	}

	public String getFireName() {
		return fireName;
	}

	public String getLocation() {
		return location;
	}

	public int getIntensity() {
		return intensity;
	}

	public boolean isControlled() {
		return isControlled;
	}

}


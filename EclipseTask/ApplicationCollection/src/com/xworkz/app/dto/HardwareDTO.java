package com.xworkz.app.dto;

public class HardwareDTO {

	private String hardwareName;
	private String hardwareType;
	private String manufacturer;
	private boolean isAvailable;

	public HardwareDTO(String hardwareName, String hardwareType, String manufacturer, boolean isAvailable) {
		this.hardwareName = hardwareName;
		this.hardwareType = hardwareType;
		this.manufacturer = manufacturer;
		this.isAvailable = isAvailable;
	}

	public String getHardwareName() {
		return hardwareName;
	}

	public String getHardwareType() {
		return hardwareType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hardwareName == null) ? 0 : hardwareName.hashCode());
		result = prime * result + ((hardwareType == null) ? 0 : hardwareType.hashCode());
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HardwareDTO)) {
			return false;
		}
		HardwareDTO other = (HardwareDTO) obj;
		if (hardwareName == null) {
			if (other.hardwareName != null) {
				return false;
			}
		} else if (!hardwareName.equals(other.hardwareName)) {
			return false;
		}
		if (hardwareType == null) {
			if (other.hardwareType != null) {
				return false;
			}
		} else if (!hardwareType.equals(other.hardwareType)) {
			return false;
		}
		if (isAvailable != other.isAvailable) {
			return false;
		}
		if (manufacturer == null) {
			if (other.manufacturer != null) {
				return false;
			}
		} else if (!manufacturer.equals(other.manufacturer)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "HardwareDTO [hardwareName=" + hardwareName + ", hardwareType=" + hardwareType + ", manufacturer="
				+ manufacturer + ", isAvailable=" + isAvailable + "]";
	}

}

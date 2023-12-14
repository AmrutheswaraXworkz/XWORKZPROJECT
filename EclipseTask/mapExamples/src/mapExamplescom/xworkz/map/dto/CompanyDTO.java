package mapExamplescom.xworkz.map.dto;

public class CompanyDTO implements Comparable<CompanyDTO> {

	private String name;
	private String location;
	private Integer gstNo;

	public CompanyDTO(String name, String location, Integer gstNo) {
		super();
		this.name = name;
		this.location = location;
		this.gstNo = gstNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getGstNo() {
		return gstNo;
	}

	public void setGstNo(Integer gstNo) {
		this.gstNo = gstNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gstNo == null) ? 0 : gstNo.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CompanyDTO)) {
			return false;
		}
		CompanyDTO other = (CompanyDTO) obj;
		if (gstNo == null) {
			if (other.gstNo != null) {
				return false;
			}
		} else if (!gstNo.equals(other.gstNo)) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(CompanyDTO o) {

		return name.compareTo(getName());
	}

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", gstNo=" + gstNo + "]";
	}

}

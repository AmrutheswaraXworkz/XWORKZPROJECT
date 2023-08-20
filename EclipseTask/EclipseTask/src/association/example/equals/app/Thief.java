package association.example.equals.app;

public class Thief {
	private String name;
	private String alias;
	private String nationality;
	private String skill;
	private String favoriteHeist;
	private String hideout;

	public Thief() {
		System.out.println("no parameter");
	}

	// Constructor
	public Thief(String name, String alias, String nationality, String skill, String favoriteHeist, String hideout) {
		super();
		this.name = name;
		this.alias = alias;
		this.nationality = nationality;
		this.skill = skill;
		this.favoriteHeist = favoriteHeist;
		this.hideout = hideout;
	}

	@Override
	public String toString() {
		return "Thief{" + "name='" + name + '\'' + ", alias='" + alias + '\'' + ", nationality='" + nationality + '\''
				+ ", skill='" + skill + '\'' + ", favoriteHeist='" + favoriteHeist + '\'' + ", hideout='" + hideout
				+ '\'' + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Thief) {
				System.out.println("obj is instance of thief");
				Thief thief = (Thief) obj;
				if (thief.name.equals(this.name) && thief.alias.equals(this.alias) && thief.skill.equals(this.skill)
						&& thief.hideout.equals(this.hideout)
						&& thief.favoriteHeist.equals(this.favoriteHeist)&&thief.nationality.equals(this.nationality)) {
					System.out.println("name ref and contents are same");
					return true;
				} else {
					System.out.println("name ref and contents are diff");
				}
			} else {
				System.out.println("obj ref not pointing to thief");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}

}

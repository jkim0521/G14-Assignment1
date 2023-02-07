public class Avenger implements Comparable <Avenger>{

	private String heroName;
	private String heroAlias;
	private int frequency;
	// TODO: Implement the Avenger Class

	public Avenger(String heroAlias, String heroName){
		this.heroName = heroName;
		this.heroAlias = heroAlias;
		frequency = 1;
	}
	
	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroAlias() {
		return heroAlias;
	}

	public void setHeroAlias(String heroAlias) {
		this.heroAlias = heroAlias;
	}

	public int getFrequency() {
		return frequency;
	}

	public void increaseFrequency() {
		this.frequency = frequency++;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		if(other == this) {
			return true;
		}
		Avenger a = (Avenger) other;
		return this.heroName == a.getHeroName() && this.heroAlias.equals(a.getHeroAlias());
	} 
	
	@Override
	public String toString() {
		String format = heroAlias + " aka " + heroName
				+ " mentioned " + frequency + " time(s)";
		return format;
	}

	@Override
	public int compareTo(Avenger o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

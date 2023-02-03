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

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		if(!(other instanceof Avenger)) {
			return false;
		}
		Avenger a = (Avenger) other;
		return (this.heroAlias == p.getID()) && (this.name.equals(p.getName()))
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
		return this;
	}

}

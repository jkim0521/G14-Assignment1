/**
 * This is an inheritance class where the Avengers inplements the Avengers Comparable.
 * This will keep track of how many times the Avengers last name or hero alias is mentioned
 * @author Shaina Anne Garrido, Joseph Kim, and Kevin Luo
 *
 */

public class Avenger implements Comparable <Avenger>{

	private String heroName;
	private String heroAlias;
	private int frequency;
	// TODO: Implement the Avenger Class

	/**
	 * 
	 * @param heroAlias is the alias name of the hero
	 * @param heroName is the name of the person
	 */
	public Avenger(String heroAlias, String heroName){
		this.heroName = heroName;
		this.heroAlias = heroAlias;
		frequency = 1;
	}
	
	/**
	 * 
	 * @return this returns the name of the person
	 */
	public String getHeroName() {
		return heroName;
	}

	/**
	 * 
	 * @param heroName this settter for the name of the person
	 */
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	/**
	 * 
	 * @return This returns the alias name of the hero
	 */
	public String getHeroAlias() {
		return heroAlias;
	}

	/**
	 * 
	 * @param heroAlias this is the setter for the alias name of the hero
	 */
	public void setHeroAlias(String heroAlias) {
		this.heroAlias = heroAlias;
	}

	/**
	 * 
	 * @return this returns the number of times the persons name is mentioned
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * This is an increment of the frequency and will add an increment everytime the name is mentioned
	 */
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
	
	//This is the format of the string that will contain the name of the hero and the alias
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

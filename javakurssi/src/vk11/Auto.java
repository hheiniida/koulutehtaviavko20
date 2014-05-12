package vk11;

class Auto {
	public Auto() {

	}

	private String malli;
	private String merkki;
	private String rekkari;
	private int vuosimalli;

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public String getMalli() {
		return malli;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setRekkari(String rekkari) {
		this.rekkari = rekkari;
	}

	public String getRekkari() {
		return rekkari;
	}

	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}

	public int getVuosimalli() {
		return vuosimalli;
	}

	public String toString() {
		String paluu = "";
		paluu = paluu + merkki + malli + rekkari + vuosimalli;
		return paluu;
	}

}

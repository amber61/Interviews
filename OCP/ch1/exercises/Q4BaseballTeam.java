package ch1.exercises;

public class Q4BaseballTeam {
	private String city, mascot;
	private int numberOfPlayers;

	public boolean equals(Object obj) {
		if (!(obj instanceof Q4BaseballTeam))
			return false;
		Q4BaseballTeam other = (Q4BaseballTeam) obj;
		return (city.equals(other.city) && mascot.equals(other.mascot));
	}

	public int hashCode() {
		return numberOfPlayers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

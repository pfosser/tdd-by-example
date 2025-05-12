package guru.springframework;

import java.util.Objects;

public class Franc {

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	Franc times(int multiplier) {
		return new Franc(this.amount * multiplier);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Franc other = (Franc) obj;
		return amount == other.amount;
	}
	
	
}

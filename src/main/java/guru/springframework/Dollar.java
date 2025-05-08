package guru.springframework;

import java.util.Objects;

public class Dollar {

	int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	Dollar times(int multiplier) {
		return new Dollar(this.amount * multiplier);
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
		Dollar other = (Dollar) obj;
		return amount == other.amount;
	}
	
	
}

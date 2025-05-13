package guru.springframework;

import java.util.Objects;

public abstract class Money {

	protected int amount;
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Money franc(int amount) {
		return new Franc(amount);
	}
	
	public abstract Money times(int multiplier);

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
		Money other = (Money) obj;
		return amount == other.amount;
	}

}

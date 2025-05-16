package guru.springframework;

import java.util.Objects;

public class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public String currency() {
		return currency;
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
		if (!getClass().isAssignableFrom(obj.getClass()) && !obj.getClass().isAssignableFrom(getClass()))
			return false;
		Money other = (Money) obj;
		return amount == other.amount && currency == other.currency;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", currency=" + currency + "]";
	}
}

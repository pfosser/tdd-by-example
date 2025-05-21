package guru.springframework;

public class Sum implements Expression {
	Money augend;
	Money addend;

	public Sum(Money augend, Money addend) {
		super();
		this.augend = augend;
		this.addend = addend;
	}
	
	@Override
	public Expression reduce(Bank bank, String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}
}
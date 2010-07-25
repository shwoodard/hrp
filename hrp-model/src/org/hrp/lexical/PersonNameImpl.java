package org.hrp.lexical;

public class PersonNameImpl extends NameImpl implements PersonName {
	private String _firstName;
	private String _lastName;

	public PersonNameImpl() {
	}

	public PersonNameImpl(String firstName, String lastName) {
		_firstName = firstName;
		_lastName = lastName;
	}

	@Override
	public String getFirstName() {
		return _firstName;
	}

	@Override
	public String getLastName() {
		return _lastName;
	}

	@Override
	public void setFirstName(String firstName) {
		setName(null);
		_firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		setName(null);
		_lastName = lastName;

	}

	@Override
	public String getName() {
		if (super.getName() != null)
			return super.getName();
		setName(String.format("%1$s %2$s", getFirstName(), getLastName()));
		return super.getName();
	}
}

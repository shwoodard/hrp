package org.hrp.lexical;

public class NameImpl implements Name {
	private String _name;

	@Override
	public String getName() {
		return _name;
	}

	protected void setName(String name) {
		_name = name;
	}
}

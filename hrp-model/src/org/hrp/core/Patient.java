package org.hrp.core;

import java.util.List;

public interface Patient extends Resource {
	public List<Provider> getProviders();
}

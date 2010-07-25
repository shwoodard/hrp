package org.hrp.core;

import java.util.List;

public interface Provider extends Resource {
	public List<Patient> getPatients();
	public List<Patient> getPatients(Clinic c);
}

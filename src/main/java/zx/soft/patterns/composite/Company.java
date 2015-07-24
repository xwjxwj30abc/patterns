package zx.soft.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {

	private String name;
	private List<Company> children = new ArrayList<>();

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Company company) {
		children.add(company);
	}

	public void remove(Company company) {
		for (Company child : children) {
			if (child.getName().equals(company.getName())) {
				children.remove(child);
			}
		}
	}

	public abstract void displayMe();

	public void displayAll() {
		displayMe();
		if (!children.isEmpty()) {
			for (Company child : children) {
				child.displayAll();
			}
		}
	}
}

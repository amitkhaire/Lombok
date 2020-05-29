package com.lombok.nonnull;

import com.lombok.User;

public class NonNullExample {
	private String name;

	public NonNullExample(User user) {
		if (user == null) {
			throw new NullPointerException("person is marked @NonNull but is null");
		}
		this.name = user.getFirstName();
	}
	
	public static void main(String[] args) {
		NonNullExample example = new NonNullExample(null);
	}
}

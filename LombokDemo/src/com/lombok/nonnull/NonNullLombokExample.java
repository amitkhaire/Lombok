package com.lombok.nonnull;

import com.lombok.User;

import lombok.NonNull;

public class NonNullLombokExample {
	private String name;

	public NonNullLombokExample(@NonNull User person) {
		this.name = person.getFirstName();
	}
	
	public static void main(String[] args) {
		NonNullLombokExample example = new NonNullLombokExample(null);
	}
}

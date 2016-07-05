package com.example.tutorial;

import com.example.tutorial.AddressBookProtos.Person;
import com.google.protobuf.InvalidProtocolBufferException;

public class TestProto {

	public static void main(String[] args) {
		Person john =
				  Person.newBuilder()
				    .setId(1234)
				    .setName("John Doe")
				    .setEmail("jdoe@example.com")
				    .addPhone(
				      Person.PhoneNumber.newBuilder()
				        .setNumber("555-4321")
				        .setType(Person.PhoneType.HOME))
				    .build();
		
		try {
			Person johnCopy = Person.parseFrom(john.toByteArray());
			System.out.println(johnCopy.getEmail());
			System.out.println(johnCopy.getName());
		} catch (InvalidProtocolBufferException e) {
		}

	}

}

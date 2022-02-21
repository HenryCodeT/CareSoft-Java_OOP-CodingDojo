package com.codingdojo.iterfaces;

public interface UsuarioCompatibleConHIPAA {
	abstract boolean assignPin(int pin);
	abstract boolean accessAuthorized(Integer confirmedAuthID);
}

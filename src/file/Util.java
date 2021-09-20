package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

	// Validar nombre
	public static boolean validarNombre(String nombre) {
		final String regexNombre = "[A-Za-záéíóú]+((\\s)?([A-Za-záéíóú])+)*";
		Pattern pattern = Pattern.compile(regexNombre);
		Matcher matcher = pattern.matcher(nombre);

		return matcher.matches();
	}

	// Validar fijo
	public static boolean validarFijo(String fijo) {
		final String regexFijo = "[89]\\d{8}";
		Pattern pattern = Pattern.compile(regexFijo);
		Matcher matcher = pattern.matcher(fijo);

		return matcher.matches();
	}

	// Validar móvil
	public static boolean validarMovil(String fijo) {
		final String regexFijo = "[67]\\d{8}";
		Pattern pattern = Pattern.compile(regexFijo);
		Matcher matcher = pattern.matcher(fijo);

		return matcher.matches();
	}

	// Validar fecha
	public static boolean validarFecha(String text) {
		try {
			LocalDate.parse(text, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	// Validar password
	public static boolean validarPass(String pass) {
		// final String regexPass =
		// "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
		// // con carácteres especiales
		// Pass válida si tiene de 8 a 20 caracteres con números y letras mayúsculas o
		// minúsculas
		final String regexPass = "^(?=.*[0-9])((?=.*[a-z])|(?=.*[A-Z])).{8,20}$";
		Pattern pattern = Pattern.compile(regexPass);
		Matcher matcher = pattern.matcher(pass);
		return matcher.matches();
	}
	// Método para validar un DNI
	public static boolean validarDNI(String dni) {
		final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKET";
		String dniRegex = "[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKET]";
		char letraDNI = ' ';
		boolean dniValido = false;
		dni = dni.toUpperCase();

		Pattern pattern;
		pattern = Pattern.compile(dniRegex);
		Matcher matcher = pattern.matcher(dni);
		boolean match = matcher.matches();

		if (!match) {
			//System.out.println("\nFormato de DNI incorrecto.");
			dniValido = false;
		}
		if (match) {
			// letra del DNI
			letraDNI = LETRAS_DNI.charAt(Integer.parseInt(dni.substring(0, 8)) % 23);
			if (letraDNI != dni.toUpperCase().charAt(dni.length() - 1)) {
				//System.out.println("\nLa letra del DNI es incorrecta.");
				dniValido = false;
			} else {
				dniValido = true;
			}
		}
		return dniValido;
	}

	public static boolean validarEntero(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

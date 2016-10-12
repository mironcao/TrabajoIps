package logic;

import java.util.Date;

public class Data {
	// ID = piscina
	Instalacion piscina = new Instalacion("piscina");

	// ID = canchatenis
	Instalacion canchatenis = new Instalacion("canchatenis");

	// ID = canchafutbol
	Instalacion canchafutbol = new Instalacion("canchafutbol");

	Socio socio1 = new Socio("admin");
	Socio pepe = new Socio("pepe");

	public void meterDatos() {
		Reserva pisc1 = new Reserva(11, new Date(2016, 10, 11, 16, 0), new Date(2016, 10, 11, 17, 0), socio1, 15, piscina);
		Reserva pisc2 = new Reserva(13, new Date(2016, 10, 13, 18, 0), new Date(2016, 10, 13, 19, 0), socio1, 15, piscina);
		Reserva pisc3 = new Reserva(13, new Date(2016, 10, 13, 21, 0), new Date(2016, 10, 13, 22, 0), pepe, 15, piscina);
		Reserva pisc4 = new Reserva(15, new Date(2016, 10, 15, 9, 0), new Date(2016, 10, 15, 10, 0), pepe, 15, piscina);

		piscina.aņadirReserva(pisc1);
		piscina.aņadirReserva(pisc2);
		piscina.aņadirReserva(pisc3);
		piscina.aņadirReserva(pisc4);

		Reserva tenis1 = new Reserva(11, new Date(2016, 10, 11, 20, 0), new Date(2016, 10, 11, 21, 0), socio1, 15, canchatenis);
		Reserva tenis2 = new Reserva(13, new Date(2016, 10, 13, 20, 0), new Date(2016, 10, 13, 21, 0), socio1, 15, canchatenis);
		Reserva tenis3 = new Reserva(13, new Date(2016, 10, 13, 23, 0), new Date(2016, 10, 13, 24, 0), pepe, 15, canchatenis);
		Reserva tenis4 = new Reserva(15, new Date(2016, 10, 15, 13, 0), new Date(2016, 10, 15, 14, 0), pepe, 15, canchatenis);

		canchatenis.aņadirReserva(tenis1);
		canchatenis.aņadirReserva(tenis2);
		canchatenis.aņadirReserva(tenis3);
		canchatenis.aņadirReserva(tenis4);
		
		Reserva futbol1 = new Reserva(11, new Date(2016, 10, 11, 10, 0), new Date(2016, 10, 11, 11, 0), socio1, 15, canchafutbol);
		Reserva futbol2 = new Reserva(13, new Date(2016, 10, 13, 13, 0), new Date(2016, 10, 13, 14, 0), socio1, 15, canchafutbol);
		Reserva futbol3 = new Reserva(13, new Date(2016, 10, 13, 16, 0), new Date(2016, 10, 13, 17, 0), pepe, 15, canchafutbol);
		Reserva futbol4 = new Reserva(15, new Date(2016, 10, 15, 2, 0), new Date(2016, 10, 15, 3, 0), pepe, 15, canchafutbol);
		
		canchafutbol.aņadirReserva(futbol1);
		canchafutbol.aņadirReserva(futbol2);
		canchafutbol.aņadirReserva(futbol3);
		canchafutbol.aņadirReserva(futbol4);
	}

	public Instalacion getPiscina() {
		return piscina;
	}

	public Instalacion getTenis() {
		return canchatenis;
	}

	public Instalacion getFutbol() {
		return canchafutbol;
	}

}

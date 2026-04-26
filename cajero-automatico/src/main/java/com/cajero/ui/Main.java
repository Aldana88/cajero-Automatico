package com.cajero.ui;

import com.cajero.model.CuentaBancaria;
import com.cajero.service.CajeroService;

public class Main {
    public static void main(String[] args) {
        CajeroService service = new CajeroService();
        CuentaBancaria cuenta = new CuentaBancaria("001", "Aldana", 10000);

        service.depositar(cuenta, 5000);

        System.out.println("Saldo final: $" + cuenta.getSaldo());
        cuenta.getHistorial().forEach(System.out::println);
    }
}

package com.cajero.service;

import com.cajero.model.CuentaBancaria;

public class CajeroService {

    public void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
        cuenta.registrar("DEPÓSITO $" + monto + " | Saldo: $" + cuenta.getSaldo());
    }
}

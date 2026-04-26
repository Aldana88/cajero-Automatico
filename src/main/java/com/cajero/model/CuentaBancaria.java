package com.cajero.model;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

    private final String numeroCuenta;
    private double saldo;
    private String titular;
    private boolean activa;
    private List<String> historial;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.activa = true;
        this.historial = new ArrayList<>();
    }

    public double getSaldo() { return saldo; }

    public boolean isActiva() { return activa; }

    public void registrar(String log) {
        historial.add(log);
        if (historial.size() > 10) historial.remove(0);
    }

    public List<String> getHistorial() { return historial; }

    public void setSaldo(double saldo) { this.saldo = saldo; }
}

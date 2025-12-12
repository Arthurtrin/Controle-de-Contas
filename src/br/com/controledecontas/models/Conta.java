package br.com.controledecontas.models;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private double limite;
    private double saldo;
    private List<Compra> compra;

    public Conta(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compra = new ArrayList<>();
    }

    public boolean fazCompra(Compra compra){
        if(this.saldo>compra.getValor()){
            this.saldo -= compra.getValor();
            this.compra.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compra;
    }

    public double getLimite() {
        return limite;
    }
}

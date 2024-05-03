/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Administrador
 */
public class ClaseCalculo extends ClaseRegistro {

    double MontoCuota, MontoSeguro, PrimaSeguro, MontoInteres, MAFInicial, MontoSaldo, Amortizacion, TCEA;

    public double getMontoCuota() {
        return MontoCuota;
    }

    public void setMontoCuota(double MontoCuota) {
        this.MontoCuota = MontoCuota;
    }

    public double getAmortizacion() {
        return Amortizacion;
    }

    public void setAmortizacion(double Amortizacion) {
        this.Amortizacion = Amortizacion;
    }

    public double getTCEA() {
        return TCEA;
    }

    public void setTCEA(double TCEA) {
        this.TCEA = TCEA;
    }

    public double getMontoSeguro() {
        return MontoSeguro;
    }

    public void setMontoSeguro(double MontoSeguro) {
        this.MontoSeguro = MontoSeguro;
    }

    public double getPrimaSeguro() {
        return PrimaSeguro;
    }

    public void setPrimaSeguro(double PrimaSeguro) {
        this.PrimaSeguro = PrimaSeguro;
    }

    public double getMontoInteres() {
        return MontoInteres;
    }

    public void setMontoInteres(double MontoInteres) {
        this.MontoInteres = MontoInteres;
    }

    public double getMAFInicial() {
        return MAFInicial;
    }

    public void setMAFInicial(double MAFInicial) {
        this.MAFInicial = MAFInicial;
    }

    public double getMontoSaldo() {
        return MontoSaldo;
    }

    public void setMontoSaldo(double MontoSaldo) {
        this.MontoSaldo = MontoSaldo;
    }

    public void DefinirPrimaSeguro() {
        double prima;
        switch (getTipo_Seguro()) {
            case "Seguro de Desgravamen":
                prima = 0.011218;
                break;
            case "Seguro de Desgravamen con Devolución":
                prima = 0.014596;
                break;
            case "Seguro de Vida":
                prima = 0.037000;
                break;
            default:
                prima = 0;
                System.out.println("ERROR");
        }
        this.PrimaSeguro = prima;
    }

    public void DefinirMontoSeguro() {
        this.MontoSeguro = getMontoTotal() * getPrimaSeguro();
    }

    public void DefinirMAFInicial() {
        this.MAFInicial = getMontoSeguro() + getMontoTotal();
    }
    public void DefinirTCEA(){
        
    }
    public void DefinirCuotaMensual(){
        
    }
}

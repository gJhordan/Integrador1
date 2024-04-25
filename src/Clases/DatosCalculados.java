/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Administrador
 */
public class DatosCalculados extends DatosIngresados{
    double MontoCuota, MontoSeguro, PrimaSeguro,MontoInteres, MAFInicial, MontoSaldo, Amortizacion, TCEA;

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

}

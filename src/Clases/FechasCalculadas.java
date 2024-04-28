/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

public class FechasCalculadas extends DatosIngresados {

    LocalDate fechadesembolso;
    LocalDate fecha1erpago;
    LocalDate[] fechasDePago;

   
    public LocalDate getFechadesembolso() {
        return fechadesembolso;
    }

    public void setFechadesembolso(LocalDate fechadesembolso) {
        this.fechadesembolso = fechadesembolso;
    }

    public LocalDate getFecha1erpago() {
        return fecha1erpago;
    }

    public void setFecha1erpago(LocalDate fecha1erpago) {
        this.fecha1erpago = fecha1erpago;
    }

    public LocalDate[] getFechasDePago() {
        return fechasDePago;
    }

    public void setFechasDePago(LocalDate[] fechasDePago) {
        this.fechasDePago = fechasDePago;
    }

    public LocalDate generarFecha1erPago() {
        return fecha1erpago.plusDays(Periodo_Gracia);
    }

    public void generarFechasDePago() {
        fechasDePago = new LocalDate[Cuotas];
        for (int i = 0; i < Cuotas; i++) {
            fechasDePago[i] = fecha1erpago.plusMonths(i);
        }
    }
     public void CalcularFechaDesembolso() {
        this.fechadesembolso = LocalDate.now();
    }

}

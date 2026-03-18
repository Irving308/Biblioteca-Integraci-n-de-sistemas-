package com.uam.cua.tysi.integracion.alumnos.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "multas")
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_multa")
    private Long idMulta;

    @ManyToOne
    @JoinColumn(name = "id_prestamo", nullable = false)
    private Prestamo prestamo;

    @Column(name = "monto", nullable = false, precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(name = "pagado", columnDefinition = "TINYINT(1) DEFAULT 0")
    private Boolean pagado;

    public Multa() {}

    public Multa(Long idMulta, Prestamo prestamo, BigDecimal monto, Boolean pagado) {
        this.idMulta = idMulta;
        this.prestamo = prestamo;
        this.monto = monto;
        this.pagado = pagado;
    }

    public Long getIdMulta() { return idMulta; }
    public void setIdMulta(Long idMulta) { this.idMulta = idMulta; }

    public Prestamo getPrestamo() { return prestamo; }
    public void setPrestamo(Prestamo prestamo) { this.prestamo = prestamo; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public Boolean getPagado() { return pagado; }
    public void setPagado(Boolean pagado) { this.pagado = pagado; }
}
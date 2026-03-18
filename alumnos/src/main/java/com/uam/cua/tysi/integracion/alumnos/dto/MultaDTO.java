package com.uam.cua.tysi.integracion.alumnos.dto;

import java.math.BigDecimal;

public class MultaDTO {

    private Long idMulta;
    private Integer idPrestamo;
    private BigDecimal monto;
    private Boolean pagado;

    public MultaDTO() {}

    public MultaDTO(Long idMulta, Integer idPrestamo, BigDecimal monto, Boolean pagado) {
        this.idMulta = idMulta;
        this.idPrestamo = idPrestamo;
        this.monto = monto;
        this.pagado = pagado;
    }

    public Long getIdMulta() { return idMulta; }
    public void setIdMulta(Long idMulta) { this.idMulta = idMulta; }

    public Integer getIdPrestamo() { return idPrestamo; }
    public void setIdPrestamo(Integer idPrestamo) { this.idPrestamo = idPrestamo; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public Boolean getPagado() { return pagado; }
    public void setPagado(Boolean pagado) { this.pagado = pagado; }
}
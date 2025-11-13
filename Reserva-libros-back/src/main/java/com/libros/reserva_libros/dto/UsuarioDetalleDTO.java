package com.libros.reserva_libros.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.libros.reserva_libros.model.EstadoReserva;

import lombok.Data;

@Data
public class UsuarioDetalleDTO {
    private Long id;
    private String nombres;
    private String apellidos;
    private String username;
    private String dni;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private List<ReservaDTO> reservas;

    @Data
    public static class ReservaDTO {
        private Long id;
        private LocalDateTime fechaReserva;
        private LocalDateTime fechaRealDevolucion;
        private EstadoReserva estado;
        private EjemplarDTO ejemplar;
    }

    @Data
    public static class EjemplarDTO {
        private LibroDTO libro;
    }

    @Data
    public static class LibroDTO {
        private String titulo;
        private String autor;
    }
}


package com.libros.reserva_libros.dto;

import java.util.Date;
import java.util.List;

import com.libros.reserva_libros.model.Reserva;
import com.libros.reserva_libros.model.User;

import lombok.Data;

@Data
public class UserLoginResponse {
    private Long id;
    private String username;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String dni;
    private String direccion;
    private Date fechaNacimiento;
    private List<Reserva> reservas;

    public UserLoginResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.nombres = user.getNombres();
        this.apellidos = user.getApellidos();
        this.telefono = user.getTelefono();
        this.reservas = user.getReservas();
        this.dni=user.getDni();
        this.direccion=user.getDireccion();
        this.fechaNacimiento=user.getFechaNacimiento();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada3;

/**
 *
 * @author LENOVO
 */
public class Usuario {
    String NombreUsuario;
    String NickName;
    String contrasena;
    String CorreoElectronico;
    float Pagos;

    public Usuario() {
    }

    public Usuario(String NombreUsuario, String NickName, String contrasena, String CorreoElectronico, float Pagos) {
        this.NombreUsuario = NombreUsuario;
        this.NickName = NickName;
        this.contrasena = contrasena;
        this.CorreoElectronico = CorreoElectronico;
        this.Pagos = Pagos;
    }
    
    

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public float getPagos() {
        return Pagos;
    }

    public void setPagos(float Pagos) {
        this.Pagos = Pagos;
    }
    
}

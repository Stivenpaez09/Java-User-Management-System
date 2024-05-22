package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = null;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }
    
    
    public Usuario validarUsuario(String usuario, String contrasenia) {
        Usuario usr = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        
        for(Usuario i: listaUsuarios){
            if(i.getUsuario().equals(usuario)){
                if(i.getContrasenia().equals(contrasenia)){
                    usr = i;
                    return usr;
                } else{
                   usr = null;
                }
                
            } else {
                usr = null;
            }
        }
        return usr;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contra, String rolRecibido) {
        Usuario usu = new Usuario();
        usu.setUsuario(usuario);
        usu.setContrasenia(contra);
        
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if(rolEncontrado != null){
           usu.setRol(rolEncontrado); 
        }
        
        usu.setRol(rolEncontrado);
        
        controlPersis.crearUsuario(usu);
    }

    private Rol traerRol(String rolRecibido) {
        
        List<Rol> listaRoles= controlPersis.traerRoles();
        
        for(Rol rol : listaRoles){
            if(rol.getNombreRol().equals(rolRecibido)){
               return rol;
            }
        }
        return null;
    }

    public void eliminarUsuario(int id) {
        controlPersis.eliminarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario us, String usuario, String contra, String rolRecibido) {
        us.setUsuario(usuario);
        us.setContrasenia(contra);
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if(rolEncontrado != null){
           us.setRol(rolEncontrado); 
        }
        
        us.setRol(rolEncontrado);
        
        controlPersis.editarUsuario(us);
    }

    public boolean compararUsuarios(Usuario usr, String usuario, String rol) {
        
        if(usr.getUsuario().equals(usuario)){
            if(usr.getRol().getNombreRol().equals("admin")){
                if(!usuario.equals("admin")){
                    return true;
                }
            }
        }
        return false;
    }


    
}

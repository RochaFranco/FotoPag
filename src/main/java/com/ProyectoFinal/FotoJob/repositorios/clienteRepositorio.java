


package com.ProyectoFinal.FotoJob.repositorios;

import com.ProyectoFinal.FotoJob.entidades.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepositorio extends JpaRepository<Cliente,String>{

    
}
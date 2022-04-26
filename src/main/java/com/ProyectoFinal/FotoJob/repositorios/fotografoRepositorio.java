


package com.ProyectoFinal.FotoJob.repositorios;

import com.ProyectoFinal.FotoJob.entidades.Fotografo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface fotografoRepositorio extends JpaRepository <Fotografo, String>{
   
    
   
     
     @Query("SELECT f FROM Fotografo f WHERE f.fotografo.especializacion= :especializacion")
     public List <Fotografo> buscarPorEspecializacion(@Param("especializacion") String especializacion);
}
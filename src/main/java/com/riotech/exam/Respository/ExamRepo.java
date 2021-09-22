
package com.riotech.exam.Respository;

import com.riotech.exam.model.Questions;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author user
 */
public interface ExamRepo extends JpaRepository<Questions,Integer>{
    
    @Query(value = "SELECT * FROM questions WHERE categories=?1",nativeQuery = true) 
     List<Questions> findByCategory(String cat);
     
     @Query(value = "SELECT * FROM questions WHERE id=?1",nativeQuery = true)
     Questions findSingleById(int id);
    
    
}

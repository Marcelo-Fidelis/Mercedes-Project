package com.marcelofidelis.mercedes_project.services;

import com.marcelofidelis.mercedes_project.domain.Department;

/*
 * I -> A object id
 * D -> A Dto of this Object
 * O -> The object
 */

public interface ServiceTemplate <I,D,O extends Department> {
    
    O create(D dto);
    O get (I id);
    O update(I id, D dtoUpdate);
    O delete(I id);

}

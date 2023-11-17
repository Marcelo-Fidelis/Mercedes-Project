package com.marcelofidelis.mercedes_project.services;


/*
 * I -> A object id
 * D -> A Dto of this Object
 * O -> The object
 */

public interface ServiceStructure <I,D,O> {
    
    O create(D dto);
    O get (I id);
    O update(I id, D dtoUpdate);
    O delete(I id);

}

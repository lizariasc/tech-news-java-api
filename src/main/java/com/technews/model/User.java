package com.technews.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Table;

// persistable object, so that the User class can map to a table
@Entity
// specifies properties that should be ignored when serializing this object to JSON
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
// specifies the name of the table that this class maps to
@Table(name = "user")
public class User {

}

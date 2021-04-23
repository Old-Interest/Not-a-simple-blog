package com.harutya.nasb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "ARTICLE")
@Entity
@Data
public class Article implements Serializable {

    @Id
    long id;


}

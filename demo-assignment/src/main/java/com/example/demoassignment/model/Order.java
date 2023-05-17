package com.example.demoassignment.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    @Id

    private int oid;
    private String oname;

}

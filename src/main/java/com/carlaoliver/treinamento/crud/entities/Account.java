package com.carlaoliver.treinamento.crud.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;


@Table(name = "conta")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name= "numero",nullable = false, unique = true, length = 6)
    private Integer number;
    @Column(name = "titular", nullable = false, length = 100)
    private String holder;
    @Column(name = "saldo", nullable = false)
    private Double sale;


    public Account(Integer id, Integer number, String holder, Double sale) {
        this.id = id;
        this.number = number;
        this.holder = holder;
        this.sale = sale;
    }

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id.equals(account.id) && number.equals(account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }
}

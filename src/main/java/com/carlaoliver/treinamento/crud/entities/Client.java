package com.carlaoliver.treinamento.crud.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "cliente")
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    @Column(name = "nome", nullable = false, length = 100)
    private String name;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate birthDate;

    public Client(Integer id, String cpf, String name, LocalDate birthDate) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id.equals(client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                '}';
    }
}

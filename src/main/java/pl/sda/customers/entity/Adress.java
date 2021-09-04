package pl.sda.customers.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
//w encji table wskazujemy w jakiej tabeli będziemy przechowywać
//dane
@Table (name = "adresses")
@Getter
@EqualsAndHashCode

public final class Adress {

    @Id
    private UUID id;
//    UUID pozwala na generowanie id po stronie kodu,
//    ale po stronie bazy danych będzie niewidoczne
    private String street;
    private String city;
    private String zipCode;
    private String countryCode;

//    only for hibernate
    private Adress (){}

    public Adress(@NonNull String street,
                  @NonNull String city,
                  @NonNull String zipCode,
                  @NonNull String countryCode) {
        this.id = UUID.randomUUID();
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.countryCode = countryCode;
    }
}

package com.bilgeadam.eCommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class deneme {

    private Long ID;
    private String name;

    public deneme(long l, String hamit) {
        this.ID=l;
        this.name=hamit;
    }
}

package com.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.entities.Regions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "countries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Countries {

    @Id
    private int countryId;
    private String countryName;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Regions> regionId;
}

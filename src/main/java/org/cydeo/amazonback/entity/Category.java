package org.cydeo.amazonback.entity;


import jakarta.persistence.*;
import lombok.*;
import org.cydeo.amazonback.entity.common.BaseEntity;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode(callSuper = false)
public class Category extends BaseEntity {

    private String description;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

//    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
//    private List<Product> products;



}

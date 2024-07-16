package com.example.apllication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class CrediteMemoData {

    @Id
    @SequenceGenerator(name="omscrediteMemo_Sequence",
            sequenceName = "omscrediteMemo_Sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "omscrediteMemo_Sequence")

    @Column(name = "creditMemoId")
    private Integer creditMemoId;
    @Column(name = "creditMemoRef")
    private String creditMemoRef;


    @Column(name = "creditMemoItems")
    private List<String> creditMemoItems;

    @OneToOne(
            mappedBy = "crediteMemoData"
    )
    private ReturnData returnData;


}

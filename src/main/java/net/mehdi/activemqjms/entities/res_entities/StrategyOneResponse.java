package net.mehdi.activemqjms.entities.res_entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SINTEG_RESPONSE")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StrategyOneResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinteg_res_seq")
    @SequenceGenerator(name = "sinteg_res_seq", sequenceName = "SINTEG_RES_SEQ", allocationSize = 1)
    @Column(name = "INTEG_ID")
    private Long id ;
    @Column(name = "INTEG_RES_DATE")
    private Date resDate;
    @Column(name = "PROCESS_CODE ")
    private String processCode;
    @Column(name = "ORGANIZATION_CODE")
    private String organizationCode;
    @Column(name = "RANDOM_NUMBER")
    private String randomNumber;
    @Column(name = " RESPONSEXML",columnDefinition = "CLOB")
    @Lob
    private String responseXml;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORDNR")
    private RecordNRRes recordNRResp;

    @OneToMany(mappedBy = "strategyOneResponse", cascade = CascadeType.ALL)
    private List<RecordRRRes> recordRRResps;

}

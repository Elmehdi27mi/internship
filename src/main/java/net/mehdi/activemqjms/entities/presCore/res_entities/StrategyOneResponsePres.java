package net.mehdi.activemqjms.entities.presCore.res_entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "SPRES_RESPONSE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StrategyOneResponsePres {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spres_res_seq")
    @SequenceGenerator(name = "spres_res_seq", sequenceName = "SPRES_RES_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id ;

    @Column(name = "ORGANIZATION_CODE", length = 255)
    private String organizationCode;

    @Column(name = "PRES_RES_DATE")
    private Date presResDate;

    @Column(name = "PROCESS_CODE", length = 255)
    private String processCode;

    @Column(name = "RESPONSEXML", columnDefinition = "CLOB")
    @Lob
    private String responseXML;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORDNR_ID  ")
    private RecordNRPresRes recordNR;

}

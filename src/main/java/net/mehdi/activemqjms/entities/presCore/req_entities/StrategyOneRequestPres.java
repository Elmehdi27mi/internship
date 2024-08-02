package net.mehdi.activemqjms.entities.presCore.req_entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "SPRES_REQUEST")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StrategyOneRequestPres {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spres_rq_seq")
    @SequenceGenerator(name = "spres_rq_seq", sequenceName = "SPRES_RQ_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ORGANIZATION_CODE")
    private String organizationCode;

    @Column(name = "PRES_REQ_DATE")
    private Date presReqDate;

    @Column(name = "PROCESS_CODE")
    private String processCode;

    @Lob
    @Column(name = "REQUESTXML", columnDefinition = "CLOB")
    private String requestXML;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORDNR_ID")
    private RecordNRPres recordNR;

}

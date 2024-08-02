package net.mehdi.activemqjms.entities.scorInteg.req_entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SINTEG_REQUEST")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
public class StrategyOneRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinteg_rq_seq")
    @SequenceGenerator(name = "sinteg_rq_seq", sequenceName = "SINTEG_RQ_SEQ", allocationSize = 1)
    @Column(name = " INTEG_ID")
    private Long id;

    @Column(name = "ORGANIZATION_CODE")
    private String organizationCode;

    @Column(name = "RANDOM_NUMBER")
    private Integer vinRandomNumber;

    @Lob
    @Column(name = "REQUESTXML", columnDefinition = "CLOB")
    private String requestXml;

    @Column(name = "PROCESS_CODE")
    private Integer inquiryCode;

    @Column(name = "INTEG_REQ_DATE")
    private Date reqDate;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORDNR")
    private RecordNR recordNR;

    @OneToMany(mappedBy = "strategyOneRequest", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<RecordRR> recordRRs;

}

package br.com.scheduler.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Client client;
    @ManyToOne
    WorkTime time;
    @ManyToOne
    Job job;
    @ManyToOne
    Worker worker   ;
}

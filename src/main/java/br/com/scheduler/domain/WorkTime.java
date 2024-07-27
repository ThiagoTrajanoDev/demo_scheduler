package br.com.scheduler.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WorkTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalTime time;

}

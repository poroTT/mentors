package kr.nomadlab.mentors.payInfo.vo;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PayInfoVO {
    private Long mbNo;
    private Long mentorMno;
    private Long menteeMno;
    private int price;
    private boolean isComplete;
    private LocalDateTime addDate;
}

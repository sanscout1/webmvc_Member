package com.ssg.webmvc_member.domain;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class MemberVO {
    private String id;
    private String password;
    private String name;
    private String email;
    private LocalDate regdate;
}

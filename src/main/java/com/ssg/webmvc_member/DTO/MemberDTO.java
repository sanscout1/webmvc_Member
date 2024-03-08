package com.ssg.webmvc_member.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MemberDTO {
    private String id;
    private String password;
    private String name;
    private String email;
    private LocalDate regdate;
}

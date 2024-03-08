package com.ssg.webmvc_member.controller;

import com.ssg.webmvc_member.DTO.MemberDTO;
import com.ssg.webmvc_member.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/member/modMember.do")
public class ModController  extends HttpServlet {
    private MemberService memberService = MemberService.INSTANCE;


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = (String) req.getParameter("id");
        MemberDTO dto = null;
        try {
            dto=memberService.selectOne(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("dto",dto);
        req.getRequestDispatcher("/WEB-INF/member/modify.jsp").forward(req,resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        LocalDate regdate = LocalDate.parse(req.getParameter("regdate"));

        MemberDTO dto = MemberDTO.builder().id(id).password(password).name(name).email(email).regdate(regdate).build();
        try {
            memberService.updateMember(dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect("/member/listMembers.do");
    }
}

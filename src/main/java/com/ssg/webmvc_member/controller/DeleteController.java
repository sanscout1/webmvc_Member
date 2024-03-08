package com.ssg.webmvc_member.controller;


import com.ssg.webmvc_member.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/delMember.do")
public class DeleteController extends HttpServlet {
    private MemberService memberService = MemberService.INSTANCE;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String id = (String) req.getParameter("id");
        try {
            memberService.delMember(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect("/member/listMembers.do");
    }
}

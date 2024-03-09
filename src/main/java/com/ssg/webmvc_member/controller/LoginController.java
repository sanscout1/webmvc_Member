package com.ssg.webmvc_member.controller;

import com.ssg.webmvc_member.service.MemberService;
import com.ssg.webmvc_member.DTO.MemberDTO;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Log4j2
@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("login get...");
        request.getRequestDispatcher("/WEB-INF/member/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        log.info("login post called");
//        String mid = request.getParameter("mid");
//        String mpw = request.getParameter("mpw");
//        String str = mid+mpw;
//        HttpSession session = request.getSession();
//        session.setAttribute("loginInfo",str);
//        response.sendRedirect("/todo/list");
        log.info("login post........");
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        try {
            MemberDTO memberDTO = MemberService.INSTANCE.login(id, pw);
            HttpSession session = request.getSession();
            session.setAttribute("loginInfo", memberDTO);
            response.sendRedirect("/member/listMembers.do");
        } catch (Exception e) {
            response.sendRedirect("/login?result=error");
        }
    }
}

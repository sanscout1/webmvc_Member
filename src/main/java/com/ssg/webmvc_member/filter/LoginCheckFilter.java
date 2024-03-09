package com.ssg.webmvc_member.filter;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/member/*"})
@Log4j2
public class LoginCheckFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("Login check filter....");
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;
        HttpSession session = req.getSession();
        if(session.getAttribute("loginInfo") == null){
            resp.sendRedirect("/login");
            return;
        }
        chain.doFilter(request, response);
        //chain.doFilter(request, response);를 호출합니다.
        // 이 호출은 필터 체인에서 다음 필터가 있으면 그 필터의 doFilter 메서드를 실행하거나,
        // 필터 체인의 마지막 필터라면 최종 목적지인 서블릿이나 JSP 페이지로 요청을 전달
    }
}

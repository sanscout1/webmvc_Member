- http://localhost:8090/member/listMembers.do
- http://localhost:8090/member/addMember.do
- http://localhost:8090/member/modMember.do

- 필터로 http://localhost:8090/login 으로 리다이렉트

# 1차 수정
- index.jsp 에 <% response.sendRedirect("/member/listMembers.do"); %> 추가
- 서버 시작과 동시 localhost:8090 은 list 출력 페이지로 접근
- 로그인 상태가 아니라면 login 화면 출력
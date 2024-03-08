package com.ssg.webmvc_member.DAO;

import com.ssg.webmvc_member.DAO.ConnectionUtil;
import com.ssg.webmvc_member.domain.MemberVO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    public List<MemberVO> listMembers() throws Exception {
        String query = "select * from mvc_member";
        MemberVO memberVO = null;
        List<MemberVO> memberVOList = new ArrayList<>();
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(query);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            memberVO = MemberVO.builder()
                    .id(resultSet.getString(1))
                    .password(resultSet.getString(2))
                    .name(resultSet.getString(3))
                    .email(resultSet.getString(4))
                    .regdate(resultSet.getDate(5).toLocalDate())
                    .build();
            memberVOList.add(memberVO);
        }

        return memberVOList;
    }

    public MemberVO selectOne(String id) throws Exception{
        String query = "select * from mvc_member where id = ?";
        MemberVO memberVO = null;
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,id);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            memberVO = MemberVO.builder()
                    .id(resultSet.getString(1))
                    .password(resultSet.getString(2))
                    .name(resultSet.getString(3))
                    .email(resultSet.getString(4))
                    .regdate(resultSet.getDate(5).toLocalDate())
                    .build();
        }

        return memberVO;
    }

    public void updateOne(MemberVO vo) throws Exception {
        String query = "update mvc_member set password = ?, name = ?, email = ?, regdate = ? where id =?";
        MemberVO memberVO = null;
        List<MemberVO> memberVOList = new ArrayList<>();
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,vo.getPassword());
        preparedStatement.setString(2,vo.getName());
        preparedStatement.setString(3,vo.getEmail());
        preparedStatement.setDate(4, Date.valueOf(vo.getRegdate()));
        preparedStatement.setString(5, vo.getId());
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
    }

    public void addMember(MemberVO vo) throws Exception {
        @Cleanup PreparedStatement pstmt = ConnectionUtil.INSTANCE.getConnection()
                .prepareStatement("insert into mvc_member values (?,?,?,?,?)");

        pstmt.setString(1, vo.getId());
        pstmt.setString(2, vo.getPassword());
        pstmt.setString(3, vo.getName());
        pstmt.setString(4, vo.getEmail());
        pstmt.setDate(5, Date.valueOf(vo.getRegdate()));


        pstmt.executeQuery();
    }

    public void deleteOne(String id) throws Exception {
        String query = "delete from mvc_member where id =?";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();
    }
}

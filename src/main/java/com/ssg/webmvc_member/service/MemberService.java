package com.ssg.webmvc_member.service;

import com.ssg.webmvc_member.DTO.MemberDTO;
import com.ssg.webmvc_member.DAO.MemberDAO;
import com.ssg.webmvc_member.domain.MemberVO;
import com.ssg.webmvc_member.util.MapperUtil;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public enum MemberService {

    INSTANCE;

    private MemberDAO memberDAO;
    private ModelMapper modelMapper;

    MemberService(){
        memberDAO= new MemberDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public List<MemberDTO> printList() throws Exception {
        List<MemberVO> memberVOList = memberDAO.listMembers();
        List<MemberDTO> memberDTOList = memberVOList.stream()
                .map(vo ->modelMapper.map(vo, MemberDTO.class)).collect(Collectors.toList());
        return memberDTOList;
    }

    public void addMember(MemberDTO dto) throws Exception {
        MemberVO vo = modelMapper.map(dto, MemberVO.class);
        memberDAO.addMember(vo);
    }
    public MemberDTO selectOne(String id) throws Exception {
        MemberVO vo = memberDAO.selectOne(id);
        MemberDTO dto = modelMapper.map(vo, MemberDTO.class);
        return dto;
    }
    public void updateMember(MemberDTO dto) throws Exception {
        MemberVO vo = modelMapper.map(dto, MemberVO.class);
        memberDAO.updateOne(vo);
    }
    public void delMember(String id) throws Exception {
        memberDAO.deleteOne(id);
    }
}

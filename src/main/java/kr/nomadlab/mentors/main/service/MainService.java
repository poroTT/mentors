package kr.nomadlab.mentors.main.service;


import kr.nomadlab.mentors.common.PageRequestDTO;
import kr.nomadlab.mentors.common.PageResponseDTO;
import kr.nomadlab.mentors.main.dto.MainDTO;

public interface MainService {
    // 게시판 등록
    void register(MainDTO mainDTO);
    // 게시판 목록
    PageResponseDTO<MainDTO> list(PageRequestDTO pageRequestDTO);

    // 멘토링 횟수
    int mentoringCnt(Long mno);

    // 게시판 상세
    MainDTO getBoard(Long mbNo);
    // 게시판 수정
    void modifyBoard(MainDTO mainDTO);
    // 게시판 삭제
    void removeOne(Long mbNo);
}

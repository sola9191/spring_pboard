package com.company.spring_pboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.spring_pboard.model.BoardVO;
import com.company.spring_pboard.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	//list화면
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String selectBoardList(Model model) throws Exception{
		model.addAttribute("boardList", service.selectBoardList());
		return "board/list";
	}
	//글쓰기화면
	@RequestMapping(value="/write", method=RequestMethod.GET)
		public String insertForm() throws Exception{
			return "/board/write";
	}
	//글쓰기액션
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String insertAction(BoardVO vo, HttpServletRequest request, MultipartFile file, RedirectAttributes rttr ) throws Exception{
		String result = "fail";
		if(service.insertBoard(vo, request, file)>0) { result="pass"; }
		rttr.addFlashAttribute("insert", result); //fail이나 pass 보내기
		return "redirect:/board/list";
	}
	//상세조회화면
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detailForm(@RequestParam("pno") int pno, Model model) throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPno(pno);
		model.addAttribute("BoardVO", service.selectBoardOne(vo));
		return "/board/detail";
	}
	//수정화면
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String editForm(@RequestParam("pno") int pno, Model model) throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPno(pno);	
		model.addAttribute("BoardVO", service.selectBoardOne(vo));
		return "/board/edit";
	}
	//수정액션
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String editAction(BoardVO vo, HttpServletRequest request, MultipartFile file, RedirectAttributes rttr) throws Exception{
		String result = "fail";
		if(service.updateBoard(vo, request, file)>0) { result="pass"; }
		rttr.addFlashAttribute("edit", result);		
		return "redirect:/board/detail?pno="+vo.getPno();
	}
	//삭제화면
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteForm(@RequestParam("pno") int pno, Model model) throws Exception{
		model.addAttribute("pno", pno);
		return "/board/delete";
	}
	//삭제액션
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteAction(@RequestParam("pno") int pno, @RequestParam("ppass") String ppass, 
			RedirectAttributes rttr) throws Exception{
		String result="fail";
		BoardVO vo = new BoardVO();
		vo.setPno(pno); vo.setPpass(ppass);
		if(service.deleteBoard(vo)>0) { result="pass"; }
		rttr.addFlashAttribute("delete", result);
		return "redirect:/board/list";
	}
	
}

package com.company.spring_pboard.model;

public class BoardVO {

	private int pno; //게시판번호
	private String ptitle; //제목
	private String pcontent; //게시글
	private String ptag; //태그
	private int pcnt; //카운트
	private String ppass; //게시글 비밀번호
	private String pname; //게시글 이름
	private String pdate; //작성일
	private String peditdate; //수정일
	private String pip; //아이피
	private String pfile;
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardVO(int pno, String ptitle, String pcontent, String ptag, int pcnt, String ppass, String pname,
			String pdate, String peditdate, String pip, String pfile) {
		super();
		this.pno = pno;
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.ptag = ptag;
		this.pcnt = pcnt;
		this.ppass = ppass;
		this.pname = pname;
		this.pdate = pdate;
		this.peditdate = peditdate;
		this.pip = pip;
		this.pfile = pfile;
	}
	@Override
	public String toString() {
		return "BoardVO [pno=" + pno + ", ptitle=" + ptitle + ", pcontent=" + pcontent + ", ptag=" + ptag + ", pcnt="
				+ pcnt + ", ppass=" + ppass + ", pname=" + pname + ", pdate=" + pdate + ", peditdate=" + peditdate
				+ ", pip=" + pip + ", pfile=" + pfile + "]";
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public String getPtag() {
		return ptag;
	}
	public void setPtag(String ptag) {
		this.ptag = ptag;
	}
	public int getPcnt() {
		return pcnt;
	}
	public void setPcnt(int pcnt) {
		this.pcnt = pcnt;
	}
	public String getPpass() {
		return ppass;
	}
	public void setPpass(String ppass) {
		this.ppass = ppass;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getPeditdate() {
		return peditdate;
	}
	public void setPeditdate(String peditdate) {
		this.peditdate = peditdate;
	}
	public String getPip() {
		return pip;
	}
	public void setPip(String pip) {
		this.pip = pip;
	}
	public String getPfile() {
		return pfile;
	}
	public void setPfile(String pfile) {
		this.pfile = pfile;
	}
	
}

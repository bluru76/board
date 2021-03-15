package com.board.domain;

import java.util.Date;

public class BoardVO {
	private int board_id;
	private String board_writer;
	private String title;
	private String content;
	private String regdate;
	private String editdate;
	private int viewcnt;
	private int updown;
	
	/**
	 * @return the board_id
	 */
	public int getBoard_id() {
		return board_id;
	}
	/**
	 * @param board_id the board_id to set
	 */
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	/**
	 * @return the board_writer
	 */
	public String getBoard_writer() {
		return board_writer;
	}
	/**
	 * @param board_writer the board_writer to set
	 */
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the regdate
	 */
	public String getRegdate() {
		return regdate;
	}
	/**
	 * @param regdate the regdate to set
	 */
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	/**
	 * @return the editdate
	 */
	public String getEditdate() {
		return editdate;
	}
	/**
	 * @param editdate the editdate to set
	 */
	public void setEditdate(String editdate) {
		this.editdate = editdate;
	}
	/**
	 * @return the viewcnt
	 */
	public int getViewcnt() {
		return viewcnt;
	}
	/**
	 * @param viewcnt the viewcnt to set
	 */
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	/**
	 * @return the updown
	 */
	public int getUpdown() {
		return updown;
	}
	/**
	 * @param updown the updown to set
	 */
	public void setUpdown(int updown) {
		this.updown = updown;
	}
	
	
	
}



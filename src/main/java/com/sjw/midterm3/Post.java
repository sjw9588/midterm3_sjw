package com.sjw.midterm3;

/**
 * Article 도메인 오브젝트.<br>
 * 데이터베이스의 article 테이블에 매핑한다.
 * 
 * @author Jacob
 */
public class Post {
	// 글번호
	String postId;
	
	// 작성자 아이디
	String userId;
	
	// 작성자 이름
	String name;
	
	// 내용
	String content;
	
	int sweet;

	// 등록일시
	String cdate;

	/*
	 * Getter and Setter methods
	 */

	public String getUserId() {
		return userId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public int getSweet() {
		return sweet;
	}

	public void setSweet(int sweet) {
		this.sweet = sweet;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "\nPost [postId=" + postId + ", userId=" + userId + ", name="
				+ name + ",content=" + content + ", sweet=" + sweet
				+ ", cdate =" + cdate + "]";
	}
}
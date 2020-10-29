package com.springcore;

public class Session {

	private long sessionId;
	private String candidateName;
	private double score;

	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", candidateName=" + candidateName + ", score=" + score + "]";
	}

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Session(long sessionId, String candidateName, double score) {
		super();
		this.sessionId = sessionId;
		this.candidateName = candidateName;
		this.score = score;
	}

	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}

}

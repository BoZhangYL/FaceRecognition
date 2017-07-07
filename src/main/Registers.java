package main;

public class Registers {
	private String RegisterName = null;// 註冊者的名字
	private int RightPairNumber = 0;// 正確陪陪人臉的數量
	private int WrongPairNumber = 0; // 人臉匹配錯誤的數量
	private int FoundNotPair = 0;// 檢測到但是沒有匹配到的數量
	private int NotFoundNumber = 0;// 沒有檢測到人臉的數量
	private int jc_dlib = 0;// dlib算法檢測到人臉所花的時間
	private int sb_dlib = 0;// dlib算法識別到人臉所花的時間
	private int jc_facepp = 0;// facepp檢測奧人臉所花的時間
	private int sb_facepp = 0;// facepp識別到人臉所花的時間
	private int jc_sensetime = 0;// sensetime檢測到人臉所花的時間
	private int sb_sensetime = 0;// sensetime識別到人臉所花的時間

	public String getRegisterName() {
		return RegisterName;
	}

	public void setRegisterName(String registerName) {
		RegisterName = registerName;
	}

	public int getRightPairNumber() {
		return RightPairNumber;
	}

	public void setRightPairNumber(int rightPairNumber) {
		RightPairNumber = rightPairNumber;
	}

	public int getWrongPairNumber() {
		return WrongPairNumber;
	}

	public void setWrongPairNumber(int wrongPairNumber) {
		WrongPairNumber = wrongPairNumber;
	}

	public int getFoundNotPair() {
		return FoundNotPair;
	}

	public void setFoundNotPair(int foundNotPair) {
		FoundNotPair = foundNotPair;
	}

	public int getNotFoundNumber() {
		return NotFoundNumber;
	}

	public void setNotFoundNumber(int notFoundNumber) {
		NotFoundNumber = notFoundNumber;
	}

	public int getJc_dlib() {
		return jc_dlib;
	}

	public void setJc_dlib(int jc_dlib) {
		this.jc_dlib = jc_dlib;
	}

	public int getSb_dlib() {
		return sb_dlib;
	}

	public void setSb_dlib(int sb_dlib) {
		this.sb_dlib = sb_dlib;
	}

	public int getJc_facepp() {
		return jc_facepp;
	}

	public void setJc_facepp(int jc_facepp) {
		this.jc_facepp = jc_facepp;
	}

	public int getSb_facepp() {
		return sb_facepp;
	}

	public void setSb_facepp(int sb_facepp) {
		this.sb_facepp = sb_facepp;
	}

	public int getJc_sensetime() {
		return jc_sensetime;
	}

	public void setJc_sensetime(int jc_sensetime) {
		this.jc_sensetime = jc_sensetime;
	}

	public int getSb_sensetime() {
		return sb_sensetime;
	}

	public void setSb_sensetime(int sb_sensetime) {
		this.sb_sensetime = sb_sensetime;
	}
}

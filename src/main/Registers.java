package main;

public class Registers {
	private String RegisterName = null;// �]���ߵ�����
	private int RightPairNumber = 0;// ���_������Ę�Ĕ���
	private int WrongPairNumber = 0; // ��Ęƥ���e�`�Ĕ���
	private int FoundNotPair = 0;// �z�y�����Ǜ]��ƥ�䵽�Ĕ���
	private int NotFoundNumber = 0;// �]�Йz�y����Ę�Ĕ���
	private int jc_dlib = 0;// dlib�㷨�z�y����Ę�����ĕr�g
	private int sb_dlib = 0;// dlib�㷨�R�e����Ę�����ĕr�g
	private int jc_facepp = 0;// facepp�z�y�W��Ę�����ĕr�g
	private int sb_facepp = 0;// facepp�R�e����Ę�����ĕr�g
	private int jc_sensetime = 0;// sensetime�z�y����Ę�����ĕr�g
	private int sb_sensetime = 0;// sensetime�R�e����Ę�����ĕr�g

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

package main;

public class Registers {
	private String RegisterName = null;//註冊者的名字
	private int RightPairNumber = 0;// 正確陪陪人臉的數量
	private int WrongPairNumber = 0; // 人臉匹配錯誤的數量
	private int Man_FoundNotPair = 0;
	private int Woman_FoundNotPair = 0;
	private int Man_NotFoundNumber = 0;
	private int Woman_NotFoundNumber = 0;
	private int jc_dlib = 0;
	private int sb_dlib = 0;
	private int jc_facepp = 0;
	private int sb_facepp = 0;
	private int jc_sensetime = 0;
	private int sb_sensetime = 0;
}

package main;

/**
 * Ӌ����Ęƥ��Ĕ���
 * **/
public class StatisticsRecognitionData {
	private String[] FaceRegisters; // ��Ę�]���ߵ������б�
	private int RightPairNumber = 0;// ���_������Ę�Ĕ���
	private int WrongPairNumber = 0; // ��Ęƥ���e�`�Ĕ���
	private int[] FoundNotPair;
	private int[] NotFoundNumber;
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

	public void StatisticsRecognitionData() {

	}

	/* Ӌ��ƥ�����_�Ĕ��� */
	public int countRightPairNumber() {
		return RightPairNumber;
	}

	/* Ӌ��ƥ���e�`�Ĕ��� */
	public int countWrongPairNumber() {
		return WrongPairNumber;
	}
	
	
}
